package com.BootCamp;

public class Number_divisible_5_between_one_hundres {

	public static void main(String[] args) {
	   		for (int number = 1; number<=100; number++) {
			if(number % 5 == 0) {
				System.out.println("number "+number+" divisibel by 5");
			}else {
				System.out.print(number);
			}
		}

	}

}
