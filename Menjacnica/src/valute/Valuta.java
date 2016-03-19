package valute;

import java.util.LinkedList;

import valute.kursevi.Kurs;

public class Valuta {

	private String naziv;
	private String nazivSkr;
	private LinkedList<Kurs> kurs;

	public String getNaziv() {
		return naziv;
	}

	public void setNaziv(String naziv) {
		this.naziv = naziv;
	}

	public String getNazivSkr() {
		return nazivSkr;
	}

	public void setNazivSkr(String nazivSkr) {
		this.nazivSkr = nazivSkr;
	}

	public LinkedList<Kurs> getKurs() {
		return kurs;
	}

	public void setKurs(LinkedList<Kurs> kurs) {
		this.kurs = kurs;
	}

}
