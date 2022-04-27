package com.tns.dateTime;
import java.time.*;


public class Example6 {
	public static void main(String[] args) {
		LocalTime t=LocalTime.now(ZoneId.of("Asia/Singapore"));
		LocalDateTime df=LocalDateTime.now(ZoneId.of("Egypt"));
		System.out.println(t);
		System.out.println(df);
		for(String s:ZoneId.getAvailableZoneIds())
		{
			System.out.println(s);
		}
	}

}
