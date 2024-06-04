package com.ilpbatch4.utility;

public class SumOfOdd {

	public static void main(String[] args) {
		int input = 5;
		sumOfOdd(input);

	}
	private static void sumOfOdd(int input) {
		int sum = 0;
		int flag = 1;
		for (int i = 1; i <= input * 2; i = i + 2) {
			if (flag == 1) {
				sum += i;
				flag = 0;
			} else {
				sum = sum - i;
				flag = 1;
			}
		}
		System.out.println("Sum of odd=" + sum);

	}
}
