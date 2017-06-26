package cam;
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
import core.AbstractRepresentation;


public class Cell {

	public AbstractRepresentation representation;
	
	public int color; //current color
	public int nextcolor; //new color 
	public int targetcolor; //index of the intended color in Cam.colArr
	
	public float[] output; //current output info to neighboring cells
	public float[] nextoutput; //new output
	
	public int outputnumber;
	
	/**Constructs a new Cell object.
	 * @param representation Representation object used in this cell
	 * @param colorindex The intended target color
	 * @param outputnumber Number of outputs that this cell generates*/
	public Cell (AbstractRepresentation representation, int colorindex, int outputnumber) {
		this.representation = representation;
		this.targetcolor = colorindex;
		this.outputnumber = outputnumber;
		
		output = new float[outputnumber];		
		nextoutput = new float[outputnumber];
		
		for (int i=0;i<outputnumber;i++) {
			output[i] = -1;
		}
		
		color = -1;
		
	}
	
	public void update()
	{
		color=nextcolor;
		for (int i=0; i<outputnumber; i++)
			output[i]=nextoutput[i];
	}
}
