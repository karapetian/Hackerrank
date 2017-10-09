package dataStructures;

import java.util.Scanner;

public class ArrayManipulation {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt(); // array.length
		long[] manipulation = new long[n+1];
		int m = in.nextInt(); // queries
		for (int a0 = 0; a0 < m; a0++) {
			int a = in.nextInt();
			int b = in.nextInt();
			int k = in.nextInt();
			for (int i = a; i <= b; i++) {
				manipulation[i] = manipulation[i] + k;
			}
		}

		// find max
		long max = 0;
		for (int j = 1; j <= n; j++) {
			if (max < manipulation[j]) {
				max = manipulation[j];
			}
		}
		System.out.print(max);

		in.close();

	}
	
	static class Manupulation {
		
		public static void main(String[] args) {
			Scanner in = new Scanner(System.in);
			int n = in.nextInt(); // array.length
			long[] manipulation = new long[n+1];
			int m = in.nextInt(); // queries
			for (int a0 = 0; a0 < m; a0++) {
				int a = in.nextInt();
				int b = in.nextInt();
				int k = in.nextInt();
				
				manipulation[a]=manipulation[a]+k;
				manipulation[b+1]=manipulation[b+1]-k;
			
			
			}

			// find max
			long max = 0;
			long current=0;
			for (int j = 1; j <= n; j++) {
				current=current+manipulation[j];
				
				if (max < current) {
					max = current;
				}
			}
			System.out.print(max);

			in.close();		
		
		}	
		
		
	}
}
