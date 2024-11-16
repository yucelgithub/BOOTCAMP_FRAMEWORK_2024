package com.BootCamp;
import java.util.*;
public class Java_Calculator {

	public static void main(String[] args) {
	     int Firstnumber= 0;
	      int Secondnumber= 0;
	      
     	        Scanner scan = new Scanner(System.in);

		        System.out.println("please enter the first number");
		         Firstnumber= scan.nextInt();

		        System.out.println("please enter the second number");
		        Secondnumber= scan.nextInt();
		        
		        int operator;			    
		        double answer= 0;
		 
		        System.out.println("Please enter operation");
		        System.out.println("1. +");
		        System.out.println("2. -");
		        System.out.println("3. *");
		        System.out.println("1. %"); 
		        
		       
		       
	
		        operator = scan.nextInt();
		        	       
		        switch(operator)
		        {
		        case 1: answer =Firstnumber + Secondnumber;
		        break;
		        case 2: answer =Firstnumber - Secondnumber;
		        break;
		        case 3: answer =Firstnumber * Secondnumber;
		        break;
		        case 4: answer =Firstnumber % Secondnumber;
		        break;
		        }
		        System.out.println("Answer is :" + answer);
		        
	}
}
  
