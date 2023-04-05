package Assignment3;
public class Test {
 static abstract class A { 
    public abstract void m1(); 
    public void m2(){ 
    	System.out.println("One"); 
    	} 
}
 static class B extends A { 
	public void m1() {		
	}
	public void m2(){ 
		System.out.println("Two");
		}
} 
    public static void main(String[] args) {   	
        B b = new B(); 
        b.m2(); 
    } 
} 

