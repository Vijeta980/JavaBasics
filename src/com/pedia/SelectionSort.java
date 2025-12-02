package com.pedia;


///TC: O(N^2)///////
public class SelectionSort {
	public static void main(String[] args) {
		
		int[] arr= {70,30,40,50,10};
		
		for(int i=0;i<=arr.length-2;i++) {
			int min=i;
			for(int j=i;j<=arr.length-1;j++) {
				if(arr[j]<arr[min]) {
					min=j;
				}
			}
			int temp=arr[min];
			arr[min]=arr[i];
			arr[i]=temp;
		}
		for(int num:arr) {
			System.out.print(num+" ");
		}
	}

}


//public class SelectionSort{
//	public static void main(String[] args) {
//		int[] nums= {1,5,4,3,2};
//		
//		for(int i=0;i<=nums.length-2;i++) {
//			for(int j=i+1;j<=nums.length-1;j++) {
//				if(nums[i]>nums[j]) {
//					int temp=nums[i];
//					nums[i]=nums[j];
//					nums[j]=temp;
//				}
//			}
//		}
//		for(int num:nums) {
//			System.out.print(num+" ");
//		}
//	}
//}
