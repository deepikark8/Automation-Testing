package Assignment3;

public class A {

	void sum(int x, int y)
	{ 
		System.out.println("Sum of two numbers: " +(x+y)); 
		} 
	void sum(int x, int y, int z){ 
		System.out.println("Sum of three numbers: " +(x+y+z));
		} 
	public static void main(String[] args)
	{
		A a = new A(); 
		a.sum(20, 30); 
		a.sum(30, 40, 50); 
		} 
}
