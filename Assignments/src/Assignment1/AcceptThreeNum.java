package Assignment1;
import java.util.Scanner;
public class AcceptThreeNum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner reader = new Scanner(System.in);
		System.out.println("Enter the Number 1: ");
		int num1 = reader.nextInt();
		System.out.println("Enter the Number 2: ");
		int num2 = reader.nextInt();
		System.out.println("Enter the Number 3: ");
		int num3 = reader.nextInt();
		
		int sum = num1+num2+num3;
		System.out.println("Sum of three numbers : "+ sum);
		
		float average = (float)(num1+num2+num3)/3;
		System.out.println("Average of three numbers :"+average);
		
		reader.close();

	}

}
