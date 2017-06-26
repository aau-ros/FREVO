package emergencyexit;

import java.util.HashMap;
import java.util.Map;
import java.util.NoSuchElementException;

public enum Environment {
	SMALL_MAZE("small_maze"),
	SMALL_MAP("NOT IMPLEMENTED YET!"),
	MAZE_1("NOT IMPLEMENTED YET!");

	public String toString() {
		return getName();
	}

	private final String name;
	
	private static final Map<String, Environment> map = new HashMap<String, Environment>();

	static {
		for (Environment type : Environment.values()) {
			map.put(type.name, type);
		}
	}

	private Environment(String name){
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public static Environment fromString(String name) {
		if (map.containsKey(name)) {
			return map.get(name);
		}
		throw new NoSuchElementException(name + "not found");
	}
}
