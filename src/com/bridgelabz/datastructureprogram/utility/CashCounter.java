package com.bridgelabz.datastructureprogram.utility;

public class CashCounter {
	
	public double bankBalance=0;
	Queue<Integer> queue=null;
	public CashCounter(double bankAmount, int numOfPeople)
	{
		bankBalance=bankAmount;
		queue=new Queue<Integer>(numOfPeople);
	}
	
	public void withdrawal(double amount)
	{
		if(amount<=bankBalance)
		{
			bankBalance=bankBalance-amount;
			System.out.println(amount+" rs has been withdrawaled.");
			queue.deueue();
		}
		else
		{
			System.out.println("Insufficient Balance.");
		}
	}

	public void deposit(double amount)
	{
		bankBalance=bankBalance+amount;
		System.out.println(amount+" rs deposited.");
		queue.deueue();
	}
}
