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

//<<<<<<< HEAD
//
//		for (Valuta trazenaValuta : valute) {
//			Kurs pom = new Kurs();
//			pom.setDatum(datum);
//			pom.setProdajni(prodajni);
//			pom.setKupovni(kupovni);
//			pom.setSrednji(srednji);
//			if (trazenaValuta.equals(valuta)) {
//				trazenaValuta.setKurs(pom);
//=======
		
		Kurs noviKurs = new Kurs();
		noviKurs.setDatum(datum);
		noviKurs.setProdajni(prodajni);
		noviKurs.setKupovni(kupovni);
		noviKurs.setSrednji(srednji);
		
		for (int i = 0; i<valute.size(); i++){
			if (valute.get(i).getKurs().contains(noviKurs)) {
				throw new RuntimeException("Vec postoji kurs za taj dan.");
			} else if (valute.get(i).equals(valuta)) {
				valute.get(i).setKurs(noviKurs);
//>>>>>>> refs/heads/implementacijainterfejsa
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
