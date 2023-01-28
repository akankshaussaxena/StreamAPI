package Dates;

import java.time.Duration;
import java.time.Instant;
import java.time.temporal.ChronoUnit;

public class InstanceExample {

	public static void main(String[] args) {

		// Instant is the time in machine readable format which will start form epoch
		// that is 01 jan 1970
		
		Instant instance=Instant.now();
		Instant instance1=Instant.now();
		System.out.println(instance);
		long instant=instance.until(instance1, ChronoUnit.HOURS);
		System.out.println(instant);;
		
		System.out.println("ofEpochMilli: "+Instant.ofEpochMilli(0));
		
		Duration d=Duration.between(instance, instance1);
		System.out.println(d);
		
	}

}
