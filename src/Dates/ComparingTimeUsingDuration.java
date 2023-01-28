package Dates;

import java.time.Duration;
import java.time.LocalTime;
import java.time.temporal.ChronoUnit;

public class ComparingTimeUsingDuration {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LocalTime localTime=LocalTime.of(12, 20);
		LocalTime localTime1=LocalTime.of(13, 21);
		long d=localTime.until(localTime1,ChronoUnit.MINUTES);
		System.out.println(d);
		
		Duration duration=Duration.between(localTime, localTime1);
		System.out.println("duration: "+duration);
		System.out.println("getSeconds: "+duration.getSeconds());
		
		Duration duration1=Duration.ofHours(23);
		System.out.println(duration1.getUnits());
		System.out.println(duration1.toMinutes());
		System.out.println(duration1.toDays());
		
		

	}

}
