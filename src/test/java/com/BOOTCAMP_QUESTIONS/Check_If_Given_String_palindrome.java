package com.BOOTCAMP_QUESTIONS;

public class Check_If_Given_String_palindrome {
	   public static boolean isPalindrome(String str)
	    {
	        
	        String rev = "";

	        
	        boolean ans = false;

	        for (int i = str.length() - 1; i >= 0; i--) {
	            rev = rev + str.charAt(i);
	        }

	        
	        if (str.equals(rev)) {
	            ans = true;
	        }
	        return ans;
	    }
	    public static void main(String[] args)
	    {
	        
	        String str = "yucel";

	        
	        str = str.toLowerCase();
	        boolean A = isPalindrome(str);
	        System.out.println(A);
	    }
	}

