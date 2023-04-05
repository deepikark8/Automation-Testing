package Assignment1;

public class Swap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		int a = 20;
		int b = 30;
		System.out.println("Before Swapping : " +a +" "+b );
		int c = b;
		b=a;
		a=c;
		
		System.out.println("After Swapping : " +a +" "+b );
		
		
		
		
		System.out.println("Swapping without Temp Variable");
		int e = 20;
		int d = 30;
		System.out.println("Before Swapping : " +e +" "+d );
		e=e+d;
		d=e-d;
		e=e-d;
		System.out.println("Afer Swapping : "+ e +" "+d);
		

	}

}
