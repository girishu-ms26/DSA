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
    private int employeeSalary;

    public Employee(String employeeName, int employeeAge, List<String> employeeNumbers, int employeeSalary) {
        this.employeeName=employeeName;
        this.employeeAge=employeeAge;
        this.employeeNumbers=employeeNumbers;
        this.employeeSalary=employeeSalary;
    }
    public int getEmployeeAge() {
        return employeeAge;
    }
    public int getEmployeeSalary() {
        return employeeSalary;
    }
    public static void main(String[]args) {
        Employee emp1 = new Employee("emp3", 59, Arrays.asList("123","321"),100);
        Employee emp2 = new Employee("emp1", 25,Arrays.asList("456"),500);
        Employee emp3 = new Employee("emp2", 23,Arrays.asList("678","098"),1000);

        List<Employee> employees = new ArrayList<>();
        employees.add(emp1);
        employees.add(emp2);
        employees.add(emp3);

        /*List<String> numbers = employees.stream().flatMap(employee -> employee.employeeNumbers.stream()).collect(Collectors.toList());
        System.out.print(numbers);*/
        System.out.println(employees.stream().collect(Collectors.summingInt(Employee::getEmployeeSalary)));
    }
}
