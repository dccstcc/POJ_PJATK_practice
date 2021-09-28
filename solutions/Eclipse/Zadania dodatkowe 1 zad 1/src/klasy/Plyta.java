package klasy;

import java.util.*;

public class Plyta {
	
	//pola klasy Plyta
	int idPlyty;
	String tytulPlyty;
	double czasTrwaniaPlyty;
	ArrayList <String> spisWykonawcow  = new ArrayList <String>();
	ArrayList <Plyta.Utwor> utwory = new ArrayList <Plyta.Utwor>();
	
	//klasa wewnetrzna utwory
	public class Utwor {
		
		//pola klasy wewnetrznej utwory
		int idUtworu;
		double czasTrwaniaUtworu;
		String tytulUtworu;
		String kompozytorUtworu;
	 	ArrayList <String> wykonawcyUtworu = new ArrayList<String>();
	
	 	//konstruktor klasy wewnetrznej
	 	Utwor(int idUtworu, double czasTrwaniaUtworu, String tytulUtworu, String kompozytorUtworu, ArrayList <String> wykonawcyUtworu) {
	 		addUtwor(idUtworu, czasTrwaniaUtworu, tytulUtworu, kompozytorUtworu, wykonawcyUtworu);
	 	}
	 	
	 	// odtworzony konstruktor domyslny
	 	Utwor() {
	 		
	 	}
	 	
	 	//funkcja dodajaca utwor
	 	public void addUtwor (int idUtworu, double czasTrwaniaUtworu, String tytulUtworu, String kompozytorUtworu, ArrayList <String> wykonawcyUtworu) {
			this.idUtworu = idUtworu;
			this.czasTrwaniaUtworu = czasTrwaniaUtworu;
			this.kompozytorUtworu = kompozytorUtworu;
			this.wykonawcyUtworu = wykonawcyUtworu;
			this.tytulUtworu = tytulUtworu;
		}
	 	
	 	//przeciazana funkcja dodajaca utwor
	 	public void addUtwor (Utwor utwor) {
	 		utwory.add(utwor);
	 	}
	 	
	 	//funkcja wyswietla pola idUtworu i tytulUtworu
		public void wyswietlNumerTytul() {
			System.out.println(idUtworu + ". " + tytulUtworu);
		}
		
		//szczegolowe informacje nt utworu
		public void szczegolyUtworu() {
			System.out.println("Tytu³ utworu: " + tytulUtworu);
			System.out.println("Czas trwania utworu: " + czasTrwaniaUtworu);
			System.out.println("Kompozytor utworu: " + kompozytorUtworu);
			System.out.println("Wykonawcy utworu:");
			for (String s: wykonawcyUtworu) {
				System.out.println("- " + s);
			}
			System.out.println("");
		}
}
	//odtworzony konstruktor domyslny
	Plyta() {
		
	}
	// przeciazony konstruktor
	Plyta(int idPlyty, String tytulPlyty, double czasTrwaniaPlyty, ArrayList <String> spisWykonawcow, Plyta.Utwor utwory) {
		addPlyta(idPlyty, tytulPlyty, czasTrwaniaPlyty, spisWykonawcow, utwory);
	}
	
	//dodaje plyte do zbioru
	public void addPlyta(int idPlyty, String tytulPlyty, double czasTrwaniaPlyty, ArrayList <String> spisWykonawcow, Plyta.Utwor utwory) {
		this.tytulPlyty = tytulPlyty;
		this.czasTrwaniaPlyty = czasTrwaniaPlyty;
		this.spisWykonawcow = spisWykonawcow;
		this.idPlyty = idPlyty;
		this.utwory.add(utwory);
	}
	
	//wyswietla tytul plyty
	public void wyswietlTytulPlyty() {
		System.out.println(tytulPlyty);
		System.out.println("");
	}
	
	//wyswietla szczegolowe informacje o plycie
	public void pokazDaneSzczegolowePlyty() {
		
		System.out.println("Tytu³ p³yty: " + tytulPlyty);
		System.out.println("Czas trwania p³yty: " + czasTrwaniaPlyty);
		System.out.println("Spis utworów na plycie:");
		for (Plyta.Utwor u: utwory) {
			u.wyswietlNumerTytul();
		}
		System.out.println("");
	}
	
	//wyswietla wykonawcow ze wszystkich plyt
	public void pokazWykonawcowPlyty() {
		System.out.println("Wykonawcy na plycie:");
		for(String s: spisWykonawcow) {
			System.out.println("- " + s);
		}
		System.out.println("");
	}
	
	
}
