public class D_InterfaceSegregation {
    /**
     * I in SOLID: Interface Segregation Principle
     * Instead of one common interface for all clients, create a specific interface for a client needs
     * create specific interfaces instead of one common interface
     * avoid god interfaces (remember single responsibility principle)
     */
    //******************************************************************
    /**
     * Examples
     */
    //******************************************************************
    interface IEmployee {
        String getSSN();
        String getName();
        int getDependantCount();
        double calculateTax(); //tax calculation
        double calculateSalary(); //salary calculation
    }

    //can be divided into
    interface ITaxable {
        double calculateTax();
    }

    interface IPayable {
        double calculateSalary();
    }

    interface IBasicEmployee {
        String getSSN();
        String getName();
        int getDependantCount();
    }
}
