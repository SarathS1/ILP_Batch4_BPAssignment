package com.ilpbatch4.utility;

public class AscendingDescendingOrder {

	public static void main(String[] args) {
		int array[]= {31,3,65,1};
		descendingorder(array);
		ascendingOrder(array);
		

	}

	
	private static void descendingorder(int[] array) {
		int temp=0;
		for(int i=0;i<array.length;i++) {
			for(int j=i+1;j<array.length;j++) {
				if(array[j]>array[i]) {
					temp=array[i];
					array[i]=array[j];
					array[j]=temp;
				}
			}
		}
		System.out.print("Descending Order=");

		for(int i=0;i<array.length;i++) {
			System.out.print(array[i]+" ");
			
		}
		System.out.println(" ");
		
	}
	private static void ascendingOrder(int[] array) {
		
		int temp=0;
		for(int i=0;i<array.length;i++) {
			for(int j=i+1;j<array.length;j++) {
				if(array[i]>array[j]) {
					temp=array[i];
					array[i]=array[j];
					array[j]=temp;
				}
			}
		}
		System.out.print("Ascending Order=");

		for(int i=0;i<array.length;i++) {
			System.out.print(array[i]+" ");
		}
	}


}
