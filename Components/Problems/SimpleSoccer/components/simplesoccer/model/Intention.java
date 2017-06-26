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

public class Intention {
	
	public int intId;
	public double param1,param2;
	public String param3s;
	
	public Intention (int id, double p1, double p2, String p3s) {
		this.intId = id;
		this.param1 = p1;
		this.param2 = p2;
		this.param3s = p3s;
	}
}
