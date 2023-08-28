package com.cjc.bms.serviceImpl;
import com.cjc.bms.model.*;

import java.util.Scanner;

import com.cjc.bms.service.RBI;

public class SBI implements RBI
{
	
	Account a = new Account();
	Scanner sc = new Scanner(System.in);

    public void createAccount()
	{
		System.out.println("Please enter your Details");
		System.out.println("Enter the Account number");
		a.setAccNo(sc.nextInt());
		System.out.println("Enter the Holder name");
		a.setName(sc.next());
		System.out.println("Enter the mobile no");
		a.setMobnO(sc.nextLong());
		System.out.println("Enter the Aadhar no");
		a.setAdharno(sc.nextLong());
		System.out.println("Enter the Gender");
		a.setGender(sc.next());
		System.out.println("Enter the Age");
		a.setAge(sc.nextByte());
		System.out.println("Enter The Blance");
		a.setBalance(sc.nextDouble());
		
	}

	
	public void displayAllDetails() 
	{
		System.out.println("Display All Details");
		System.out.println("AccNo ="+a.getAccNo());
		System.out.println("Name ="+ a.getName());
		System.out.println("MobnO ="+a.getMobnO());
		System.out.println("Adharno = "+a.getAdharno());
		System.out.println("Gender ="+a.getGender());
		System.out.println("Age ="+a.getAge());
		System.out.println("Balance ="+a.getBalance());
	}

	public void depositeMoney() 
	{
		System.out.println("Deposite Money");
		System.out.println("Enter deposite amount");
		double amt=sc.nextDouble();
		double totalamt = a.getBalance()+amt;
		a.setBalance(totalamt);
	}

	
	public void withdrawal() 
	{
	System.out.println("Withdrawal");
	System.out.println("Enter withdrawal Amount");
	double amt1= sc.nextDouble();
	double withdraw = a.getBalance()-amt1;
	a.setBalance(withdraw);
	}


	public void balanceCheck() 
	{
		System.out.println("Balance Check");
		System.out.println("Balance ="+a.getBalance());
		
		
	}
}