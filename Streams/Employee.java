package Streams;

import jdk.nashorn.internal.objects.annotations.Getter;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Employee {
    private String employeeName;
    private int employeeAge;

    public Employee(String employeeName, int employeeAge) {
        this.employeeName=employeeName;
        this.employeeAge=employeeAge;
    }
    public int getEmployeeAge() {
        return employeeAge;
    }
    public static void main(String[]args) {
        Employee emp1 = new Employee("emp3",59);
        Employee emp2 = new Employee("emp1",25);
        Employee emp3 = new Employee("emp2",23);

        List<Employee> employees = new ArrayList<>();
        employees.add(emp1);
        employees.add(emp2);
        employees.add(emp3);

//        employees.stream().sorted((Comparator.nullsLast(
//                Comparator.comparing(i -> i.employeeAge)
//        ))).forEach(i -> System.out.println(i.employeeName + " " + i.employeeAge));

        employees.stream().sorted(Comparator.comparing(i -> i.employeeName)).forEach(i -> System.out.println(i.employeeName));
    }
}
