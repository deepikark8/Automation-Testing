package Assignment3;
import java.util.Scanner;
class PrintText{	
	void text(String sText) {	
		if(!sText.isEmpty()){	
			System.out.println("I love"+ " "+sText);	
		}else {
			System.out.println("I love programming languages");
		}
	}
}
public class Programming {
	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);
		System.out.println("Enter a string");
		String str = reader.nextLine();
		PrintText obj = new PrintText();
		obj.text(str);
		reader.close();
	}
}
