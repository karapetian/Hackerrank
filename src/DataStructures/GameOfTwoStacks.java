package DataStructures;

import java.util.Scanner;
import java.util.Stack;

public class GameOfTwoStacks {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		Stack<Integer> s1 = new Stack<>();
		Stack<Integer> s2 = new Stack<>();
		int sum = 0;
		int answer = 0;
		int g = in.nextInt();
		for (int a0 = 0; a0 < g; a0++) {
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
			while (sum < x) {
				if (s1.peek() <= s2.peek()) {
					sum = sum + s1.pop();
				} else {
					sum = sum + s2.pop();
				}
				if (sum < x) {
					answer++;
				}
			}
			System.out.println(answer);
		}
		in.close();
	}
}
