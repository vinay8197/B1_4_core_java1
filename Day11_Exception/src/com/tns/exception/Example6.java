package com.tns.exception;

public class Example6 {

public static void main(String args[])

{

System.out.println(myMethod());

}

public static int myMethod(){

try {

int x = 63;

int y = 9;

int z=x/y;

System.out.println("Inside try block");

System.exit(0);// the program is completed without completing finally block

}

catch (Exception exp){

System.out.println(exp);

}

finally{

  System.out.println("Java finally block");

  return 0;

}

}

}


