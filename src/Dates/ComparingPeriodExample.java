package Dates;

import java.time.LocalDate;
import java.time.Period;

public class ComparingPeriodExample {

	public static void main(String[] args) {

		//period is compatiable for LocaDate only
		LocalDate localDate=LocalDate.of(2023, 01, 01);
		LocalDate localDate1=LocalDate.of(2023, 12, 31);
		
		Period period=localDate.until(localDate1);
		System.out.println("period : "+period);
		System.out.println("getDays : "+period.getDays());
		System.out.println("getMonths : "+period.getMonths());
		System.out.println("getYears : "+period.getYears());
		
		Period period2=Period.between(localDate, localDate1);
		System.out.println("period2 : "+period2);
		System.out.println("getDays : "+period2.getDays());
		//factory methods of period
		System.out.println(Period.ofDays(10));
		System.out.println(Period.from(period2));
		
		
	//	Period.between(LocalTime.now(), LocalTime.MAX);comlilation issue as localTime not allowed
	}

}
