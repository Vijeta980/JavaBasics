package com.pedia;

public class ConsecSum {
	public static void main(String[] args) {
		int[] nums= {1,2,3,5,2,1};
		int target=10;
		
		for(int i=0;i<nums.length;i++) {
			int sum=0;

			for(int j=i;j<nums.length;j++) {
				sum+=nums[j];
				if(sum==target) {
					System.out.println("Subarray: ");
					for(int k=i;k<=j;k++) {
						System.out.println(nums[k]+" ");
					}
					System.out.println();
					}
			}
			

		}
	}

}
