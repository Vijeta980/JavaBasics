package com.pedia;

//1021. Remove Outermost Parentheses
//Input: s = "(()())(())"
//Output: "()()()"

//class Solution {
//    public String removeOuterParentheses(String s) {
//        
//        StringBuilder sb=new StringBuilder();
//
//        int count=0;
//        for(char c:s.toCharArray()){
//            if(c=='('){
//                if(count>0) sb.append(c);
//                count++;
//            }
//            else{
//                count--;
//                if(count>0) sb.append(c);
//            }
//        }
//        return sb.toString();
//    }
//}




//151. Reverse Words in a String

//Input: s = "the sky is blue"
//Output: "blue is sky the"

//class Solution {
//    public String reverseWords(String s) {
//        String[] words=s.trim().split("\\s+");
//        StringBuilder sb=new StringBuilder();
//
//        for(int i=words.length-1;i>=0;i--){
//            sb.append(words[i]);
//            if(i>0) sb.append(" ");
//        }
//        return sb.toString();
//        
//    }
//}



//1903. Largest Odd Number in String
//Input: num = "52"
//Output: "5"

//class Solution {
//    public String largestOddNumber(String num) {
//
//        for(int i=num.length()-1;i>=0;i--){
//            int digit=num.charAt(i)-'0';
//            if(digit%2==1){
//                return num.substring(0,i+1);
//            }
//        }
//        return "";
//    }
//}

public class StringParenthesis {
	public static void main(String[] args) {
		
	}

}
