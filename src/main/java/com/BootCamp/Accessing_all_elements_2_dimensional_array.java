package com.BootCamp;

public class Accessing_all_elements_2_dimensional_array {

	public static void main(String[] args) {
		
		int[][]a= {{5,2,9},{4,6,8}};
		
		for (int i=0; i<a.length; i++) {
			for(int j=0; j< a[i].length; j++) {
				System.out.println(a[i][j] +" ");
			}
		}

		System.out.println();
	}

}
