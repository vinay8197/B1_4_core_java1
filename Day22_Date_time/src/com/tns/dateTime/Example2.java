package com.tns.dateTime;
import java.time.*;
import java.time.format.DateTimeFormatter;

public class Example2 {
	public static void main(String[] args) {
		LocalDateTime datetime=LocalDateTime.now();
		DateTimeFormatter df=DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm");
		String var=datetime.format(df);
		System.out.println(var);
	}

}
