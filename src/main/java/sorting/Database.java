package sorting;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

public class Database {
	
	public static List<EmployeeV2> getEmployeeV2s() {
		
		List<EmployeeV2> list = new ArrayList<>();
		list.add(new EmployeeV2(176, "Roshan", "IT", 600000));
		list.add(new EmployeeV2(388, "Bikash", "CIVIL", 900000));
		list.add(new EmployeeV2(470, "Bimal", "DEFENSE",500000));
		list.add(new EmployeeV2(624, "Sourav", "CORE", 400000));
		list.add(new EmployeeV2(176, "Prakash", "SOCIAL", 1200000));
		
		return list;
	}
	
	public static Map<String, Integer> getMap() {
		
		Map<String, Integer> map = new HashMap<>();
		map.put("Gupta", 2);
		map.put("Mahesh", 1);
		map.put("Tallada", 3);
		
		return map;
	}

}
