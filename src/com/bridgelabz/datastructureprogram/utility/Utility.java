package com.bridgelabz.datastructureprogram.utility;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Scanner;

/**
 * @author Deepak Prajapati
 *
 */
public class Utility {
	/**
	 * This all methods are for OrderedList
	 */
	private int count=0;
	public Node head;
	private Node temp, temp2;
	
	//inner class
	/**
	 * @author Deepak Prajapati
	 *
	 * @description This is the inner class of Utility class.
	 */
	public class Node<T>
	{
		T data;
		Node next;
		
		public T getData() {
			return data;
		}

		public void setData(T data) {
			this.data = data;
		}

		public Node getNext() {
			return next;
		}

		public void setNext(Node next) {
			this.next = next;
		}

		public Node(T data)
		{
			this.data=data;
			next=null;
		}
	}
	
	//for adding the items
	public <T> void add(T item)
	{
		Node new_node=new Node(item);
		new_node.next=head;
		head=new_node;
		count++;
	}
	

	/**
	 * @param item
	 * 
	 * @description This method will remove the item which is 
	 * given by you as a parameter from the list and 
	 */
	public <T> void remove(T item)
	{
		Node temp=head;
		Node prev=head;
		if(head==null)
		{
			System.out.println("List is empty, first you have to add the data.");
		}
		else if(temp.getData().equals(item)){
			head=temp.getNext();
		}
		else 
		{
			temp2=head;
			temp=head;
			while(temp!=null)
			{
				if(item.equals(temp.getData()))
				{
					System.out.println(item+" is removed.");

					prev.setNext(temp.getNext());
					count--;
					for(int i=0; i<size(); i++)
					{
						System.out.print(temp2.getData()+" ");
						temp2=temp2.getNext();
					}
					break;
				}
				else
				{
					prev=temp;
					temp=temp.getNext();
				}
			}
			if(temp==null)
			{
				System.out.println(item+" is not available in the list.");
			}
		}
	}
	
	/**
	 * @param item
	 * 
	 * @discription this method will search the item 
	 * from the list which you have given as a parameter. 
	 * 
	 * 
	 */
	public <T> void search(T item)
	{
		if(head==null)
		{
			System.out.println("Your list is Empty please first add some data.");
		}
		else
		{
			temp=head;
			while(temp!=null)
			{
				if(item.equals(temp.getData()))
				{
					System.out.println(item+" is found, "+item+" is removed");
					remove(item);
					break;
				}
				else
				{
					temp=temp.getNext();
				}
			}
			if(temp==null)
			{
				System.out.println(item+" is not found, "+item+" is added.");
				add(item);
			}
		}
	}
	
	
	/**
	 * @description This method five you all the element of the list.
	 */
	public LinkedList<String> getElement()
	{
		LinkedList<String> list=new LinkedList<String>();
		if(head!=null)
		{
			temp=head;

			for(int i=0; i<size(); i++)
			{
				list.add((String)temp.getData());
				
				temp=temp.getNext();
			}
		}
		return list;
	}
	
	/**
	 * @return integer value
	 * 
	 * @description This method will return size of the list.
	 */
	public int size()
	{
		return count;
	}
	
	
	/**
	 * @param file
	 * 
	 * @description This method will write all content of 
	 * the list into a file which you have entered as a parameter.
	 */
	public void fileWriter(String file)
	{
		String string="";
		 BufferedWriter bufferedWriter=null;
		try {
			FileWriter writer = new FileWriter(file,false);
			bufferedWriter = new BufferedWriter(writer); 
			temp=head;
			while(temp!=null)
			{
				string=string+temp.getData()+" ";
				temp=temp.getNext();
			}
			bufferedWriter.write(string);
			bufferedWriter.flush();
           
		} catch (IOException e) {
			e.printStackTrace();
		}
		finally {
			try {
				bufferedWriter.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}

	
	public void balanceParanthesis()
	{
		Scanner scanner = new Scanner(System.in);
        Stack stack=new Stack();
        System.out.println("Parenthesis Matching Test\n");
        /* Accepting expression */
        System.out.println("Enter expression");
        String exp = scanner.next();        
        int length = exp.length();
        System.out.println("\nMatches and Mismatches:\n");
        for (int i = 0; i < length; i++)
        {    
            char charactor = exp.charAt(i);
            if (charactor == '(')
                stack.push(i);
            
            else if (charactor == ')')
            {
                    stack.pop();
                    System.out.println("True");
            }            
        }
        int condition=1;
        while (!stack.isEmpty() && condition==1)
        {
        	System.out.println("False");
        	condition++;
        }
            
	}
	
	/**
	 * @param str
	 * 
	 * @Description This method is for check String is Palindrome or not.
	 */
	public boolean Palindrome(String str)
	{
		char[] charArray=str.toCharArray();
		
		boolean condition=true;
		int i1 = 0;
		int i2 = charArray.length - 1;
		while (i2 > i1) {
			if (charArray[i1] != charArray[i2]) {
				condition= false;
				return condition;
			}
			++i1;
			--i2;
		}
		return condition;
	}
	
	
	/**
	 * @param file
	 * 
	 * @description This method will accepts the argument by name file which is the File Path.
	 * 
	 * @return It will return the String which is written in the file.
	 */
	public String fileReader(String file)
	{
		String string=null;
		BufferedReader bufferedWriter=null;
		try {
			FileReader fileReader=new FileReader(file);
			bufferedWriter=new BufferedReader(fileReader);
			string=bufferedWriter.readLine();
		} catch (IOException e) {
			e.printStackTrace();
		}
		return string;
	}
	
	/**
	 * @param node
	 * @return
	 */
	public long binarySearchTree(int node)
	{
		long sum=0;
		if(node<=1)
		{
			return 1;
		}
		else
		{
			for(int i=1; i<=node; i++)
			{
				sum=sum+(binarySearchTree(i-1)*binarySearchTree(node-i));
			}
			return sum;
		}
	}
	
	/**
	 * @param year
	 * @return It will return true if year is leap year otherwise it will return false.
	 */
	private boolean leapYear(int year)
	{
		if(year % 4==0 && year % 100!=0 || year % 400==0)
			return true;
		else
			return false;

	}
	
	/**
	 * @param year
	 * @param month
	 * @param day
	 * @return it returns the day 0 for Sunday 1 for Monday and so on. 
	 */
	private int dayOfWeek(int year, int month, int day)
	{
		int y= year-(14-month)/12;
		int x= y + (y/4) - (y/100) + (y/400); 
		int m=month + 12 * ((14 - month)/12) - 2;
		int d=(day + x + (31*m) / 12) % 7;
		return d;
	}
	
	/**
	 * @param year
	 * @param month
	 * @description This method will print the calendar of given month.
	 */
	public String[][] calendar(int year, int month)
	{
		Utility utility=new Utility();
		String[] months={"","January", "February", "March","April", "May", "June",
				"July", "August", "September","October", "November", "December"};
		String[] day={"S ","M ","T ","W ","Th","F ","S "};
		
		//declaring the 2DArray for calendar.
		String[][] calendarArray=new String[7][7];
		
		int[] days = {0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
		if (month == 2 && utility.leapYear(year)) 
		{
			days[month] = 29;
		}
		
		//Initializing the Calendar
		int dayOfTheWeek=utility.dayOfWeek(year, month, 1);
		int date=01;
		for(int j=0; j<day.length; j++)
		{
			calendarArray [0][j]=day[j];
		}
		for(int i=0; i<7; i++)
		{
			if(dayOfTheWeek<=i)
			{
				calendarArray[1][i]=Integer.toString(date);
				date++;
			}
			else{
				calendarArray[1][i]="  ";
			}
		}
		for(int i=2; i<7; i++)
		{
			for(int j=0; j<7; j++)
			{
				if(date<=days[month]){
					calendarArray[i][j]=Integer.toString(date);
					date++;
				}
				else{
					calendarArray[i][j]="  ";
				}
			}
		}
		
		return calendarArray;
		
		/*// Printing the calendar
		System.out.println("\n\nJava Calendar  "+month+"  "+year);
		System.out.println(months[month]+"  "+year);
		for(int i=0; i<7; i++)
		{
			System.out.print(calendarArray[0][i]+"\t");
		}
		System.out.println();
		for(int i=1; i<7; i++)
		{
			for(int j=0; j<7; j++)
			{
				System.out.print(" "+calendarArray[i][j]+"\t");
				if(j==6)
				{
					System.out.println();
				}
			}
		}*/
	}
	
	/**
	 * @param start
	 * @param end
	 * @return LinkedList
	 * 
	 * @Description This method will find the prime numbers between the 
	 * arguments(start and end) and store in the linked list and return 
	 * the list of prime numbers as an LinkedList. 
	 */
	public LinkedList<Integer> primeNumber(int start, int end)
	{
		int length=0;
		LinkedList<Integer> list=new LinkedList<Integer>();
		for(int a=start; a<end; a++)
		{
			int number = a, count=0;

			for (int i = 1; i <= number; i++)
			{
				count = 0;
				for (int j = 2; j <= i / 2; j++) 
				{
					if (i % j == 0) 
					{
						count++;
						break;
					}
				}
			}

			if(count==0)
			{
				list.add(a);
			}
		}
		return list;
	}
	
	
	/**
	 * @param number
	 * @param number2
	 * @return This method will return true if given numbers are anagram 
	 * and return false if given numbers are not anagram 
	 */
	public boolean anagram(int number, int number2)
	{
		String string=Integer.toString(number);
		char[] charArray=string.toCharArray();
		String string2=Integer.toString(number2);
		char[] charArray2=string2.toCharArray();
		Arrays.sort(charArray);
		Arrays.sort(charArray2);
		string=new String(charArray);
		string2=new String(charArray2);
		if(string.length()==string2.length())
		{
			if(string.equals(string2))
			{
				return true;
			}
			else
				return false;
		}
		else{
			return false;
		}
	}
}
