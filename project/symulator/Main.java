
//---------------------------------------------------------------------------------------------------
//Projekt
//---------------------------------------------------------------------------------------------------
//symulator miedzymiastowych przewozow autokarowych
//---------------------------------------------------------------------------------------------------
//nalezy wypelnic pola formularza dotyczacego podrozy wpisujac okreslenia podane w nawiasach <>
//nastepnie wyswietla sie informacje dotyczace wybranych preferencji
//po czym nastapi wyszukanie optymalnej podrozy dla zapytan z formularza
//nalezy zaakceptowac lub odrzucic wyszukana podroz
//w razie akceptacji nalezy przesledzic przebieg podrozy
//na koncu wyswietli sie informacja o zakonczeniu podrozy
//---------------------------------------------------------------------------------------------------

package symulator;

public class Main {

	public static void main(String[] args) throws Wyjatki{
	
		Formularz formularz = new Formularz();
		
		//wypisuje formularz
		formularz.wypisz();
		
		//spowalnie wyswietlenie nastepnego wyniku
		new Spij(1000);
		
		//podziekowanie za wypelniony formluarz
		formularz.podziekuj();
		new Spij(2000);
		
		//wyswietla podumowanie wypelnionego formularza
		formularz.podsumowanie();
		
		Polaczenie polaczenie = new Polaczenie();
		
		//wypisuje znalezione optymalne polaczenie i oczekuje jego potwierdzenia
		polaczenie.drukuj();
		
		//jezeli polaczenie zostalo zaakceptowane przeprowadzana jest symulacja podrozy
		if (Polaczenie.akceptacja.equals("tak")) {
		Symulacja symulacja = new Symulacja();
		symulacja.start();
		}
	}

}
