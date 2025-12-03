package com.pedia;

//28. Find the Index of the First Occurrence in a String
//Input: haystack = "sadbutsad", needle = "sad"
//Output: 0

//class Solution {
//    public int strStr(String haystack, String needle) {
//        int n=haystack.length();
//        int m=needle.length();
//
//        for(int i=0;i<n-m;i++){
//            int j;
//            for(j=0;j<m;j++){
//                if(haystack.charAt(i+j)!=needle.charAt(j)){
//                    break;
//                }
//            }
//            if(j==m) return i;
//        }
//        return -1;
//    }}

//////////////////////////////////////////////////
//int occ=-1;
//if(haystack.contains(needle)){
//    occ=haystack.indexOf(needle);
//    return occ;
//}
//return occ;
//}}


////58. Length of Last Word////////////
/////Input: s = "Hello World"
///Output: 5
///
//class Solution {
//    public int lengthOfLastWord(String s) {
//
//        s=s.trim();
//
//        int lastSpace=s.lastIndexOf(" ");
//        
//        return s.length()-lastSpace-1;
//
//    }
//}
 

//1662. Check If Two String Arrays are Equivalent
//Input: word1 = ["ab", "c"], word2 = ["a", "bc"]
//Output: true

//class Solution {
//    public boolean arrayStringsAreEqual(String[] word1, String[] word2) {
//
//        String s1=String.join("",word1);
//        String s2=String.join("",word2);
//
//        return s1.equals(s2);
//    }
//}

//14. Longest Common Prefix
//Input: strs = ["flower","flow","flight"]
//Output: "fl"

//class Solution {
//    public String longestCommonPrefix(String[] strs) {
//
//
//        String prefix=strs[0];
//
//        for(int i=1;i<strs.length;i++){
//            while(!strs[i].startsWith(prefix)){
//            prefix=prefix.substring(0,prefix.length()-1);
//            }
//        }
//        return prefix;
//    }
//}













public class StringQue {
	public static void main(String[] args) {
		
	}

}
