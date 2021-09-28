package klasy;
import java.util.*;

public class Main {

	public static void main(String[] args) {
		//tworze listê wykonawcow na plycie
		ArrayList <String> spisWykonawcow = new ArrayList<String>();
		spisWykonawcow.add("wykonawca1");
		spisWykonawcow.add("wykonawca2");
		spisWykonawcow.add("wykonawca3");
		spisWykonawcow.add("wykonawca4");
		
		//tworze liste wykonawcow utworu1
		ArrayList <String> wykonawcyUtworu1 = new ArrayList <String>();
		wykonawcyUtworu1.add("wykonawca1");
		wykonawcyUtworu1.add("wykonawca2");
		
		//tworze liste wykonawcow utworu 2
		ArrayList <String> wykonawcyUtworu2 = new ArrayList <String>();
		wykonawcyUtworu2.add("wykonawca3");
		wykonawcyUtworu2.add("wykonawca4");
		
		//tworze liste wykonawcow utworu 3
		ArrayList <String> wykonawcyUtworu3 = new ArrayList <String>();
		wykonawcyUtworu3.add("wykonawca1");
		wykonawcyUtworu3.add("wykonawca4");
		
		//zbieram informacje o utworze1
		Plyta x = new Plyta();
		Plyta.Utwor utwor1 = x.new Utwor(1, 0.5, "utwor1", "kompozytor1", wykonawcyUtworu1);
		
		//zbieram informacje o utworze2
		Plyta.Utwor utwor2 = x.new Utwor(2, 0.7, "utwor2", "kompozytor2", wykonawcyUtworu2);
		
		//zbieram informacje o utworze3
		Plyta.Utwor utwor3 = x.new Utwor(3, 0.3, "utwor3", "kompozytor3", wykonawcyUtworu3);
		
		//zbieram informacje o plycie1
		Plyta plyta1 = new Plyta(1, "plyta1", 1.5, spisWykonawcow, utwor1);
		Plyta.Utwor z = plyta1.new Utwor();
		z.addUtwor(utwor2);
		z.addUtwor(utwor3);
		
		//dodaje plyte 1 do biblioteki
		Plyty biblioteka = new Plyty(plyta1);
		
		//wyswietla tytuly plyt zapisanych w bazie
		for (int i = 0; i<biblioteka.zbior.size(); i++) {
		biblioteka.zbior.get(i).wyswietlTytulPlyty();
		}
		
		//wyswietla szczegolowe dane o plytach
		for (int i = 0; i<biblioteka.zbior.size(); i++) {
			biblioteka.zbior.get(i).pokazDaneSzczegolowePlyty();
			}
	
		//wyswietla szczegolowe informacje o wszystkich utworach na plycie
		for (int i = 0; i<biblioteka.zbior.size(); i++) {
			for (int j = 0; j<biblioteka.zbior.get(i).utwory.size(); j++) {
				biblioteka.zbior.get(i).utwory.get(j).szczegolyUtworu();
			}
		}
	
		//wyswietla wszystkich wykonawcow z poszczegolnych plyt
		for (int i = 0; i<biblioteka.zbior.size(); i++) {
			biblioteka.zbior.get(i).pokazWykonawcowPlyty();
			}
		
		//wyswietla szczegolowe informacje nt. wybranego utworu z wybranej plyty
		biblioteka.zbior.get(0).utwory.get(1).szczegolyUtworu();
	}

}
