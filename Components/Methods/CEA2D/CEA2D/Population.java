package CEA2D;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.dom4j.Document;
import org.dom4j.Node;

import CEA2D.Member.replaceFunction;
import net.jodk.lang.FastMath;
import utils.NESRandom;
import core.AbstractRepresentation;
import core.ComponentXMLData;

/**
 * The class population represents the whole population for the evolutionary
 * algorithm SSEA2D. It contains all the representations and the function to
 * evolve a new generation.
 * 
 * @author Thomas Dittrich
 */
public class Population {

	Member[] members;
	Parameters parameters;
	long randomNeighborhoodSeed;
	private ComponentXMLData representation;
	private int inputnumber;
	private int outputnumber;
	
	private double numElite;
	private double numMutate;
	private double numXOver;
	private double numRenew;

	
	private double effectivityElite;
	private double effectivityMutate;
	private double effectivityXOver;
	private double effectivityRenew;

	public double getNumElite() {
		return numElite;
	}
	
	public double getNumMutate() {
		return numMutate;
	}

	public double getNumXOver() {
		return numXOver;
	}

	public double getNumRenew() {
		return numRenew;
	}
	
	public double getEffectivityElite() {
		return effectivityElite;
	}
	
	public double getEffectivityMutate() {
		return effectivityMutate;
	}

	public double getEffectivityXOver() {
		return effectivityXOver;
	}

	public double getEffectivityRenew() {
		return effectivityRenew;
	}

	/**
	 * 
	 * @param representation
	 *            ComponentXMLdata which is used to create the Members. If this
	 *            constructor is called in a subclass of AbstractRepresentation the
	 *            variable representation should be handed over
	 * @param parameters
	 *            Instance which holds the properties for each member. 
	 */
	public Population(ComponentXMLData representation, Parameters parameters, int inputnumber, int outputnumber) {
		this.parameters = parameters;
		this.representation = representation;
		this.inputnumber = inputnumber;
		this.outputnumber = outputnumber;
		members = new Member[parameters.POPULATIONFIELDSIZE * parameters.POPULATIONFIELDSIZE];

		for (int i = 0; i < members.length; i++) {
			members[i] = new Member(representation, parameters, inputnumber, outputnumber);
		}
		
		if (parameters.NEIGHBOURHOODMODE == 1) {
			SetGridneighborhood();
		} else if (parameters.NEIGHBOURHOODMODE == 2) {
			randomNeighborhoodSeed = parameters.getGenerator().getSeed();
			SetRandomneighborhood(8);
		} else {
			SetGridneighborhood();
		}
	}
	
	public Population(ComponentXMLData representation, Parameters parameters, int inputnumber, 
			int outputnumber, ArrayList<AbstractRepresentation> population, Document doc) {
		this.parameters = parameters;
		this.inputnumber = inputnumber;
		this.outputnumber = outputnumber;
		members = new Member[parameters.POPULATIONFIELDSIZE * parameters.POPULATIONFIELDSIZE];
		
		for (int i = 0; i < members.length; i++) {
			members[i] = new Member(population.get(i), parameters);
		}
		
		// get population root node
		Node dpopulations = doc.selectSingleNode("/frevo/populations");
		// get population size
		List<?> npops = dpopulations.selectNodes(".//population");
		Iterator<?> it = npops.iterator();
		while (it.hasNext()) {
			Node pop = (Node) it.next();
			this.randomNeighborhoodSeed = Long.valueOf(pop.valueOf("./@randomNeighborhoodSeed"));
		}
		
		if (parameters.NEIGHBOURHOODMODE == 1) {
			SetGridneighborhood();
		} else if (parameters.NEIGHBOURHOODMODE == 2) {
			SetRandomneighborhood(8);
		} else {
			SetGridneighborhood();
		}
	}
		

	/**
	 * Returns an ArrayList of IRepresentations which contains all the
	 * IRepresentations of the Members
	 * 
	 * @return ArrayList of IRepresentation
	 */
	public ArrayList<AbstractRepresentation> getMembers() {
		ArrayList<AbstractRepresentation> m = new ArrayList<AbstractRepresentation>();

		for (Member me : members) {
			m.add(me.rep);
		}

		return m;
	}

	/**
	 * Evolves the IRepresentation of every member according to the
	 * evolution-rules
	 */
	public void evolve(Step step) throws Exception {
		NESRandom rand = parameters.getGenerator();
		
		// get diff to all neighbors
		for (int i = 0; i < members.length; i++) {
			members[i].diff = 0;
			int j = 0;
			double diff = 0.0;
			for (Member n : members[i].neighbors) {
				if (n.rep.getFitness() >= members[i].rep.getFitness()) {
					diff += members[i].rep.diffTo(n.rep);
					j++;
				}
			}
			members[i].diff = j>0 ? diff / j : 0.0;
		}

		AbstractRepresentation[] newmembers = new AbstractRepresentation[members.length];
		numElite=0;
		numMutate=0;
		numXOver=0;
		numRenew=0;
		int numEliteElite=0;
		int numMutateElite=0;
		int numXOverElite=0;
		int numRenewElite=0;
		
		for (int i = 0; i < members.length; i++) {
			members[i].rep.setFitness(members[i].rep.getFitness()+((double)i+1)/1e6);
		}
		
		for (int i = 0; i < members.length; i++) {
			
			switch(members[i].getCreatedBy()){
			  case ELITE: numElite++; break;
			  case MUTATE: numMutate++; break;
			  case XOVER: numXOver++; break;
			  case RENEW: numRenew++; break;
			}
			
			ArrayList<AbstractRepresentation> neighborhood = new ArrayList<AbstractRepresentation>();
			
			for(Member n : members[i].neighbors){
				neighborhood.add(n.rep);
			}
			neighborhood.add(members[i].rep);
			
			
			
			step.getRanking().sortCandidates(neighborhood, step.getProblemData(), rand);
			
			int rankneighborhood = neighborhood.indexOf(members[i].rep);
			float re = parameters.PERCENTELITE / 100.0f;
			int rankelite = (int) FastMath
					.rint(neighborhood.size() * re);
			
			AbstractRepresentation[] elite = new AbstractRepresentation[rankelite];
			
			for(int j = 0; j < rankelite; j++){
				elite[j] = neighborhood.get(j);
			}
			
			if(rankneighborhood < rankelite || members[i].rep.getFitness() == elite[rankelite-1].getFitness()){
				newmembers[i] = members[i].rep;
				switch(members[i].getCreatedBy()){
				  case ELITE: numEliteElite++; break;
				  case MUTATE: numMutateElite++; break;
				  case XOVER: numXOverElite++; break;
				  case RENEW: numRenewElite++; break;
				}
				members[i].setCreatedBy(replaceFunction.ELITE);
			}else{
				int geneticoperationrand = rand.nextInt((int) (100-parameters.PERCENTELITE));
				if(geneticoperationrand < parameters.PERCENTMUTATEELITE){
					newmembers[i] = elite[rand.nextInt(rankelite)].clone();
					newmembers[i].mutate(parameters.MUTATIONSEVERITY, parameters.MUTATIONPROBABILITY, 1);
					members[i].setCreatedBy(replaceFunction.MUTATE);
				}else if(geneticoperationrand < parameters.PERCENTXOVERELITE + parameters.PERCENTMUTATEELITE){
					newmembers[i] = members[i].rep.clone();
					newmembers[i].xOverWith(elite[rand.nextInt(rankelite)], 1);
					members[i].setCreatedBy(replaceFunction.XOVER);
				}else{
					newmembers[i] = representation.getNewRepresentationInstance(inputnumber, outputnumber, parameters.getGenerator());
					members[i].setCreatedBy(replaceFunction.RENEW);
				}
			}
			
			// ranks all the members in the neighborhood of member[i] according
			// to their fitness. The second condition for the ranking is the
			// difference to the neighbors (a member with a high difference to
			// all his neighbors is more likely to find a good solution for the
			// problem). The third condition is an ID that is unique.
//			int fitnessrankneighborhood = 1;
//			for (Member n : members[i].neighbors) {
//				double f = members[i].rep.getFitness();
//				double fn = n.rep.getFitness();
//				long id = members[i].id;
//				long idn = n.id;
//				double d = members[i].diff;
//				double dn = n.diff;
//				if (fn > f) {
//					fitnessrankneighborhood++;
//				} else if (f == fn && dn > d) {
//					fitnessrankneighborhood++;
//				} else if (f == fn && dn == d && id > idn) {
//					fitnessrankneighborhood++;
//				}
//			}
//
////			if (fitnessrankneighborhood != 1) {
//				float re = parameters.PERCENTELITE / 100.0f;
//				// the highest rank that is still elite
//				int rankelite = (int) FastMath
//						.rint(((members[i].neighbors.size() + 1) * re));
//				if (fitnessrankneighborhood > rankelite) { // not elite
//					int geneticoperationrand = rand.nextInt(100);
//					// create a mutation of one of the elite-neighbors
//					if (geneticoperationrand < parameters.PERCENTMUTATEELITE) {
//						ArrayList<AbstractRepresentation> elite = new ArrayList<AbstractRepresentation>();
//						for (Member m : members[i].neighbors) {
//							elite.add(m.rep);
//						}
//						Collections.sort(elite, Collections.reverseOrder());
//						while (elite.size() > rankelite) {
//							elite.remove(rankelite);
//						}
//						int elitemutate = rankelite > 1 ? rand
//								.nextInt(rankelite - 1) : 0;
//						newmembers[i] = elite.get(elitemutate).clone();
//						newmembers[i].mutate(parameters.MUTATIONSEVERITY, parameters.MUTATIONPROBABILITY, 1);
//						members[i].setCreatedBy(replaceFunction.MUTATE);
//					} else
//					// create an offspring with one of the elite neighbors
//					if (geneticoperationrand < parameters.PERCENTXOVERELITE
//							+ parameters.PERCENTMUTATEELITE) {
//						ArrayList<AbstractRepresentation> elite = new ArrayList<AbstractRepresentation>();
//						for (Member m : members[i].neighbors) {
//							elite.add(m.rep);
//						}
//						Collections.sort(elite, Collections.reverseOrder());
//						while (elite.size() > rankelite) {
//							elite.remove(rankelite);
//						}
//						int xoverpartner = rankelite > 1 ? rand
//								.nextInt(rankelite - 1) : 0;
//						newmembers[i] = members[i].rep.clone();
//						newmembers[i].xOverWith(elite.get(xoverpartner), 1);
//						members[i].setCreatedBy(replaceFunction.XOVER);
//					} else { // create a new member
////						newmembers[i] = members[i].rep.clone();
////						newmembers[i].mutate(100, 100, 1);
//						newmembers[i] = representation.getNewRepresentationInstance(inputnumber, outputnumber, parameters.getGenerator());
//						members[i].setCreatedBy(replaceFunction.RENEW);
//					}
//				} else { // do nothing
//					newmembers[i] = members[i].rep;
//					switch(members[i].getCreatedBy()){
//					  case ELITE: numEliteElite++; break;
//					  case MUTATE: numMutateElite++; break;
//					  case XOVER: numXOverElite++; break;
//					  case RENEW: numRenewElite++; break;
//					}
//					members[i].setCreatedBy(replaceFunction.ELITE);
//				}
//			} else { // do nothing
//				newmembers[i] = members[i].rep;
//				switch(members[i].getCreatedBy()){
//				  case ELITE: numEliteElite++; break;
//				  case MUTATE: numMutateElite++; break;
//				  case XOVER: numXOverElite++; break;
//				  case RENEW: numRenewElite++; break;
//				}
//				members[i].setCreatedBy(replaceFunction.ELITE);
//			}
		}
		
		// copy the new members into the population
		for (int i = 0; i < members.length; i++) {
			members[i].rep = newmembers[i];
		}
		for (int i = 0; i < members.length; i++) {
			if(members[i].rep.isEvaluated()){
				members[i].rep.setFitness(members[i].rep.getFitness()-((double)i+1)/1e6);
			}
		}
		effectivityElite = numElite == 0? 0 : ((double)numEliteElite)/((double)numElite);
		effectivityMutate = numMutate == 0? 0 : ((double)numMutateElite)/((double)numMutate);
		effectivityXOver = numXOver == 0? 0 : ((double)numXOverElite)/((double)numXOver);
		effectivityRenew = numRenew == 0? 0 : ((double)numRenewElite)/((double)numRenew);
		
//		effectivityElite = numEliteElite;
//		effectivityMutate = numMutateElite;
//		effectivityXOver = numXOverElite;
//		effectivityRenew = numRenewElite;
		
	}

	/**
	 * Sets the neighbors for every member. The Neighbors of a member are those
	 * which are adjacent in the grid
	 */
	private void SetGridneighborhood() {
		int fieldlength = parameters.POPULATIONFIELDSIZE;
		for (int x0 = 0; x0 < fieldlength; x0++) {
			for (int y0 = 0; y0 < fieldlength; y0++) {
				for (int x1 = -1; x1 <= 1; x1++) {
					for (int y1 = -1; y1 <= 1; y1++) {
						if (x1 != 0 || y1 != 0) {
							int x = (x0 + x1 + fieldlength) % fieldlength;
							int y = (y0 + y1 + fieldlength) % fieldlength;
							members[x0 * fieldlength + y0].neighbors
									.add(members[x * fieldlength + y]);
						}
					}
				}
			}
		}
	}

	/**
	 * Sets the neighbors for every member. The Neighbors of a member are
	 * selected by random
	 */
	private void SetRandomneighborhood(int numberofneighbors) {
		int fieldlength = parameters.POPULATIONFIELDSIZE;
		NESRandom localRandom = new NESRandom(randomNeighborhoodSeed);					
		for (int x0 = 0; x0 < fieldlength; x0++) {
			for (int y0 = 0; y0 < fieldlength; y0++) {
				for (int i = 0; i < numberofneighbors; i++) {
					int randValue = localRandom.nextInt(members.length);
					members[x0 * fieldlength + y0].neighbors.add(members[randValue]);
				}
			}
		}
	}
}
