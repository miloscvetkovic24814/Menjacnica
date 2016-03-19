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

	@Override
	public String toString() {
		return "Valuta [naziv=" + naziv + ", nazivSkr=" + nazivSkr + ", kurs=" + kurs + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((nazivSkr == null) ? 0 : nazivSkr.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Valuta other = (Valuta) obj;
		if (nazivSkr == null) {
			if (other.nazivSkr != null)
				return false;
		} else if (!nazivSkr.equals(other.nazivSkr))
			return false;
		return true;
	}

}
