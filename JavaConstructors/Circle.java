public class Circle {
    //parameter
    double radius;
    //default constructor
    Circle(){
        this.radius = 10;
    }
    //parameterized constructor
    Circle(double radius){
        this.radius = radius;
    }
    // method to display radius
    void DisplayRadius(){
        System.out.println("radius = " + radius);
    }
    // main method
    /**
     * @param args
     */
    public static void main(String[] args) {
        //object of circle class
        Circle circle = new Circle();
        //second object for parameterized constructor
        Circle circle2 = new Circle(15);
        circle.DisplayRadius();
        circle2.DisplayRadius();

    }

}
