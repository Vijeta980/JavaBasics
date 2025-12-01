package com.pedia;

//public class Gcd {
//	public static void main(String[] args) {
//		int n=9;
//		int m=12;
//		int max=0;
//		int gcd=1;
//		for(int i=1;i<Math.min(n, m);i++) {
//			if(n%i==0 && m%i==0) {
//				gcd=i;
//				System.out.println(gcd);
//
//			}
//			 
//		}
//	}
//
//}

//O(min(n,m))
//public class Gcd {
//	public static void main(String[] args) {
//		int n=9;
//		int m=12;
//		
//		for(int i=Math.min(n, m);i>0;i--) {
//			if(n%i==0 && m%i==0) {
//				System.out.println(i);
//				break;
//			}
//		}
//	}
//	}

//TC:O(logphi(min(a,b)))

public class Gcd {
	public static void main(String[] args) {
		int a=18;
		int b=12;
		
		while(a>0 && b>0) {
			if(a>b) a=a%b;
			else b=b%a;
		}
		if(a==0) {
			System.out.println(b);
		}
		else {
			System.out.println(a);
		}
		
	}
	}