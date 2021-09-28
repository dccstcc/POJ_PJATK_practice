package biblioteka;

import java.io.FileNotFoundException;

public class Main {

	public static void main(String[] args) throws FileNotFoundException {
		ZbiorPozycji biblioteka = new ZbiorPozycji();
		biblioteka.addCzasopismo("czasopismo1", 23.3, 2014, "magazyn");
		biblioteka.addCzasopismo("czasopismo2", 2.3, 2010, "dziennik");
		biblioteka.addKsiazka("autor1", "tytul1", 2015, "wydawnictwo1", 1234);
		biblioteka.addKsiazka("autor2", "tytul2", 2012, "wydawnictwo2", 567);
		biblioteka.addKsiazka("autor3", "tytul3", 1997, "wydawnictwo3", 89);
		System.out.println(biblioteka.getCzasopismo("czasopismo2", 2.3));
		System.out.println(biblioteka.getKsiazka("autor3", "tytul3"));
		biblioteka.exportCzasopismaDoPliku();
		biblioteka.exportKsiazkiDoPliku();
	}

}
