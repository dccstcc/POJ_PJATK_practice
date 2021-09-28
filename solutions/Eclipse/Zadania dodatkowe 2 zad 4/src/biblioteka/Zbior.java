package biblioteka;

import java.io.FileNotFoundException;

public interface Zbior {
	public void addKsiazka(String autor, String tytul, int rokWydania, String wydawnictwo, int ISBN);
	public String getKsiazka (String autor, String tytul);
	public void addCzasopismo(String tytul, double numer, int rokWydania, String rodzaj);
	public String getCzasopismo (String tytul, double numer);
	public void exportKsiazkiDoPliku () throws FileNotFoundException;
	public void exportCzasopismaDoPliku  () throws FileNotFoundException;
}
