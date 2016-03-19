package valute.kursevi;

import java.util.GregorianCalendar;

public class Kurs {

	private GregorianCalendar datum;
	private double prodajni;
	private double kupovni;
	private double srednji;

	public GregorianCalendar getDatum() {
		return datum;
	}

	public void setDatum(GregorianCalendar datum) {
		if (datum == null) {
			throw new NullPointerException("Greska u datumu.");
		} else {
			this.datum = datum;
		}
	}

	public double getProdajni() {
		return prodajni;
	}

	public void setProdajni(double prodajni) {
		if (prodajni > 0) {
			this.prodajni = prodajni;
		} else {
			throw new IllegalArgumentException("Pogresan iznos.");
		}
	}

	public double getKupovni() {
		return kupovni;
	}

	public void setKupovni(double kupovni) {
		if (kupovni > 0) {
			this.kupovni = kupovni;
		} else {
			throw new IllegalArgumentException("Pogresan iznos.");
		}
	}

	public double getSrednji() {
		return srednji;
	}

	public void setSrednji(double srednji) {
		if (srednji > 0) {
			this.srednji = srednji;
		} else {
			throw new IllegalArgumentException("Pogresan iznos.");
		}
	}

	@Override
	public String toString() {
		return "Kurs [datum=" + datum + ", prodajni=" + prodajni + ", kupovni=" + kupovni + ", srednji=" + srednji
				+ "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((datum == null) ? 0 : datum.hashCode());
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
		Kurs other = (Kurs) obj;
		if (datum == null) {
			if (other.datum != null)
				return false;
		} else if (!datum.equals(other.datum))
			return false;
		return true;
	}

}
