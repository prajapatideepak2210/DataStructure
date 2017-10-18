package com.bridgelabz.datastructureprogram.programs;

import java.util.Scanner;

import com.bridgelabz.datastructureprogram.utility.Utility;

public class Palindrome {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		Utility u=new Utility();
		System.out.print("Enter the String to check palindrome : ");
		String string=sc.next();
		
		boolean palindrome=u.Palindrome(string);
		
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
