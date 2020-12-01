public class E_DependencyInversion {
    /**
     * D in SOLID: DependencyInversion Principle
     * BEWARE: It is not dependency injection
     * Abstractions should not depend on details, details should depend on abstracttions
     * Details are implemented using abstractions.
     * program to interfaces
     *
     * Dependency Inversion is more focused on the structure of your code,
     * its focus is keeping your code loosely coupled.
     * On the other hand, Dependency Injection is how the code functionally works.
     */
    //******************************************************************
    /**
     * Examples
     */
    //******************************************************************
    static interface ITaxable { double calculateTax(); }
    static class Employee implements ITaxable {

        @Override
        public double calculateTax() {
            return 0;
        }
    }

    public static void main(String[] args) {
        ITaxable taxable = new Employee();
        System.out.println(taxable.calculateTax());
    }
}
