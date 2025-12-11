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
public class Practice{
	public static void main(String[] args) {
		int[] num= {50,20,10,30,40};
		
		for(int i=1;i<num.length;i++) {
			int j=i;
			while(j>0 && num[j-1]>num[j]) {
				int temp=num[j];
				num[j]=num[j-1];
				num[j-1]=temp;
				j--;
			}
			
			
		}
		for(int arr:num) {
			System.out.print(arr+" ");
		}
		
	}
}
