package com.bridgelabz.datastructureprogram.programs;

import java.util.Scanner;

import com.bridgelabz.datastructureprogram.utility.Utility;

public class BinarySearchTree {
	public static void main(String[] args) {
		Utility utility=new Utility();
		Scanner scan=new Scanner(System.in);
		System.out.println("Program Started.");
		System.out.println("Enter how many test do you want : ");
		int test=scan.nextInt();
		
		for(int i=0; i<test; i++)
		{
			System.out.print("Enter the nodes : ");
			int nodes=scan.nextInt();
			System.out.println("\nFor "+nodes+", "+utility.binarySearchTree(nodes)+" search possible.");
		}
		System.out.println("Program Ended.");
	}
}
