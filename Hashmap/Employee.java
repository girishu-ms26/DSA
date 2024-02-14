package Hashmap;

import java.util.EnumMap;
import java.util.HashMap;

public class Employee {
    private int id;
    private String firstName;
    private String lastName;
    private int salary;

    public Employee(int id, String firstName, String lastName, int salary) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.salary = salary;
    }

    public int getId() {
        return id;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public int getSalary() {
        return salary;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    @Override
    public int hashCode(){
        final int prime = 31;
        int result = 1;
        result = result * prime + id;
        result = result * prime + ((firstName==null) ? 0 : firstName.hashCode());
        result = result * prime + ((firstName==null) ? 0 : lastName.hashCode());
        result = result * prime + salary;
        return result;
    }

    public static void main(String[] args) {
        Employee e1 = new Employee(1,"a","b",2);
        Employee e2 = new Employee(2,"a","b",2);
        Employee e3 = new Employee(3,"a","b",2);
        Employee e4 = new Employee(4,"a","b",2);

        HashMap<Employee,Integer> emp = new HashMap<>();
        emp.put(e1,1);
        emp.put(e2,1);
        emp.put(e3,1);
        emp.put(e4,1);
        System.out.println(emp.size());
    }
}
