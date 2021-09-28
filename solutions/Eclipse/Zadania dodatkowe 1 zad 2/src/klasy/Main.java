package klasy;

public class Main {

	public static void main(String[] args) {
		//sprawdza ile razy wysepuje litera "l" w tekscie "lorem ipsum..."
		System.out.println(Metody.ileRazyWystepuje('l', Teksty.tekst));
	
		//sprawdza ile razy wysepuje slowo "orem" w tekscie "lorem ipsum..."
		System.out.println(Metody.ileRazyWystepuje("orem", Teksty.tekst));
		
		//sprawdza ile razy wystepuje wyraz "abc" w alfabecie
		System.out.println(Metody.ileRazyWystepuje("abc", Teksty.alfabet));
	
		//sprawdza ile razy w alfabecie wystepuje litera A bez wzgledu na wielkosc liter
		System.out.println(Metody.ileRazyWystepujeZnakWithoutCase("A", Teksty.alfabet));
		
		//brakuje metody liczacej wystapienia frazy w tekscie z uwzglednieniem wielkosci liter
		
		
	}

}
