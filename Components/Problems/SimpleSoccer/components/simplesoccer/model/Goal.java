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

import java.awt.geom.Point2D;


public class Goal extends FieldObject {

	public int side;
	
	public Goal (Point2D.Double pos, int side) {
		super(pos);
		this.side = side;
	}
	
	public int getType() {
		return 4;
	}
	
	public int getSide() {
		return side;
	}
}
