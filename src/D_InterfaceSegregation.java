public class D_InterfaceSegregation {
    /**
     * I in SOLID: Interface Segregation (Division) Principle
     * Instead of one common interface for all clients, create a specific interface for a client needs
     * create specific interfaces instead of one common interface
     * avoid god interfaces (remember single responsibility principle)
     *
     * What the Interface Segregation Principle says is that your interface should not be bloated
     * with methods that implementing classes don’t require. For such interfaces, also called
     * “fat interfaces”, implementing classes are unnecessarily forced to provide
     * implementations (dummy/empty) even for those methods that they don’t need.
     * In addition, the implementing classes are subject to change when the interface changes.
     * An addition of a method or change to a method signature requires modifying all
     * the implementation classes even if some of them don’t use the method.
     *
     * Both the Interface Segregation Principle and Single Responsibility Principle have the same goal:
     * ensuring small, focused, and highly cohesive software components.
     *
     * The difference is that Single Responsibility Principle is concerned with classes,
     *  while Interface Segregation Principle is concerned with interfaces
     *
     *  Eases testing as mock classes can be written to implement interfaces and those could be used in testing
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
