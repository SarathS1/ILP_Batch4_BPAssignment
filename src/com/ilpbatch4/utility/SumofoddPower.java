package com.ilpbatch4.utility;

public class SumofoddPower {

	public static void main(String[] args) {
		int input=5;
		sumOfOddPower(input);

	}

	private static void sumOfOddPower(int input) {
		double sum=0;
		   int flag=1;
		   int power=1;
		   for(int i=1;i<=input*2;i=i+2) {
			   if(flag==1) {
				  sum+=Math.pow(i,(double)power);
				  flag=0;
				  power++;
			   }
			   else {
				   sum= sum-(Math.pow(i,(double)power));
				   flag=1;
				   power++;
			   }
		   }
		   System.out.println("Sum of odd power="+sum);
		
	}

}
