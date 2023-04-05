package com.Feb10.Assignment;

public class Q4ReverseString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str = "Java";
		
	
		
		String strReversed = "";
	/*	for(int i=str.length()-1; i>=0;i--) {
			strReversed = strReversed + str.charAt(i);
			
		}
		*/
		System.out.println(strReversed);
	
      int sizeOfArray = str.length()-1;
	
		
		for(int i=0; i<str.length(); i++) {
			
			strReversed = strReversed+ str.charAt(sizeOfArray-i);
			
		}
	
		
		System.out.println("second way : "+strReversed);
	}

}
