package com.bridgelabz.datastructureprogram.programs;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

import com.bridgelabz.datastructureprogram.utility.OrderedListMetods;

public class OrderedList {
	public static void main(String[] args) {
		OrderedListMetods o1=new OrderedListMetods();
		Scanner sc=new Scanner(System.in);
		System.out.println("Program Started.");
		String str=null;
		String file="/home/bridgeit/Deepak Programs/DataStructureProgram/file for ordered list";
		try {
			FileReader fr=new FileReader(file);
			BufferedReader bf=new BufferedReader(fr);
			str=bf.readLine();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		String str1=str.replaceAll(",", "");
		String[] str2=str1.split(" ");
		int[] array=new int[str2.length];
		for(int i=0; i<str2.length; i++)
		{
			array[i]=Integer.parseInt(str2[i]);
		}
		
		for(int i=0; i<str2.length; i++)
		{
			o1.push(array[i]);
		}
		System.out.println("Size of Lis : "+o1.size());
		o1.printList();
		System.out.print("\nEnter a number to search : ");
		int search=sc.nextInt();
		
		o1.search(search);
		System.out.println("Size of Lis : "+o1.size());
		o1.printList();
		
		o1.fileWriter(file);
	}
	
	
}
