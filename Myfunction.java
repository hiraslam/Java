// Package declaration (required in the project structure)
package first; 

// Importing Scanner class to take user input
import java.util.Scanner; 

// Class definition
public class Myfunction {
    
    // Method to find the Greatest Common Divisor (GCD) of two numbers
    public static int findGCD(int a, int b) {
        int gcd = 1; // Variable to store the greatest common divisor
        int min; // Variable to store the smaller number

        // Finding the smaller number between 'a' and 'b'
        if (a > b)
            min = b;
        else
            min = a;

        // Loop to check for common divisors from 1 to the smaller number
        for (int i = 1; i <= min; i++) {
            // If 'i' is a factor of both 'a' and 'b'
            if (a % i == 0 && b % i == 0) {
                gcd = i; // Update gcd whenever a common divisor is found
            }
        }

        return gcd; // Returning the greatest common divisor
    }

    // Main method where program execution begins
    public static void main(String[] args) {
        // Creating a Scanner object to take user input
        Scanner scanner = new Scanner(System.in);

        // Asking the user to enter two integers
        System.out.print("Enter two integers: ");
        int num1 = scanner.nextInt(); // Reading first number
        int num2 = scanner.nextInt(); // Reading second number

        // Calling the findGCD method and printing the result
        System.out.println("GCD of " + num1 + " and " + num2 + " is: " + findGCD(num1, num2));

        // Closing the scanner to prevent memory leaks
        scanner.close();
    }
}
