package com.bridgelabz.datastructureprogram.programs;

import java.util.Scanner;

import com.bridgelabz.datastructureprogram.utility.Utility;

public class Calendar {
	public static void main(String[] args) {
		Utility utility=new Utility();
		Scanner scan=new Scanner(System.in);
		System.out.print("Enter the year which should be in 4 digit only : ");
		int year=scan.nextInt();
		int length=(int)Math.log10(year)+1;
		String[][] calendar=null;
		if(length==4)
		{
			System.out.print("Enter the Month which should be into 1 to 12 : ");
			int month=scan.nextInt();
			System.out.println("\n\n");
			if(month>0 && month<13)
			{
				calendar=utility.calendar(year, month);
			}
			else
			{
				System.out.println("You have entered wrong month.");
			}
		}
		else
		{
			System.out.println("You have entered wrong year.");
		}
		
		
		for(int i=0; i<7; i++)
		{
			System.out.print(calendar[0][i]+"\t");
		}
		System.out.println();
		for(int i=1; i<7; i++)
		{
			for(int j=0; j<7; j++)
			{
				System.out.print(calendar[i][j]+"\t");
				if(j==6)
				{
					System.out.println();
				}
			}
		}
	}
}
