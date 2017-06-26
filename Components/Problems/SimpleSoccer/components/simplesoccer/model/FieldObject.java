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


public class FieldObject extends GameObject {

	public Point2D.Double position;
	
	public FieldObject (Point2D.Double pos) {
		this.position = pos;
	}
	
	public Point2D.Double getPosition() {
		return this.position;
	}
	
	public void setPosition (Point2D.Double pos) {
		this.position = pos;
	}
	
}
