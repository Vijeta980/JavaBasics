package com.pedia;

import java.util.Scanner;

public class Calculator {
	 static int add(int a,int b) {
		return a+b;
		 
	 }
	 static int sub(int a,int b) {
		 return a-b;
	 }
	 static int multi(int a,int b) {
		 return a*b;
	 }
	 static double div(int a,int b) {
		 if(b==0) {
			 System.out.println("Can't divide by zero");
			 return Double.NaN;
		 }
		 return (double)a /b;
	 }
	 static int modulo(int a,int b) {
		 if(b==0) {
			 System.out.println("Error:Can't find modulo with zero!");
			 return 0;
		 }
		 return a%b;
	 }
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);

		System.out.println("Enter num1");
		int num1=sc.nextInt();
		
		System.out.println("Enter num2");
		int num2=sc.nextInt();

		
		System.out.println("Select one:");

		System.out.println("1.Add");
		System.out.println("2.Sub");
		System.out.println("3.Multi");
		System.out.println("4.Div");
		System.out.println("5.Modulo");
		System.out.println("6.Exit");


		
		int choice=sc.nextInt();
		
		if(choice==1) {
			System.out.println("Result:"+add(num1,num2));
		}
		else if(choice==2) {
			System.out.println("Result:"+sub(num1,num2));
		}
		else if(choice==3) {
			System.out.println("Result:"+multi(num1,num2));
		}
		else if(choice==4) {
			System.out.println("Result:"+div(num1,num2));
		}
		else if(choice==5) {
			System.out.println("Result:"+modulo(num1,num2));
		}
		else {
			System.out.println("Invalid Choice");
		}
		
		sc.close();

	}

}
