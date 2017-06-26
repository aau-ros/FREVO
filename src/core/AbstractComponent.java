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

import java.util.Hashtable;



/**
 * Abstract base superclass for all FREVO components. Each component is instantiated based on a source {@link ComponentXMLData} class.
 * Furthermore, a map of properties are also always passed to each component. 
 * @author Istvan Fehervari
 */
public abstract class AbstractComponent {
	
	/** Holds a reference to a map containing key value pairs of the properties of this component. */
	private Hashtable<String, XMLFieldEntry> properties;
	
	/** Hold a backwards reference to the <tt>ComponentXMLdata</tt> object that was used to create this component instance. */
	private ComponentXMLData xmldata;
	
	/** Returns the <tt>ComponentXMLdata</tt> object that was used to create this component instance.
	 * @return A reference to the source <tt>ComponentXMLdata</tt> object.*/
	final public ComponentXMLData getXMLData() {
		return this.xmldata;
	}
	
	/** Sets the source <tt>ComponentXMLdata<tt> object to the given value.
	 * @param data The new <tt>ComponentXMLdata<tt> to be used. */
	final public void setXMLData (ComponentXMLData data) {
		this.xmldata = data;
	}
	
	/** Sets the properties of this component to the given value. The object will receive a clone (shallow copy) of the source map.
	 * @param properties The new map of property keys and values. */
	@SuppressWarnings("unchecked")
	final public void setProperties (Hashtable<String, XMLFieldEntry> properties) {
		// TODO: Implement deep copy to also cover string and other objects	
		this.properties = (Hashtable<String, XMLFieldEntry>) properties.clone();
	}
	
	/** Returns the properties of this component loaded from the component source XML file.
	 * @return A reference to the properties map of this component.*/
	final public Hashtable<String, XMLFieldEntry> getProperties() {
		return this.properties;
	}
	
	/**
	 * Returns the type of the given property key.
	 * @param key The key whose assigned type is requested.
	 * @return the type of the requested property key.
	 * @throws IllegalArgumentException if the given key is not found in the property map.
	 */
	final public XMLFieldType getTypeOfProperty(String key) {
		XMLFieldEntry entr = this.properties.get(key);
		if(entr == null)
			throw new IllegalArgumentException("Key "+key+" not found!");
		
		return entr.getType();
	}
		
	/**
	 * Returns the value assigned to the given property key.
	 * @param key The key whose assigned value is requested.
	 * @return The value of the requested property key.
	 * @throws IllegalArgumentException if the given key is not found in the property map.
	 */
	final public String getPropertyValue(String key) throws IllegalArgumentException {
		XMLFieldEntry entr = this.properties.get(key);
		if(entr == null)
			throw new IllegalArgumentException("Key "+key+" not found!");
		
		return entr.getValue();
	}
	
}
