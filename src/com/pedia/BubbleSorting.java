package com.pedia;

//public class BubbleSorting {
//	public static void main(String[] args) {
//		int[] arr= {50,40,20,10,30};
//	
//		for(int i=0;i<arr.length-1;i++) {
//			for(int j=0;j<arr.length-1;j++) {
//				if(arr[j]>arr[j+1]){
//					int temp=arr[j];
//					arr[j]=arr[j+1];
//					arr[j+1]=temp;
//					}
//				
//			}
//		
//			}
//		
//		for(int num:arr) {
//			System.out.print(num+" ");
//		}
//	}
//
//}

public class BubbleSorting {
	public static void main(String[] args) {
		String s="abbaca";
		StringBuilder sb=new StringBuilder(s);
		
		boolean found=true;
		
		while(found) {
			found=false;
			for(int i=0;i<sb.length()-1;i++) {
				if(sb.charAt(i)==sb.charAt(i+1)) {
					sb.delete(i, i+2);	
					found=true;
					break;
				}
		
		}
		
		}
		System.out.println(sb.toString()); 

	
	}
	}
		
	
