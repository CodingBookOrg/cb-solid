public class C_LiskovSubstitutionPrinciple {
    /**
     * L in SOLID: Liskov Substitution Principle
     * objects in a program would be substitutable with child instances of that object class
     * Child class can be used as parent class objects
     */

    //******************************************************************
    /**
     * Examples
     */
    //******************************************************************
    private static class Shape {
        public double getArea() { return 0; }
    }
    private static class Circle extends Shape {
        private int r;
        public double getArea() { return Math.PI * Math.pow(r, 2); }
    }

    public static void main(String[] args) {
        Circle circle = new Circle();
        circle.getArea();

        //
        // using liskov substitution principle
        //
        Shape shape = circle;
    }

}
