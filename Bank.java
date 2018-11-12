package com.nt.bo;

import com.nt.exceptionclasses.InSufficientFundsException;
import com.nt.exceptionclasses.InvalidAmountException;

public interface Bank {
	public double deposite(double amt) 
		throws InvalidAmountException;
	public double withdraw(double amt) 
			throws InvalidAmountException,InSufficientFundsException;
	public double balanceEnquiry();

}
