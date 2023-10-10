package Int;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class Test2 {
	public static void main(String[]args) {
		List<Integer> list = new ArrayList<>();
		Collections.addAll(list,1,2,3,4,2,5,4);
		Set<Integer> set = new HashSet<>();
		List<Integer> duplicateData = list.stream().filter(i -> !set.add(i)).collect(Collectors.toList());
		System.out.println(duplicateData);
	}
	
	// SELECT * FROM employee salary = (select max(salary) from employee);
}
