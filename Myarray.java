package first;

import java.util.Scanner;//import scanner class to input data

public class Myarray {
    public static void main(String[] args) 
    {
        Scanner scanner = new Scanner(System.in);//create object of scanner class
        int [] numbers = new int[5];//integer array

        System.out.println("Enter 5 integers:");
        for (int i = 0; i < 5; i++) 
        {
            numbers[i] = scanner.nextInt();
        }

        // Display all values in the array
        System.out.println("Values in the array:");
        for (int i = 0; i < numbers.length; i++) 
        {
            System.out.println(numbers[i]);
        }

        scanner.close();
    }
}


