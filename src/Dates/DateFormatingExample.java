package Dates;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class DateFormatingExample {

	public static void parsingDate() {

		// String into LocalDate
		String dateString = "2018-10-20";
		LocalDate localDate = LocalDate.parse(dateString);// by default taking ISO_LOCAL_DATE FORMATTER
		System.out.println("localDate: "+localDate);
		LocalDate localDate1 = LocalDate.parse(dateString,DateTimeFormatter.ISO_LOCAL_DATE);// by default taking ISO_LOCAL_DATE FORMATTER
		System.out.println("localDate1: "+localDate1);
		
		//using differnet format
		String dateString2 = "20181020";
		LocalDate localDate2 = LocalDate.parse(dateString2,DateTimeFormatter.BASIC_ISO_DATE);// by default taking ISO_LOCAL_DATE FORMATTER
		System.out.println("localDate2: "+localDate2);
		
		//using customize dateFormat
		String dateString3 = "2018|10|20";
		DateTimeFormatter dateTimeFormatter=DateTimeFormatter.ofPattern("yyyy|MM|dd");
		LocalDate localDate3 = LocalDate.parse(dateString3,dateTimeFormatter);// customize FORMATTER
		System.out.println("localDate3: "+localDate3);
		
	}

	public static void formattingDate() {
		// LocalDate into String
		DateTimeFormatter dateTimeFormatter=DateTimeFormatter.ofPattern("yyyy|MM|dd");
		LocalDate localDate=LocalDate.now();
		String fromatDate=localDate.format(dateTimeFormatter);
		System.out.println("fromatDate: "+fromatDate);
		

	}

	public static void main(String[] args) {
		parsingDate();
		formattingDate();
	}

}
