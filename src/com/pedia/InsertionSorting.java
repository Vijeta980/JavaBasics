package com.pedia;

//
////TC: O(N^2)
public class InsertionSorting {
	public static void main(String[] args) {
		int[] nums= {1,5,2,1,3};
		
		for(int i=1;i<=nums.length-1;i++) {
			int j=i;
			while(j>0 && nums[j-1]>nums[j]) {
					int temp=nums[j];
					nums[j]=nums[j-1];
					nums[j-1]=temp;
					j--;
					
				}
			}
		
		for(int num:nums) {
			System.out.print(num+" ");
		}
	}

}





























