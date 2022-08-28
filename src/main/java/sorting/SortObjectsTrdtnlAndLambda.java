package sorting;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class SortObjectsTrdtnlAndLambda {
	// we will see how to sort primitives in traditional and lambda
	
	public static void sortTraditional() {
		List<EmployeeV2> employeeV2s = Database.getEmployeeV2s();
		
		//sort based on salary -- asc/desc based on over ridden compare method
		Collections.sort(employeeV2s, new MyComparator());
		System.out.println(employeeV2s);
		
	}
	
	public static void sortStream() {
		List<EmployeeV2> employeeV2s = Database.getEmployeeV2s();
		
		//using lambda
		Collections.sort(employeeV2s, (o1,  o2)-> (int) (o2.getSalary() - o1.getSalary()));
		System.out.println("Using Lambda");
		System.out.println(employeeV2s);
		
		
		// using stream api
		System.out.println("Using stream");
		employeeV2s
			.stream()
			.sorted((o1,  o2)-> (int) (o2.getSalary() - o1.getSalary()))
			.forEach(System.out::println);
		
		
		// Comparator's comparing
		// need to explore desc in this way
		System.out.println("Comparator's comparing");
		employeeV2s
			.stream()
			.sorted(Comparator.comparing(emp -> emp.getSalary()))
			.forEach(System.out::println);
		
		
		// further optimization using method reference // desc
		System.out.println("further optimization using method reference");
		employeeV2s
			.stream()
			//.sorted(Comparator.comparing(EmployeeV2::getSalary))
			.sorted(Comparator.comparing(EmployeeV2::getSalary).reversed())
			.forEach(System.out::println);
		
	}

}


class MyComparator implements Comparator<EmployeeV2> {

	@Override
	public int compare(EmployeeV2 o1, EmployeeV2 o2) {
		//asc
		//return (int) (o1.getSalary() - o2.getSalary());
		
		//desc
		return (int) (o2.getSalary() - o1.getSalary());
	}
	
}
