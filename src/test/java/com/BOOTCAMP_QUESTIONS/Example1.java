package com.BOOTCAMP_QUESTIONS;

public class Example1 {
	   public static void main(String args[]) { 
		      // initializing a string
		      String msg = "Tutorials Point Welcomes You!!";
		      System.out.println("The given String is: " + msg);
		      // initial count of the words
		      int total = 1;
		      // loop variable
		      int i = 0; 
		      // while loop to count the number of words
		      while (i < msg.length()) { 
		         // checking if the current character is space or not
		         if ((msg.charAt(i) == ' ') && (msg.charAt(i + 1) != ' '))  {
		            total++;  // incrementing the word count
		         }
		         i++; // incrementing loop variable
		      } 
		      // printing the result
		      System.out.println("Number of words in the given string: " +  total);
		   } 
		}


