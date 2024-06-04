package com.ilpbatch4.utility;

public class Sumofcubicpower {

	public static void main(String[] args) {
		int input = 5;
		sumofcubicpower(input);
	}
	private static void sumofcubicpower(int input) {
		int currentnumber = 1;
		int previousnumber = 1;
		int temp = 0;
		int result = 0;
		int sum = 0;
		for (int i = 1; i <= input; i++) {
			sum += cubicpower(currentnumber);
			temp = currentnumber;
			currentnumber += previousnumber;
			previousnumber = temp;
		}
		System.out.println("Result="+sum);
	}
	private static int cubicpower(int number) {
		int sumofpower = number * number * number;
		return sumofpower;
	}
}
