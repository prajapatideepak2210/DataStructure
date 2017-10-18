package com.bridgelabz.datastructureprogram.programs;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

import com.bridgelabz.datastructureprogram.utility.Utility;

public class UnOrderedList {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Program Started.");
		String str=null;
		String file="/home/bridgeit/Deepak Programs/DataStructureProgram/File For Unordered list";
		try {
			FileReader fr=new FileReader(file);
			BufferedReader bf=new BufferedReader(fr);
			str=bf.readLine();
		} catch (IOException e) {
			e.printStackTrace();
		}
		String str1=str.replaceAll(",", "");
		String[] str2=str1.split(" ");
		
		Utility o1=new Utility();
		for(int i=str2.length-1; i>=0; i--)
		{
			o1.add(str2[i]);
		}
		System.out.println("The size of list : "+o1.size());
		//printing all list 
		System.out.println("All content : ");
		System.out.println("===================================================");
		for(String i : str2)
		{
			System.out.print(i+" ");
		}
		System.out.println("\n===================================================");
		System.out.print("Enter what you want to search : ");
		String search=sc.next();
		o1.search(search);
		System.out.println("The size of list : "+o1.size());
		o1.fileWriter(file);
		
		System.out.println("Program ended.");
	}
}
