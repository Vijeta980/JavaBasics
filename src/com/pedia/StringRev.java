package com.pedia;

public class StringRev {
	public static void main(String[] args) {
		String str="Madam";
		String s=str.toLowerCase();
		String rev="";
		
		for(int i=s.length()-1;i>=0;i--) {
			rev+=s.charAt(i);
		}
		System.out.println(rev);
		
		if(s.equals(rev)) {
			System.out.println("Palindrome");
		}
		else {
			System.out.println("Not a Palindrome");
		}
	}

}
