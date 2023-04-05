package Assignment1;
import java.util.Scanner;
public class ScannerClassAssignment {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner reader = new Scanner(System.in);
		System.out.println("Enter a Integer:");
		int numInt = reader.nextInt();
		System.out.println("Enter a double:");
		double numdouble = reader.nextDouble();
		System.out.println("Enter a float:");
		float numFloat = reader.nextFloat();
		System.out.println("Is it Integer?");
		Boolean numBool = reader.hasNext();
		
		
		System.out.println("Integer :"+numInt);
		System.out.println("double :"+numdouble);
		System.out.println("float :"+numFloat);
		System.out.println("Boolean :"+numBool);
		
	
		
		
		
		reader.close();
		

	}

}
