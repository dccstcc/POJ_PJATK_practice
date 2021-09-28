package biblioteka;

import java.util.*;
import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class ZbiorPozycji implements Zbior {
	private ArrayList<Ksiazki> ksiazki = new ArrayList<Ksiazki> (); 
	private ArrayList<Czasopisma> czasopisma = new ArrayList<Czasopisma> (); 
	private ArrayList<PlytyCDaudio> plytyCDaudio = new ArrayList<PlytyCDaudio> (); 
	private ArrayList<PlytyCDsoftware> plytyCDsoftware = new ArrayList<PlytyCDsoftware> ();
	private ArrayList<KasetyAudio> kasetyAudio = new ArrayList<KasetyAudio> ();
	private ArrayList<KasetyVHS> kasetyVHS = new ArrayList<KasetyVHS> ();
	
	public void addKsiazka(String autor, String tytul, int rokWydania, String wydawnictwo, int ISBN) {
		ksiazki.add(new Ksiazki(autor, tytul, rokWydania, wydawnictwo, ISBN));
	}
	
	public String getKsiazka (String autor, String tytul) {
		String temp = "brak ksiazki";
		for (int i = 0; i<ksiazki.size(); i++) {
			if (ksiazki.get(i).getAutor() == autor && ksiazki.get(i).getTytul() == tytul) {
					temp = ksiazki.get(i).getInfo();
			}
		}
		return temp;
	}
	
	public void addCzasopismo(String tytul, double numer, int rokWydania, String rodzaj) {
		czasopisma.add(new Czasopisma(tytul, numer, rokWydania, rodzaj));
	}
	
	public String getCzasopismo (String tytul, double numer) {
		String temp = "brak czasopisma";
		for (int i = 0; i<czasopisma.size(); i++) {
			if (czasopisma.get(i).getTytul() == tytul && czasopisma.get(i).getNumer() == numer) {
					temp = czasopisma.get(i).getInfo();
			}
		}
		return temp;
	}
	
	public void exportKsiazkiDoPliku () throws FileNotFoundException {
		PrintWriter zapis = new PrintWriter("ksiazkiDBexport.txt");
		for (int i = 0; i<ksiazki.size(); i++) {
			zapis.println(ksiazki.get(i).getInfo());
		}
		zapis.close();
	}
	
	public void exportCzasopismaDoPliku () throws FileNotFoundException {
		PrintWriter zapis = new PrintWriter("czasopismaDBexport.txt");
		for (int i = 0; i<czasopisma.size(); i++) {
			zapis.println(czasopisma.get(i).getInfo());
		}
		zapis.close();
	}
	
}

