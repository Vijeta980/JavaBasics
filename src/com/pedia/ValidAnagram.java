package com.pedia;

import java.util.HashSet;
import java.util.Set;

public class ValidAnagram {
	public static void main(String[] args) {
		String str1="Anagram";
		String str2="Nagaram";
		
		str1=str1.toLowerCase();
		str2=str2.toLowerCase();
		
		if(str1.length()!=str2.length()) {
			System.out.println(false);
			return;
		}
		int[] freq=new int[26];
		
		for(char c:str1.toCharArray()) {
			freq[c-'a']++;
		}
		for(char c:str2.toCharArray()) {
			freq[c-'a']--;
		}
		for(int count:freq) {
			if(count!=0) {
				System.out.println(false);
				return;
			}
		}
		System.out.println(true);
	}

}
