package com.tns.application;
import com.tns.framework.CurrentAcc;

public class MMCurrentAcc extends CurrentAcc{

	public MMCurrentAcc(int accNo, String accNm, float accBal, float credit_limit) {
		super(accNo, accNm, accBal,credit_limit);
		
	}

	@Override
	public String toString() {
		return String.format("MMCurrentAcc [ toString()=%s]", super.toString());
	}
	
}
