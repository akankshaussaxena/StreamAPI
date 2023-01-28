package Dates;

import java.time.Clock;
import java.time.Instant;
import java.time.LocalDateTime;
import java.time.OffsetDateTime;
import java.time.ZoneId;
import java.time.ZoneOffset;
import java.time.ZonedDateTime;

public class ZonedDateTimeExample {

	public static void main(String[] args) {
		ZonedDateTime zonedDateTime=ZonedDateTime.now();
		System.out.println("zonedDateTime: "+zonedDateTime);
		System.out.println("getOffset: "+zonedDateTime.getOffset());
		System.out.println("getZone: "+zonedDateTime.getZone());
		
		ZonedDateTime zonedDateTime1=ZonedDateTime.now(ZoneId.of("Asia/Calcutta"));

		System.out.println("now with zoneId: "+zonedDateTime1);
		
		ZonedDateTime zonedDateTime2=ZonedDateTime.now(ZoneId.of("America/Chicago"));

		System.out.println("now with zoneId: "+zonedDateTime2);
		
		ZonedDateTime zonedDateTime3=ZonedDateTime.now(Clock.system(ZoneId.of("America/Chicago")));
		System.out.println("now with clock: "+zonedDateTime3);
	
		
		//LocalDateTime value for Zone
		//LocalDateTime localDateTime=LocalDateTime.now(ZoneId.of("ABS/ACX"));//this will through runtime exception
		//System.out.println("localDateTime with ZoneId : "+localDateTime);
		
		LocalDateTime localDateTime=LocalDateTime.now(ZoneId.of("America/Chicago"));
		System.out.println("localDateTime with ZoneId : "+localDateTime);
		
		LocalDateTime localDateTime1=LocalDateTime.now(Clock.system(ZoneId.of("America/Chicago")));//this will through runtime exception
		System.out.println("localDateTime with Clock : "+localDateTime1);
		
		//ZoneId.getAvailableZoneIds
		
		//System.out.println(ZoneId.getAvailableZoneIds());	
		System.out.println("total available zone is: "+ZoneId.getAvailableZoneIds().size());
		ZoneId.getAvailableZoneIds().stream().forEach(zone->System.out.println(zone));
		
		//convert localDateTime and instant into ZonedDateTime
		
		LocalDateTime localDateTime2=LocalDateTime.now();
		ZonedDateTime zonedDateTime4=localDateTime2.atZone(ZoneId.of("America/Chicago"));
		System.out.println("zonedDateTime4: "+zonedDateTime4);
		
		ZonedDateTime zonedDateTime5=Instant.now().atZone(ZoneId.of("Asia/Calcutta"));
		//ZonedDateTime zonedDateTime6=Instant.now().atZone(ZoneId.of("ASIA/CALCUTTA"));//not allowed
		System.out.println(zonedDateTime5);
		
		OffsetDateTime offsetDateTime=localDateTime2.atOffset(ZoneOffset.of("+5"));
		
		System.out.println("offsetDateTime: "+offsetDateTime);
		
		
	}

}
