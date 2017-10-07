package DataStructures;

import java.util.Scanner;

public class Array_2D {

	public static void main(String[] args) {

		int[][] A = new int[6][6];
		Scanner s = new Scanner(System.in);
		for (int i = 0; i < 6; i++) {
			for (int j = 0; j < 6; j++) {
				A[i][j] = s.nextInt();
			}
		}

		int[] sumArray = new int[16];
		int sum = 0;
		int k = 0;
		for (int i = 0; i <= 3; i++) {
			for (int j = 0; j <= 3; j++) {

				sum = A[i][j] + A[i][j + 1] + A[i][j + 2] + A[i + 1][j + 1] + A[i + 2][j] + A[i + 2][j + 1]
						+ A[i + 2][j + 2];
				sumArray[k] = sum;
				k++;
			}
		}

		int max = Integer.MIN_VALUE;
		for (k = 0; k < 16; k++) {
			if (max < sumArray[k]) {
				max = sumArray[k];
			}
		}
		System.out.println(max);

		s.close();
	}

}
