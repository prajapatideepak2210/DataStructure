package com.bridgelabz.datastructureprogram.programs;

import java.util.Scanner;

import com.bridgelabz.datastructureprogram.utility.Utility;

public class Palindrome {
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		Utility utility=new Utility();
		System.out.print("Enter the String to check palindrome : ");
		String string=scanner.next();
		boolean palindrome=utility.Palindrome(string);
		if(palindrome)
		{
			System.out.println(string+ " is palindrome.");
		}
		else
		{
			System.out.println(string + " is not palindrome.");
		}
	}
}
