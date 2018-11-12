package com.nt.user;

import com.nt.bo.Bank;
import com.nt.exceptionclasses.InSufficientFundsException;
import com.nt.exceptionclasses.InvalidAmountException;

public class BankUser {
	private Bank bank;
	public void addBank(String bankName)throws Exception{
		//reflection api
		Class bankclass=Class.forName(bankName);
		Object bankObject=bankclass.newInstance();
		if(bankObject instanceof Bank) {
			bank=(Bank) bankObject;
		}
		else {
			throw new Exception("Invalid bank name");
		}
	}
	public String deposite(double amt) throws InvalidAmountException {
		return bank.deposite(amt)+" "+ bank.balanceEnquiry();
		
	
	}
			
		public double withdraw(double amt) throws InvalidAmountException, InSufficientFundsException {
			return bank.withdraw(amt);
			
		}
		public double balanceEnquiry() {
			return bank.balanceEnquiry();
		}{
			
		}


}
