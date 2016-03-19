package menjacnica.interfejs;

import java.util.GregorianCalendar;

import valute.Valuta;
import valute.kursevi.Kurs;

public interface MenjacnicaInterfejs {

	public void dodavanjeKursaValuteZaOdredjeniDan(Valuta valuta, GregorianCalendar datum, double prodajni,
			double kupovni, double srednji);

	public void brisanjeKursaValuteZaOdredjeniDan(Valuta valuta, GregorianCalendar datum);

	public Kurs vracanjeKursaValuteZaOdredjeniDan(Valuta valuta, GregorianCalendar datum);

}