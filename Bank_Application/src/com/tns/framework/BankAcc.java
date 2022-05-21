package com.tns.framework;

public abstract class BankAcc {
	private int accNo;
	private String accNm;
    private float accBal;
    public float getAccBal() {
    	return accBal;
    }
	public void setAccBal(float accBal) {
		this.accBal = accBal;
	}
	public String getAccNm() {
		return accNm;
	}
	public BankAcc(int accNo, String accNm, float accBal) {
		this.accNo = accNo;
		this.accNm = accNm;
		this.accBal = accBal;
	}
	 abstract public void withdraw(float amount);
	 public void deposite(float amount) {
		 System.out.println("The Deposite amount is"+amount);
		 accBal+=amount;
		 System.out.println("Account balance is :"+amount);
	 }
	@Override
	public String toString() {
		return String.format("BankAcc [accNo=%s, accNm=%s, accBal=%s]", accNo, accNm, accBal);
	}
	 
	

}
