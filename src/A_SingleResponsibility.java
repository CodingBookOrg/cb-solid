import java.math.BigDecimal;

public class A_SingleResponsibility {
    /**
     * S in SOLID: Single responsibility principle
     * Each class should have only one responsibility
     * There should not be more than one reason to change a class
     * God class: trying to do a lot of things, has many responsibilities
     */

    /**
     * Example god class
     */
    private class EmployeeGodClass {
        public BigDecimal calculateTax() { return null; }
        public BigDecimal calculateYearlySalary() { return null; }
        public int getDependantCount() { return 0; }
    }

    /**
     * Divide above class into subclasses
     */
    private class Employee {
        public int getDependantCount() { return 0; }
    }
    private class TaxCalculator {
        public BigDecimal calculateYearlyTax(Employee employee) { return null; }
    }
    private class SalaryCalculator {
        public BigDecimal calculateYearlySalary(Employee employee) { return null; }
    }

}
