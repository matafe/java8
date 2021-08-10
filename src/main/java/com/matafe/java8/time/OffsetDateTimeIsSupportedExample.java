package com.matafe.java8.time;

import java.time.OffsetDateTime;
import java.time.temporal.ChronoField;
import java.time.temporal.ChronoUnit;

public class OffsetDateTimeIsSupportedExample {

	public static void main(String[] args) {

		OffsetDateTime offsetDT = OffsetDateTime.now();

		System.out.println("*** ChronoField ***");
		for (ChronoField chronoField : ChronoField.values()) {
			System.out.println(chronoField + " is supported:" + offsetDT.isSupported(chronoField));
		}

		System.out.println("\n*** ChronoUnit ***");
		for (ChronoUnit chronoUnit : ChronoUnit.values()) {
			System.out.println(chronoUnit + " is supported:" + offsetDT.isSupported(chronoUnit));
		}

	}

}
