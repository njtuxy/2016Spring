package com.company;

import java.util.Comparator;
import java.util.TreeSet;

public class Main {

    public static void main(String[] args) {
	// write your code here
    }


    public static void order2Employees(){
        TreeSet<Employee> employeeOrderByName = new TreeSet<Employee>(new EmployeeNameComparator());
        TreeSet<Employee> employeeOrderByAge = new TreeSet<Employee>(new EmployeeAgeComparator());
        TreeSet<Employee> employeeOrderByDepartment = new TreeSet<Employee>(new EmployeeDepartmentComparator());

        employeeOrderByName.add(new Employee("Yan Xia", "QA Automation", 34));
        employeeOrderByName.add(new Employee("Waylon", "QA Automation", 29));

        employeeOrderByAge.add(new Employee("Yan Xia", "QA Automation", 34));
        employeeOrderByAge.add(new Employee("Waylon", "QA Automation", 29));


        for(Employee e:employeeOrderByName){
            System.out.println(e.name);
        }

        for(Employee e:employeeOrderByAge){
            System.out.println(e.name);
        }


    }


}

class Employee{

    public String name;
    public String department;
    public Integer age;

    Employee(String name, String department, Integer age){
        this.name = name;
        this.department = department;
        this.age = age;
    }

}

class EmployeeNameComparator implements Comparator<Employee>{

    @Override

    public int compare(Employee e1, Employee e2){
        if(e1.name.compareTo(e2.name) > 0){
            return 1;
        }else{
            return -1;
        }
    }

}


class EmployeeAgeComparator implements Comparator<Employee>{

    @Override

    public int compare(Employee e1, Employee e2){
        if(e1.age > e2.age){
            return 1;
        }else{
            return -1;
        }
    }

}

class EmployeeDepartmentComparator implements Comparator<Employee>{

    @Override

    public int compare(Employee e1, Employee e2){
        if(e1.department.compareTo(e2.department) > 0 ){
            return 1;
        }else{
            return -1;
        }
    }

}
