package com.java.anonymous;

enum Day{
	MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY, SUNDAY;
}
public class Enum_Ex {
	public static void main(String[] args) {
		Day today = Day.FRIDAY;
		System.out.println("Today is: " + today);
		
		//using enum in switch
		switch(today) {
		case MONDAY:
			System.out.println("Start of the work week");
			break;
		case FRIDAY:
			System.out.println("Weekend is near");
			break;
		}
	}

}
