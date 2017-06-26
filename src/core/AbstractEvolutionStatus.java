package core;

import org.dom4j.Element;
import org.dom4j.Node;

public abstract class AbstractEvolutionStatus {

	/** Exports this EvolutionStatus and all its necessary data to the provided XML element. The EvolutionStatus must be reconstructible from the saved data using {@link #loadFromXML(Node)}.
	 * @param element The root element to be used for saving. */
	public abstract void exportToXmlElement (Element element);
	
	/** Reconstructs this EvolutionStatus from the given XML node.
	 * @param node The root XML node to load the data from.
	 * @return a newly created representation built from the provided data. */
	public abstract AbstractRepresentation loadFromXML(Node node);
}
