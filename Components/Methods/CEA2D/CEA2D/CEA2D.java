package CEA2D;

import java.awt.Color;
import java.awt.GridLayout;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.List;

import javax.swing.JFrame;

import main.FrevoMain;

import org.dom4j.Document;
import org.dom4j.DocumentFactory;
import org.dom4j.Element;
import org.dom4j.Node;

import utils.NESRandom;
import utils.StatKeeper;
import core.AbstractMethod;
import core.AbstractRanking;
import core.AbstractRepresentation;
import core.ComponentType;
import core.ComponentXMLData;
import core.PopulationDiversity;
import core.ProblemXMLData;
import core.XMLFieldEntry;
import core.XMLMethodStep;
import frevoutils.JGridMap.Display;
import frevoutils.JGridMap.JGridMap;

/**
 * The class SSEA2D (Spatially Structured Evolutionary Algorithm 2D) is a
 * evolutionary algorithm that considers only the neighbors of every
 * representation to decide if the representation remains in the next
 * generation, mutates, creates an offspring with another representation or is
 * replaced by a totally new representation. The representations are arranged in
 * a two dimensional grid, where every representation has 8 neighbors.
 * 
 * @author Thomas Dittrich
 * 
 */
public class CEA2D extends AbstractMethod {

	/**
	 * Parameters of the method for current experiment
	 */
	private Parameters parameters;
	
	private StatKeeper bfitness;
	private StatKeeper numSimulations;
	
	// Statistics about population diversity 
	private StatKeeper diversity;
	private StatKeeper maxDiversity;
	private StatKeeper minDiversity;
	private StatKeeper standardDeviation;

	private StatKeeper numElite;
	private StatKeeper numMutate;
	private StatKeeper numXOver;
	private StatKeeper numRenew;
	
	private StatKeeper effectivityElite;
	private StatKeeper effectivityMutate;
	private StatKeeper effectivityXOver;
	private StatKeeper effectivityRenew;
	
	private Population pop;

	private double minfitness;

	private boolean iniOK = false;
	
	Display gridFrame;
	JGridMap fitnessgrid;

	/** Constructs a new SSEA2D object */
	public CEA2D(NESRandom random) {
		super(random);
		parameters = new Parameters(this);
	}

	private void initialize() {
		parameters.initialize(getProperties());
		
		// show fitness grid if in GUI mode
		if (FrevoMain.isFrevoWithGraphics()) {
			// initialize fitness grid
			if (gridFrame == null) {
				gridFrame = new Display(300, 300, "Spatial Fitness");
				gridFrame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
				gridFrame.setLocation(0, 0);
			}
			if (fitnessgrid == null) {
				fitnessgrid = new JGridMap(200, 250, parameters.POPULATIONFIELDSIZE,
						parameters.POPULATIONFIELDSIZE, 1);
				// initialize color scale
				// 0....red
				// 50...yellow
				// 100..green
				for (int i = 0; i < 100; i++) {
					int r = 0;
					int g = 0;
					if (i < 50) {
						r = 255;
						g = i * 255 / 50;
					} else {
						r = 255 - (i - 50) * 255 / 50;
						g = 255;
					}
					int color = r * 65536 + g * 256;
					fitnessgrid.addColorToScale(i, new Color(color));
				}
			}
			gridFrame.setLayout(new GridLayout(1, 1));
			gridFrame.add(fitnessgrid);
			gridFrame.pack();
			gridFrame.setVisible(true);
		}
	}

	@Override
	public void runOptimization(ProblemXMLData problemData,
			ComponentXMLData representationData, ComponentXMLData rankingData,
			Hashtable<String, XMLFieldEntry> properties) {

		// initialize evolution
		initialize();

		pop = new Population(representationData, parameters,
				problemData.getRequiredNumberOfInputs(),
				problemData.getRequiredNumberOfOutputs());

		createStatistics();
		
		try {
			Step step = new Step(problemData, rankingData);
			
			// Iterate through generations
			for (int generation = 0; generation < parameters.GENERATIONS; generation++) {
				
				step.setGeneration(generation);
				
				if (!evolve(step)) {
					break;
				}
			}
			
		} catch (InstantiationException e1) {
			e1.printStackTrace();
		} catch (Exception e) {		
			e.printStackTrace();
		}
		
		// indicate final progress
		setProgress(100);

		// closes the window which holds the fitness grid
		if (FrevoMain.isFrevoWithGraphics()) {
			if (gridFrame != null) {		
		 		gridFrame.dispose();		 		
			}
			fitnessgrid = null;
			gridFrame = null;
		}
	}
	
	@Override
	public void continueOptimization(ProblemXMLData problemData,
			ComponentXMLData representationData, ComponentXMLData rankingData,
			Hashtable<String, XMLFieldEntry> properties,
			Document doc) {
		// initialize evolution
		initialize();

		// record the best fitness over the evolution
		Node dpopulations = doc.selectSingleNode("/frevo/populations");
		double best_fitness = Double.parseDouble(dpopulations.valueOf("./@best_fitness"));
		int lastGeneration  = Integer.parseInt(dpopulations.valueOf("./@generation"));
		long randomseed = Long.parseLong(dpopulations.valueOf("./@randomseed"));
		getRandom().setSeed(randomseed);
		
		// load initial population(s)
		ArrayList<ArrayList<AbstractRepresentation>> loadedPops = loadFromXML(doc);
		if (loadedPops.size() != 1) {
			System.err.println("Couldn't restore population from XML file");
			return;
		}
		
		pop = new Population(representationData, parameters,
				problemData.getRequiredNumberOfInputs(),
				problemData.getRequiredNumberOfOutputs(), 
				loadedPops.get(0), doc);
				
		createStatistics();
		
		
		try {
		// evolve the whole population
			Step step = new Step(problemData, rankingData);
			pop.evolve(step);
			step.setBestFitness(best_fitness);
			
			// Iterate through generations
			for (int generation = lastGeneration + 1; generation < parameters.GENERATIONS; generation++) {
				
				step.setGeneration(generation);
				
				if (!evolve(step)) {
					break;
				}
			}
			
		} catch (InstantiationException e1) {
			e1.printStackTrace();
		} catch (Exception e) {		
			e.printStackTrace();
		}
		
		// indicate final progress
		setProgress(100);

		// closes the window which holds the fitness grid
		if (FrevoMain.isFrevoWithGraphics()) {
			gridFrame.dispose();
			fitnessgrid = null;
			gridFrame = null;
		}
		
	}
	
	private boolean evolve(Step step) throws Exception {
		// set progress
		setProgress((float) step.getGeneration() / (float) parameters.GENERATIONS);

		boolean doSave = false;

		AbstractRanking ranking = step.getRanking();
		// evaluates all members and calculates the best fitness
		ArrayList<AbstractRepresentation> memberrepresentations = pop
				.getMembers();

		int numSims = ranking.sortCandidates(memberrepresentations,
				step.getProblemData(), new NESRandom(generator.getSeed()));

		bfitness.add(memberrepresentations.get(0).getFitness());

		if (memberrepresentations.get(0).getFitness() > step.getBestFitness()) {
			step.setBestFitness(memberrepresentations.get(0).getFitness());
			doSave = true;
		}

		numSimulations.add(numSims);
		
		PopulationDiversity diversityCalc = new PopulationDiversity(pop.getMembers()); 
		diversity.add(diversityCalc.getAverageDiversity());
		maxDiversity.add(diversityCalc.getMaxDiversity());
		minDiversity.add(diversityCalc.getMinDiversity());
		standardDeviation.add(diversityCalc.getStandardDeviation());

		numElite.add(pop.getNumElite());
		numMutate.add(pop.getNumMutate());
		numXOver.add(pop.getNumXOver());
		numRenew.add(pop.getNumRenew());
		
		effectivityElite.add(pop.getEffectivityElite());
		effectivityMutate.add(pop.getEffectivityMutate());
		effectivityXOver.add(pop.getEffectivityXOver());
		effectivityRenew.add(pop.getEffectivityRenew());
		
		if (FrevoMain.isFrevoWithGraphics()) {
			// shows the fitness of the whole population as a grid of
			// colors, where red means bad fitness and green means good
			// fitness
			updatefitnessgrid();
		}

		// save periodically
		if ((parameters.SAVEINTERVAL != 0) && (step.getGeneration() % parameters.SAVEINTERVAL == 0)) {
			doSave = true;
		}

		// save last generation
		if (step.getGeneration() == parameters.GENERATIONS - 1) {
			doSave = true;
		}

		String fitnessstring;
		if (step.getProblemData().getComponentType() == ComponentType.FREVO_PROBLEM) {
			fitnessstring = " (" + step.getBestFitness() + ")";
		} else {
			// multiproblem
			fitnessstring = "";
		}
		
		long currentActiveSeed = getRandom().getSeed();
		String fileName = getFileName(step.getProblemData(), step.getGeneration(), fitnessstring);
		Element xmlLastState = saveResults(step.getGeneration());
		xmlLastState.addAttribute("best_fitness", String.valueOf(step.getBestFitness()));
		// save the last state of evaluation
		XMLMethodStep state = new XMLMethodStep(fileName, xmlLastState, this.seed, currentActiveSeed);
		setLastResults(state);
		
		if (doSave) {
			FrevoMain.saveResult(
					fileName , xmlLastState, this.seed, currentActiveSeed
					);
		}

		if (step.getBestFitness() >= step.getMaxFitness()) {
			// fill up remaing space in statkeeper with last value
			if (bfitness.length() != parameters.GENERATIONS) {
				int dif = parameters.GENERATIONS - bfitness.length();
				double lastvalue = bfitness.getValues().get(bfitness.length()-1);
				for (int i=0;i<dif;i++) {
					bfitness.add(lastvalue);
				}
			}
			
			return false;
		}

		if (handlePause()) {
			// closes the window which holds the fitnessgrid
			if (gridFrame != null)
				gridFrame.dispose();
			fitnessgrid = null;
			gridFrame = null;
			return false;
		}

		// mutates all members of the population according to the
		// specified mutation rules (only if it's not the last
		// generation)
		if (step.getGeneration() != parameters.GENERATIONS - 1) {
			pop.evolve(step);
		}
		
		return true;
	}

	private String getFileName(ProblemXMLData problemData, int generation,
			String fitnessstring) {
		DecimalFormat fm = new DecimalFormat("000");
		
		return problemData.getName() + "_g" + fm.format(generation)
				+ fitnessstring;		
	}
	
	private static ArrayList<AbstractRepresentation> createList(Node nd) {
		ArrayList<AbstractRepresentation> result = new ArrayList<AbstractRepresentation>();

		ComponentXMLData representation = FrevoMain
				.getSelectedComponent(ComponentType.FREVO_REPRESENTATION);

		try {
			List<?> npops = nd.selectNodes("./*");
			Iterator<?> it = npops.iterator();
			int size = npops.size();
			int currentIndex = 0;
			while (it.hasNext()) {
				// set loading progress
				FrevoMain.setLoadingProgress((float) currentIndex / size);

				Node net = (Node) it.next();
				size--;
				if (size % 10 == 0)
					size = size + (2 * 2 - 4);
				AbstractRepresentation member = representation
						.getNewRepresentationInstance(0, 0, null);
				member.loadFromXML(net);
				result.add(member);

				currentIndex++;
			}
		} catch (Exception e) {
			e.printStackTrace();
		}

		return result;
	}
 
	/** Saves all population data to a new XML element and returns it. */
	public Element saveResults(int generation) {
		Element dpopulations = DocumentFactory.getInstance().createElement(
				"populations");

		dpopulations.addAttribute("count", String.valueOf(1));
		dpopulations.addAttribute("generation", String.valueOf(generation));
		dpopulations.addAttribute("randomseed", String.valueOf(this.getSeed()));
		
		Element dpop = dpopulations.addElement("population");
		dpop.addAttribute("randomNeighborhoodSeed", String.valueOf(pop.randomNeighborhoodSeed));
		
		// sort candidates with decreasing fitness
		ArrayList<AbstractRepresentation> members = pop.getMembers();
						
		for (AbstractRepresentation n : members) {
			n.exportToXmlElement(dpop);
		}

		return dpopulations;
	}

	@Override
	public ArrayList<ArrayList<AbstractRepresentation>> loadFromXML(Document doc) {
		// final list to be returned
		ArrayList<ArrayList<AbstractRepresentation>> populations = new ArrayList<ArrayList<AbstractRepresentation>>();

		// get population root node
		Node dpopulations = doc.selectSingleNode("/frevo/populations");

		// get number of current generation
		int currentGeneration = Integer
						.parseInt(dpopulations.valueOf("./@generation"));

		
		// get population size
		List<?> npops = dpopulations.selectNodes(".//population");
		Iterator<?> it = npops.iterator();
		while (it.hasNext()) {
			Node pop = (Node) it.next();
			ArrayList<AbstractRepresentation> pops = createList(pop);
			populations.add(pops);
		}
		// Load the number of generations
		XMLFieldEntry gensize = getProperties().get("generations");
		if (gensize != null){
			int generations = Integer.parseInt(gensize.getValue());
			// TODO check max fitness also
			// set boolean value which shows possibility of continuation of experiment
			// if maximum number of generations hasn't been reached.
			setCanContinue(currentGeneration + 1 < generations);
		}
		
		return populations;
	}

	/**
	 * displays the fitness of the actual population in a Grid
	 */
	private void updatefitnessgrid() {
		// determine maximum and minimum fitness
		ArrayList<AbstractRepresentation> rep = pop.getMembers();
		double maxfitness = rep.get(0).getFitness();
		if (!iniOK) {
			minfitness = rep.get(0).getFitness();
		}
		for (AbstractRepresentation r : rep) {
			if (r.isEvaluated()) {
				if (r.getFitness() > maxfitness) {
					maxfitness = r.getFitness();
				} else if (r.getFitness() < minfitness) {
					minfitness = r.getFitness();
				}
			}
		}
		// normalize fitness between 0 and 100
		double k = 100.0 / (maxfitness - minfitness);
		double d = -(minfitness * k);
		int[][] fitnessarray = new int[parameters.POPULATIONFIELDSIZE][parameters.POPULATIONFIELDSIZE];
		for (int x = 0; x < parameters.POPULATIONFIELDSIZE; x++) {
			for (int y = 0; y < parameters.POPULATIONFIELDSIZE; y++) {
				if (rep.get(x * parameters.POPULATIONFIELDSIZE + y).isEvaluated()) {
					int normfitness = (int) (rep.get(
							x * parameters.POPULATIONFIELDSIZE + y).getFitness()
							* k + d);
					fitnessarray[x][y] = normfitness;
				} else {
					fitnessarray[x][y] = 0;
				}
			}
		}
		// show normalized fitness in fitness grid
		fitnessgrid.setData(fitnessarray);
		fitnessgrid.repaint();
		iniOK = true;
	}
	
	private void createStatistics() {
		bfitness = new StatKeeper(true, "Best Fitness ("
				+ FrevoMain.getCurrentRun() + ")", "Generations");

		numSimulations = new StatKeeper(true, "numSimulations"
				+ FrevoMain.getCurrentRun(), "Generations");

		diversity = new StatKeeper(true, "Diversity", "Generations");
		maxDiversity = new StatKeeper(true, "Max. diversity", "Generations");
		minDiversity = new StatKeeper(true, "Min. diversity", "Generations");
		standardDeviation = new StatKeeper(true, "Deviation", "Generations");

		numElite = new StatKeeper(true, "number of Elite", "Generations");
		numMutate = new StatKeeper(true, "number of Mutation", "Generations");
		numXOver = new StatKeeper(true, "number of XOver", "Generations");
		numRenew = new StatKeeper(true, "number of Renew", "Generations");
		
		effectivityElite = new StatKeeper(true, "effektivity of Elite", "Generations");
		effectivityMutate = new StatKeeper(true, "effektivity of Mutation", "Generations");
		effectivityXOver = new StatKeeper(true, "effektivity of XOver", "Generations");
		effectivityRenew = new StatKeeper(true, "effektivity of Renew", "Generations");
		
		// Collect best fitness
		FrevoMain.addStatistics(bfitness,true);

		//FrevoMain.addStatistics(numSimulations,false);
		
		//FrevoMain.addStatistics(diversity,true);
		//FrevoMain.addStatistics(maxDiversity,false);
		//FrevoMain.addStatistics(minDiversity,false);
		//FrevoMain.addStatistics(standardDeviation,false);

		//FrevoMain.addStatistics(numElite, false);
		//FrevoMain.addStatistics(numMutate, false);
		//FrevoMain.addStatistics(numXOver, false);
		//FrevoMain.addStatistics(numRenew, false);

		//FrevoMain.addStatistics(effectivityElite, false);
		//FrevoMain.addStatistics(effectivityMutate, false);
		//FrevoMain.addStatistics(effectivityXOver, false);
		//FrevoMain.addStatistics(effectivityRenew, false);
	}
}
