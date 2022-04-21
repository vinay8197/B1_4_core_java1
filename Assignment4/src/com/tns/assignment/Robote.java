package com.tns.assignment;

public class Robote {

	    static int numberOfPaths(int m, int n)
	    {
	        if (m == 1 || n == 1)
	            return 1;
	 
	       
	        return numberOfPaths(m - 1, n) + numberOfPaths(m, n - 1);
	      
	    }
	 
	    public static void main(String args[])
	    
	    {
	    	int m=2;
	    	int n=2;
	        System.out.println("The nuber of paths are "+numberOfPaths(m, n));
	    }
}


