
// rozszerzenie klasy polaczenie, pozwala przeprowadzic symulacje podrozy autokarem

package symulator;

import java.util.*;

public class Symulacja extends Polaczenie implements SymulacjaInterfejs{
	protected int godzina;
	protected int minuta;
	public String czasStartu;
	public String czasKonca;
	protected int pom;
	protected int czasPrzerwy;
	protected int czasKoncaFlakKorek;
	protected boolean flaga1 = false;
	protected boolean flaga2 = false;
	protected int opoznienie = 0;
	
	// symulacja wydarzen podczas jazdy autokarem
	public void start() {
		System.out.println("");
		System.out.println("");
		new Spij(3000);
		System.out.println("ROPOCZENIE PODROZY");
		System.out.println("");
		System.out.println("");
		new Spij(3000);
		
		System.out.println("Wyjazd z: " + Formularz.skad);
		System.out.println("");
		new Spij(3000);
		
		//generator godziny i minuty startu podrozy
		Random random = new Random();
		godzina = random.nextInt(24);
		minuta = random.nextInt(60);
		czasStartu= godzina + " : " + minuta;
		new Spij(3000);
		System.out.println("Jest godzina " +  czasStartu);
		System.out.println("");
		new Spij(3000);
		
		//wyswietla czas konca podrozy
		pom = (int) czasPodrozy;
		pom += godzina;
		if(pom > 24) {
			godzina = pom - 24;
		}
		else godzina = pom;
		czasKonca =  godzina + " : " + minuta;
		System.out.println("Planowane zakonczenie podrozy: " + czasKonca);
		czasKoncaFlakKorek = godzina;
		
		//istnieje ryzyko przebicia opony
		flak();
		
		//informacja o punkcie posrednim podrozy
		if (przesiadki == 1) {
			System.out.println("");
			System.out.println("dojazd do punktu posredniego: " + przez + " ,czas na przesiadke");
			System.out.println("");
		}
		
		//isnieje ryzyko, ze ruch uliczny sie zablokuje
		korek();
		
		//informacja o zmianie kierowcow
		new Spij(4000);
		System.out.println("");
		System.out.println("");
		System.out.println ("Zmiana kierowcow oraz przerwa dla podroznych");
		System.out.println("");
		System.out.println("");
		new Spij(4000);
		
		//informacja o osiagnieciu celu podrozy
		System.out.println("");
		System.out.println("Osiagnieto cel podrozy: " + Formularz.dokad);
		System.out.println("");
		System.out.println("");
		new Spij(3000);
		
		//wyswietlenie czasu podrozy
		if (godzina != czasKoncaFlakKorek) {
			godzina = czasKoncaFlakKorek;
		}
		System.out.println ("godzina przybycia: " + godzina + " : " + minuta);
		System.out.println("");
		new Spij(4000);
		
		//wyswietlenie opoznien
		if (flaga1) {
			++opoznienie;
		}
		if (flaga2) {
			++opoznienie;
		}
		if(opoznienie != 0) {
			new Spij (3000);
			System.out.println("");
			System.out.println("Liczba godzin opoznienia: " + opoznienie);
			System.out.println("");
			new Spij (3000);
		}
		
		//informacja o zakonczeniu podrozy
		System.out.println("");
		System.out.println("");
		System.out.println("Dziekujemy, mozna zaczac kolejna podroz !");
		System.out.println("");
		System.out.println("");
		
		for (int i = 0; i < 4; i++) {
			new Spij(3000);
			System.out.println("   _______________   ");
			System.out.println("   |_|_|_|_|_|_|_|   ");
			System.out.println("   |_o_o_--_--_o_|   ");
			System.out.println("");
			System.out.println("");
		}
		
		
	}
	
	//33% szansa na przebicie opony w czasie podrozy
	protected void flak() {
		Random random = new Random();
		int czyFlak = random.nextInt(3);
		if (czyFlak == 1) {
			new Spij(3000);
			System.out.println("");
			System.out.println("");
			System.out.println ("W autokarze przebila sie opona");
			System.out.println("");
			new Spij (3000);
			System.out.println("Trwa wymiana kola");
			System.out.println("");
			new Spij (2000);
			System.out.println("Naprawiono usterke");
			System.out.println("");
			new Spij(2000);
			System.out.println("Przyjazd opozniony o godzine");
			System.out.println("");
			System.out.println("");
			new Spij(1500);
			
			//w razie przebicia opony istnieje godzinne opoznienie
			czasKoncaFlakKorek += 1;
			if(czasKoncaFlakKorek > 24) {
				czasKoncaFlakKorek -= 24;
			}
			System.out.println ("Planowany przyjazd do: " + Formularz.dokad + " o godzinie: " + czasKoncaFlakKorek + " : " + minuta);
			System.out.println("");
			new Spij(2500);
			
			flaga1 = true;
		}
	}
	
	//50% szans na zablokowanie ruchu ulicznego
	protected void korek () {
		Random random = new Random();
		int czyKorek = random.nextInt(2);
		if (czyKorek == 1) {
			System.out.println("");
			System.out.println("");
			new Spij(2000);
			System.out.println("Trasa sie \"zakorkowala\"");
			System.out.println("");
			new Spij(3000);
			
			//w razie zakorkowania sie ruchu istnieje godzinne opoznienie
			System.out.println ("Przypuszczalne opoznienie podrozy: 1 godzina");
			System.out.println("");
			new Spij(2000);
			czasKoncaFlakKorek += 1;
			if(czasKoncaFlakKorek > 24) {
				czasKoncaFlakKorek -= 24;
			}
			System.out.println("Przypuszczalne przybycie do: " + Formularz.dokad + " o godzinie: " + czasKoncaFlakKorek + " : " + minuta);
			System.out.println("");
			System.out.println("");
			new Spij(2000);
			
			flaga2 = true;
		}
		
	}
}

