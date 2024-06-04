package com.ilpbatch4.utility;

public class PatterA1 {

	public static void main(String[] args) {
		int rows = 4;
		alphanumeric(rows);
	}

	private static void alphanumeric(int rows) {
		int spaces = rows - 1;
		int columns = 1;
		for (int i = 1; i <= rows; i++) {
			char ch = 'A';
			int num = 1;
			for (int j = 1; j <= spaces; j++) {
				System.out.print(" ");
			}
			for (int j = 1; j <= columns; j++) {
				System.out.print(ch);
				ch = (char) (ch + 1);
			}
			for (int j = 1; j <= columns; j++) {
				System.out.print(num);
				num++;
			}
			columns++;
			spaces--;
			System.out.println("");
		}
	}

}