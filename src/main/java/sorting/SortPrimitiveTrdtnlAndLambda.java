package sorting;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class SortPrimitiveTrdtnlAndLambda {
	// we will see how to sort primitives in traditional and lambda
	
	public static void sortTraditional() {
		
		//asc
		List<Integer> ascList = Arrays.asList(8,3,12,4);
		Collections.sort(ascList);
		System.out.println(ascList);
		
		//desc --asc+rev
		List<Integer> descList = Arrays.asList(47,25,23,79);
		Collections.sort(descList);
		Collections.reverse(descList);
		System.out.println(descList);
	}
	
	public static void sortLambda() {
			
		//asc
		List<Integer> ascList = Arrays.asList(8,3,12,4);
		
		//toPrintIndividual
		ascList.stream().sorted().forEach(System.out::println);
		
		//toPrintList
		List<Integer> collect = ascList.stream().sorted().collect(Collectors.toList());
		System.out.println(collect);
		
		
		
		//desc
		List<Integer> descList = Arrays.asList(47,25,23,79);
		
		//toPrintIndividual
		ascList.stream().sorted(Comparator.reverseOrder()).forEach(System.out::println);
		
		//toPrintList
		List<Integer> collect2 = ascList.stream().sorted(Comparator.reverseOrder()).collect(Collectors.toList());
		System.out.println(collect2);
	}

}
