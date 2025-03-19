package first;
import java.util.Scanner;//import package to input
public class Mystring {

		    public static void main(String[] args) {
		        // Create a Scanner object to take input
		        Scanner scanner = new Scanner(System.in);

		        // Declare an array to store 5 names
		        String[] names = new String[5];

		        // Prompt the user to enter 5 names
		        System.out.println("Enter 5 names:");

		        // Using a for loop to take input
		        for (int i = 0; i < 5; i++) {
		            System.out.print("Enter name " + (i + 1) + ": ");
		            names[i] = scanner.nextLine(); // Read and store each name in the array
		        }

		        // Display all names using a for loop
		        System.out.println("\nThe entered names are:");
		        for (int i = 0; i < 5; i++) {
		        	// Print each name with its index
		            System.out.println("Name " + (i + 1) + ": " + names[i]); 
		        }

		        // Close the scanner to avoid resource leaks
		        scanner.close();// recommended 
		    }


	}

