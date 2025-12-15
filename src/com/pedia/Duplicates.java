package com.pedia;

import java.util.HashMap;
import java.util.Map;

public class Duplicates {
	public static void main(String[] args) {
		int[] nums= {1,2,2,3,4,4,5,6,6};
		
		HashMap<Integer,Integer>map=new HashMap<>();
		
		for(int i=0;i<nums.length;i++) {
			map.put(nums[i], map.getOrDefault(nums[i], 0)+1);
			
		}
		for(Map.Entry<Integer, Integer>entry:map.entrySet()) {
			if(entry.getValue()>1) {
				System.out.println(entry.getKey());
			}
			
			
		}
	}

}
