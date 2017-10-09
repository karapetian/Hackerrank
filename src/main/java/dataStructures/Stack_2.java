package dataStructures;

import java.util.Scanner;
import java.util.Stack;

public class Stack_2 {

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		int n1 = in.nextInt();
		int n2 = in.nextInt();
		int n3 = in.nextInt();

		int sum1 = 0;
		int sum2 = 0;
		int sum3 = 0;
		Stack<Integer> s1 = new Stack<>();
		Stack<Integer> s2 = new Stack<>();
		Stack<Integer> s3 = new Stack<>();

		int h1[] = new int[n1];
		for (int h1_i = 0; h1_i < n1; h1_i++) {
			h1[h1_i] = in.nextInt();
			s1.push(h1[h1_i]);
			sum1 = sum1 + h1[h1_i];
		}
		int h2[] = new int[n2];
		for (int h2_i = 0; h2_i < n2; h2_i++) {
			h2[h2_i] = in.nextInt();
			s2.push(h2[h2_i]);
			sum2 = sum2 + h2[h2_i];
		}
		int h3[] = new int[n3];
		for (int h3_i = 0; h3_i < n3; h3_i++) {
			h3[h3_i] = in.nextInt();
			s3.push(h3[h3_i]);
			sum3 = sum3 + h3[h3_i];
		}

		// int largest=(sum1>sum2)?(sum1>sum3?sum1:sum3):(sum2>sum3?sum2:sum3);
		boolean notEqual = true;
		while (notEqual) {
			if (sum1 == sum2 && sum1 == sum3) {
				System.out.print(sum1);
				notEqual = false;
			} else if (sum1 > sum2 && sum1 > sum3) {
				sum1 = sum1 - s1.pop();
				continue;
			} else if (sum2 > sum1 && sum2 > sum3) {
				sum2 = sum2 - s2.pop();
				continue;
			} else
				sum3 = sum3 - s3.pop();
    			continue;
		}
	}
}
