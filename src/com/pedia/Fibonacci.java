package com.pedia;

import java.util.Scanner;

//public class Fibonacci {
//	public static void main(String[] args) {
//		//Scanner sc=new Scanner(System.in);
//		//System.out.println("Enter a num:");
//		//int n=sc.nextInt();
//		int n=5;
//		
//		int a=0; int b=1;
//		
//		System.out.println(a+" "+b+" ");
//		
//		for(int i=0;i<n;i++) {
//			int temp=a+b;
//			System.out.println(temp+" ");
//			a=b;
//			b=temp;
//		}
//	}
//
//}

public class Fibonacci {
	public static int fib(int n) {
		if(n==0) return 0;
		if(n==1) return 1;
		return fib(n-1)+fib(n-2);
	}
	public static void main(String[] args) {
		int n=7;
		System.out.println(fib(n));
		}
	}
	