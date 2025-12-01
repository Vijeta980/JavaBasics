package com.pedia;

public class ArmstringNu {
	public boolean isArmstrong(int n) {
		
		int og=n;
		
		int digits=String.valueOf(n).length();
		double arm=0;
		
		while(n>0) {
			int rem=n%10;
			arm=arm+Math.pow(rem, digits);
			n=n/10;
			
			
		}
		return arm==og;
		
		

		
	}
	public static void main(String[] args) {
		ArmstringNu obj=new ArmstringNu();
		System.out.println(obj.isArmstrong(153));
	}
}
