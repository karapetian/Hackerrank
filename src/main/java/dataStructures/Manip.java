package dataStructures;

import java.util.LinkedList;
import java.util.Scanner;

import dataStructures.Linked_1.Node;

public class Manip {

	public static void main(String[] args) {
//		Scanner in = new Scanner(System.in);
//		int n = in.nextInt(); // array.length
//		long[] manipulation = new long[n+1];
//		int m = in.nextInt(); // queries
//		for (int a0 = 0; a0 < m; a0++) {
//			int a = in.nextInt();
//			int b = in.nextInt();
//			int k = in.nextInt();
//			
//			manipulation[a]=manipulation[a]+k;
//			manipulation[b+1]=manipulation[b+1]-k;
//		
//		
//		}
//
//		// find max
//		long max = 0;
//		long current=0;
//		for (int j = 1; j <= n; j++) {
//			current=current+manipulation[j];
//			
//			if (max < current) {
//				max = current;
//			}
//		}
//		System.out.print(max);
//
//		in.close();		
	
Manip p = new Manip();
p.ReversePrint(10);

	
	}
	

	void ReversePrint(Integer l) {
		if (l==0){
		     return;
		 } else{
		 ReversePrint(l-1);
			 System.out.println(l);
		 }	
	 	System.out.println(l);
	}	
	
	static int Fibonachi(int n){
		if(n==1){
			return 0;
		}
		if(n==2||n==3){
			return 1;
		} 
//		if(n==4){
//			return 2;
//		}
		int result = 1;
		while(n>=3){
			result=Fibonachi(n-1)+Fibonachi(n-2);
		}
	
		
		return result;
	}
}

