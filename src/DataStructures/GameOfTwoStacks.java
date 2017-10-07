package DataStructures;

import java.util.Scanner;
import java.util.Stack;

public class GameOfTwoStacks {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		int g = in.nextInt();
		for (int a0 = 0; a0 < g; a0++) {
			Stack<Integer> s1 = new Stack<>();
			Stack<Integer> s2 = new Stack<>();
			int answer = 0;
			int sum = 0;
			int n = in.nextInt();
			int m = in.nextInt();
			int x = in.nextInt();
			int[] a = new int[n];
			for (int a_i = 0; a_i < n; a_i++) {
				a[a_i] = in.nextInt();
			}
			for (int i = n - 1; i >= 0; i--) {
				s1.push(a[i]);
			}

			int[] b = new int[m];
			for (int b_i = 0; b_i < m; b_i++) {
				b[b_i] = in.nextInt();
			}
			for (int i = m - 1; i >= 0; i--) {
				s2.push(b[i]);
			}
			Stack<Integer> s3 = new Stack<>();
			int t = 0;
			while(sum<=x && !s1.empty()){
				 t = s1.pop();
				sum = sum +t;
				s3.push(t);
				if (sum <= x) {
					answer++;
				} 
			}
			if(sum > x && !s3.isEmpty()){
				sum = sum-s3.pop();
			}
			int max = answer;
			while(!s2.isEmpty()) {
				sum = sum + s2.pop();
				answer++;
				if(sum <= x) {
					//answer++;
					if(answer > max) {
						max = answer;
					}
				}
				else {
					while(sum > x && !s3.isEmpty()) {
						sum = sum-s3.pop();
						answer--;
					}
				}
			}
//			while(sum<=x && !s2.isEmpty()){
//				sum = sum+s2.pop();
//				if (sum <= x) {
//					answer++;
//				} else {
//					if(!s3.isEmpty()){
//						
//					}
//				}
//			}
			System.out.println(max);
		}
		in.close();
	}
}
