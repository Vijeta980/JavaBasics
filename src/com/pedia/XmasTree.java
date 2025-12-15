package com.pedia;

public class XmasTree {
	public static void main(String[] args) {
		int n=5;
		
		for(int i=1;i<=n;i++) {
			for(int s=1;s<=n-i;s++) {
				System.out.print(" ");
			}
			for(int j=1;j<=2*i-1;j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		for(int t=1;t<=2;t++) {
			for(int s=1;s<n;s++) {
				System.out.print(" ");
			}
			System.out.println("|");
		}
	}

}
