package com.pedia;

public class BinarySearch {
	public static void main(String[] args) {
		int[] arr= {10,20,30,40,50};
		int k=50;
		
		int found=binary(arr,k,0,arr.length-1);
		if(found>=0) {
			System.out.println("Found at "+found);
		}
		else {
			System.out.println("Not found");
		}
	}

		
		static int binary(int[] arr,int k,int l,int r) {
			int mid=r+l/2;
			if(k>arr[mid]) {
				return binary(arr,k,mid+1,r);
			}
			else if(k<arr[mid]) {
				return binary(arr,k,l,mid-1);
			}
			else {
				return mid;
			}
			
		}
	}