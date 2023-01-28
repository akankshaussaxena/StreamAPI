package Dates;

import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class TimeFormattingExample {
	
	public static void parseTime() {
		//String to Localtime
		String time="13:00";
		LocalTime localTime=LocalTime.parse(time);
		System.out.println("localTime: "+localTime);
		
		String time1="13:00";
		LocalTime localTime1=LocalTime.parse(time1,DateTimeFormatter.ISO_LOCAL_TIME);
		System.out.println("localTime1: "+localTime1);
		
		//customized Format
		
		String time2="13*00";
		DateTimeFormatter dateTimeFormatter=DateTimeFormatter.ofPattern("HH*mm");
		LocalTime localTime2=LocalTime.parse(time2,dateTimeFormatter);
		System.out.println("localTime2: "+localTime2);
		
	}
	
    public static void formatTime() {
    	//LocalTime to String
    	LocalTime localTime=LocalTime.now();
    	DateTimeFormatter dateTimeFormatter=DateTimeFormatter.ofPattern("HH*mm");
    	String formatTime=localTime.format(dateTimeFormatter);
    	System.out.println("formatTime: "+formatTime);
    	
		
	}

	public static void main(String[] args) {
		parseTime();
		formatTime();
		
	}

}
