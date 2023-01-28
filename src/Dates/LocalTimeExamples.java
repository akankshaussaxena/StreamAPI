package Dates;

import java.time.LocalTime;
import java.time.temporal.ChronoField;
import java.time.temporal.ChronoUnit;

public class LocalTimeExamples {

	public static void main(String[] args) {
		//creating instance of localTime
		LocalTime localTime = LocalTime.now();
		System.out.println("localTime "+localTime);
		
		//creating instance using of method(hour->0-23,sec-0-59,min-0-59,nanosec->9's is the range)
		
		System.out.println("localTime with min "+LocalTime.of(20, 33));
		System.out.println("localTime with min and sec "+LocalTime.of(23, 33,59));
		System.out.println("localTime with min sec and nanosec "+LocalTime.of(20, 33,59,696969124));
		
		//getting the localTime instance
		
		System.out.println("getHour "+localTime.getHour());
		System.out.println("getHour "+localTime.getMinute());
		System.out.println("toSecondOfDay "+localTime.toSecondOfDay());
		System.out.println("CLOCK_HOUR_OF_DAY "+localTime.get(ChronoField.CLOCK_HOUR_OF_DAY));
		
		//modifying the localtime instance ->that will not change localtime instance will create new instance with modify value
		
		System.out.println("plus min "+localTime.plus(1, ChronoUnit.MINUTES));
		System.out.println("minus hours "+localTime.minus(1, ChronoUnit.HOURS));
		System.out.println("with "+localTime.with(ChronoField.HOUR_OF_DAY, 1));
		System.out.println("withHour "+localTime.withHour(1));
		
		
		
	}

}
