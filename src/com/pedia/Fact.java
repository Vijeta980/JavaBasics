package com.pedia;

//public class Fact {
//	public static int fact(int n) {
//		if(n==0) return 1;
//		return n*fact(n-1);
//	}
//	public static void main(String[] args) {
//		int n=5;
//		System.out.println(fact(n));
//	}
//
//}

public class Fact {
	public static void main(String[] args) {
		int n=5;
		for(int i=n-1;i>0;i--) {
			n*=i;
		}
		System.out.println(n);
	}
}
