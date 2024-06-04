package com.ilpbatch4.utility;
import java.util.*;
public class DuplicateInArray {

	public static void main(String[] args) {
		int[] array = {1,3,1,1,6,7,3,9,7 };
		duplicate_numbers(array);

	}

	private static void duplicate_numbers(int[] array) {
		System.out.println("The duplicate values are:");
		Set<Integer> result = new HashSet<>();
		for (int i = 0; i < array.length; i++) {
			for (int j = i + 1; j < array.length; j++) {
				if (array[i] == array[j] && !result.contains(array[j])) {
					result.add(array[j]);
					System.out.println(array[j]);
					break;
				}

			}

		}

	}
}
