package valute;

import java.util.LinkedList;

import valute.kursevi.Kurs;

public class Valuta {

	private String naziv;
	private String nazivSkr;
	private LinkedList<Kurs> kurs; // Kurs ce pri unosenju biti sortiran po
									// datumu.

	public String getNaziv() {
		return naziv;
	}

	public void setNaziv(String naziv) {
		if (naziv == null) {
			throw new NullPointerException("Greska u nazivu.");
		} else if (naziv.isEmpty()) {
			throw new IllegalArgumentException("Niste uneli naziv.");
		} else {
			this.naziv = naziv;
		}
	}

	public String getNazivSkr() {
		return nazivSkr;
	}

	public void setNazivSkr(String nazivSkr) {
		if (nazivSkr == null) {
			throw new NullPointerException("Greska u nazivu(skr).");
		} else if (nazivSkr.isEmpty()) {
			throw new IllegalArgumentException("Niste uneli naziv(skr).");
		} else {
			this.nazivSkr = nazivSkr;
		}
	}

	public LinkedList<Kurs> getKurs() {
		return kurs;
	}

	public void setKurs(Kurs kurs) {
		if (kurs == null) {
			throw new NullPointerException("Greska u postavljanju kursa.");
		} else if (this.kurs.isEmpty()) {
			this.kurs.addFirst(kurs);
			return;
		} else {
			boolean unet = false;
			for (int i = 0; i < this.kurs.size(); i++) {
				if (this.kurs.get(i).getDatum().after(kurs.getDatum())) {
					this.kurs.add(i, kurs); // Odrzava poredak po datumu.
					unet = true;
					break;
				}
			}
			if (!unet) {
				this.kurs.addLast(kurs);
			}
		}
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