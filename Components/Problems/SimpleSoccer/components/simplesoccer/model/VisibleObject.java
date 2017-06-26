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
package components.simplesoccer.model;

public class VisibleObject {

	/** Returns 0 if the team of this player equals with the team of the observer, 1 if not, and -1 if not player */
	public int team = -1;
	
	/** Returns the distance to this object */
	public double distance;
	/** Returns the relative direction to this object in degrees */
	public double direction;
	
	public VisibleObject() {}
}
