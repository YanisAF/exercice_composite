package org.example;

public class EmployeIndividuel implements Employee{
    private String name;
    private int age;

    public EmployeIndividuel(String name, int age){
        this.name = name;
        this.age = age;
    }

    @Override
    public void showDetails(){
        System.out.println("Informations sur l'employee : "+name+" "+age+" ans.");
    }
}
