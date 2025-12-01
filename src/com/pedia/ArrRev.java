package com.pedia;

import java.util.Arrays;

//public class ArrRev {
//	public static void main(String[] args) {
//		int[] num= {10,50,30,40,50};
//		
//		int left=0;int right=num.length-1;
//		int temp=0;
//		
//		for(left=0;left<num.length-1;left++) {
//			temp=num[left];
//			num[left]=num[right];
//			num[right]=temp;
//			right--;
//		}
//		for(int i=0;i<num.length;i++) {
//			System.out.println(num[i]+" ");
//		}
//	
//	}
//
//}
//Recursion/////

public class ArrRev {
	static void func(int[] arr,int l,int r) {
		if(l>=r) {
			return;
		}
		else {
			int temp=arr[l];
			arr[l]=arr[r];
			arr[r]=temp;
			
			func(arr,l+1,r-1);
		}
	}
	
	
	
	public static void main(String[] args) {
		int[] arr= {10,20,30,40,50};
		
		func(arr,0,arr.length-1);
		for(int num:arr) {
			System.out.println(num+" ");
		}
	}
		
	}

