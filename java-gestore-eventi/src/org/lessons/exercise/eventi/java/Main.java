package org.lessons.exercise.eventi.java;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalTime;

public class Main {
	public static void main(String[] args) {

		Concerto c = null;
		try {
			c = new Concerto("Travis Scott", LocalDate.parse("2023-06-30"), 500, LocalTime.parse("17:30"),
					BigDecimal.valueOf(90));
			for (int i = 0; i < 300; i++) {
				c.prenota();
			}

		} catch (Exception e) {
			System.err.println(e.getMessage());
		}

		System.out.println(c);
	}
}
