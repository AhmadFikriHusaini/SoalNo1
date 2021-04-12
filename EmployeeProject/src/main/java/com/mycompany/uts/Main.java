package com.mycompany.uts;

public class Main {
    public static void main(String[] args) {
        
        Employee emp1 = new Employee();
        Employee emp2 = new Employee("Disaster", 1998);
        Employee emp3 = new Employee("Zuggeberg",2008,"Human Resource","Officer");

        System.out.print("Name");
        System.out.print("\t\tID Number");
        System.out.print("\tDepartment");
        System.out.println("\tPosition");
        System.out.println("---------------------------------------------------------------------");
        
        emp1.setName("Susan Meyers");
        emp1.setIdNumber(47899);
        emp1.setDepartment("Accounting");
        emp1.setPosition("Vice President");
        
        emp2.setName("Mark Jones");
        emp2.setIdNumber(39119);
        emp2.setDepartment("IT");
        emp2.setPosition("Programmer");
        
        emp3.setName("Joy Rogers");
        emp3.setIdNumber(81774);
        emp3.setDepartment("Manufacturing");
        emp3.setPosition("Engineer");
        
        System.out.print(emp1.getName());
        System.out.print("\t"+emp1.getIdNumber());
        System.out.print("\t\t"+emp1.getDepartment());
        System.out.println("\t"+emp1.getPosition());
        
        System.out.print(emp2.getName());
        System.out.print("\t"+emp2.getIdNumber());
        System.out.print("\t\t"+emp2.getDepartment());
        System.out.println("\t\t"+emp2.getPosition());
        
        System.out.print(emp3.getName());
        System.out.print("\t"+emp3.getIdNumber());
        System.out.print("\t\t"+emp3.getDepartment());
        System.out.println("\t"+emp3.getPosition());
    }
}
