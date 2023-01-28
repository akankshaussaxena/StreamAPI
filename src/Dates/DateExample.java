package Dates;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class DateExample {

	public static void main(String[] args) {
//local date
		LocalDate localDate=LocalDate.now();
		System.out.println("localDate : "+localDate);
		//local time
		LocalTime localTime=LocalTime.now();
		System.out.println("localTime: "+localTime);
		//local date and time
		LocalDateTime localDateTime=LocalDateTime.now();
		System.out.println("localDateTime : "+localDateTime);
	}

}
