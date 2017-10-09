package dataStructures;

import java.util.Scanner;

public class Arrays_DC {
	public static void main(String[] args) {
		
		
		Scanner c = new Scanner(System.in);
		int count = c.nextInt();
		int[] A = new int [count] ;
		for(int i=0; i<count; i++){
			A[i]= c.nextInt();
		}
		
		int[]B = new int [count] ;
		for(int i=0; i<count; i++){
			B[i]= A[count-1-i];
			System.out.print(B[i]+" ");
		}
		c.close();
	}	
}
