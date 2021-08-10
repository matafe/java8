package com.matafe.java8.time;

import java.time.Duration;
import java.time.OffsetDateTime;
import java.time.Period;
import java.time.temporal.ChronoUnit;

public class OffsetDateTimeAddSubstractExample {

	public static void main(String[] args) {

		OffsetDateTime offsetDT = OffsetDateTime.parse("1983-07-12T06:30:15+07:00");
		System.out.println("OffsetDateTime      : " + offsetDT);

		// Adding/subtracting days
		System.out.println("10 days before      : " + offsetDT.minusDays(10));
		System.out.println("15 days later       : " + offsetDT.plusDays(15));

		// Adding/subtracting months
		System.out.println("Minus 4 months      : " + offsetDT.minusMonths(4));
		System.out.println("Plus 5 months       : " + offsetDT.plusMonths(5));

		// Adding/subtracting weeks
		System.out.println("Minus 20 weeks      : " + offsetDT.minusWeeks(20));
		System.out.println("Plus 30 weeks       : " + offsetDT.plusWeeks(30));

		// Adding/subtracting years
		System.out.println("Minus 12 years      : " + offsetDT.minusYears(12));
		System.out.println("Plus 4 years        : " + offsetDT.plusYears(4));

		// Adding/subtracting hours
		System.out.println("12 hours before     : " + offsetDT.minusHours(12));
		System.out.println("6 hours later       : " + offsetDT.plusHours(6));

		// Adding/subtracting minutes
		System.out.println("Minus 40 minutes    : " + offsetDT.minusMinutes(40));
		System.out.println("Plus 15 minutes     : " + offsetDT.plusMinutes(15));

		// Adding/subtracting seconds
		System.out.println("Minus 30 seconds    : " + offsetDT.minusSeconds(30));
		System.out.println("Plus 20 seconds     : " + offsetDT.plusSeconds(20));

		// Adding/subtracting Nanos
		System.out.println("Minus 20000 nanos   : " + offsetDT.minusNanos(20000));
		System.out.println("Plus 340000 nanos   : " + offsetDT.plusNanos(340000));

		// Using DAYS
		System.out.println("30 days before      : " + offsetDT.minus(30, ChronoUnit.DAYS));
		// Using WEEKS
		System.out.println("3 weeks before      : " + offsetDT.minus(3, ChronoUnit.WEEKS));
		// Using MONTHS
		System.out.println("6 months later      : " + offsetDT.plus(6, ChronoUnit.MONTHS));
		// Using YEARS
		System.out.println("2 years later       : " + offsetDT.plus(2, ChronoUnit.YEARS));

		// Using HOURS
		System.out.println("8 hours before      : " + offsetDT.minus(8, ChronoUnit.HOURS));
		// Using MINUTES
		System.out.println("35 minutes before   : " + offsetDT.minus(35, ChronoUnit.MINUTES));
		// Using SECONDS
		System.out.println("125 seconds later   : " + offsetDT.plus(125, ChronoUnit.SECONDS));
		// Using NANOS
		System.out.println("42357500 nanos later: " + offsetDT.plus(42357500, ChronoUnit.NANOS));

		// Using TemporalAmount - Duration
		System.out.println("60 days before      : " + offsetDT.minus(Duration.ofDays(60)));
		System.out.println("160 minutes before  : " + offsetDT.minus(Duration.ofMinutes(160)));
		System.out.println("2 hours later       : " + offsetDT.plus(Duration.ofHours(2)));

		// Using TemporalAmount - Period
		System.out.println("5 years before      : " + offsetDT.minus(Period.ofYears(5)));
		System.out.println("8 months later      : " + offsetDT.plus(Period.ofMonths(8)));

	}
}
