package com.pedia;

//29. Divide Two Integers:without using multi ,div,mod 
//Input: dividend = 10, divisor = 3
//Output: 3

public class DivIntegers {
	public static void main(String[] args) {
		int dividend=-10;
		int divisor=3;
		
		int a=Math.abs(dividend);
		int b=Math.abs(divisor);
		
		int count=0;
		while(a>=b) {
			a=a-b;
			count++;
		}
		if(dividend<0 || divisor<0) {
			count=-count;
		}
		System.out.println(count);
	}

}
