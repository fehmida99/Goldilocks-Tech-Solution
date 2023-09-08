package com.goldilocks;

import java.util.Scanner;

public class DecimalToBinary {
	
	public static String DecimalToBinary(String st) {
				
		try {
			int number = Integer.parseInt(st);
			StringBuilder sb = new StringBuilder();
			
			while (number > 0) {
				int rem = number % 2;
				sb.append(rem);
				number /= 2;
			}
			
//			123/2=61--r=1
//			61/2=30 -- r = 1
//			30/2=15 -- r= 0
//			15/2=7-- r=1
//			7/2 = 3-- r=1
//			3/2 = 1 -- r=1
//			1/2 = 0 -- r=1
//			
//			123 --> 1111011
			
			
			return sb.reverse().toString();
		} catch (NumberFormatException ex) {
			return "Invalid input...";
		}
		
		
		
	}
	
	
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter the Decimal value to convert it into Binary number.");
	System.out.println("********************************************************");
	String decimalNum = sc.next();
	
	String binaryNum = DecimalToBinary(decimalNum);    
	
	System.out.println(binaryNum);
	
	
}






}
