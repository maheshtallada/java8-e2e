package sorting;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import java.util.Map.Entry;

public class SortMapTrdnlAndLambda {
	// we will see how to sort map in traditional and lambda
	
	//for preserving insertion order, we can go with treemap
	
	public static void sortMapTraditional() {
		Map<String, Integer> map = Database.getMap();
		
		List<Entry<String, Integer>> arrayList = new ArrayList<>(map.entrySet());
		Collections.sort((List<Entry<String, Integer>>) arrayList, 
				new Comparator<Entry<String, Integer>>() {

					@Override
					public int compare(Entry<String, Integer> o1, Entry<String, Integer> o2) {
						//return o1.getKey().compareTo(o2.getKey());
						return o1.getValue().compareTo(o2.getValue());
					}
		});
		
		// to verify sorting order
		for(Entry<String, Integer> entry: arrayList) {
			System.out.println(entry.getKey() + " " + entry.getValue());
		}
		
		
		// custom object sort
		
	}
	
	public static void sortMapLambda() {
		Map<String, Integer> map = Database.getMap();
		List<Entry<String, Integer>> arrayList = new ArrayList<>(map.entrySet());
		
		// using lambda
		System.out.println("Using Lambda");
		Collections.sort(arrayList, (o1, o2)-> o1.getValue().compareTo(o2.getValue()));
		
		// to verify sorting order
		for(Entry<String, Integer> entry: arrayList) {
			System.out.println(entry.getKey() + " " + entry.getValue());
		}
		
		
		//using stream api
		System.out.println("Using streams");
		
		//asc primitive
		map.entrySet().stream().sorted(Map.Entry.comparingByKey()).forEach(System.out::println);
		System.out.println("*********************************");
		map.entrySet().stream().sorted(Map.Entry.comparingByValue()).forEach(System.out::println);
		
		//desc primitive -- can use reversed -- need to explore
		
	}
	
	public static void sortCustomMapLambda() {
		
		// traditional asc
		// we can directly add comparator for treeMap as shown below::
		Map<EmployeeV2, Integer> employeeMap = new TreeMap<>(new Comparator<EmployeeV2>() {

			@Override
			public int compare(EmployeeV2 o1, EmployeeV2 o2) {
				return (int) (o1.getSalary()-o2.getSalary());
			}
		});
		
		employeeMap.put(new EmployeeV2(176, "Roshan", "IT", 600000), 60);
		employeeMap.put(new EmployeeV2(388, "Bikash", "CIVIL", 900000), 90);
		employeeMap.put(new EmployeeV2(470, "Bimal", "DEFENSE",500000), 50);
		employeeMap.put(new EmployeeV2(624, "Sourav", "CORE", 400000), 40);
		employeeMap.put(new EmployeeV2(176, "Prakash", "SOCIAL", 1200000), 120);
		
		// to verify
		employeeMap.entrySet().stream().forEach(System.out::println);
		
		
		//using lambda desc
		Map<EmployeeV2, Integer> employeeMapLambda = new TreeMap<>(
				(o1, o2) -> (int) (o2.getSalary() - o1.getSalary()));
		
		employeeMapLambda.put(new EmployeeV2(176, "Roshan", "IT", 600000), 60);
		employeeMapLambda.put(new EmployeeV2(388, "Bikash", "CIVIL", 900000), 90);
		employeeMapLambda.put(new EmployeeV2(470, "Bimal", "DEFENSE",500000), 50);
		employeeMapLambda.put(new EmployeeV2(624, "Sourav", "CORE", 400000), 40);
		employeeMapLambda.put(new EmployeeV2(176, "Prakash", "SOCIAL", 1200000), 120);
		
		// to verify
		System.out.println("******************* lambda **********");
		employeeMapLambda.entrySet().stream().forEach(System.out::println);
		
		
		
		
		// stream api
		System.out.println("****************** Stream API ***********");
		employeeMapLambda.entrySet().stream()
				.sorted(Map.Entry.comparingByKey(Comparator.comparing(EmployeeV2::getSalary)))
				.forEach(System.out::println);
				
		employeeMapLambda.entrySet().stream()
				.sorted(Map.Entry.comparingByKey(Comparator.comparing(EmployeeV2::getSalary)
						.reversed()))
				.forEach(System.out::println);
	}
		
}