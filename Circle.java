package first;
import java.util.Scanner;//import scanner class to input data

// Circle Class with a an attribute radius and methods area and circumference 
public class Circle {

    private double radius; // Stores the radius of the circle.

    // Constructors:

     // No-arg constructor (default circle). it initializes a circle with a default radius of 1.
    public Circle() {
        this.radius = 1; // Sets the default radius to 1.
    }

     // b) Constructor with specified radius(Parameterized constructor)
    public Circle(double radius) {
        this.radius = radius; // Sets the radius to the provided value.
    }

    // Method to get the area of the circle.
        public double getArea() {
        double area;
        area = 3.14 * radius * radius; // Calculates the area using the formula: π * r^2
        return area;
    }

    // Method to get the circumference of the circle.
     
    public double getcircumference() {
        double circumference;
        circumference = 2 * 3.14 * radius; // Calculates the circumference using the formula: 2 * π * r
        return circumference;
    }

    // Main Method (Testing the class)
    public static void main(String[] args) 
    {
   
    	// Creating Circle Objects
        Circle Circle1 = new Circle(); // Creates a default circle with radius 1.
        Circle Circle2 = new Circle(5); // Creates a circle with radius 5.
        double a;
        System.out.println("Enter the value of Radius of circle: ");
        Scanner input = new Scanner(System.in);
        a = input.nextDouble();
        Circle Circle3 = new Circle(a);

        //Displaying Circle1 details
        System.out.println("Circle1:");
        System.out.println("Radius of Circle: " + Circle1.radius);
        System.out.println("Area: " + Circle1.getArea());
        System.out.println("Circumference: " + Circle1.getcircumference());

        // Displaying Circle2 details
        System.out.println("Circle2:");
        System.out.println("Radius of Circle: " + Circle2.radius);
        System.out.println("Area: " + Circle2.getArea());
        System.out.println("Circumference: " + Circle2.getcircumference());
        
        //Displaying Circle3 details
        System.out.println("Circle3:");
        System.out.println("Radius of Circle: " + Circle3.radius);
        System.out.println("Area: " + Circle3.getArea());
        System.out.println("Circumference: " + Circle3.getcircumference());
        input.close();    
    }
}