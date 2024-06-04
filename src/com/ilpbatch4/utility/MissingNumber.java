package com.ilpbatch4.utility;

public class MissingNumber {

	public static void main(String[] args) {
		int Limit = 10;
		int array[] = { 1, 3, 5, 6 };
		int missingdigit[] = new int[Limit];
		findLimit(array, Limit, missingdigit);

	}

	private static void findLimit(int[] array, int Limit, int[] missingdigit) {
		int count = 0;
		int flag = 0;
		for (int i = 1; i <= Limit; i++) {
			for (int j = 0; j < array.length; j++) {
				if (i == array[j]) {
					flag = 1;
				}
			}
			if (flag == 0 && count < Limit) {
				missingdigit[count] = i;
				count++;
			}
			flag = 0;
		}
		System.out.print("missing digit=");
		for (int i = 0; i < missingdigit.length; i++) {
			if (missingdigit[i] == 10) {
				System.out.print(missingdigit[i] + " ");
				break;
			} else {
				System.out.print(missingdigit[i] + " ");
			}
		}
	}
}
