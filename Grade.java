package hello;
import java.util.Scanner;
public class Grade {
		    public static void main(String[] args) {
		        Scanner scanner = new Scanner(System.in);

		        // Input marks
		        System.out.print("Enter marks (out of 100): ");
		        int marks = scanner.nextInt();

		        // Determine grade using switch statement
		        char grade;
		        switch (marks / 10) { 
		            case 10: 
		            case 9:  grade = 'A'; break;
		            case 8:  grade = 'B'; break;
		            case 7:  grade = 'C'; break;
		            case 6:  grade = 'D'; break;
		            default: grade = 'F';
		        }

		        // Display result
		        System.out.println("Your grade is: " + grade);

		        scanner.close();
		    }
		}

