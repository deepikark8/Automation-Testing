package com.Feb10.Assignment;

public class Q1PrintTwoString {
	
	
	public static void main(String[] args) {
		
		String str1 = "I Love Java Programming";
		String s = str1.replace(" ", "");
		//System.out.println(s);
		String str2 = "o";
		int firstletter = s.indexOf(str2);
		int secondletter = s.lastIndexOf(str2);	
//		int charactersInBetween = (secondletter-1) - firstletter;
//		System.out.println("Index of First o : " + firstletter);
//		System.out.println("Index of Second o : " + secondletter);
//		System.out.println("Number of characters in between o is "+ charactersInBetween);
	
		
		String sStr1 = s.substring(firstletter+1, secondletter); 
		System.out.println("Index of First o : " + firstletter);
		System.out.println("Index of Second o : " + secondletter);
		System.out.println("Number of characters in between o is "+ sStr1.length());
		

		
		//Another Way
		
//		String[] strArray = s.split(str2);
//		for(int i=0; i<strArray.length;i++) {
//			
//			System.out.println(strArray[i]);
//			
//		}
//		
//		System.out.println(strArray[1].length());
	        	
	       
		//Another Way
		
//		char[] arr= new char[s.length()];
//		 s.getChars(firstletter, secondletter, arr, charactersInBetween);
//		
//		
//		for(char temp: arr){
//	    	   System.out.print(temp);
//	       }
		
		
		
	}
	

}
