package com.BootCamp;

import java.util.Arrays;
import java.util.Comparator;

public class Second_highest_number_in_an_array {
	
	public static void main(String[]args) {
		
		int[]numbers = {5,12,40,24,56};
		
		Integer SeconHighestElement = Arrays.stream(numbers).boxed().sorted(Comparator.reverseOrder()).skip(1).findFirst().get();
		System.out.println(SeconHighestElement);
	}
		
		
	}

	
   
