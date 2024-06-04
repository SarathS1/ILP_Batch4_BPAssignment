package com.ilpbatch4.utility;

public class Sim {

	public static void main(String[] args) {
		int row = 6;
		pattern(row);

	}

	private static void pattern(int row) {
		for (int i = 1; i <= row; i++) {
			for (int j = 1; j <= row - i; j++) {
				System.out.print("  ");
			}
			for (int k = 1; k <= i; k++) {
				if (k % 2 == 1 ) {
					System.out.print(i + " ");
				}
				else
					System.out.print("* ");
			}
			for (int k = 2; k <= i; k++) {
				if ((k % 2 == 0)&&(i%2==0) ||(k % 2 == 1)&&(i%2==1)) {
					System.out.print(i + " ");
				}
				else
					System.out.print("* ");
			}
        System.out.println("");
	}
}
}
