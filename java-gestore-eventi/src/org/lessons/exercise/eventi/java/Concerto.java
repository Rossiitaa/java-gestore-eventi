package org.lessons.exercise.eventi.java;

import java.math.BigDecimal;
import java.text.DecimalFormat;
import java.time.LocalDate;
import java.time.LocalTime;

public class Concerto extends Evento {

	private LocalTime ora;
	private BigDecimal prezzo;

	public Concerto(String titolo, LocalDate data, int postiTotale, LocalTime ora, BigDecimal prezzo) throws Exception {
		super(titolo, data, postiTotale);
		setOra(ora);
		setPrezzo(prezzo);
	}

	public LocalTime getOra() {
		return ora;
	}

	public void setOra(LocalTime ora) {
		this.ora = ora;
	}

	public BigDecimal getPrezzo() {
		return prezzo;
	}

	public void setPrezzo(BigDecimal prezzo) {
		this.prezzo = prezzo;
	}

	public String getPrezzoFormattato() {
		DecimalFormat f = new DecimalFormat("##.00");
		return f.format(getPrezzo()) + "€";
	}

	public String getDataOra() {
		return getDataFormattata() + " - " + getOra();
	}

	@Override
	public String toString() {
		return getDataOra() + " - " + getTitolo() + " - " + getPrezzoFormattato();
	}

}