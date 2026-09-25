package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class AppTest {

    @Test
    public void testCalculateSalary() {
        App employee = new App();

        double result = employee.calculateSalary(40000, 10000);

        assertEquals(50000, result);
    }

    @Test
    public void testCalculateTax() {
        App employee = new App();

        double result = employee.calculateTax(60000);

        assertEquals(6000, result);
    }

    @Test
    public void testCalculateNetSalary() {
        App employee = new App();

        double result = employee.calculateNetSalary(40000, 10000);

        assertEquals(47500, result);
    }
}
