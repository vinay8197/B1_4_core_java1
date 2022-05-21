package com.tns.client;

import com.tns.application.MMBankFactory;
import com.tns.application.MMCurrentAcc;
import com.tns.application.MMSavingAcc;
import com.tns.framework.BankFactory;
import com.tns.framework.CurrentAcc;
import com.tns.framework.SavingAcc;

public class Client {
	public static void main(String[] args) {
		BankFactory b=new MMBankFactory();
		SavingAcc s=new MMSavingAcc(100,"Vinay T N ",20000,true);
		CurrentAcc c=new MMCurrentAcc(101,"Varun Kumar",100000,30000);
		s.withdraw(1000);
		c.withdraw(20000);
		System.out.println(s);
		System.out.println(c);
	}


}
