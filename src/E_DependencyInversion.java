public class E_DependencyInversion {
    /**
     * D in SOLID: DependencyInversion Principle
     * BEWARE: It is not dependency injection
     * Abstractions should not depend on details, details should depend on abstracttions
     * Details are implemented using abstractions.
     * program interfaces
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
