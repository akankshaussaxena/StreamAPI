package Dates;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class DateTimeFormatterExample {
	
	public static void parsingDateTime() {
		String dateTime="2018-10-12T12:10:10";
		LocalDateTime localDateTime=LocalDateTime.parse(dateTime);
		System.out.println("localDateTime: "+localDateTime);
		
		LocalDateTime localDateTime1=LocalDateTime.parse(dateTime,DateTimeFormatter.ISO_LOCAL_DATE_TIME);
		System.out.println("localDateTime1: "+localDateTime1);
		
		//custum dateTime
		String dateTime1="2018-10-12T12|10|10";
		DateTimeFormatter dateTimeFormatter=DateTimeFormatter.ofPattern("yyyy-MM-dd'T'HH|mm|ss");
		LocalDateTime localDateTime2=LocalDateTime.parse(dateTime1,dateTimeFormatter);
		System.out.println("localDateTime2: "+localDateTime2);
		
	}

	public static void formatDateTime() {
		
		DateTimeFormatter dateTimeFormatter=DateTimeFormatter.ofPattern("yyyy-MM-dd'T'HH|mm|ss");
		DateTimeFormatter dateTimeFormatter2=DateTimeFormatter.ofPattern("yyyy-MM-dd'AKKU'HH|mm|ss");
		LocalDateTime localDateTime=LocalDateTime.now();
		String formatDateTime=localDateTime.format(dateTimeFormatter);
		String formatDateTime1=localDateTime.format(dateTimeFormatter2);
		System.out.println("formatDateTime: "+formatDateTime);
		System.out.println("formatDateTime1: "+formatDateTime1);
		
	}
	public static void main(String[] args) {

		parsingDateTime();
		formatDateTime();
	}

}
