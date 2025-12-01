package com.pedia;

import java.util.Scanner;

public class PrimeNo {
	public static void main(String[] args) {
		int n=2;
		
		if(n<=1) {
			System.out.println("Not a prime");
		}
		
		boolean isPrime=true;
		for(int i=2;i<=Math.sqrt(n);i++) {
			if(n%i==0) {
				isPrime=false;
			}
		}
		if(isPrime) {
			System.out.println("Prime");
		}
		else {
			System.out.println("Not a Prime");
		}
		
	}

}
