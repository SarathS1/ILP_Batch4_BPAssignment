package com.ilpbatch4.utility;

public class SortArrayof0s1s2s {
	public static void main(String[] args) {
		int array[] = { 1, 0, 2, 0, 0, 1, 2, 2, 1, 1, 2,4,5,6,7 };
		sorting(array);
	}
	private static void sorting(int[] array) {
		int temp = 0;
		System.out.println("After Sorting:");
		for (int i = 0; i < array.length; i++) {
			for (int j = i + 1; j < array.length; j++) {
				if (array[i] > array[j]) {
					temp = array[j];
					array[j] = array[i];
					array[i] = temp;
				}
			}
		}
		for (int i = 0; i < array.length; i++) {
			if(array[i]>2) {
				continue;
			}
			else {
			System.out.println(array[i]);
		}
	}

}
}
