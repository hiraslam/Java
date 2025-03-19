package first;
import java.util.Scanner;//import to input data
public class Addnumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a, b , sum, avg;
		Scanner Input = new Scanner(System.in);//create object of scanner class
		System.out.println("Enter the two numbers you want to add:");
		System.out.println("Number 1:");
		a= Input.nextInt();
		System.out.println("Number2:");
		b= Input.nextInt();
		sum=a+b;
		System.out.println("Sum is:"+ sum);
		Input.close();//Its not compulsory but it is recommended
		avg=sum/2;
		System.out.println("Average of the given numbers:"+ avg);
		Input.close();
	}

}
