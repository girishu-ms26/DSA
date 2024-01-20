package interviewPrep;

import java.sql.SQLException;
import java.util.*;

import static interviewPrep.Employee.nameComparator;

public class Employee implements Comparable<Employee> {
    int employeeId;
    String employeeName;

    public Employee(int employeeId, String employeeName) {
        this.employeeId=employeeId;
        this.employeeName=employeeName;
    }

    @Override
    public int compareTo(Employee o) {
        return this.employeeId - o.employeeId;
    }
    @Override
    public String toString(){
        return "[employeeId="+this.employeeId+",employeeName="+this.employeeName+"]";
    }
    public static Comparator<Employee> nameComparator = new Comparator<Employee>() {
        @Override
        public int compare(Employee o1, Employee o2) {
            return o1.employeeName.compareTo(o2.employeeName);
        }
    };
}
class Test {
    public static void main(String[]args) {
        Employee[] empArr = new Employee[3];
        empArr[0] = new Employee(1,"Girishu3");
        empArr[1] = new Employee(3,"Girishu2");
        empArr[2] = new Employee(2,"Girishu1");
        Arrays.sort(empArr,nameComparator);
        System.out.println("sorted"+Arrays.toString(empArr));

    }
}
