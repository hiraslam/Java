package hello;
import static java.lang.Math.*;

public class Mymathclass {
    public static void main(String[] args) {
        // Calculating and printing mathematical operations directly
        System.out.println("Square Root of 25: " + sqrt(25));
        System.out.println("2 to the power of 3: " + pow(2, 3));
        System.out.println("Absolute value of -10.5: " + abs(-10.5));
        System.out.println("Natural log of e: " + log(E));
        System.out.println("Random number: " + random());
        
        double angle1 = 30;
        double angle2 = 45;
        double angle3 = 60;

        // Convert degrees to radians
        double rad1 = Math.toRadians(angle1);
        double rad2 = Math.toRadians(angle2);
        double rad3 = Math.toRadians(angle3);

        // Compute and print sine values
        System.out.println("Sine of 30°: " + Math.sin(rad1));
        System.out.println("Sine of 45°: " + Math.sin(rad2));
        System.out.println("Sine of 60°: " + Math.sin(rad3));

        // Compute and print cosine values
        System.out.println("Cosine of 30°: " + Math.cos(rad1));
        System.out.println("Cosine of 45°: " + Math.cos(rad2));
        System.out.println("Cosine of 60°: " + Math.cos(rad3));

        // Compute and print tangent values
        System.out.println("Tangent of 30°: " + Math.tan(rad1));
        System.out.println("Tangent of 45°: " + Math.tan(rad2));
        System.out.println("Tangent of 60°: " + Math.tan(rad3));
        

    }
}
