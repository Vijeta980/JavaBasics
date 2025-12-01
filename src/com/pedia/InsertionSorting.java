package com.pedia;


//TC: O(N^2)
public class InsertionSorting {
	public static void main(String[] args) {
		int[] nums= {1,5,2,1,3};
		
		for(int i=0;i<=nums.length-1;i++) {
			for(int j=i;j<=nums.length-2;j++) {
				while(j>0 && nums[j-1]>nums[j]) {
					int temp=nums[j-1];
					nums[j-1]=nums[j];
					nums[j]=temp;
					
				}
			}
		}
		for(int num:nums) {
			System.out.print(num+" ");
		}
	}

}
