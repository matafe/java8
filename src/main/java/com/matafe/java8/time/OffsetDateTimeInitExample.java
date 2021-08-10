package com.matafe.java8.time;

import java.time.Clock;
import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.OffsetDateTime;
import java.time.ZoneId;
import java.time.ZoneOffset;
import java.time.format.DateTimeFormatter;

public class OffsetDateTimeInitExample {

	public static void main(String[] args) {

		OffsetDateTime offsetDT1 = OffsetDateTime.now();
		System.out.println("OffsetDateTime1: " + offsetDT1);

		OffsetDateTime offsetDT2 = OffsetDateTime.now(Clock.systemUTC());
		System.out.println("OffsetDateTime2: " + offsetDT2);

		OffsetDateTime offsetDT3 = OffsetDateTime.now(ZoneId.of("Asia/Jakarta"));
		System.out.println("OffsetDateTime3: " + offsetDT3);

		OffsetDateTime offsetDT4 = OffsetDateTime.of(1980, 4, 9, 20, 15, 45, 345875000, ZoneOffset.of("+07:00"));
		System.out.println("OffsetDateTime4: " + offsetDT4);

		OffsetDateTime offsetDT5 = OffsetDateTime.of(LocalDate.now(), LocalTime.of(15, 50, 25),
				ZoneOffset.of("+07:00"));
		System.out.println("OffsetDateTime5: " + offsetDT5);

		OffsetDateTime offsetDT6 = OffsetDateTime.of(LocalDateTime.now(), ZoneOffset.of("+07:00"));
		System.out.println("OffsetDateTime6: " + offsetDT6);

		OffsetDateTime offsetDT7 = OffsetDateTime.ofInstant(Instant.now(), ZoneId.systemDefault());
		System.out.println("OffsetDateTime7: " + offsetDT7);

		OffsetDateTime offsetDT8 = OffsetDateTime.parse("2019-08-31T15:20:30+08:00");
		System.out.println("OffsetDateTime8: " + offsetDT8);

		OffsetDateTime offsetDT9 = OffsetDateTime.parse("1980-04-09T08:20:45+07:00",
				DateTimeFormatter.ISO_OFFSET_DATE_TIME);
		System.out.println("OffsetDateTime9: " + offsetDT9);
		
	}
}
