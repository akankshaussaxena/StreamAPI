package Dates;

import java.time.LocalDate;
import java.time.Month;
import java.time.temporal.ChronoField;
import java.time.temporal.ChronoUnit;

public class LocalDateExamples {

	public static void main(String[] args) {
		//creating localDate instance
		LocalDate localDate = LocalDate.now();
		System.out.println("localDate: "+localDate);
		
		//getting values from localDate instance
		System.out.println("getDayOfMonth: "+localDate.getDayOfMonth());
		
		System.out.println("getDayOfYear: "+localDate.getDayOfYear());
		System.out.println("getMonthValue: "+localDate.getMonthValue());
		System.out.println("getMonth: "+localDate.getMonth());
		System.out.println("getDayOfWeek: "+localDate.getDayOfWeek());
		System.out.println("getEra: "+localDate.getEra());
		System.out.println("DAY_OF_MONTH: "+localDate.get(ChronoField.DAY_OF_MONTH));
		
		
		//creating localDate instance using of
		
		LocalDate localDate1 = LocalDate.of(2017, 05, 27);
		LocalDate localDate2 = LocalDate.of(2017,Month.APRIL, 27);
		
		System.out.println("localDate1 "+localDate1);
		System.out.println("localDate1 "+localDate2);
		//modify localDate instance
		//local date modification->LocalDate is immutable than it will create new instance not change the current instance
		
		System.out.println("plusDays: "+localDate.plusDays(1));
		System.out.println("plusMonths: "+localDate.plusMonths(13));
		System.out.println("minusDays: "+localDate.minusDays(3));
		System.out.println("minusMonths: "+localDate.minusMonths(2));
		System.out.println("withDayOfMonth: "+localDate.withDayOfMonth(12));
		System.out.println("with chronoal : "+localDate.with(ChronoField.YEAR, 2020));
		System.out.println("with temporal adjustur : "+localDate.with(localDate2.getDayOfWeek()));
		System.out.println("localdate isEqual : "+localDate.isEqual(localDate1));
		System.out.println("localdate isLeapYear : "+localDate.isLeapYear());
		System.out.println("localdate isBefore : "+localDate.isBefore(localDate2));
		System.out.println("localdate isAfter : "+localDate.isAfter(localDate2));
		System.out.println("localdate subtract year by 1 : "+localDate.minus(1, ChronoUnit.YEARS));
		
		//unsupported ex->sub time in date will through unsupported exception
		
		System.out.println("isSupported : "+localDate.isSupported(ChronoField.MINUTE_OF_DAY));
		
		
		
	}

}
