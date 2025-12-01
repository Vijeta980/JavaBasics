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
