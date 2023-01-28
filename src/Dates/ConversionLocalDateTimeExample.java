package Dates;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class ConversionLocalDateTimeExample {

	public static void main(String[] args) {
//converting localDate ,localtime into localDateTime and viceversa
		LocalDate localDate = LocalDate.of(2019, 10, 21);
		System.out.println("atTime :" + localDate.atTime(22, 12));// coverting LocalDate into LocalDateTime

		LocalTime localTime = LocalTime.of(23, 10, 21);
		System.out.println("atDate :" + localTime.atDate(LocalDate.now()));// coverting LocalDate into LocalDateTime

		LocalDateTime localDateTime=LocalDateTime.of(LocalDate.now(), LocalTime.now());
		
		System.out.println("toLocalDate :" + localDateTime.toLocalDate());// coverting LocalDate into LocalDateTime
		System.out.println("toLocalTime :" + localDateTime.toLocalTime());
		
	}

}
