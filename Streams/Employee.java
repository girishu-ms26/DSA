package Streams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Employee {
    private String employeeName;
    private int employeeAge;
    private List<String> employeeNumbers;

    public Employee(String employeeName, int employeeAge, List<String> employeeNumbers) {
        this.employeeName=employeeName;
        this.employeeAge=employeeAge;
        this.employeeNumbers=employeeNumbers;
    }
    public int getEmployeeAge() {
        return employeeAge;
    }
    public static void main(String[]args) {
        Employee emp1 = new Employee("emp3", 59, Arrays.asList("123","321"));
        Employee emp2 = new Employee("emp1", 25,Arrays.asList("456"));
        Employee emp3 = new Employee("emp2", 23,Arrays.asList("678","098"));

        List<Employee> employees = new ArrayList<>();
        employees.add(emp1);
        employees.add(emp2);
        employees.add(emp3);

        List<String> numbers = employees.stream().flatMap(employee -> employee.employeeNumbers.stream()).collect(Collectors.toList());
        System.out.print(numbers);
    }
}
