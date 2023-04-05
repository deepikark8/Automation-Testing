package com.Feb10.Assignment;

public class Q3ReplaceSubstring {

	public static void main(String[] args) {
		/* 
		 * String "Dog chases cat , cat chases rat"
		 * replace cat with rat.
		 */
		 
		
		String str = "Dog chases cat , cat chases rat";
		String strReplaced = str.replace("cat", "rat");
		System.out.println(strReplaced);
		
	}
}
