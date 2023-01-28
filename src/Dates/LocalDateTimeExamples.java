package Dates;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.temporal.ChronoField;
import java.time.temporal.ChronoUnit;

public class LocalDateTimeExamples {

	public static void main(String[] args) {
//creating instance
		LocalDateTime  localDateTime=LocalDateTime.now();
		System.out.println("localDateTime: "+localDateTime);
		
	//of method
		LocalDateTime localDateTime1=LocalDateTime.of(LocalDate.now(), LocalTime.now());
	System.out.println("localDateTime1: "+localDateTime1);
	LocalDateTime localDateTime2=LocalDateTime.of(2023,02,19,22,22,33,33333);
	System.out.println("localDateTime2: "+localDateTime2);
	
	//get value
	
	System.out.println("getDayOfMonth: "+localDateTime.getDayOfMonth());
	System.out.println("getHour: "+localDateTime.getHour());
	System.out.println("getYear: "+localDateTime.getYear());
	System.out.println("DAY_OF_MONTH: "+localDateTime.get(ChronoField.DAY_OF_MONTH));
//modify dateTime
	System.out.println("plusDays: "+localDateTime.plusDays(2));
	System.out.println("plusWeeks: "+localDateTime.plusWeeks(2));
	System.out.println("minusDays: "+localDateTime.minusDays(1));
	System.out.println("minus HOURS: "+localDateTime.minus(1, ChronoUnit.HOURS));
	
	//with
	System.out.println("withDayOfMonth: "+localDateTime.withDayOfMonth(20));
	System.out.println("with : "+localDateTime.with(localDateTime.getDayOfWeek()));
	}

}
