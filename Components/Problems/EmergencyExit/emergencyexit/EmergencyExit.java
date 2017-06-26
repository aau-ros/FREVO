package emergencyexit;

import core.AbstractRepresentation;
import core.AbstractSingleProblem;

import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Hashtable;
import java.util.NavigableMap;

import ROS.ROS_frevo;

/**
 * A simulation where multiple Agents try to find the Emergency Exit.
 * This is an example for CPSwarm where an external simulator is used.
 * @author Micha Rappaport
 */
public class EmergencyExit extends AbstractSingleProblem {
	/**
	 * Interface to ROS simulator.
	 */
	private ROS_frevo sim;
	
	/**
	 * Load configuration parameters and store in simulator interface.
	 */
	private void loadParameters() {
		// general simulation parameters for ROS
		Hashtable<String,String> params = new Hashtable<String, String>();
		params.put("steps", getProperties().get("steps").getValue());
		params.put("agents", getProperties().get("agents").getValue());
		sim.setParameters(params);
		
		// name of the environment to simulate in
		sim.setEnvironment(Environment.fromString(getProperties().get("environment").getValue()));
	}
	
	/**
	 * Calculate the fitness score of the last simulation run.
	 * @return double: The fitness score.
	 */
	private double calcFitness() {
		// get content from log files
		ArrayList<NavigableMap<Integer,Double>> logs = sim.getLogs();
		
		// fitness score is negative sum of all distances
		double dist = 0;
		
		// iterate all log files
        for (NavigableMap<Integer,Double> log : logs) {
            // take last line of log file
            dist = dist + log.lastEntry().getValue();
        }

        // return negative distance as fitness
		return -dist;
	}

	/**
	 * Simulate without visualization to evaluate the candidate representation.
	 * @param AbstractRepresentation candidate: The candidate to evaluate.
	 * @return double: The fitness of the candidate.
	 */
	@Override
	public double evaluateCandidate(AbstractRepresentation candidate) {
		// create new simulator interface
		sim = new ROS_frevo(candidate);
		
		// read config for simulation
		loadParameters();
				
		// run simulation
		sim.run();

		// return fitness
		return calcFitness();
	}

	/**
	 * Simulate with visualization to introspect a certain candidate representation.
	 * @param AbstractRepresentation candidate: The candidate to introspect.
	 */
	@Override
	public void replayWithVisualization(AbstractRepresentation candidate) {
		// create new simulator interface
		sim = new ROS_frevo(candidate);

		// read config for simulation
		loadParameters();
		
		// run simulation
		sim.runVisual();
	}

	/**
	 * Get the maximally possible fitness value.
	 * @return double: The maximum fitness.
	 */
	@Override
	public double getMaximumFitness() {
		return 0;
	}
}
