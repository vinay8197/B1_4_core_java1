package com.tns.assignment;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class ListTooLargeException extends RuntimeException

{

ListTooLargeException(String message)

{

super(message);

}

}

public class MyClass {
	public void analyze(List<String> data)

	{

	if (data.size() > 50)

	{

	throw new ListTooLargeException("mr vinay List can'texceed 50 items! ");

	}

	}


	public static void main(String[] args) {

	MyClass obj = new MyClass();

	List<String> data = new ArrayList<>(Collections.nCopies(100,"Customer Details"));

	obj.analyze(data);

	}

}
