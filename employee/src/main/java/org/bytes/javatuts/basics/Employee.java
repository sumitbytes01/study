package org.bytes.javatuts.basics;
import java.util.Arrays;

public class Employee {
    private String name;
    private String id;
    private float salary;
    private String department;
    private Address address;
    private String[] hobbies;

    public Employee(String name, String id, float salary,String department, Address address,String[] hobbies) {
        this.name = name;
        this.id = id.toUpperCase();
        this.salary = salary;
        this.department = department;
        this.address= address;
        this.hobbies = hobbies;
    }

    public String[] getHobbies() {
        return hobbies;
    }



    @Override
    public String toString() {
        return "Employee{" +
                "hobbies=" + Arrays.toString(hobbies) +
                ", address=" + address +
                ", department='" + department + '\'' +
                ", salary=" + salary +
                ", id='" + id + '\'' +
                ", name='" + name + '\'' +
                '}';
    }

    public void setHobbies(String[] hobbies) {
        this.hobbies = hobbies;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public float getSalary() {
        return salary;
    }

    public void setSalary(float salary) {
        this.salary = salary;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    // write toString() method

    public static void main(String args[]) {
        Address add1 = new Address("h2 wing 706", "pune","india", 411027);
        String[] hobbies = {"Reading", "Coding", "Traveling"};
        Employee emp1 = new Employee("sumit", "egh108", 50000.00f, Department.HR.getDesc(),add1, hobbies );
        System.out.println(emp1);

    }


}

// hobbies of an employee