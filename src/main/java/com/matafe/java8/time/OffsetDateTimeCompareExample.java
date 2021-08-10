package com.matafe.java8.time;

import java.time.LocalDateTime;
import java.time.OffsetDateTime;
import java.time.ZoneOffset;
import java.time.format.DateTimeFormatter;

public class OffsetDateTimeCompareExample {

	public static void main(String[] args) {

		OffsetDateTime offsetDT1 = OffsetDateTime.parse("1979-12-09T09:50:25+07:00");
		OffsetDateTime offsetDT2 = OffsetDateTime.parse("1980-04-09T09:50:25+08:00");

		LocalDateTime localDT = LocalDateTime.parse("19791209095025", DateTimeFormatter.ofPattern("yyyyMMddHHmmss"));
		OffsetDateTime offsetDT3 = OffsetDateTime.of(localDT, ZoneOffset.of("+07:00"));

		System.out.println("OffsetDateTime1 after OffsetDateTime2    : " + offsetDT1.isAfter(offsetDT2));
		System.out.println("OffsetDateTime1 before OffsetDateTime2   : " + offsetDT1.isBefore(offsetDT2));
		System.out.println("OffsetDateTime1 equal OffsetDateTime3    : " + offsetDT1.isEqual(offsetDT3));
		System.out.println("OffsetDateTime2 equal OffsetDateTime3    : " + offsetDT2.isEqual(offsetDT3));

		System.out.println("OffsetDateTime1 compareTo OffsetDateTime2: " + offsetDT1.compareTo(offsetDT2));
		System.out.println("OffsetDateTime2 compareTo OffsetDateTime1: " + offsetDT2.compareTo(offsetDT1));
		System.out.println("OffsetDateTime1 compareTo OffsetDateTime3: " + offsetDT1.compareTo(offsetDT3));
		System.out.println("OffsetDateTime3 compareTo OffsetDateTime2: " + offsetDT3.compareTo(offsetDT2));

	}

}
