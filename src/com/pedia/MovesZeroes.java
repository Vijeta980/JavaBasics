package com.pedia;

//public class MovesZeroes {
//	public static void main(String[] args) {
//		int[] nums={1,0,0,2,3,4,5};
//		int j=0;
//		
//		for(int i=0;i<nums.length;i++) {
//			if(nums[i]!=0) {
//				nums[j]=nums[i];
//				j++;
//				
//			}
//		}
//		while(j<nums.length) {
//			nums[j]=0;
//			j++;
//		}
//		for(int num:nums) {
//			System.out.println(num);
//		}
//		
//	}
//
//}

public class MovesZeroes {
	public static void main(String[] args) {
		int[] nums= {0,1,0,13,5};
		int j=0;
		
		for(int i=0;i<nums.length;i++) {
			if(nums[i]!=0) {
				int temp=nums[i];
				nums[i]=nums[j];
				nums[j]=temp;
				j++;
			}
		}
		for(int arr:nums) {
			System.out.print(arr+" ");
		}
	}
	}
