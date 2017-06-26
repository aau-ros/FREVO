/*
 * Copyright (C) 2009 Istvan Fehervari, Wilfried Elmenreich
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

/** Provides a list of component types 
 * @author Istvan Fehervari*/
public enum ComponentType {
	/** Indicates a problem with an absolute fitness.
	 * @see AbstractSingleProblem */
	FREVO_PROBLEM,
	/** Indicates a problem that evaluates many candidates at a time.
	 * @see AbstractMultiProblem*/
	FREVO_MULTIPROBLEM,
	/** Indicates an optimization method component.
	 * @see AbstractMethod*/
	FREVO_METHOD,
	/** Indicates a solution representation.
	 * @see AbstractRepresentation*/
	FREVO_REPRESENTATION,
	/** Indicates a set of solution representations.
	 * @see AbstractRepresentation*/
	FREVO_BULKREPRESENTATION,
	/** Indicates a ranking algorithm.
	 * @see AbstractRanking*/
	FREVO_RANKING
}
