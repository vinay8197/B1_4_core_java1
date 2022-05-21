package com.tns.application;

import com.tns.framework.*;

public class MMBankFactory extends BankFactory {
	public MMSavingAcc getNewSavingAcc(int accNo, String accNm, float accBal,boolean isSalaried) {
		MMSavingAcc s=new MMSavingAcc(accNo, accNm,accBal, isSalaried);
		return s;
	}
	public MMCurrentAcc getNewCurrentAcc(int accNo, String accNm, float accBal,float creaditLimit) {
		MMCurrentAcc c=new MMCurrentAcc(accNo,accNm,accBal,creaditLimit);
		return c;
		
	}
	
}
