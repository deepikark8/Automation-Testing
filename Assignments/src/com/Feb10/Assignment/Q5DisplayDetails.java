package com.Feb10.Assignment;

public class Q5DisplayDetails {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String sText = "Hello Java 8";
		System.out.println(sText);
		int countInteger = 0;
		int countUC = 0;
		int countLC = 0;
		for(int i=0; i<sText.length();i++)
		{
			if(Character.isDigit(sText.charAt(i))){
				countInteger++;
			}
			
			if(Character.isUpperCase(sText.charAt(i))) {
				countUC++;
			}
			
			if(Character.isLowerCase(sText.charAt(i))) {
				countLC++;
			}
		}
		System.out.println("Integer - " + countInteger);
		System.out.println("uppercase - " + countUC);
		System.out.println("lowerCase - " + countLC);
		
	}

}
