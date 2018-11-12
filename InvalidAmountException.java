package com.nt.exceptionclasses;

public class InvalidAmountException extends Exception {
	public InvalidAmountException() {
		super();
	}
	public InvalidAmountException(String msg) {
		super(msg);
	}
}
