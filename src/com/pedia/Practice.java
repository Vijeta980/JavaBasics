package com.pedia;

import java.util.HashMap;
import java.util.Map;

//public class Practice{
//	public static void main(String[] args) {
//		int[] arr= {10,20,40,30,0};
//		
//		for(int i=1;i<arr.length;i++) {
//			int key=arr[i];
//			int j=i-1;
//			
//			while(j>=0 && arr[j]>key) {
//				arr[j+1]=arr[j];
//				j--;
//			}
//			arr[j+1]=key;
//		}
//		for(int num:arr) {
//			System.out.print(num+" ");
//		}
//		
//		
//	}
//}
//Insertion//////////
//public class Practice{
//	public static void main(String[] args) {
//		int[] num= {50,20,10,30,40};
//		
//		for(int i=1;i<num.length;i++) {
//			int j=i;
//			while(j>0 && num[j-1]>num[j]) {
//				int temp=num[j];
//				num[j]=num[j-1];
//				num[j-1]=temp;
//				j--;
//			}
//			
//			
//		}
//		for(int arr:num) {
//			System.out.print(arr+" ");
//		}
//		
//	}
//}

//public class Practice{
//	public static void main(String[] args) {
//		int[] nums= {10,20,30,40,50};
//		
//		int start=0;
//		int end=nums.length-1;
//		
//		while(start<end) {
//			int temp=nums[start];
//			nums[start]=nums[end];
//			nums[end]=temp;
//			start++;
//			end--;
//		}
//		for(int num :nums) {
//			System.out.print(num+" ");
//		}
//		
//		}
//}

public class Practice{
	public static void main(String[] args) {
		
		int num=5;
		
		for(int i=1;i<=num;i++) {
			for(int s=1;s<=num-i;s++) {
				System.out.print(" ");
			}
			for(int j=1;j<=2*i-1;j++) {
				System.out.print("*");
			}
			System.out.println();

		}
	}
	}
