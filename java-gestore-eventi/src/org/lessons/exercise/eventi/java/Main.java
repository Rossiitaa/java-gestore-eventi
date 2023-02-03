package org.lessons.exercise.eventi.java;

import java.time.LocalDate;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.print("Inserire nome evento: ");
		String titolo = sc.next();

		System.out.print("Inserire la data dell'evento (aaaa-mm-gg): ");
		String dataStr = sc.next();
		LocalDate data = LocalDate.parse(dataStr);

		System.out.print("Inserire numero posti totale: ");
		int postiTotale = sc.nextInt();

		Evento ev1 = null;
		try {
			ev1 = new Evento(titolo, data, postiTotale);
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			System.out.println(ev1 == null ? "Non è stato possibile creare l'evento" : ev1);
		}

		System.out.println("-------------------\nVuoi effettuare prenotazioni? ");
		boolean check = sc.nextBoolean();
		if (check) {
			System.out.println("Quante prenotazioni vuoi effettuare? ");
			int numeroPrenotazioni = sc.nextInt();

			for (int i = 0; i < numeroPrenotazioni; i++) {
				try {
					ev1.prenota();
				} catch (Exception e) {
					System.err.println(e.getMessage());
				}
			}

			System.out.println("Posti prenotati: " + ev1.getPostiPrenotati() + "\nPosti disponibili: "
					+ (ev1.getPostiTotale() - ev1.getPostiPrenotati()));
		}

	}
}
