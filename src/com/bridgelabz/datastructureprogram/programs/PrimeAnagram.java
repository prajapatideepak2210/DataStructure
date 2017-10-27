package com.bridgelabz.datastructureprogram.programs;

import java.util.LinkedList;

import com.bridgelabz.datastructureprogram.utility.Utility;

public class PrimeAnagram {
	public static void main(String[] args) {
		Utility utility=new Utility();
		System.out.println("Program Started.");
		int start=1;
		int end=1000;
		LinkedList<Integer> list=new LinkedList<Integer>();
		list=utility.primeNumber(start, end);
		
		String[][] TwoDArray=new String[2][28561];
		int index1=0, index2=0;
		for(int i=0; i<list.size()-1; i++)
		{
			for(int j=i+1; j<list.size(); j++)
			{
				if(list.get(i)!=null)
				{
					if(utility.anagram(list.get(i), list.get(j))==true)
					{
						TwoDArray[0][index1]=list.get(i)+"-"+list.get(j);
						index1++;
					}
					else if(utility.anagram(list.get(i), list.get(j))==false)
					{
						TwoDArray[1][index2]=list.get(i)+"-"+list.get(j);
						index2++;
					}
				}
			}
		}
		
		for(int i=0; i<2; i++)
		{
			if(i==0)
				System.out.println("This are the Anagram Numbers : ");
			else if(i==1)
				System.out.println("\nThis are the not Anagram Numbers : ");
			for(int j=0; j<400; j++)
			{
				
				if(TwoDArray[i][j]!=null)
				{
					System.out.print(TwoDArray[i][j]+"   ");
				}
			}
		}
	}
}
