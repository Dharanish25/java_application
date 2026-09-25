 package org.example;

public class App {

    public double calculateSalary(double basicSalary, double bonus) {
        return basicSalary + bonus;
    }

    public double calculateTax(double salary) {
        if (salary > 50000) {
            return salary * 0.10;
        } else {
            return salary * 0.05;
        }
    }

    public double calculateNetSalary(double basicSalary, double bonus) {
        double salary = calculateSalary(basicSalary, bonus);
        double tax = calculateTax(salary);
        return salary - tax;
    }

    public static void main(String[] args) {

        App employee = new App();

        double basicSalary = 40000;
        double bonus = 10000;

        double grossSalary = employee.calculateSalary(basicSalary, bonus);
        double tax = employee.calculateTax(grossSalary);
        double netSalary = employee.calculateNetSalary(basicSalary, bonus);

        System.out.println("Employee Salary Details");
        System.out.println("-----------------------");
        System.out.println("Basic Salary : " + basicSalary);
        System.out.println("Bonus        : " + bonus);
        System.out.println("Gross Salary : " + grossSalary);
        System.out.println("Tax          : " + tax);
        System.out.println("Net Salary   : " + netSalary);
    }
}
