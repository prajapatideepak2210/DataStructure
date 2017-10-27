package com.bridgelabz.datastructureprogram.programs;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

import com.bridgelabz.datastructureprogram.utility.Utility;

public class UnOrderedList {
	private static Scanner scanner;
	public static void main(String[] args) {
		
		scanner=new Scanner(System.in);
		System.out.println("Program Started.");
		BufferedReader bufferedReader;
		String string=null;
		String file="/home/bridgeit/Deepak Programs/DataStructureProgram/File For Unordered list";
		try {
			FileReader fileReader=new FileReader(file);
			bufferedReader = new BufferedReader(fileReader);
			string=bufferedReader.readLine();
		} catch (IOException e) {
			e.printStackTrace();
		}
		String string1=string.replaceAll(",", "");
		String[] string2=string1.split(" ");
		
		Utility utility=new Utility();
		for(int i=string2.length-1; i>=0; i--)
		{
			utility.add(string2[i]);
		}
		System.out.println("The size of list : "+utility.size());
		//printing all list 
		System.out.println("All content : ");
		System.out.println("===================================================");
		for(String i : string2)
		{
			System.out.print(i+" ");
		}
		System.out.println("\n===================================================");
		System.out.print("Enter what you want to search : ");
		String search=scanner.next();
		utility.search(search);
		System.out.println("The size of list : "+utility.size());
		utility.fileWriter(file);
		
		System.out.println("Program ended.");
	}
}
