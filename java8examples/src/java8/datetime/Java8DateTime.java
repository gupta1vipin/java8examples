package java8.datetime;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;
import java.time.ZonedDateTime;
import java.time.temporal.ChronoUnit;

public class Java8DateTime {

	public static void main(String[] args) {

		LocalDate localDate = LocalDate.now();
		System.out.println("Date : " + localDate);

		LocalTime localTime = LocalTime.now();
		System.out.println("Time : " + localTime);

		LocalDateTime localDateTime = LocalDateTime.now();
		System.out.println("DateTime : " + localDateTime);

		ZonedDateTime zonedDateTime = ZonedDateTime.now();
		System.out.println("Zoned Time :" + zonedDateTime);

		LocalDate birthDay = LocalDate.of(1990, Month.DECEMBER, 15);
		System.out.println("\nSpecificDate : " + birthDay);

		Month month = LocalDateTime.now().getMonth();
		System.out.println("Current Month :" + month);

		LocalDateTime fiveHoursBefore = LocalDateTime.now().minusHours(5); // .plusDays,
																			// .plusHours....
		System.out.println("Now - 5 hours :" + fiveHoursBefore);

		LocalTime truncated = LocalTime.now().truncatedTo(ChronoUnit.HOURS);
		System.out.println("Truncate : " + truncated);
		
		calculateTimeBetweenDates();
	}

	private static void calculateTimeBetweenDates() {
		LocalDateTime oneDate = LocalDateTime.now();
		LocalDateTime anotherDate = LocalDateTime.of(2018, Month.JUNE, 21, 20, 00);
		
		System.out.println("\nDays between the dates: " + ChronoUnit.DAYS.between(anotherDate, oneDate));
		System.out.println("Months between the dates: " + ChronoUnit.MONTHS.between(anotherDate, oneDate));
		System.out.println("Years between the dates: " + ChronoUnit.YEARS.between(anotherDate, oneDate));
		System.out.println("Hours between the dates: " + ChronoUnit.HOURS.between(anotherDate, oneDate));
		System.out.println("Minutes between the dates: " + ChronoUnit.MINUTES.between(anotherDate, oneDate));
		System.out.println("Seconds between the dates: " + ChronoUnit.SECONDS.between(anotherDate, oneDate));
	}
}
