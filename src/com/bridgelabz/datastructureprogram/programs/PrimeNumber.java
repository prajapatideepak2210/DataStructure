package com.bridgelabz.datastructureprogram.programs;

import java.util.LinkedList;

import com.bridgelabz.datastructureprogram.utility.Utility;

public class PrimeNumber {
	public static void main(String[] args) {
		Utility utility=new Utility();
		System.out.println("Program Started.");
		int start=1;
		int end=1000;
		LinkedList<Integer> list=new LinkedList<Integer>();
		list=utility.primeNumber(start, end);
		int[][] TwoDArray=new int[11][30];
		int index=0;
		int value=100;
		for(int i=0; i<1; i++)
		{
			
			for(int j=0; j<50; j++)
			{
				if(index<list.size())
				{
					if(list.get(index)>value)
					{
						i++;
						j=0;
						value=value+100;
					}
					TwoDArray[i][j]=list.get(index);
					index++;
				}
			}
		}
		System.out.println(list.size());
		int value2=100;
		for(int i=0; i<11; i++)
		{
			for(int j=0; j<30; j++)
			{
				if(TwoDArray[i][j]>value2)
				{
					System.out.println();
					value2=value2+100;
				}
				if(TwoDArray[i][j]!=0)
				{
					System.out.print(TwoDArray[i][j]+"\t");
				}
			}
		
		}
	}
}
