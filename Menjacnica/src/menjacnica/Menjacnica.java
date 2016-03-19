package menjacnica;

import java.util.GregorianCalendar;

import menjacnica.interfejs.MenjacnicaInterfejs;
import valute.Valuta;
import valute.kursevi.Kurs;

public class Menjacnica implements MenjacnicaInterfejs {

	@Override
	public void dodavanjeKursaValuteZaOdredjeniDan(Valuta valuta, GregorianCalendar datum, double prodajni,
			double kupovni, double srednji) {

		Kurs k = new Kurs();
		k.setDatum(datum);
		k.setProdajni(prodajni);
		k.setKupovni(kupovni);
		k.setSrednji(srednji);

	}

	@Override
	public void brisanjeKursaValuteZaOdredjeniDan(Valuta valuta, GregorianCalendar datum) {
		// TODO Auto-generated method stub

	}

	@Override
	public Kurs vracanjeKursaValuteZaOdredjeniDan(Valuta valuta, GregorianCalendar datum) {
		// TODO Auto-generated method stub
		return null;
	}

}
