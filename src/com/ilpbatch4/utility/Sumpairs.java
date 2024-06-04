package com.ilpbatch4.utility;

public class Sumpairs {

	public static void main(String[] args) {
		int arr[] = { 1, 5, 6, 4, 3, 2, 4, 3 };
		int check = 6;
		checkSum(arr, check);
		System.out.println(" ");
	}
	private static void checkSum(int[] arr, int check) {
		int sum = 0;
		int count = 0;
		System.out.println("The possible pairs are: ");
		for (int i = 0; i < arr.length; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[i] + arr[j] == check) {
					System.out.print(arr[i] + " and " + arr[j] + " "+"\n");
					count++;
				}
			}
		}
		if (count == 0) {
			System.out.print("No pairs found");
		}

	}

}
