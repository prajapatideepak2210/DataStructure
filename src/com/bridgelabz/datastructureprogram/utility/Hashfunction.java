package com.bridgelabz.datastructureprogram.utility;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Scanner;

/**
 * @author Deepak Prajapati
 * 
 * @description This class has a method by name "hashingfunction".
 *
 */
public class Hashfunction {
	Scanner scanner=new Scanner(System.in);

	/**
	 * @param string
	 * 
	 * @description This method will accepts the numbers as a String and will
	 * arrange the values in hashing function and then asking for Search 
	 * an element, if element available in the list then will remove that element
	 * from the list and if element is not available so add that element into 
	 * the list, and after that it will write the list into the file. 
	 */
	public void hashingfunction(String string, String filePath)
	{
		HashMap<Integer, LinkedList<Integer>> hashmap=new HashMap<>();
		String string2=string.replaceAll(",","");
		String stringArray[]=string2.split(" ");

		int integerList[]=new int[stringArray.length];
		//Storing data of file into the array.
		for(int i=0; i<stringArray.length; i++)
		{
			integerList[i]=Integer.parseInt(stringArray[i]);
		}
		//initializing the HashMap.
		for(int i=0; i<11; i++)
		{
			hashmap.put(i, new LinkedList<>());
		}

		// Puting the values into the hash map with key and values
		for(int i=0; i<integerList.length; i++)
		{
			LinkedList<Integer> linkedList=new LinkedList<>();
			int remainder=integerList[i]%11;
			linkedList=hashmap.get(remainder);
			linkedList.add(integerList[i]);
			hashmap.put(remainder, linkedList);
		}

		System.out.print("Enter the number to search : ");
		int numberToFind=scanner.nextInt();
		int remainderForSearch=numberToFind%11;

		LinkedList<Integer> linkedList2 = new LinkedList<>();
		linkedList2=hashmap.get(remainderForSearch);

		boolean isFound=true;

		// Searching the value which given by the user into the list
		for(int i=0; i<linkedList2.size(); i++)
		{
			if(numberToFind==linkedList2.get(i))
			{
				System.out.println("Your search "+numberToFind+" is found, removing it.");
				linkedList2.remove(i);
				isFound=false;
			}
		}
		if(isFound)
		{
			System.out.println("Your search "+numberToFind+" is not found, adding it.");
			linkedList2=hashmap.get(remainderForSearch);
			linkedList2.addLast(numberToFind);
			hashmap.put(remainderForSearch, linkedList2);
		}

		// Writing the list into the file
		File file = new File(filePath);
		LinkedList<Integer> list2=new LinkedList<Integer>();
		FileWriter fileWriter=null;
		try {
			for(int i=0; i<11; i++)
			{
				LinkedList<Integer> list=hashmap.get(i);
				for(int j=0; j<list.size(); j++)
				{
					list2.add(list.get(j));
				}
			}
			String string3="";
			for (int elements : list2)	
			{
				string3=string3+elements+" ";
			}
			System.out.println(string3);
			fileWriter=new FileWriter(file);
			fileWriter.write(string3);
		} catch (IOException e) {
			e.printStackTrace();
		}
		finally {
			try {
				fileWriter.flush();
				fileWriter.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
}
