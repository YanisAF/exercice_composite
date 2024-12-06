package org.example;

import java.util.ArrayList;
import java.util.List;

public class Manager implements Employee{
    private String name;
    private int age;
    private List<Employee> listEmploye = new ArrayList<>();

    public Manager(String name, int age){
        this.name = name;
        this.age = age;
    }

    public void add(Employee employee){
        listEmploye.add(employee);
    }

    public void deleteEmploye(Employee employee){
        listEmploye.remove(employee);
    }

    public void setListEmploye(List<Employee> listEmploye) {
        this.listEmploye = listEmploye;
    }

    @Override
    public void showDetails(){
        System.out.println("Manager : "+name+" "+age+" ans.");
        for (Employee employee : listEmploye){
            employee.showDetails();
        }
    }
}
