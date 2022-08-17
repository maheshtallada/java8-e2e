package sorting;

import java.util.List;

public class CollectionSort {
	
	public static void sortById(List<Employee> listEmp) {
		listEmp.stream() //gives Collection
		.sorted((o1, o2) -> o1.getId()-o2.getId()) //asc
		.forEach(System.out::println);
	}

}
