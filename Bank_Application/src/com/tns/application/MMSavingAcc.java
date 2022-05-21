package com.tns.application;
import com.tns.framework.SavingAcc;

public class MMSavingAcc extends SavingAcc {
	

	public MMSavingAcc(int accNo, String accNm, float accBal, boolean isSalaried) {
		super(accNo, accNm, accBal, isSalaried);
		
	}

	@Override
	public String toString() {
		return String.format("MMSavingAcc [toString()=%s]", super.toString());
	}
	

}
