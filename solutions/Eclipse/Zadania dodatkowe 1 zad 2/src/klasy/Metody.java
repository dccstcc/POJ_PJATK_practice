package klasy;

public class Metody extends Teksty {
	
	//konstruktor tworzy nowy tekst
	Metody (String tekst) {
		super(tekst);
	}
	
	//funkcja zlicza wystapienia danego znaku z danym tekscie z uwzglednieniem wielkosci liter
	public static int ileRazyWystepuje (char x, String tekst) {
		int licznik = 0;
		for (int i = 0; i < tekst.length(); i++) {
			if (x == tekst.charAt(i)) {
				licznik++;
			}
		}
		return licznik;
	}
	
	//przeciazona funkcja zlicza wystapienie zadanego ciagu znakow w danym tekscie bez wzgledu na wielkosc liter
	public static int ileRazyWystepuje (String x, String tekst) {
		int licznik = 0;
		if (tekst.indexOf(x) != -1) {
			
			for (int i = 0; i < tekst.length(); i++) {
				if (tekst.indexOf(x, i) != -1) {
					licznik++;
				}
			}
			return licznik;
		}
		else {
			return licznik;
		}
	}
	
	
	//funkcja zlicza wystapienie znaku w tekscie bez wzgledu na wielkoœæ liter
	public static int ileRazyWystepujeZnakWithoutCase (String x, String tekst) {
		int licznik = 0;
		String xMaleTemp =  x.toLowerCase(); 
		char xMale = xMaleTemp.charAt(0);
		String xDuzeTemp =  x.toUpperCase(); 
		char xDuze = xDuzeTemp.charAt(0);
		for (int i = 0; i < tekst.length(); i++) {
			if (xMale  == tekst.charAt(i) || xDuze == tekst.charAt(i)) {
				licznik++;
			}
		}
		return licznik;
		}
	
	
}
