package ROS;

import core.AbstractRepresentation;
import emergencyexit.Environment;
import java.io.IOException;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.lang.String;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.Files;
import java.util.ArrayList;
import java.util.Hashtable;
import java.util.NavigableMap;
import java.util.TreeMap;

/**
 * An interface to execute ROS simulations.
 * @author Micha Rappaport
 */
public class ROS_frevo {
	private AbstractRepresentation nnetwork;
	private String rosPackage = "/home/micha/Workspaces/ros_cps/src/cpswarm/emergency_exit"; // TODO: make it a variable parameter
	private Environment env;
	private ArrayList<NavigableMap<Integer,Double>> logs;

	/**
	 * Constructor.
	 * @param AbstractRepresentation candidate: The candidate representation.
	 */
	public ROS_frevo(AbstractRepresentation candidate) {
		nnetwork = candidate;
		
		// TODO: export candidate representation to ROS
	}
	
	/**
	 * Set the environment to use. It must exist already in ROS.
	 * @param Environment env: The environment as selected in the problem parameter.
	 */
	public void setEnvironment(Environment env) {
		this.env = env;
	}
	
	/**
	 * Write problem parameters to YAML file for ROS.
	 * @param Hashtable<String,String> params: A hash table containing parameter names and values.  
	 */
	public void setParameters(Hashtable<String,String> params) {
	    BufferedWriter writer;
		try {
			writer = new BufferedWriter(new FileWriter(rosPackage + "/config/frevo.yaml"));
			for (String param: params.keySet()) {
				writer.write(param + ": " + params.get(param));
				writer.newLine();
			}
			writer.close();
		}
		catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	/**
	 * Return the log file contents.
	 * @return ArrayList<NavigableMap<Integer,Double>>: An array with one map entry for each log file.
	 */
	public ArrayList<NavigableMap<Integer,Double>> getLogs() {
		return logs;
	}
	
	/**
	 * Read the log files produced by ROS.
	 * It assumes log files with two columns, separated by tabulator.
	 * The first column must be an integer, the second a double value.
	 * @return ArrayList<NavigableMap<Integer,Double>>: An array with one map entry for each log file.
	 */
	public void readLogs() {
		// container for data of all log files
		logs = new ArrayList<NavigableMap<Integer,Double>>();
		
		// path to log directory
	    File logPath = new File(rosPackage + "/log/");
	    
	    // iterate through all log files
	    String[] logFiles = logPath.list();
	    for ( int i=0; i<logFiles.length; i++ ) {
	    	// container for data of one log file
	    	NavigableMap<Integer,Double> log = new TreeMap<Integer, Double>();
	    	
	    	// read log file
	    	Path logFile = Paths.get(logPath + "/" + logFiles[i]);
	    	try {
	    		BufferedReader logReader = Files.newBufferedReader(logFile);
	    		
	    		// store every line
		    	String line;
				while ((line = logReader.readLine()) != null) {
					if ( line.length() <= 1 || line.startsWith("#") )
						continue;
					
					log.put(Integer.parseInt(line.split("\t")[0]), Double.parseDouble(line.split("\t")[1]));
				}
			}
	    	catch (IOException e) {
				e.printStackTrace();
			}
	    	
	    	// store contents of log file
	    	logs.add(log);
	    }
	}
	
	/**
	 * Run the simulation without GUI.
	 */
	public void run() {
		// run simulation
		String[] cmd = {"bash", "-c", rosPackage + "/scripts/" + env + "_visual.sh"}; // TODO: call without _visual
		Process p;
		try {
			p = Runtime.getRuntime().exec(cmd);
			p.waitFor();
		}
		catch (Exception e) {
			e.printStackTrace();
		}
		
		// read log files
		readLogs();
	}
	
	/**
	 * Run the simulation with GUI.
	 */
	public void runVisual(){
		String[] cmd = {"bash", "-c", rosPackage + "/scripts/" + env + "_visual.sh"};
		Process p;
		try {
			p = Runtime.getRuntime().exec(cmd);
			p.waitFor();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
