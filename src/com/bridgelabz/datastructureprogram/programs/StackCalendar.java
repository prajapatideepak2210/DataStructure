package com.bridgelabz.datastructureprogram.programs;

import java.util.LinkedList;
import java.util.Scanner;

import com.bridgelabz.datastructureprogram.utility.Queue;
import com.bridgelabz.datastructureprogram.utility.Stack;
import com.bridgelabz.datastructureprogram.utility.Utility;

public class StackCalendar {
	private static Scanner scanner;

	public static void main(String[] args) {
		Utility utility=new Utility();
		scanner = new Scanner(System.in);
		System.out.print("Enter the year which should be in 4 charactor only : ");
		int year=scanner.nextInt();
		int length=(int)Math.log10(year)+1;
		String[][] calendar=null;
		if(length==4)
		{
			System.out.print("Enter the Month which should be into 1 to 12 : ");
			int month=scanner.nextInt();
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
		System.out.println();
		Queue<String> queue=new Queue<String>();
		Stack<String> stack=new Stack<>();
		for(int i=0; i<7; i++)
		{
			LinkedList<String> linkList=new LinkedList<String>();
			for(int j=0; j<7; j++)
			{
				linkList.add(calendar[i][j]);
			}
			if(linkList!=null)
			{
				queue.enqueue(linkList);
			}
		}
		if(queue!=null)
		{
			queue.getelement();
			stack.push(queue);
		}
		stack.getElement();
	}
}
