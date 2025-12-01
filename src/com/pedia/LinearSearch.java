package com.pedia;

public class LinearSearch {
	public static void main(String[] args) {
		int[] num= {1,2,3,4,5};
		int find=5;
		int index=-1;
		
		for(int i=0;i<num.length;i++) {
			if(num[i]==find) {
				index=i;
				break;
			}
		}
		
		if(index!=-1) {
			System.out.println("Element found at index "+index);
		}
		else {
			System.out.println("Not found");
		}
	}

	}
