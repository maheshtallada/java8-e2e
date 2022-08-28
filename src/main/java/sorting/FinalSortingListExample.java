package sorting;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

import lombok.AllArgsConstructor;
import lombok.Data;

public class FinalSortingListExample {

	// 1. sort an object list, based on a field.
	
	/* 2. sort the same object list, based on two fields., 
	sort dept name desc and then for same dept, the stu names should be asc */
	
	static List<Hosteler> hostelers = Arrays.asList(
			new Hosteler(4, "Keerthana"),
			new Hosteler(2, "Akhil"),
			new Hosteler(3, "Srikanth"),
			new Hosteler(6, "Arun"),
			new Hosteler(5, "Amir"),
			new Hosteler(1, "Harish"),
			new Hosteler(8, "Sriram"),
			new Hosteler(7, "saiteja"),
			new Hosteler(53, "Mahesh"),
			new Hosteler(10, "Mahesh"),
			new Hosteler(9, "Prashanth"));
	
	public static void main(String[] args) {
		hostelers.stream().forEach(System.out::println);
		
		System.out.println("******** Sort based on rollNo desc ********");
		List<Hosteler> rollNoDesc = hostelers.stream()
			.sorted((h1, h2)-> h2.getRollNo()-h1.getRollNo())
			.collect(Collectors.toList());
		rollNoDesc.stream().forEach(System.out::println);
		
		
		System.out.println("******** Sort based on name desc ********");
		hostelers.stream()
			.sorted((h1, h2) -> h2.getName().compareTo(h1.getName()))
			.forEach(System.out::println);
		// observe that, when names are same, 
		//the objects are printed which has higher rollNo, but we want the other way
		
		
		System.out.println("******** Sort based on name desc and rollNo asc ********");
		Comparator<Hosteler> nameComp = (h1, h2) -> h2.getName().compareTo(h1.getName());
		Comparator<Hosteler> rollNoComp = (h1, h2) -> h1.getRollNo()-h2.getRollNo();
		hostelers.stream()
			.sorted(nameComp.thenComparing(rollNoComp))
			.forEach(System.out::println);

	}

}

@Data
@AllArgsConstructor
class Hosteler {
	
	private Integer rollNo;
	private String name;
}
