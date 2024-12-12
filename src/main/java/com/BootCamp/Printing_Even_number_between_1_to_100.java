package com.BootCamp;

public class Printing_Even_number_between_1_to_100 {

	public static void main(String[] args) {
		
		
		int  a = 100;
		
		System.out.print("Even Number From 1 to "+a+" are :");
		for(int b=1; b<=a; b++) {
			 if (b % 2 == 0) {
				System.out.print(b + " " );
			}
		}

	}

}
