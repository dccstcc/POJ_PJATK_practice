package samochody;

public class Main {

	public static void main(String[] args) {
		// argumenty/cechy auta
		//String marka, double cena, double przebieg, String rocznik_YYYY_MM_DD, String region, String miasto, boolean czyUszkodzony, boolean czyNowy
		
		ZbiorAut ogloszenia = new ZbiorAut("Audi", 150000.0, 0.3, "2014/03/23", "Wojewodztwo pomorskie", "Gdynia", false, true);
		ogloszenia.dodajOgloszenie("Audi", 240000.0, 0.1, "2015/05/12", "Wojewodztwo ma³opolskie", "Kraków", false, true);
		ogloszenia.dodajOgloszenie("Audi", 80000.0, 183325.3, "2010/04/03", "Wojewodztwo lubelskie", "Zamoœæ", false, false);
		ogloszenia.dodajOgloszenie("Renault", 10000, 178000, "2001/04/25", "Wojewodztwo pomorskie", "Gdynia", false, false);
		ogloszenia.dodajOgloszenie("Mercedes", 7000, 257000, "2007/09/04", "Wojewodztwo warmiñsko-mazurskie", "E³k", true, false);
		ogloszenia.wyswietlLosowy();
		ogloszenia.wyswietlMarki("Audi");
		ogloszenia.wyswietlCzyUszkodzony(true);
		ogloszenia.wyswietlRocznik("2010/04/03");
		ogloszenia.wyswietlMiasto("Zamoœæ");
		//ogloszenia.wyswietlWszystkie();
		Sortowanie sortowanie = new Sortowanie(ogloszenia, "DESC", "cena");
		sortowanie.sortujRosnaco("rocznik");
		sortowanie.sortujMalejaco("data ogloszenia");
		sortowanie.sortujRosnaco("przebieg");
	}

}
