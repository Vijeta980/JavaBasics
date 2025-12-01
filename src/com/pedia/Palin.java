package com.pedia;

//public class Palin {
//	public static void main(String[] args) {
//		String str="Madam";
//		String rev="";
//		
//		for(int i=str.length()-1;i>=0;i--) {
//			rev+=str.charAt(i);
//		}
//		System.out.println((rev));
//		}
//	}


//public class Palin {
//	public static void main(String[] args) {
//		String str="Hello";
//		String rev="";
//		Boolean isBoolean=false;
//		
//		for(int i=str.length()-1;i>=0;i--) {
//			rev+=str.charAt(i);
//		}
//		if(str.equalsIgnoreCase(rev)) {
//			isBoolean=true;
//		}
//		else {
//			isBoolean=false;
//		}
//		System.out.println(isBoolean);
//	}
//	}


//Recursion//////////////

public class Palin {
	static boolean func(String s,int i) {
		int n=s.length();
		if(i>=n/2) {
			return true;
		}
		if(s.charAt(i)!=s.charAt(n-i-1)) {
			return false;
		}
			return func(s,i+1);
		
		
	}
	public static void main(String[] args) {
		String str= "Madam";
		str=str.toLowerCase();
		boolean result=func(str,0);
		
		if(result) {
			System.out.println("Palindrome");
		}
		else {
			System.out.println("Not Palindrome");
		}
		}
	}