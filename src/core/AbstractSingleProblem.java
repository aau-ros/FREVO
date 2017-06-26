/*
 * Copyright (C) 2009 Istvan Fehervari, Wilfried Elmenreich, Tobias Ibounig
 * Original project page: http://www.frevotool.tk
 *
 * This program is free software; you can redistribute it and/or modify it
 * under the terms of the GNU General Public License Version 3 as published
 * by the Free Software Foundation http://www.gnu.org/licenses/gpl-3.0.txt
 *
 * There is no warranty for this free software. The GPL requires that 
 * modified versions be marked as changed, so that their problems will
 * not be attributed erroneously to authors of previous versions.
 */
package core;

import java.util.ArrayList;

import sun.reflect.generics.reflectiveObjects.NotImplementedException;

/**
 * Provides a general interface to formulate own problems that evaluates a single representations at a time.
 * By evaluating a candidate a corresponding fitness value must be calculated and returned.
 * 
 * <p>
 * In order to provide a visualized evaluation the method  {@link AbstractSingleProblem#replayWithVisualization} must be overwritten.
 * 
 * <p>To support requirement changes based on different parameters override the following method:<br><br>
 * 
 * -{@link AbstractProblem#adjustRequirements(java.util.Hashtable, java.util.Hashtable)}
 * 
 * @author Istvan Fehervari
 *
 */
public abstract class AbstractSingleProblem extends AbstractProblem {

	/** This function is called when the user request a visual replay from the problem.
	 * A total re-evaluation is not needed, only to provide a visual mean for
	 * the user to grasp the performance of the indicated candidate solution.
	 * <p> 
	 * It is recommended to use advanced threading for display like {@link javax.swing.SwingWorker}.
	 * @param candidate The candidate whose replay has been requested. */
	public void replayWithVisualization(AbstractRepresentation candidate) {
		//Default implementation
		System.out.println ("Fitness: "+this.evaluateFitness(candidate));
	}

	/** Evaluates the given representation by calculating its corresponding fitness value. A higher fitness means better performance.<br>
	 * @param candidate The candidate solution to be evaluated.
	 * @return the corresponding fitness value. */
	final public double evaluateFitness(AbstractRepresentation candidate) {
		double fitness = evaluateCandidate(candidate);
		candidate.setFitness(fitness);
		return fitness;
	}
	
	/** Evaluates the given representation by calculating its corresponding fitness value. A higher fitness means better performance.<br>
	 * @param candidate The candidate solution to be evaluated.
	 * @return the corresponding fitness value. */
	protected abstract double evaluateCandidate(AbstractRepresentation candidate);
	
	/** Returns the achievable maximum fitness of this problem. A representations with this fitness value cannot be improved any further. */
	public abstract double getMaximumFitness();
	
	/** Returns the novelty vector for the given candidate representation. Assigns the corresponding fitness value if requested. */
	public ArrayList<Float> getNoveltyVector(AbstractRepresentation candidate, boolean assignfitness) throws NotImplementedException {
		throw new NotImplementedException();
	}
}
