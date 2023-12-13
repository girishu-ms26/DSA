package interviewPrep;

import java.util.*;
import java.util.stream.Collectors;

public class Employee implements Comparator<Employee> {
    int employeeId;
    String employeeName;

    public Employee(int employeeId, String employeeName) {
        this.employeeId = employeeId;
        this.employeeName = employeeName;
    }
    public Employee() {
    }
    public int getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(int employeeId) {
        this.employeeId = employeeId;
    }

    public String getEmployeeName() {
        return employeeName;
    }

    public void setEmployeeName(String employeeName) {
        this.employeeName = employeeName;
    }


    @Override
    public int compare(Employee o1, Employee o2) {
        return Integer. compare(o1.employeeId,o2.employeeId);
    }
}
class Test {
    public static void main(String[]args) {
        List<Employee> empList = new ArrayList<>();
        empList.add(new Employee(1,"girishu1"));
        empList.add(new Employee(3,"girishu3"));
        empList.add(new Employee(2,"girishu2"));
        empList.add(new Employee(0,"girishu0"));
        Employee emp = new Employee();

//        Collections.sort(empList,emp);
//        empList.stream().forEach(i -> System.out.println(i.employeeId+" "+i.employeeName));
        empList.stream().sorted(Comparator.comparing(i -> i.employeeId)).forEach(i -> System.out.println(i.employeeId+" "+i.employeeName));
    }
}
