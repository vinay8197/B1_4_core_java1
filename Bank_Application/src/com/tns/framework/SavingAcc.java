package com.tns.framework;

public abstract class SavingAcc extends BankAcc {
	 static private boolean isSalaried;
	static final private float MINBAL=500;
	public SavingAcc(int accNo, String accNm, float accBal,boolean isSalaried) {
		super(accNo, accNm, accBal);
		SavingAcc.isSalaried=isSalaried;
	    
		}
	public void withdraw(float amount) {
		float accBal=this.getAccBal();
		if((amount+MINBAL)<accBal) {
			accBal-=amount;
			this.setAccBal(accBal);
			System.out.println("The User Name  "+this.getAccNm()+"  Withdraw amount is :"+amount+"  Account Balance is :"+accBal);
			}
		else {
			System.out.println("The withdraw amount is greater then balance amount ");
		}
		
	}
	@Override
	public String toString() {
		return String.format("SavingAcc [%s]", super.toString());
	}
	
	

}
