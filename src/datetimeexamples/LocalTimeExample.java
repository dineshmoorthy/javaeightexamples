package datetimeexamples;

import java.time.LocalTime;
import java.util.concurrent.TimeUnit;

public class LocalTimeExample {
	
	
	public static void main(String[] args) {
		
		LocalTime now, nowPlus, nowHrsMins, lunch, bedtime;
		now = LocalTime.now();

		LocalTime localTime = now;
		System.out.println("Time now is : "+now);
		nowPlus = now.plusHours(1).plusMinutes(30);
		
		System.out.println("what Time is one and half hour from now: "+nowPlus);
		 // LocalTime's plus methods
	      System.out.println("Addition of Hours : " + localTime.plusHours(2));
	      System.out.println("Addition of Minutes : " + localTime.plusMinutes(30));
	      System.out.println("Addition of Seconds : " + localTime.plusSeconds(20));
	      System.out.println("Addition of Nanos : " + localTime.plusNanos(60000));

	      // LocalTime's minus methods
	      System.out.println("Subtraction  of Hours : " + localTime.minusHours(2));
	      System.out.println("Subtraction  of Minutes : " + localTime.minusMinutes(30));
	      System.out.println("Subtraction  of Seconds : " + localTime.minusSeconds(20));
	      System.out.println("Subtraction  of Nanos : " + localTime.minusNanos(60000));

	      
	//	nowHrsMins = now.truncatedTo(MINUTES);
	//	System.out.println();
		
		lunch = LocalTime.of(12, 30);
		System.out.println("Is lunch in future now : " +lunch.isAfter(now));
		
	//	long minsToLunch = now.until(lunch, TimeUnit.MINUTES);
		
	}
}
