package org.example;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Employee employee1 = new EmployeIndividuel("Rudy", 35);
        Employee employee2 = new EmployeIndividuel("Gerard", 30);
        Employee employee3 = new EmployeIndividuel("Paolo", 62);
        Employee employee4 = new EmployeIndividuel("Yoda", 25);

        Manager manager1 = new Manager("Jean", 35);
        Manager manager2 = new Manager("Carlos", 28);

        manager1.add(employee1);
        manager1.add(employee2);
        manager2.add(employee3);
        manager2.add(employee4);

        manager1.showDetails();
        manager2.showDetails();
    }
}