package com.bridgelabz.datastructureprogram.programs;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

import com.bridgelabz.datastructureprogram.utility.OrderedListMetods;

public class OrderedList {
	public static void main(String[] args) {
		OrderedListMetods orderedListMetods=new OrderedListMetods();
		Scanner scanner=new Scanner(System.in);
		System.out.println("Program Started.");
		String string=null;
		String file="/home/bridgeit/Deepak Programs/DataStructureProgram/file for ordered list";
		try {
			FileReader fileReader=new FileReader(file);
			BufferedReader bufferedReader=new BufferedReader(fileReader);
			string=bufferedReader.readLine();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		String string1=string.replaceAll(",", "");
		String[] string2=string1.split(" ");
		int[] array=new int[string2.length];
		for(int i=0; i<string2.length; i++)
		{
			array[i]=Integer.parseInt(string2[i]);
		}
		
		for(int i=0; i<string2.length; i++)
		{
			orderedListMetods.push(array[i]);
		}
		System.out.println("Size of Lis : "+orderedListMetods.size());
		orderedListMetods.printList();
		System.out.print("\nEnter a number to search : ");
		int search=scanner.nextInt();
		
		orderedListMetods.search(search);
		System.out.println("Size of Lis : "+orderedListMetods.size());
		orderedListMetods.printList();
		
		orderedListMetods.fileWriter(file);
	}
}
