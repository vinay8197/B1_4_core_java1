package com.tns.assignment;

public class Assignment {
	public static int findWinner(int n, int k) {
        if (n==1)
            return 1;
        else
            return (findWinner(n-1,k) + k - 1) % n + 1;
        
    }
	
 

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=5;
		int k=2;
		System.out.println("The out put is :"+findWinner(n,k));
		

	}

}
