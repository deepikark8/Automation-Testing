package Assignment1;
import java.util.Scanner;

public class UserDetails {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String name,gender,address;
		int age;
		
		Scanner reader = new Scanner(System.in);
		
		System.out.println("Enter the Name : ");
		 name = reader.nextLine();
	
		 System.out.println("Age :");
		 age = reader.nextInt();
		
		 System.out.println("Gender :");
		 gender = reader.next();
		reader.nextLine();
		
		System.out.println("Address :");
		 address = reader.nextLine();
		
		//Output
		System.out.println("User Details :"+"\n"+name+"\n"+age+"\n"+gender+"\n"+address);
		
		/*
		 * Same line input
		 * 
		 * Scanner reader = new Scanner(System.in);
		System.out.println("Enter the Userdetails(Name,Age,Gender,Address : ");
		String str = reader.nextLine();
	
		
		System.out.println("Length :"+ str.length());
		
		//Output
		String[] arrStr = new String[4];
		arrStr = str.split(",");
		
		for(int i=0; i<arrStr.length; i++) {
			System.out.println(arrStr[i]);
		}
		 */

		
		
		
		
		reader.close();
		
		
		
		
		
		

	}

}
