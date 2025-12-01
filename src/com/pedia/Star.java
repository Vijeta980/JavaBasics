package com.pedia;

//public class Star {
//	public static void main(String[] args) {
//		int n=5;
//		
//		for(int i=0;i<n;i++) {
//			for(int j=0;j<=i;j++) {
//				System.out.print("* ");
//			}
//			System.out.println();
//		}
//	}
//
//}

//Two space req for right ang left tri
//public class Star {
//	public static void main(String[] args) {
//		int n=5;
//		
//		for(int i=0;i<n;i++) {
//			for(int s=0;s<n-i-1;s++) {
//				System.out.print("  ");
//			}
//			for(int j=0;j<=i;j++) {
//				System.out.print("* ");
//			}
//			System.out.println();
//		}
//	}
//	
//
//}

//right ang centre

//public class Star {
//	public static void main(String[] args) {
//		int n=5;
//		
//		for(int i=0;i<n;i++) {
//			for(int s=0;s<n-i-1;s++) {
//				System.out.print(" ");
//			}
//			for(int j=0;j<=i;j++) {
//				System.out.print("* ");
//			}
//			System.out.println();
//		}
//	}
//	
//
//}
//public class Star {
//	public static void main(String[] args) {
//		int n=5;
//		for(int i=0;i<=n;i++) {
//			for(int s=0;s<n-i;s++) {
//				System.out.print("* ");
//			}
//			for(int j=0;j<=i;j++) {
//				System.out.print("  ");
//				
//			}
//			System.out.println();
//		}
//	}
//	
//	}

//public class Star {
//	public static void main(String[] args) {
//		int n=5;
//		
//		for(int i=5;i>=0;i--) {
//			for(int j=1;j<=i;j++) {
//				System.out.print(j+" ");
//				
//			}
//			System.out.println();
//		}
//	}
//	
//	}

/////////////////Pyramid/////////////////
//public class Star {
//	public static void main(String[] args) {
//		int n=7;
//		
//		for(int i=0;i<n;i++) {
//		
//			for(int j=0;j<n-i-1;j++) {
//				System.out.print(" ");
//			}
//			for(int j=0;j<2*i+1;j++) {
//				System.out.print("*");
//			}
//			for(int j=0;j<n-i-1;j++) {
//				System.out.print(" ");
//			}
//			System.out.println();
//		}
//	}
//	}



//public class Star {
//	public static void main(String[] args) {
//		int n=5;
//		
//		for(int i=0;i<n;i++) {
//			for(int j=0;j<i;j++) {
//				System.out.print(" ");
//			}
//			for(int j=0;j<2*(n-i)-1;j++) {
//				System.out.print("*");
//			}
//			System.out.println();
//		}
//	}
//	}



/////////////Diamond///////////////////
//public class Star {
//public static void main(String[] args) {
//	int n=5;
//	
//	for(int i=0;i<n;i++) {
//	
//		for(int j=0;j<n-i-1;j++) {
//			System.out.print(" ");
//		}
//		for(int j=0;j<2*i+1;j++) {
//			System.out.print("*");
//		}
//		for(int j=0;j<n-i-1;j++) {
//			System.out.print(" ");
//		}
//		System.out.println();
//	}
//	for(int i=0;i<n;i++) {
//		for(int j=0;j<i;j++) {
//			System.out.print(" ");
//		}
//		for(int j=0;j<2*(n-i)-1;j++) {
//			System.out.print("*");
//		}
//		System.out.println();
//	}
//}
//}






//MYWAY DIFF DIAMOND//////////////////////


//public class Practice {
//	public static void main(String[] args) {
//		int n=5;
//	
//		for(int i=0;i<n;i++) {
//			for(int s=0;s<n-i-1;s++) {
//				System.out.print(" ");
//			}
//			for(int j=0;j<2*i+1;j++) {
//				System.out.print("*");
//			}
//			System.out.println();
//	}
//		
//		for(int i=1;i<n;i++) {
//			int stars=2*n-1;
//			for(int s=0;s<i;s++) {
//				System.out.print(" ");
//				stars-=2;
//
//			}
//			for(int j=0;j<stars;j++) {
//				System.out.print("*");
//			}
//			System.out.println();
//		}
//		
//
//}
//}



////Triangle side Symmetry/////////////
//public class Star {
//	public static void main(String[] args) {
//		int n=5;
//		for(int i=1;i<=2*n-1;i++) {
//			int stars=i;
//			if(i>n) stars= 2*n-i;
//			for(int j=1;j<=stars;j++) {
//				System.out.print("*");
//			}
//			System.out.println();
//		}
//	}}

//
//public class Star {
//	public static void main(String[] args) {
//		int n=5;
////		int start=1;
////		for(int i=0;i<n;i++) {
////			if(i%2==0) start=1;
////			else start=0;
////			for(int j=0;j<=i;j++) {
////				System.out.print(start);
////				start=1-start;
////			}
////			System.out.println();
////		
///	}
//		2nd way//
//		for(int i=0;i<5;i++){
//            for(int j=0;j<i;j++){
//                if(i%2==0){
//                    System.out.print(j%2);
//                }
//                else{
//                    System.out.print((i+j)%2);
//                }
//            }
//            System.out.println();
//	}
//	}}

//public class Star {
//	public static void main(String[] args) {
//		int n=5;
//		for(int i=0;i<=n;i++) {
//			int space=2*(n)-2*i; //also u can use 2*n
//
//			for(int j=0;j<=i;j++) {
//				System.out.print(j);
//			}
//			for(int j=0;j<space;j++) {
//				System.out.print(" ");
//			}
//			for(int j=i;j>=0;j--) {
//				System.out.print(j);
//			}
//			System.out.println();
//			space -= 2;
//			
//		}
//	}}


//public class Star {
//	public static void main(String[] args) {
//		int n=5;
//		int num=1;
//		for(int i=1;i<=n;i++) {
//			for(int j=1;j<=i;j++) {
//				System.out.print(num+" ");
//				num=num+1;
//			}
//			System.out.println();
//		}
//	}
//	}

//public class Star {
//	public static void main(String[] args) {
//		int n=5;
//		
//		for(int i=0;i<=n;i++) {
//			for(char ch='A';ch<='A'+i;ch++) {
//				System.out.print(ch+" ");
//			}
//			System.out.println();
//		}
//	}
//	}

////square//////////
//public class Star {
//	public static void main(String[] args) {
//		int n=4;
//		for(int i=0;i<n;i++) {
//			for(int j=0;j<n;j++) {
//				if(i==0 || j==0 || i==n-1 || j==n-1) {
//				System.out.print("*");
//				}
//				else {
//					System.out.print(" ");
//				}
//			}
//			System.out.println();
//
//		}
//		
//	}
//	}


//not stars pattern////////
//public class Star{
//	public static void main(String[] args) {
//		int n=12;
//		//int square = 0;
//		for(int i=1;i<=n;i++) {
//			 //square+=n;
//			 System.out.println(i*i);
//			 System.out.println(Math.pow(i, 2));
//		}
//		//System.out.println(square);
//		
//	}
//}

//centreeeeeeeeeeee///
//public class Star{
//	public static void main(String[] args) {
//		
//		int n=5;
//		
//		for(int i=0;i<5;i++) {
//			for(int s=0;s<n-i-1;s++) {
//				System.out.print(" ");
//			}
//			
//			for(int j=0;j<=i;j++) {
//				System.out.print("* ");
//			}
//			System.out.println();
//		}
//		
//	}
//	}



		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

