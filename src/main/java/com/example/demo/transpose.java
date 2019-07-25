package com.example.demo;

public class transpose {

	public int[][] transpose(int[][] A) {
		int[][] B = new int[A[0].length][A.length];
//		int[][] B = new int[A.length][A[0].length];
//		if (A.length < A[0].length) {
//			B = new int[A[0].length][A.length];
//		}
		for (int i = 0; i < A.length; i++) {
			for (int j = 0; j < A[0].length; j++) {
//				if (A[0].length == 1) {
//					B[i][j] = A[i][j];
//					continue;
//				}
				B[j][i] = A[i][j];
			}
		}
		return B;
	}

	public static void main(String[] args) {
		transpose test = new transpose();
		int[][] A =
//					{{1,2,3},
//					{4,5,6},
//					{7,8,9,}
//					};
//					{{7,2}};
//					{{2},{6},{2}};
//					{{5},{8}};
					{{2,7},{5,8},{8,8}};
//					{{1,2,3},{4,5,6}};
		int[][] result = test.transpose(A);
		System.out.println(result);
	}

}
