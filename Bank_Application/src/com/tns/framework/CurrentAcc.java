package com.tns.framework;

public abstract class CurrentAcc extends BankAcc {
	final private float creditLimit;
	

	public CurrentAcc(int accNo, String accNm, float accBal,float limit) {
		super(accNo, accNm, accBal);
		creditLimit=limit;
		
		
	}
	public void withdraw(float amount) {
		float accBal=this.getAccBal();
		if(amount<=creditLimit) {
			if(amount<accBal) {
				accBal-=amount;
				this.setAccBal(accBal);
				System.out.println("The User name is: "+this.getAccNm()+"  withdraw amount is :"+amount+" Account Balance is :"+accBal);
				
			}
			else {
				System.out.println("enter the amount less then account balence");
			}
			
		}else {
			System.out.println("enter the amount  with in credit limit value");
		}
	}
	@Override
	public String toString() {
		return String.format("CurrentAcc [creditLimit=%s, %s]", creditLimit,super.toString());
	}
	
	

}
