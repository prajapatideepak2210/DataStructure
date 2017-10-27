package com.bridgelabz.datastructureprogram.programs;

import java.util.Scanner;

import com.bridgelabz.datastructureprogram.utility.CashCounter;

public class BankCashCounter {
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.println("Bank Open Now.\n\n");
		System.out.print("Enter how many people is in the queue : ");
		int numberOfPeople=scanner.nextInt();
		System.out.print("\nEnter from how much amount do you want to start the bank : ");
		double amount=scanner.nextDouble();
		CashCounter cashCounter=new CashCounter(amount, numberOfPeople);
		
		do{
			System.out.println("Enter 1 for Withdrawal , and 2 for Deposit : ");
			int condition=scanner.nextInt();
			switch (condition) {
			case 1:
				System.out.println("Enter the amount : ");
				double rupee=scanner.nextDouble();
				cashCounter.withdrawal(rupee);
				break;
				
			case 2:
				System.out.println("Enter the amount : ");
				double rupee2=scanner.nextDouble();
				cashCounter.deposit(rupee2);
				break;

			default:
				System.out.println("You have entered wrong choise.");
				break;
			}
			numberOfPeople--;
		}while(numberOfPeople!=0);
		
		System.out.println("Remaining amount in Bank : "+cashCounter.bankBalance);
		System.out.println("Bank Closed.");
	}
}
