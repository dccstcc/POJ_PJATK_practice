
// Formularz zbiera informacje o danych dotyczacych preferencji podrozy, wraz z kontrola poprawnosci wpisywanych danych

package symulator;

import java.io.*;


public class Formularz implements FormularzInterfejs {
	public static String skad;
	public static String dokad;
	public static String taryfa;
	public static String przesiadki;
	public static String miejsce1;
	public static String miejsce2;
	public static String niepelnosprawni;
	public static String ulgi;
	public static String autokar;
	public static String uwagi;
	protected boolean flaga = false;
	
	// funkcja wypisuje formularz i pobiera wpisy, w razie blednego wpisu zglasza wyjatek, az do momentu poprawnego wpisu
	public void wypisz () throws Wyjatki{
		System.out.println("Wyszukiwarka polaczen miedzymiastowych");
		System.out.println("");
		System.out.println("");
		
		//strumien pobierania danych od uzytkownika
		BufferedReader brIn = new BufferedReader (new InputStreamReader(System.in));
		
		System.out.println("Wpisz sk¹d chcesz jechac ? <Gdansk> <Warszawa> <Krakow> <Poznan> <Wroclaw> <Lublin>");
		do {
		try {
			
			//pobiera dane od uzytkownika
			skad = brIn.readLine();
			
			if (!(skad.equals("Gdansk") || skad.equals("Warszawa") || skad.equals("Krakow") || skad.equals("Poznan") ||
					skad.equals("Wroclaw") || skad.equals("Lublin"))) {
				throw new Wyjatki("Niepoprawna nazwa miasta / wpisz ponownie");
			}
			
		}
		catch (IOException e) {
			System.out.println("Nieprawidlowa odpowiedz na pytanie:");
			System.out.println("Sk¹d chcesz jechac ? <Gdansk> <Warszawa> <Krakow> <Poznan> <Wroclaw> <Lublin>");
		}
		
		// obsluga wyjatku w razie blednego wpisu
		catch (Wyjatki e) {
			System.out.println(e);
			skad = "";
			flaga = true;
			}
		
		// przerywa petle w razie poprawnego wpisu
		if (skad.equals("Gdansk") || skad.equals("Warszawa") || skad.equals("Krakow") || skad.equals("Poznan") ||
				skad.equals("Wroclaw") || skad.equals("Lublin")) {
			break;
		}
		}
		while (flaga);
		
		
		System.out.println("Dokad chcesz jechac ? <Gdansk> <Warszawa> <Krakow> <Poznan> <Wroclaw> <Lublin>");
		do {
		try {
			
			dokad = brIn.readLine();
			
			if (!(dokad.equals("Gdansk") || dokad.equals("Warszawa") || dokad.equals("Krakow") || dokad.equals("Poznan") ||
					dokad.equals("Wroclaw") || dokad.equals("Lublin"))) {
				throw new Wyjatki("Niepoprawna nazwa miasta / wpisz ponownie");
			}
			
		}
		catch (IOException e) {
			System.out.println("Nieprawidlowa odpowiedz na pytanie:");
			System.out.println("Dok¹d chcesz jechac ? <Gdansk> <Warszawa> <Krakow> <Poznan> <Wroclaw> <Lublin>");
		}
		catch (Wyjatki e) {
			System.out.println(e);
			dokad = "";
			flaga = true;
			}
		
		if (dokad.equals("Gdansk") || dokad.equals("Warszawa") || dokad.equals("Krakow") || dokad.equals("Poznan") ||
				dokad.equals("Wroclaw") || dokad.equals("Lublin")) {
			break;
		}
		}
		while (flaga);
		
		
		System.out.println("Jaka taryfe chcesz wybrac ? <normalna> <ekspres>");
		do {
		try {
			
			taryfa = brIn.readLine();
			
			if (!(taryfa.equals("normalna") || taryfa.equals("ekspres"))) {
				throw new Wyjatki("Niepoprawna nazwa taryfy / wpisz ponownie");
			}
			
		}
		catch (IOException e) {
			System.out.println("Nieprawidlowa odpowiedz na pytanie:");
			System.out.println("Jaka taryfe chcesz wybrac ? <normalna> <ekspres>");
		}
		catch (Wyjatki e) {
			System.out.println(e);
			taryfa = "";
			flaga = true;
			}
		
		if (taryfa.equals("normalna") || taryfa.equals("ekspres")) {
			break;
		}
		}
		while (flaga);
		
		
		System.out.println("Ile chcesz miec przesiadek ? <0> <1>");
		do {
		try {
			
			przesiadki = brIn.readLine();
			
			if (!(przesiadki.equals("0") || przesiadki.equals("1"))) {
				throw new Wyjatki("Niepoprawna liczba przesiadek / wpisz ponownie");
			}
			
		}
		catch (IOException e) {
			System.out.println("Nieprawidlowa odpowiedz na pytanie:");
			System.out.println("Ile chcesz miec przesiadek ? <0> <1>");
		}
		catch (Wyjatki e) {
			System.out.println(e);
			przesiadki = "";
			flaga = true;
			}
		
		if (przesiadki.equals("0") || przesiadki.equals("1")) {
			break;
		}
		}
		while (flaga);
		
		
		System.out.println("Gdzie chcesz siedziec ? <przod> <srodek> <tyl>");
		do {
		try {
			
			miejsce1 = brIn.readLine();
			
			if (!(miejsce1.equals("przod") || miejsce1.equals("srodek") || miejsce1.equals("tyl"))) {
				throw new Wyjatki("Niepoprawna nazwa miejsca / wpisz ponownie");
			}
			
		}
		catch (IOException e) {
			System.out.println("Nieprawidlowa odpowiedz na pytanie:");
			System.out.println("Gdzie chcesz siedziec ? <przod> <srodek> <tyl>");
		}
		catch (Wyjatki e) {
			System.out.println(e);
			miejsce1 = "";
			flaga = true;
			}
		
		if (miejsce1.equals("przod") || miejsce1.equals("srodek") || miejsce1.equals("tyl")) {
			break;
		}
		}
		while (flaga);
		
		
		System.out.println("Czy chcesz siedziec przy oknie ? <tak> <nie>");
		do {
		try {
			
			miejsce2 = brIn.readLine();
			
			if (!(miejsce2.equals("tak") || miejsce2.equals("nie"))) {
				throw new Wyjatki("Niepoprawne okreslenie miejsca / wpisz ponownie");
			}
			
		}
		catch (IOException e) {
			System.out.println("Nieprawidlowa odpowiedz na pytanie:");
			System.out.println("Czy chcesz siedziec przy oknie ? <tak> <nie>");
		}
		catch (Wyjatki e) {
			System.out.println(e);
			miejsce2 = "";
			flaga = true;
			}
		
		if (miejsce2.equals("tak") || miejsce2.equals("nie")) {
			break;
		}
		}
		while (flaga);
		
		
		System.out.println("Czy autokar ma byc przystosowany dla osob niepelnosprawnych ? <tak> <nie>");
		do {
		try {
			
			niepelnosprawni = brIn.readLine();
			
			if (!(niepelnosprawni.equals("tak") || niepelnosprawni.equals("nie"))) {
				throw new Wyjatki("Nieokreslona odpowiedz / wpisz ponownie");
			}
			
		}
		catch (IOException e) {
			System.out.println("Nieprawidlowa odpowiedz na pytanie:");
			System.out.println("Czy autokar ma byc przystosowany dla osob niepelnosprawnych ? <tak> <nie>");
		}
		catch (Wyjatki e) {
			System.out.println(e);
			niepelnosprawni = "";
			flaga = true;
			}
		
		if (niepelnosprawni.equals("tak") || niepelnosprawni.equals("nie")) {
			break;
		}
		}
		while (flaga);
		
		
		System.out.println("Jakie posiadasz ulgi ? <emeryt/rencista> <uczen> <staly klient> <brak>");
		do {
		try {
			
			ulgi = brIn.readLine();
			
			if (!(ulgi.equals("emeryt/rencista") || ulgi.equals("uczen") || ulgi.equals("staly klient") || ulgi.equals("brak"))) {
				throw new Wyjatki("Nieokreslono ulgi / wpisz ponownie");
			}
			
		}
		catch (IOException e) {
			System.out.println("Nieprawidlowa odpowiedz na pytanie:");
			System.out.println("Jakie posiadasz ulgi ? <emeryt/rencista> <uczen> <staly klient>");
		}
		catch (Wyjatki e) {
			System.out.println(e);
			ulgi = "";
			flaga = true;
			}
		
		if (ulgi.equals("emeryt/rencista") || ulgi.equals("uczen") || ulgi.equals("staly klient") || ulgi.equals("brak")) {
			break;
		}
		}
		while (flaga);
		
		
		System.out.println("Wybierz klase autokaru ? <normalny> <ekskluzywny>");
		do {
		try {
			
			autokar = brIn.readLine();
			
			if (!(autokar.equals("normalny") || autokar.equals("ekskluzywny"))) {
				throw new Wyjatki("Nie wybrano klasy autokaru / wpisz ponownie");
			}
			
		}
		catch (IOException e) {
			System.out.println("Nieprawidlowa odpowiedz na pytanie:");
			System.out.println("Wybierz klase autokaru ? <normalny> <ekskluzywny>");
		}
		catch (Wyjatki e) {
			System.out.println(e);
			autokar = "";
			flaga = true;
			}
		
		if (autokar.equals("normalny") || autokar.equals("ekskluzywny")) {
			break;
		}
		}
		while (flaga);
		
		
		System.out.println("Jakie sa Twoje uwagi dotyczace podrozy?");
		
		try {
			
			uwagi = brIn.readLine();
			
		}
		catch (IOException e) {
			System.out.println("Nieprawidlowo wypelnione pole uwagi:");
		}
		
			
	}
	
	// wypisuje podziekowanie za wypelnienie formularza
	public void podziekuj() {
		System.out.println("");
		System.out.println("");
		System.out.println("Dziekujemy !");
		System.out.println("Rozpoczyna sie wyszukiwanie optymalnego polaczenia !");
		System.out.println("");
	}
	
	// wypisuje podsumowanie wypelnionych pol formularza
	public void podsumowanie() {
		System.out.println("");
		System.out.println("Podsumowanie twoich preferencji podrozy:");
		System.out.println("");
		new Spij(1000);
		System.out.println("Miejsce wyjazdu: " + skad);
		new Spij(1000);
		System.out.println("Podroz do : " + dokad);
		new Spij(1000);
		System.out.println("Wybrana taryfa: " + taryfa);
		new Spij(1000);
		System.out.println("liczba przesiadek: " + przesiadki);
		new Spij(1000);
		System.out.println("preferowane miejsce w autokarze: " + miejsce1);
		new Spij(1000);
		System.out.println("Czy miejsce przy oknie ?: " + miejsce2);
		new Spij(1000);
		System.out.println("Czy autokar powinien byc przystosowany dla osob niepelnosprawnych: " + niepelnosprawni);
		new Spij(1000);
		System.out.println("Posiadane ulgi: " + ulgi);
		new Spij(1000);
		System.out.println("Wybrana klasa autokaru: " + autokar);
		new Spij(1000);
		System.out.println("Twoje uwagi: " + uwagi);
		System.out.println("");
	}
}
