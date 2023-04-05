package Assignment3;
import java.util.Scanner;

class Students{
	
	
	public void students(String strName){
		
		if(strName.isEmpty()) {
			System.out.println("Unknown");
		}else {
			System.out.println(strName);
		}
		
	
	}
}

public class ClassDetails {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner reader = new Scanner(System.in);
		System.out.println("Enter the name");
		String strText = reader.nextLine();
		Students students = new Students();
		students.students(strText);
	
		reader.close();
		
	}

}
