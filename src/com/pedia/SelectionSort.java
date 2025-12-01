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
