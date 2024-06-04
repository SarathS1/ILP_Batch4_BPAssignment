package com.ilpbatch4.utility;

public class PatternZ {

	public static void main(String[] args) {
		   int input=5;
			patternz(input);

		}

		private static void patternz(int input) {
			for(int i=1;i<=input;i++)
			{ 
				for(int j=0;j<input;j++)
				{
					if (i==1 || i==input||j==input-i){
		                System.out.print("*");
		            } else {
		                System.out.print(" ");
		            }
		        }
				System.out.println();
				}
			}
           }

