package com.nt.user;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import com.nt.exceptionclasses.InSufficientFundsException;
import com.nt.exceptionclasses.InvalidAmountException;

public class Clerk {
	public static void main(String[] args) throws Exception  {
		BankUser ibank=new BankUser();
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.println("Add Bank");
		String bankName=br.readLine();
		ibank.addBank(bankName);
		System.out.println();
		String option="";
		String s = null;
		double amt=0.0;
		do {
			try
			{
			System.out.println("choose one option");
			System.out.println("1. Deposite");
			System.out.println("2. withdraw");
			System.out.println("3. Balanceenguiry");
			System.out.println("enter option");
			option = br.readLine();
			switch(option) {
			case "1":
			{
				System.out.println("enter deposite amount");
				s= br.readLine();
				amt=Double.parseDouble(s);
				ibank.deposite(amt);
				ibank.balanceEnquiry();
				break;
			}
			case "2":
			{
				System.out.println("enter withdraw amount");
				s= br.readLine();
				amt=Double.parseDouble(s);
			double withdrawAmt=	ibank.withdraw(amt);
				System.out.println("withdraw amount: "+withdrawAmt);
				ibank.balanceEnquiry();
				break;
				
		}
			case "3":
			{
				ibank.balanceEnquiry();
				break;
	}
		default:
			System.out.println("invalid option");

}
		}
		catch(InvalidAmountException ie) {
		ie.printStackTrace();
		}
			catch(InSufficientFundsException ise) {
				ise.printStackTrace();
			}
			catch(NumberFormatException e) {
				e.printStackTrace();
			}
			System.out.println("\n Do you want to continue (yes/no)");
			try {
				option=br.readLine();
			} catch (Exception e) {
				
				e.printStackTrace();
			}
		}while(option.equalsIgnoreCase("yes"));
	}

	
}

