package test;

import java.util.HashMap;
import java.util.Map;

public class MapDemoWithObjKey {

	public static void main(String[] args) {
		
		// to demonstrate adding of objects as keys to a map.
		
		// run this same code with 1.with equals and hashcode method overridden
		// and 2. uncomment those 2 methods
		Map<Student, Integer> empMap = new HashMap<>();
		
		Student student = new Student(1, "Aspire");
		empMap.put(student,1001);
		System.out.println(empMap);
		
		Student studentDup = new Student(1, "Aspire");
		empMap.put(studentDup,1005);
		System.out.println(empMap);
		
		empMap.put(null,1006);
		empMap.put(null,10001001);
		System.out.println(empMap);

		
	}

}
