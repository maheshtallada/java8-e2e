package sorting;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class CollectionSort {
	
	public static void sortById(List<Employee> listEmp) {
		listEmp.stream() //gives Collection
		.sorted((o1, o2) -> o1.getId()-o2.getId()) //asc
		.forEach(System.out::println);
	}
	
	public static void sortByIdAndThenSalary(List<Employee> listEmp) {
		Comparator<Employee> compareById = 
				Comparator.comparing( Employee::getId);
		
		Comparator<Employee> compareBySalary = 
				Comparator.comparing( Employee::getSalary);
		
		Comparator<Employee> compareByIdAndSalary = 
				compareById
					.thenComparing(compareBySalary.reversed());
		
		//Collections.sort(listEmp, compareByIdAndSalary);
		//System.out.println(listEmp);
		
		listEmp.stream().sorted(compareByIdAndSalary).forEach(System.out :: println);
	}

}
