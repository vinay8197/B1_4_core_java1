package com.tns.client;

import com.tns.application.GSNormalAcc;
import com.tns.application.GSPrimeAcc;
import com.tns.application.GSShopFactory;
import com.tns.framework.NormalAcc;
import com.tns.framework.PrimeAcc;
import com.tns.framework.ShopFactory;

public class Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ShopFactory s=new GSShopFactory();
		PrimeAcc p=new GSPrimeAcc(123,"Vinay T N",250,true);
		NormalAcc n=new GSNormalAcc(124,"Varsha R C",300,10);
		System.out.println("Prime account ");
		p.bookProduct(p.getCharge());
		System.out.println("Normal account");
		n.bookProduct(n.getCharges());
		System.out.println(s.getNewPrimeAcc(1, "Vijay Kumar", 1236, true));
		System.out.println(s.getNewNormalAcc(800, "Siddesh ", 1000, 50));
		
		System.out.println(p);
		System.out.println(n);
		}

	}


