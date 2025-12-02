package com.pedia;

import java.util.HashSet;
import java.util.Set;

public class RemoveDuplicates {
	public static void main(String[] args) {
		int[] num= {1,2,3,4,5,1,2};
		
		Set<Integer>set=new HashSet<>();
		for(int i=0;i<num.length;i++) {
			set.add(num[i]);
		}
		System.out.println(set);
		System.out.println(set.size());
	}

}

//26. Remove Duplicates from Sorted Array//
///Input: nums = [1,1,2] k=2;
//Output: 2, nums = [1,2,_] 

//class Solution {
//    public int removeDuplicates(int[] nums) {
//        int i=0;
//        for(int j=1;j<nums.length;j++){
//            if(nums[i]!=nums[j]){
//                i++;
//                nums[i]=nums[j];
//            }
//        }
//        return i+1;
//
//
//    }
//}


///////27. Remove Element//////////////////

//class Solution {
//    public int removeElement(int[] nums, int val) {
//
//        int i=0;
//        for(int j=0;j<nums.length;j++){
//            if(nums[j]!=val){
//                nums[i]=nums[j];
//                i++;
//            }
//
//            
//        }
//        return i;
//    }
//}