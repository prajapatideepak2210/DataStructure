package com.bridgelabz.datastructureprogram.utility;

import com.bridgelabz.datastructureprogram.utility.Stack.Node;

public class StackForString {
	private int count=-1;
	public Node head=null, tail=null;
	private Node temp,temp2, prev;
	
	//Inner Class
	public class Node
	{
		String data;
		Node next;
		
		public String getData() {
			return data;
		}

		public void setData(String data) {
			this.data = data;
		}

		public Node getNext() {
			return next;
		}

		public void setNext(Node next) {
			this.next = next;
		}

		public Node(String data)
		{
			this.data=data;
			next=null;
		}
	}
	
	
	/**
	 * @param item
	 * 
	 * @description This method is used to push the items.
	 */
	public  void push(String item)
	{
		Node new_Node=new Node(item);
		
		if(head==null)
		{
			head=new_Node;
			tail=new_Node;
			count++;
		}
		
		else
		{
			prev=tail;
			tail=new_Node;
			count++;
		}
	}
	
	/**
	 * @Description This method is used to remove the elements.
	 */
	public void pop()
	{
		if(head==null)
		{
			System.out.println("List is Empty. Please first insert the element.");
		}
		else
		{
			temp2=tail;
			tail=prev;
			count--;
			
		}
	}
	
	
	/**
	 * @return boolean
	 * 
	 * @Description This method is returns and check stack is Empty or not.
	 */
	public boolean isEmpty()
	{
		if(count==-1)
			return true;
		else
			return false;
	}
	
	/**
	 * @return T
	 * 
	 * @Description This method returns top element of the stack.
	 */
	public String peek()
	{
		if(head==null)
		{
			System.out.println("Stack is Empty.");
			return null;
		}
		else{
			return  tail.getData();
		}
	}
	
	
	/**
	 * @return integer
	 * 
	 * @Description This method returns size of Stack.
	 */
	public int size()
	{
		return count;
	}
	
	//I have to remade it.
	public String getElement()
	{
		String value="";
		if(head!=null)
		{
			temp=head;
			for(int i=0; i<size(); i++)
			{
				temp=temp.getNext();
			}
			return value;
		}
		else{
			System.out.println("Stack is Empty.");
			return value;
		}
	}
}
