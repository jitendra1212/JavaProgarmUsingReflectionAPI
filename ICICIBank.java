package com.nt.bo;

import com.nt.exceptionclasses.InSufficientFundsException;
import com.nt.exceptionclasses.InvalidAmountException;

public class ICICIBank implements Bank{
 
	private double balance;
	@Override
	public double deposite(double amt) throws InvalidAmountException {
		if(amt <=0) {
			throw new InvalidAmountException(amt+"is invalid amount");
		}
		return balance=balance+amt;
	}

	@Override
	public double withdraw(double amt) throws InvalidAmountException, InSufficientFundsException {
		if(amt<=0) {
			throw new InvalidAmountException(amt+"is invalid amopunt");
		}
		if(balance<amt) {
			throw new InSufficientFundsException("insufficent funds");
		}
		return balance=balance-amt;
		
	}

	@Override
	public double balanceEnquiry() {
		System.out.println("Current balance: "+balance);
		return balance;
		
	}

}
