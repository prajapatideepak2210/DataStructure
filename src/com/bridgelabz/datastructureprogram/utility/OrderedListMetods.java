package com.bridgelabz.datastructureprogram.utility;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;
import java.util.Comparator;

import com.bridgelabz.datastructureprogram.utility.Utility.Node;

public class OrderedListMetods {
	Node head=null, tail, temp, temp2, new_node;
	int count=0;
	public class Node
	{
		int data;
		Node nextNode;
		public int getData() {
			return data;
		}
		public void setData(int data) {
			this.data = data;
		}
		public Node getNextNode() {
			return nextNode;
		}
		public void setNextNode(Node nextNode) {
			this.nextNode = nextNode;
		}
		
		//Single argument Constructor of Node class
		public Node(int item)
		{
			this.data=item;
			nextNode=null;
		}
	}
	
	
	public void push(int item)
	{
		Node new_node=new Node(item);
		
		if(head==null)
		{
			head=new_node;
			temp=new_node;
			tail=new_node;
			count++;
		}
		else
		{
			if(item<head.getData())
			{
				new_node.setNextNode(head);
				head=new_node;
				temp=new_node;
				count++;
			}
			else
			{
				if(item>tail.getData())
				{
					tail.setNextNode(new_node);
					tail=new_node;
					count++;
				}
				if(item>head.getData() && item< tail.getData())
				{
					boolean condition=true;
					temp=head;
					while(condition)
					{
						if(item>temp.getData() && item<temp.getNextNode().getData())
						{
							new_node.setNextNode(temp.getNextNode());
							temp.setNextNode(new_node);
							condition=false;
							count++;
						}
						else
						{
							temp=temp.getNextNode();
						}
					}
				}
			}
		}
	}
	
	public void remove(int item)
	{
		Node temp=head;
		Node prev=head;
		if(head==null)
		{
			System.out.println("List is empty, first you have to add the data.");
		}
		else if(item==head.getData()){
			head=head.getNextNode();
		}
		else 
		{
			temp2=head;
			temp=head;
			while(temp!=null)
			{
				if(item==temp.getData())
				{
					System.out.println(item+" is removed.");
					prev.setNextNode(temp.getNextNode());
					count--;
					break;
				}
				else
				{
					prev=temp;
					temp=temp.getNextNode();

				}
			}
			if(temp==null)
			{
				System.out.println(item+" is not available in the list.");
			}
		}
	}
	
	public void search(int searchItem)
	{
		if(head==null)
		{
			System.out.println("List is Empty, please first add some data.");
		}
		else
		{
			temp=head;
			while(temp!=null)
			{
				if(searchItem==temp.getData())
				{
					System.out.println("Your Search "+searchItem+" is found, "+searchItem+" is removed.");
					remove(searchItem);
					break;
				}
				else
				{
					temp=temp.getNextNode();
				}
			}
			if(temp==null)
			{
				System.out.println("Your search "+searchItem+" is not Found, "+searchItem+" is added.");
				push(searchItem);
			}
		}
	}
	
	public void printList()
	{
		temp=head;
		System.out.println("Ordered List is : ");
		for(int i=0; i<size(); i++)
		{
			System.out.print(temp.getData()+" ");
			temp=temp.getNextNode();
		}
	}
	
	public void fileWriter(String file)
	{
		String str="";
		 BufferedWriter bw=null;
		try {
			FileWriter writer = new FileWriter(file,false);
            bw = new BufferedWriter(writer); 
			temp=head;
			while(temp!=null)
			{
				str=str+temp.getData()+" ";
				temp=temp.getNextNode();
			}
			bw.write(str);
			bw.flush();
           
		} catch (IOException e) {
			e.printStackTrace();
		}
		finally {
			try {
				bw.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
	
	public int size()
	{
		return count;
	}
}
