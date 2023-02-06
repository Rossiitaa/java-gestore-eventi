package org.lessons.exercise.eventi.java;

import java.time.LocalDate;
import java.util.List;

public class Main {
	public static void main(String[] args) {

		Evento e1 = null;
		Evento e2 = null;
		Evento e3 = null;
		Evento e4 = null;
		Evento e5 = null;

		try {
			e1 = new Evento("Travis Scott", LocalDate.parse("2023-06-17"), 30);
			e2 = new Evento("Coldplay", LocalDate.parse("2023-07-25"), 20);
			e3 = new Evento("Circuito internazionale di Enzo e Dino Ferrari", LocalDate.parse("2023-05-18"), 50);
			e4 = new Evento("Napoli - Inter", LocalDate.parse("2023-05-18"), 20);
			e5 = new Evento("Champions League", LocalDate.parse("2023-04-20"), 50);
		} catch (Exception e) {
			System.err.println(e.getMessage());
		}

		ProgrammEventi pe = new ProgrammEventi("Eventi da panico");
		pe.addEvento(e1);
		pe.addEvento(e2);
		pe.addEvento(e3);
		pe.addEvento(e4);
		pe.addEvento(e5);
		System.out.println(pe);

		List<Evento> eventi18maggio = pe.getEventiByData(LocalDate.parse("2023-05-18"));

		System.out.println("Eventi presenti il 18 maggio: " + eventi18maggio);
		System.out.println("------------------");
		System.out.println("Numero eventi presenti nel programma: " + pe.getNumeroEventi());
		pe.clearEventi();
		System.out.println("Numero eventi presenti nel programma dopo clear: " + pe.getNumeroEventi());

	}
}
