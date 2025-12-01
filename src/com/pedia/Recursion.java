package com.pedia;

///////BASIC

//public class Recursion {
//	static  void func() {
//		System.out.print(1);
//		func();
//		//return func();
//	}
//	public static void main(String[] args) {
//		func();
//	}
//	
//
//}

//////Eg
//public class Recursion {
//	 static int count=0;
//	static void func() {
//		if(count==4) {
//			System.out.println(count);
//			return;
//
//		}
//		else {
//			System.out.println(count);
//			count++;
//			func();
//		}
//	}
//	public static void main(String[] args) {
//		func();
//		//return count; 
//	}
//}


//Print name 5times//////////
//public class Recursion {
//		static void func(int n) {
//			if(n==0) {
//				return;
//			}
//			else {
//				System.out.println("Vijeta");
//				func(n-1);
//				}
//		}
//		public static void main(String[] args) {
//			func(5);
//
//		
//	}}

//Print 1-N times/////
//public class Recursion {
//	static void func(int i,int n) {
//		if(i>n) return;
//		else {
//			System.out.println(i);
//			func(i+1,n);
//		}
//		
//	}
//	public static void main(String[] args) {
//		func(1,5);
//	}
//}

//public class Recursion {
//	static void func(int i,int n) {
//		if(i<=n) return;
//		else {
//			System.out.println(i);
//			func(i-1,n);
//		}
//	}
//	public static void main(String[] args) {
//		func(5,0);
//	}
//}

//public class Recursion {
//	static void func(int i,int sum) {
//		if(i<1) {
//			System.out.println(sum);
//			return;
//		}
//		else {
//			func(i-1,sum+i);
//		}
//		
//	}
//	public static void main(String[] args) {
//		func(5,0);
//	
//	}
//}

//public class Recursion {
//	static int func(int n) {
//		if(n==0) {
//			return n;
//		}
//		else {
//			return n+func(n-1);
//		}
//		
//	}
//	public static void main(String[] args) {
//		int n=5;
//		System.out.println(func(n));
//	
//	}
//
//}


