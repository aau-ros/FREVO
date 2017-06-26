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

public class Line extends GameObject {

	public int line_id;
	
	/**
	 * Line object
	 * @param lineid 0: top, 1: right, 2: bottom, 3: left
	 */
	public Line(int lineid) {
		line_id = lineid;
	}
	
	public int getLineId() {
		return this.line_id;
	}
	
	public void setLineId(int id) {
		this.line_id = id;
	}
	
	/**
	 * Returns the type of the object
	 * @return 0 if undefined, 1 if player, 2 if ball, 3 if line, 4 if goal
	 */
	public int getType() {
		return 3;
	}
}
