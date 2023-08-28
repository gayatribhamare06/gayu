package com.cjc.bms.client;

import java.util.Scanner;

import com.cjc.bms.service.RBI;
import com.cjc.bms.serviceImpl.SBI;

public class Test {
	public static void main(String [] args)
	{
		RBI bank = new SBI();
		Scanner sc = new Scanner(System.in);
		System.out.println("1.Create Account\n"
		                                      +"2.display All Details\n" 
				                              +"3.deposite Money\n"
		                                      +"4.withdrawal\n"
				                              +"5.balance Check");
		while (true) {
		System.out.println("Enter your choise");
		
		int i =sc.nextInt();
		if(i==1)
		{
			bank.createAccount();
		}
		else if(i==2)
		{
			bank.displayAllDetails();
			
		}
		else if (i==3) 
		{
			bank.depositeMoney();
		}
		else if(i==4)
		{
			bank.depositeMoney();
			
		}
		else
		{
			bank.balanceCheck();
			
		}
				 
	}

}
}
