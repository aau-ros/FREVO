package swissSystem;
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
public class ResultElement {

	private SwissElement against;
	private int result;
	private int hashcode;
	
	public ResultElement (SwissElement id, int result) {
		this.against = id;
		this.result = result;
	}
	
	public ResultElement (SwissElement id, int result, int hc) {
		this(id,result);
		hashcode = hc;
	}
	
	public SwissElement getId() {
		return against;
	}
	
	public int getHashcode() {
		return hashcode;
	}
	
	public void setId(SwissElement id) {
		this.against = id;
	}
	
	public int getResult() {
		return this.result;
	}
	
	public void setResult(int result) {
		this.result = result;
	}
	
	/**
	 * Return true if the game against this id was won, false otherwise
	 * @return
	 */
	public boolean isWin() {
		if (result == 1) return true;
		return false; 
	}
}
