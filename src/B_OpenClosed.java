public class B_OpenClosed {
    /**
     * O in SOLID: Open closed principle
     * Your classes should be open for extension but close for modification
     * meaning extension should not end up in modificaton.
     * How: use abstract base classes and interfaces
     */

    //******************************************************************
    /**
     * Examples
     */
    //******************************************************************

    interface IEmployee {
        String getName();
    }

    class Employee implements IEmployee {

        @Override
        public String getName() {
            return null;
        }
    }

    /**
     * if we want to add new features to employee class.
     * we can do so by adding new default function to IEmployee interface
     */
    interface IEmployee_Extended {
        String getName();
        default String getSurname() { return null; }
    }


//----------------------------------------------------------------------
    /**
     * Using inheritance
     */
    class BaseEmployee {
        public String getName() { return null; }
        public int getSalary() { return 100; }
    }

    class Employee2 extends BaseEmployee {
    }

    /**
     * if we want to add new features to Employee3 class.
     * we can do so by adding new function to BaseEmployee class
     */
    class BaseEmployee_Extended {
        public String getName() { return null; }
        public String getSurname() { return null; }
    }


    //----------------------------------------------------------------------
    /**
     * Using polymorphism
     */
    class SalaryCalculator {
        public int calculate(BaseEmployee employee) {
            return employee.getSalary();
        }
    }

    // if we want to add new employee types
    // we do not need to edit existing implementation
    class Manager extends BaseEmployee {
        @Override
        public int getSalary() {
            return 300;
        }
    }

}
