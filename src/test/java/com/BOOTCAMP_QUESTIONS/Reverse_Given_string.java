package com.BOOTCAMP_QUESTIONS;

public class Reverse_Given_string {

	  public static void main (String[] args) {
	      
	        String str= "yucel kahraman", nstr="";
	        char ch;
	      
	      System.out.print("Original word: ");
	      System.out.println("yucel kahraman"); //Example word
	      
	      for (int i=0; i<str.length(); i++)
	      {
	        ch= str.charAt(i); 
	        nstr= ch+nstr; 
	      }
	      System.out.println("Reversed word: "+ nstr);
	    }
	}

