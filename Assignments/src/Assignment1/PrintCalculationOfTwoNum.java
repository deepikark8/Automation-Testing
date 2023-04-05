package Assignment1;
import java.util.Scanner;


public class PrintCalculationOfTwoNum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner reader = new Scanner(System.in);
		System.out.println("Enter the number :");
		int num1 = reader.nextInt();
		
		System.out.println("Enetr the number :");
		int num2 = reader.nextInt();
		
		int addition = num1 + num2;
		System.out.println("Addition of "+ num1 +" + "+ num2 +" = "+addition);
		
		int multiplication = num1 * num2;
		System.out.println("Multiplication of "+ num1 +" x "+ num2 +" = "+ multiplication);
		
		int subtract = num1 - num2;
		System.out.println("Subtraction of "+ num1 +" - "+ num2 +" = "+ subtract );
		
		double divide = num1 / num2;
		System.out.println("Divide of "+ num1 +" / "+ num2 +" = "+ divide );
		
		int remainder = num1 % num2;
		System.out.println("Remainder of "+ num1 +" % "+ num2 +" = "+ remainder );
		
		
		reader.close();
		
		
		

	}

}
