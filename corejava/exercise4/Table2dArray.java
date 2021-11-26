package exercise4;

import java.util.Arrays;

public class Table2dArray {
	public static void main(String[] args) {
		int[][] table = new int[10][9];

		for (int i = 1; i <= 10; i++) {
			for (int j = 1; j <= 9; j++) {
				table[i-1][j-1] = (i) * (j+1);
			}
		}
		for (int[] a : table) {
			System.out.println(Arrays.toString(a));
		}
	}

}
