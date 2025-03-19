package first;
import java.util.Scanner;
public class nested 
{
		    public static void main(String[] args) {
		        Scanner scanner = new Scanner(System.in);

		        // Input marks
		        System.out.print("Enter marks (out of 100): ");
		        int marks = scanner.nextInt();

		        // Determine grade
		        char grade;
		        if (marks >= 90) {
		            grade = 'A';
		        } else if (marks >= 80) {
		            grade = 'B';
		        } else if (marks >= 70) {
		            grade = 'C';
		        } else if (marks >= 60) {
		            grade = 'D';
		        } else {
		            grade = 'F';
		        }

		        // Display result
		        System.out.println("Your grade is: " + grade);

		        scanner.close();
		    }

	}

