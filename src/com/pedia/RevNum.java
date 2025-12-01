package com.pedia;

//public class RevNum {
//	public static void main(String[] args) {
//		int num=123;
//		int rev=0;
//		int rem=0;
//		
//		while(num>0) {
//			rem=num%10;
//			rev=10*rev+rem;
//			num=num/10;
//			
//		}
//		System.out.println(rev);
//	}
//
//}

//count digit
public class RevNum {
	public static void main(String[] args) {
		int num=123456;
		int count=0;
		
		while(num>0) {
			int rem=num%10;
			count++;
			num=num/10;
			
			
		}
		System.out.println(count);
	}
	}