package com.bridgelabz.datastructureprogram.utility;

public class CashCounter {
	
	public double bankBalance=0;
	Queue q1=null;
	public CashCounter(double bankAmount, int numOfPeople)
	{
		bankBalance=bankAmount;
		q1=new Queue(numOfPeople);
	}
	
	public void withdrawal(double amount)
	{
		if(amount<=bankBalance)
		{
			bankBalance=bankBalance-amount;
			System.out.println(amount+" rs has been withdrawaled.");
			q1.deueue();
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
		q1.deueue();
	}
}
