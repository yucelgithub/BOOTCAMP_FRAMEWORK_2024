package com.BOOTCAMP_QUESTIONS;

public class BinarySearch {

	int binarySearch(int a[], int l, int r, int x)
	    {
	        while (l <= r) {
	            int m = (l + r) / 2;

	            if (a[m] == x) {
	                return m;
	            
	            } else if (a[m] > x) {
	                r = m - 1;
            
	            } else {
	              l = m + 1;
	            }  
	        }
   
	        return -1;
	    }
	    public static void main(String args[])
	    {
	        BinarySearch ob = new BinarySearch();
	        int a[] = { 2, 3, 4, 10, 40 };
	        int n = a.length;
	        int x = 10;
	        int res = ob.binarySearch(a, 0, n - 1, x);

	        if (res == -1)
	            System.out.println("Element not present");
	        else
	            System.out.println("Element found at index " + res);
	    }
	}
