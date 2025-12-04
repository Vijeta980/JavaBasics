package com.pedia;

//The element must appear more than half the size of the array.

public class MajorityMoore{
	public static void main(String[] args) {
		int[] arr= {5,6,6,6,5,5,5};
		
		int candidate=arr[0];
		int count=1;
		
		for(int i=1;i<arr.length;i++) {
			if(arr[i]==candidate) {
				count++;
			}
			else if(count==0) {
				candidate=arr[i];
				count=1;
			}
			else {
				count--;
			}
		}
		System.out.println(candidate);
		
		
	}
}
