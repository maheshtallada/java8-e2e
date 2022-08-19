package sorting;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
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
		
}