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

/** Enumeration of possible types of variables defined in properties and requirements.
 * @author Istvan Fehervari*/
public enum XMLFieldType {

	/** Array of integers separated with the comma character. E.g. 1,2,3*/
	INTARRAY,
	/** String value*/
	STRING,
	/** Integer value*/
	INT,
	/** Long integer value*/
	LONG,
	/** Float value*/
	FLOAT,
	/** Boolean value*/
	BOOLEAN,
	/** Enumeration provided by a class*/
	ENUM,
	/** Path to a file*/
	FILE;
}
