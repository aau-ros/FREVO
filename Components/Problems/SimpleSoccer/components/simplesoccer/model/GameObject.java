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

public class GameObject {
	
	public double distance;
	//public double direction;
	
	public double getDistance() {
		return this.distance;
	}
	
	
	/*public double getDirection() {
		return this.direction;
	}*/
	
	public void setDistance(double distance) {
		this.distance = distance;
	}
	
	/*public void setDirection(double direction) {
		this.direction = direction;
	}*/
	
	/**
	 * Returns the type of the object
	 * @return 0 if undefined, 1 if player, 2 if ball, 3 if line, 4 if goal
	 */
	public int getType() {
		return 0;
	}
}
