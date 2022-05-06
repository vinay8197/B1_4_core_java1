package com.tns.enum1;

public class Example5 {
	enum Day
	{
		SUNDAY,MONDAY,TUESDAY,WEDNESDAY,THURSDAY,FRIDAY,SATURDAY
	}

	public static void main(String[] args) {
		Day d=Day.MONDAY;
		printDisplay(d);
	}
		

	public static void printDisplay(Day d) {
		{
			if(d==Day.SATURDAY)
			{
				System.out.println("Same");
			}
			else
			{
				System.out.println("Not Same");
			}
		}
		
	}

}
