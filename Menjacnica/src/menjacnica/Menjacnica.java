package menjacnica;

import java.util.GregorianCalendar;
import java.util.LinkedList;

import menjacnica.interfejs.MenjacnicaInterfejs;
import valute.Valuta;
import valute.kursevi.Kurs;

public class Menjacnica implements MenjacnicaInterfejs {

	private LinkedList<Valuta> valute; // Valute koje koristi Menjacnica

	public Menjacnica(LinkedList<Valuta> valute) {
		this.valute = valute;
	}

	@Override
	public void dodavanjeKursaValuteZaOdredjeniDan(Valuta valuta, GregorianCalendar datum, double prodajni,
			double kupovni, double srednji) {


		for (Valuta trazenaValuta : valute) {
			Kurs pom = new Kurs();
			pom.setDatum(datum);
			pom.setProdajni(prodajni);
			pom.setKupovni(kupovni);
			pom.setSrednji(srednji);
			if (trazenaValuta.equals(valuta)) {
				trazenaValuta.setKurs(pom);
				return;
			}
		}

	}

	@Override
	public void brisanjeKursaValuteZaOdredjeniDan(Valuta valuta, GregorianCalendar datum) {

		for (Valuta i : valute) {
			if (i.equals(valuta)) {
				for (int j = 0; j < i.getKurs().size(); j++) {
					if (i.getKurs().get(j).getDatum().equals(datum)) {
						i.getKurs().remove(j);
						return;
					}
				}
			}
		}

		throw new RuntimeException("Ne postoji kurs za taj datum.");

	}

	@Override
	public Kurs vracanjeKursaValuteZaOdredjeniDan(Valuta valuta, GregorianCalendar datum) {

		for (Valuta i : valute) {
			if (i.equals(valuta)) {
				for (Kurs j : i.getKurs()) {
					if (j.getDatum().equals(datum)) {
						return j;
					}
				}
			}
		}

		throw new RuntimeException("Ne postoji kurs za taj datum.");

	}

}
