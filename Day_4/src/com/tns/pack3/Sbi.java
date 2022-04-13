package com.tns.pack3;

public class Sbi {
	private int bal;
	public Sbi(int bal){
		this.bal=bal;
	}
	public void Getter() {
		System.out.println("balance is :"+bal);
	}
	public int Setter(int bal) {
		this.bal=this.bal+bal;
		return this.bal;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		

	}

}
