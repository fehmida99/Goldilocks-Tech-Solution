package com.goldilocks;

import java.util.Scanner;


public class InputOutput {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Write input to Print output...");
		System.out.println();
		System.out.println("To Stop Type Cancel!!!");
		String input;
		while(!(input=sc.nextLine()).equalsIgnoreCase("CANCEL")) {
			System.out.println(input);
		}
	}

}
