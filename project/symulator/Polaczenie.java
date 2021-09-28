
//na podstawie wypelnionego formularza dobiera i wyswietla przykladowe polaczenie
// klasa pochodna od klasy Formularz

package symulator;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;
import java.io.*;

public class Polaczenie extends Formularz implements PolaczenieInterfejs{
	public static String przez = przejazdPrzez();
	public int przesiadki = przesiadki();
	public double cena = ustalCene();
	public static double czasPodrozy = czasPodrozy();
	public static String akceptacja;
	protected boolean flaga = false;
	
	BufferedReader brIn = new BufferedReader (new InputStreamReader(System.in));
	
	//ustala czy istnieje punkt posredni podrozy
	protected static String przejazdPrzez() {
		if (skad.equals("Gdansk") && dokad.equals("Krakow")) {
			
			return "Warszawa";
		}
		else if (skad.equals("Gdansk") && dokad.equals("Lublin")) {
			
			return "Warszawa";
		}
		else if (skad.equals("Gdansk") && dokad.equals("Wroclaw")) {
			
			return "Poznan";
		}
		else if (skad.equals("Poznan") && dokad.equals("Lublin")) {
			
			return "Warszawa";
		}
		else if (skad.equals("Poznan") && dokad.equals("Krakow")) {
			
			return "Warszawa";
		}
		else if (skad.equals("Wroclaw") && dokad.equals("Gdansk")) {
			
			return "Poznan";
		}
		else if (skad.equals("Wroclaw") && dokad.equals("Lublin")) {
			
			return "Krakow";
		}
		else if (skad.equals("Krakow") && dokad.equals("Gdansk")) {
			
			return "Warszawa";
		}
		else if (skad.equals("Lublin") && dokad.equals("Gdansk")) {
			
			return "Warszawa";
		}
		else if (skad.equals("Lublin") && dokad.equals("Wroclaw")) {
			
			return "Krakow";
		}
		else if (skad.equals("Lublin") && dokad.equals("Poznan")) {
			
			return "Warszawa";
		}
		else {
			
			return "";
		}
	}
	
	//jezeli istnieje punkt posredni podrozy ustala w nim przesiadke
	protected int przesiadki() {
		if (skad.equals("Gdansk") && dokad.equals("Krakow")) {
			return 1;
		}
		else if (skad.equals("Gdansk") && dokad.equals("Lublin")) {
			return 1;
		}
		else if (skad.equals("Gdansk") && dokad.equals("Wroclaw")) {
			return 1;
		}
		else if (skad.equals("Poznan") && dokad.equals("Lublin")) {
			return 1;
		}
		else if (skad.equals("Poznan") && dokad.equals("Krakow")) {
			return 1;
		}
		else if (skad.equals("Wroclaw") && dokad.equals("Gdansk")) {
			return 1;
		}
		else if (skad.equals("Wroclaw") && dokad.equals("Lublin")) {
			return 1;
		}
		else if (skad.equals("Krakow") && dokad.equals("Gdansk")) {
			return 1;
		}
		else if (skad.equals("Lublin") && dokad.equals("Gdansk")) {
			return 1;
		}
		else if (skad.equals("Lublin") && dokad.equals("Wroclaw")) {
			return 1;
		}
		else if (skad.equals("Lublin") && dokad.equals("Poznan")) {
			return 1;
		}
		else {
			return 0;
		}
	}
	
	//wylicza przykladowy czas podrozy zaleznie od wybranej taryfy
	protected static double czasPodrozy() {
		Random random = new Random();
		if (taryfa.equals("ekspres")) {
		double temp = 4.5 + random.nextDouble()*4;
		temp *= 100;
		temp = Math.round(temp);
		temp /= 100;
		return temp;
		}
		else {
			double temp = 6 + random.nextDouble()*4;
			temp *= 100;
			temp = Math.round(temp);
			temp /= 100;
			return temp;
		}
	}
	
	//ustala cene podorzy zaleznie od wypelnionych pol formularza: rodzaj taryfy, rodzaj autokaru, posiadane zniki
	protected double ustalCene() {
		double cena = 50; 
		if (taryfa.equals("ekspres")) {
			cena += 30;
		}
		if (autokar.equals("ekskluzywny")) {
			cena += 50;
		}
		if (ulgi.equals("emeryt/rencista") || ulgi.equals("uczen") || ulgi.equals("staly klient")) {
			cena -= cena*0.33;
		}
		return cena;
	}
	
	//wypisuje wyszukane polacznie
	public void drukuj () {
		new Spij(3000);
		System.out.println("Wyszukane polaczenie: ");
		System.out.println("");
		System.out.println("");
		new Spij(1000);
		System.out.println("Podroz z: " + skad);
		new Spij(1000);
		System.out.println("Podroz do: " + dokad);
		new Spij(1000);
		System.out.println("przez: " + przez);
		new Spij(1000);
		System.out.println("przesiadki: " + przesiadki);
		new Spij(1000);
		System.out.println("cena przejazdu: " + cena + " zl");
		new Spij(1000);
		System.out.println("czas podrozy: " + czasPodrozy + " godzin");
		new Spij(1000);
		System.out.println("");
		
		// akceptacja przez uzytkownika zaproponowanej podrozy z kontrola poprawnosci wprowadzanych danych
		System.out.println("Czy akceptujesz te podroz ? <tak> <nie>");
		do {
		try {
			
			//wczytuje dane od uzytkownika
			akceptacja = brIn.readLine();
			
			if (!(akceptacja.equals("tak") || akceptacja.equals("nie"))) {
				throw new Wyjatki("Nie dokonano potwierdzenia podrozy / dokonaj potwierdzenia ponownie");
			}
			
		}
		catch (IOException e) {
			System.out.println("Nieprawidlowa odpowiedz na pytanie:");
			System.out.println("Czy akceptujesz te podroz ? <tak> <nie>");
		}
		
		//obsluga wyjatku w razie wprowadzenia niepoprawnych danych
		catch (Wyjatki e) {
			System.out.println(e);
			akceptacja = "";
			flaga = true;
			}
		
		//przerywa petle w razie poprawnego wpisu
		if (akceptacja.equals("tak") || akceptacja.equals("nie")) {
			break;
		}
		}
		while(flaga);
		
		//obsluga wyboru ta/nie
		System.out.println("");
		System.out.println("");
		new Spij(2000);
		if (akceptacja.equals("tak")) {
		System.out.println ("Dziekujemy, podroz czas zaczac !");
		}
		else {
			System.out.println("Dziekujemy, mozna rozpoczac wyszukiwanie od nowa");
		}
	}
}
