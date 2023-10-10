package Interview;

import java.util.HashMap;
import java.util.Map;

public class Employee {
    String name;

    @Override
    public int hashCode() {
        return 1;
    }
    public static void main(String[]args) {
        Map<Employee,Integer> employeeMap = new HashMap<>();
        employeeMap.put(new Employee(),1);
        employeeMap.put(new Employee(),2);
        employeeMap.put(new Employee(),3);
        System.out.println(employeeMap);
    }
}
