package com.pedia;

import java.util.Scanner;

//Non hashing Normal way 0(n)//////////
//public class Hashing {
//	public static void main(String[] args) {
//		int n=6;
//		
//		int nums[]= {1,2,3,45,5,6,5};
//		int count=0;
//		
//		for(int i=0;i<nums.length;i++) {
//			if(nums[i]==n) {
//				count=count+1;
//			}
//		}
//		System.out.println(count);
//	}
//
//}

//Number hashing///////////////
//public class Hashing {
//	public static void main(String[] args) {
//		Scanner sc=new Scanner(System.in);
//		int n=sc.nextInt();
//		
//		int[] arr=new int[n];
//		
//		for(int i=0;i<n;i++) {
//			arr[i]=sc.nextInt();
//		}
//		
//		int hash[]=new int[13];
//		
//		for(int i=0;i<n;i++) {
//			hash[arr[i]]++;
//		}
//		
//		int q=sc.nextInt();
//		while(q-->0) {
//			int number=sc.nextInt();
//			System.out.println(hash[number]);
//		}
//		sc.close();
//	
//		}
//	}


/////////////Character Hashing//////////////////
public class Hashing {
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		String s=sc.nextLine();
		
		int[] hash=new int[256];
		for(int i=0;i<s.length();i++) {
			hash[s.charAt(i)]++;
		}
		
		int q=sc.nextInt();
		sc.nextLine();
		while(q-->0) {
			char c=sc.nextLine().charAt(0);
			System.out.println(hash[c]);
		}
		sc.close();
		
		
	}
	}