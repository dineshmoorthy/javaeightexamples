package datetimeexamples;

import java.time.DayOfWeek;
import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;
import java.time.Period;
import java.time.ZoneId;
import java.time.ZonedDateTime;

public class ZoneIdExampleone {

	
	 public static void main(String... args) {  
		    ZoneId zoneid1 = ZoneId.of("Asia/Kolkata");  
		    ZoneId zoneid2 = ZoneId.of("Asia/Tokyo");  
		    LocalTime id1 = LocalTime.now(zoneid1);  
		    LocalTime id2 = LocalTime.now(zoneid2);  
		    System.out.println(id1);  
		    System.out.println(id2);  
		    System.out.println(id1.isBefore(id2));
		    
		    LocalDate chritsmas = LocalDate.of(2020,Month.DECEMBER, 25);
		    LocalDate today = LocalDate.now();
		    DayOfWeek days = DayOfWeek.SATURDAY;
		    
		    
		    Instant now = Instant.now();
		    try {
				Thread.sleep(15);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		    
		    Instant later = Instant.now();
		    System.out.println("now is before : "+ now.isBefore(later));

		    System.out.println("now : "+ now);
		    System.out.println("later : " + later);
		    
		    Period oneDay = Period.ofDays(1);
		    System.out.println("period of one day : "+ oneDay);
		    LocalDateTime beforeDst = LocalDateTime.of(2014,Month.MARCH, 8, 12, 00);
		    ZonedDateTime newyorktime = ZonedDateTime.of(beforeDst, ZoneId.of("America/NewYork"));
		    System.out.println("Before : "+ newyorktime);
		    System.out.println("After : "+ newyorktime.plus(oneDay));
		    
		  }  
}
