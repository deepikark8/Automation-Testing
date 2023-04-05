package Assignment1;

import java.util.Scanner;

//import java.util.Scanner;
public class AreaPerimeterCircle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
	/*	double diameter = 16;
		System.out.println("Diameter of circle "+diameter);
		
		
		
		double radius = diameter/2;
		double area = Math.PI * radius * radius;
		System.out.println("Area of Circle : "+ area);
		
		double perimeter = 2 * Math.PI * radius;
		System.out.println("Perimeter of Circle : "+ perimeter);
		*/
		
	
		//Using Scanner
		Scanner reader =  new Scanner(System.in);
		System.out.println("Enter the radius of circle ");
		double radius1 = reader.nextDouble();
		
		
		double area1 = Math.PI * radius1 * radius1;
		System.out.println("Area of Circle : "+ area1);
		
		double perimeter1 = 2 * Math.PI * radius1;
		System.out.println("Perimeter of Circle : "+ perimeter1);
		reader.close();

	}

}
