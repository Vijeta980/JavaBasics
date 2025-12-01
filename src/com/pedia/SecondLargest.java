package com.pedia;

import java.util.Arrays;
import java.util.HashMap;

//public class SecondLargest {
//	public static void main(String[] args) {
//		int[] num= {10,20,30,40,50,45,50};
//		Arrays.sort(num);
//		int l=num[0];
//		int sl=num[0];
//		
//		for(int i=1;i<num.length;i++) {
//			if(num[i]>l) {
//				l=num[i];
//			}
//		}
//			for(int i=0;i<num.length-1;i++) {
//				if(num[i]>sl) {
//					sl=num[i];
//				}
//				
//			}
//			System.out.println(sl);
//			
//		}
//		
//	}


public class SecondLargest {
	public static void main(String[] args) {
		int[] nums= {10,20,30,40,50,50};
		
		int l=Integer.MIN_VALUE;
		int sl=Integer.MIN_VALUE;
		
		for(int num:nums) {
			if(num>l) {
				sl=l;
				l=num;
				
			}
			else if(num>sl && num<l) {
				sl=num;
			}
		}
		System.out.println(sl);
		
		
	}
	}
