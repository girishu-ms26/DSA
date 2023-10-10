package Int;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class TestingDuplicateEmployees {
	
	public static void main(String[]args) {
		ArrayList<DeplicateEmployeeList> employeeList = new ArrayList<>();
		new DeplicateEmployeeList("E001","PRADEEP","HR",36);
		employeeList.add(new DeplicateEmployeeList("E001","PRADEEP","HR",36));
		employeeList.add(new DeplicateEmployeeList("E001","PRADEEP","HR",36));
		employeeList.add(new DeplicateEmployeeList("E002","GIRISHU","LEAD",24));
		employeeList.add(new DeplicateEmployeeList("E001","PRADEEP","LEAD",36));
		
		// Count of employee repeated
		
		 Map<String,Long> nameCount = employeeList.stream().collect(Collectors
		 .groupingBy(DeplicateEmployeeList :: getName, Collectors.counting()));
		 System.out.println(nameCount);
		 
		// Loop
		
		Map<String, Integer> map = new HashMap<String,Integer>();
		for(DeplicateEmployeeList e:employeeList) {
			if(!map.containsKey(e.getName())) {
				map.put(e.getName(), 1);
			} else {
				map.put(e.getName(),map.get(e.getName())+1);
			}
		}
		System.out.println(map);
	}
}