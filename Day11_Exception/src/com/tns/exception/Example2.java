package com.tns.exception;

public class Example2 {public static void main(String args[]) {
    try{  
        int num=121/5;  
        System.out.println(num); 
        System.exit(0);
  }  
  catch(ArithmeticException e){
     System.out.println("Number should not be divided by zero");
  }  
  finally{
    System.out.println("This is finally block");
  }  
  System.out.println("Out of try-catch-finally");  
}   

}
