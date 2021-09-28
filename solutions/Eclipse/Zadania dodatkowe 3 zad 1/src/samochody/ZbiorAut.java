package samochody;

import java.util.*;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class ZbiorAut {
	private ArrayList <Samochod> auta = new ArrayList<Samochod>();

	ZbiorAut() {
		
	}
	
	ZbiorAut (String marka, double cena, double przebieg, String rocznik_YYYY_MM_DD, String region, String miasto, boolean czyUszkodzony, boolean czyNowy) {
		auta.add(new Samochod(marka, cena, przebieg, rocznik_YYYY_MM_DD, region, miasto, czyUszkodzony, czyNowy));
	}
	
	public void dodajOgloszenie(String marka, double cena, double przebieg, String rocznik_YYYY_MM_DD, String region, String miasto, boolean czyUszkodzony, boolean czyNowy) {
		Samochod samochod = new Samochod();
		samochod.setMarka(marka);
		samochod.setCena(cena);
		samochod.setPrzebieg(przebieg);
		samochod.setRocznik(rocznik_YYYY_MM_DD);
		samochod.setRegion(region);
		samochod.setMiasto(miasto);
		samochod.setCzyUszkodzony(czyUszkodzony);
		samochod.setCzyNowy(czyNowy);
		samochod.setDataOgloszenia();
		auta.add(samochod);
	}
	
	public void wyswietlWszystkie() {
		for (int i = 0; i<auta.size(); i++) {
				System.out.println("***Og這szenie sprzeda篡 samochodu :***");
				System.out.println("marka: " + auta.get(i).getMarka());
				System.out.println("cena: " + auta.get(i).getCena());
				System.out.println("przebieg: " + auta.get(i).getPrzebieg());
				System.out.println("rocznik: " + auta.get(i).getRocznik());
				System.out.println("region: " + auta.get(i).getRegion());
				System.out.println("miasto: " + auta.get(i).getMiasto());
				System.out.println("czyUszkodzony: " + auta.get(i).getCzyUszkodzony());
				System.out.println("czyNowy: " + auta.get(i).getCzyNowy());
				System.out.println("data ogloszenia: " + auta.get(i).getDataOgloszenia());
				System.out.println(" ");
		}
	}
	
	public void wyswietlLosowy() {
		Random random = new Random();
		int indeks = random.nextInt(auta.size());
		System.out.println("***Losowe og這szenie sprzeda篡 samochodu :***");
		System.out.println("marka: " + auta.get(indeks).getMarka());
		System.out.println("cena: " + auta.get(indeks).getCena());
		System.out.println("przebieg: " + auta.get(indeks).getPrzebieg());
		System.out.println("rocznik: " + auta.get(indeks).getRocznik());
		System.out.println("region: " + auta.get(indeks).getRegion());
		System.out.println("miasto: " + auta.get(indeks).getMiasto());
		System.out.println("czyUszkodzony: " + auta.get(indeks).getCzyUszkodzony());
		System.out.println("czyNowy: " + auta.get(indeks).getCzyNowy());
		System.out.println("data ogloszenia: " + auta.get(indeks).getDataOgloszenia());
		System.out.println(" ");
	}
	
	public void wyswietlMarki(String marka) {
		for (int i = 0; i<auta.size(); i++) {
			if (marka == auta.get(i).getMarka()) {
				System.out.println("***Og這szenie sprzeda篡 samochodu marki " + marka + " :***");
				System.out.println("`MARKA`: " + auta.get(i).getMarka());
				System.out.println("cena: " + auta.get(i).getCena());
				System.out.println("przebieg: " + auta.get(i).getPrzebieg());
				System.out.println("rocznik: " + auta.get(i).getRocznik());
				System.out.println("region: " + auta.get(i).getRegion());
				System.out.println("miasto: " + auta.get(i).getMiasto());
				System.out.println("czyUszkodzony: " + auta.get(i).getCzyUszkodzony());
				System.out.println("czyNowy: " + auta.get(i).getCzyNowy());
				System.out.println("data ogloszenia: " + auta.get(i).getDataOgloszenia());
				System.out.println(" ");
			}
		}
	}
	
	public void wyswietlCeny(double cena) {
		for (int i = 0; i<auta.size(); i++) {
			if (cena == auta.get(i).getCena()) {
				System.out.println("***Og這szenie sprzeda篡 samochodu w cenie" + cena + " :***");
				System.out.println("marka: " + auta.get(i).getMarka());
				System.out.println("`CENA`: " + auta.get(i).getCena());
				System.out.println("przebieg: " + auta.get(i).getPrzebieg());
				System.out.println("rocznik: " + auta.get(i).getRocznik());
				System.out.println("region: " + auta.get(i).getRegion());
				System.out.println("miasto: " + auta.get(i).getMiasto());
				System.out.println("czyUszkodzony: " + auta.get(i).getCzyUszkodzony());
				System.out.println("czyNowy: " + auta.get(i).getCzyNowy());
				System.out.println("data ogloszenia: " + auta.get(i).getDataOgloszenia());
				System.out.println(" ");
			}
		}
	}
	
	public void wyswietlPrzebieg(double przebieg) {
		for (int i = 0; i<auta.size(); i++) {
			if (przebieg == auta.get(i).getPrzebieg()) {
				System.out.println("***Og這szenie sprzeda篡 samochodu o przebiegu " + przebieg + " :***");
				System.out.println("marka: " + auta.get(i).getMarka());
				System.out.println("cena: " + auta.get(i).getCena());
				System.out.println("`PRZEBIEG`: " + auta.get(i).getPrzebieg());
				System.out.println("rocznik: " + auta.get(i).getRocznik());
				System.out.println("region: " + auta.get(i).getRegion());
				System.out.println("miasto: " + auta.get(i).getMiasto());
				System.out.println("czyUszkodzony: " + auta.get(i).getCzyUszkodzony());
				System.out.println("czyNowy: " + auta.get(i).getCzyNowy());
				System.out.println("data ogloszenia: " + auta.get(i).getDataOgloszenia());
				System.out.println(" ");
			}
		}
	}
	
	public void wyswietlRocznik(String rocznik_YYYY_MM_DD) {
		SimpleDateFormat formatuj = new SimpleDateFormat("yyyy/MM/dd");
		Date data = null;
		try {
			data = formatuj.parse(rocznik_YYYY_MM_DD);
		}
		catch (ParseException e) {
			e.printStackTrace();
		}
		
		for (int i = 0; i<auta.size(); i++) {
			if (data.compareTo(auta.get(i).getRocznikDate()) == 0) /*(data.toString() == auta.get(i).getRocznik()) - nie dziala*/ {
				System.out.println("***Og這szenie sprzeda篡 samochodu wyprodukowanegow dniu " + data.toString() + " :***");
				System.out.println("marka: " + auta.get(i).getMarka());
				System.out.println("cena: " + auta.get(i).getCena());
				System.out.println("przebieg: " + auta.get(i).getPrzebieg());
				System.out.println("`ROCZNIK`: " + auta.get(i).getRocznik());
				System.out.println("region: " + auta.get(i).getRegion());
				System.out.println("miasto: " + auta.get(i).getMiasto());
				System.out.println("czyUszkodzony: " + auta.get(i).getCzyUszkodzony());
				System.out.println("czyNowy: " + auta.get(i).getCzyNowy());
				System.out.println("data ogloszenia: " + auta.get(i).getDataOgloszenia());
				System.out.println(" ");
			}
		}
	}
	
	public void wyswietlRegion(String region) {
		for (int i = 0; i<auta.size(); i++) {
			if (region == auta.get(i).getRegion()) {
				System.out.println("***Og這szenie sprzeda篡 samochodu z regionu " + region + " :***");
				System.out.println("marka: " + auta.get(i).getMarka());
				System.out.println("cena: " + auta.get(i).getCena());
				System.out.println("przebieg: " + auta.get(i).getPrzebieg());
				System.out.println("rocznik: " + auta.get(i).getRocznik());
				System.out.println("`REGION`: " + auta.get(i).getRegion());
				System.out.println("miasto: " + auta.get(i).getMiasto());
				System.out.println("czyUszkodzony: " + auta.get(i).getCzyUszkodzony());
				System.out.println("czyNowy: " + auta.get(i).getCzyNowy());
				System.out.println("data ogloszenia: " + auta.get(i).getDataOgloszenia());
				System.out.println(" ");
			}
		}
	}
	
	public void wyswietlMiasto(String miasto) {
		for (int i = 0; i<auta.size(); i++) {
			if (miasto == auta.get(i).getMiasto()) {
				System.out.println("***Og這szenie sprzeda篡 samochodu z miasta " + miasto + " :***");
				System.out.println("marka: " + auta.get(i).getMarka());
				System.out.println("cena: " + auta.get(i).getCena());
				System.out.println("przebieg: " + auta.get(i).getPrzebieg());
				System.out.println("rocznik: " + auta.get(i).getRocznik());
				System.out.println("region: " + auta.get(i).getRegion());
				System.out.println("`MIASTO`: " + auta.get(i).getMiasto());
				System.out.println("czyUszkodzony: " + auta.get(i).getCzyUszkodzony());
				System.out.println("czyNowy: " + auta.get(i).getCzyNowy());
				System.out.println("data ogloszenia: " + auta.get(i).getDataOgloszenia());
				System.out.println(" ");
			}
		}
	}
	
	public void wyswietlCzyUszkodzony(boolean czyUszkodzony_T_F) {
		for (int i = 0; i<auta.size(); i++) {
			if (czyUszkodzony_T_F == auta.get(i).getCzyUszkodzonyTF()) {
				String s = (czyUszkodzony_T_F) ? (s="uszkodzonego") : (s="nieuszkodzonego");
				System.out.println("***Og這szenie sprzeda篡 samochodu " + s + " :***");
				System.out.println("marka: " + auta.get(i).getMarka());
				System.out.println("cena: " + auta.get(i).getCena());
				System.out.println("przebieg: " + auta.get(i).getPrzebieg());
				System.out.println("rocznik: " + auta.get(i).getRocznik());
				System.out.println("region: " + auta.get(i).getRegion());
				System.out.println("miasto: " + auta.get(i).getMiasto());
				System.out.println("`CZY USZKODZONY`: " + auta.get(i).getCzyUszkodzony());
				System.out.println("czyNowy: " + auta.get(i).getCzyNowy());
				System.out.println("data ogloszenia: " + auta.get(i).getDataOgloszenia());
				System.out.println(" ");
			}
		}
	}
	
	public void wyswietlCzyNowy(boolean czyNowy_T_F) {
		for (int i = 0; i<auta.size(); i++) {
			if (czyNowy_T_F == auta.get(i).getCzyNowyTF()) {
				String s = (czyNowy_T_F) ? (s="nowego") : (s="uzywanego");
				System.out.println("***Og這szenie sprzeda篡 samochodu " + s + " :***");
				System.out.println("marka: " + auta.get(i).getMarka());
				System.out.println("cena: " + auta.get(i).getCena());
				System.out.println("przebieg: " + auta.get(i).getPrzebieg());
				System.out.println("rocznik: " + auta.get(i).getRocznik());
				System.out.println("region: " + auta.get(i).getRegion());
				System.out.println("miasto: " + auta.get(i).getMiasto());
				System.out.println("czyUszkodzony: " + auta.get(i).getCzyUszkodzony());
				System.out.println("`CZY NOWY`: " + auta.get(i).getCzyNowy());
				System.out.println("data ogloszenia: " + auta.get(i).getDataOgloszenia());
				System.out.println(" ");
			}
		}
	}
	
	public void wyswietlDataOgloszenia(String dataOgloszenia_YYYY_MM_DD) {
		SimpleDateFormat formatuj = new SimpleDateFormat("yyyy/MM/dd");
		Date data = null;
		try {
			data = formatuj.parse(dataOgloszenia_YYYY_MM_DD);
		}
		catch (ParseException e) {
			e.printStackTrace();
		}
		for (int i = 0; i<auta.size(); i++) {
			if (data.compareTo(auta.get(i).getDataOgloszeniaDate()) == 0) {
				System.out.println("***Og這szenie sprzeda篡 samochodu z dnia: " + data.toString() + " :***");
				System.out.println("marka: " + auta.get(i).getMarka());
				System.out.println("cena: " + auta.get(i).getCena());
				System.out.println("przebieg: " + auta.get(i).getPrzebieg());
				System.out.println("rocznik: " + auta.get(i).getRocznik());
				System.out.println("region: " + auta.get(i).getRegion());
				System.out.println("miasto: " + auta.get(i).getMiasto());
				System.out.println("czyUszkodzony: " + auta.get(i).getCzyUszkodzony());
				System.out.println("czyNowy: " + auta.get(i).getCzyNowy());
				System.out.println("`DATA OGLOSZENIA`: " + auta.get(i).getDataOgloszenia());
				System.out.println(" ");
			}
		}
	}
	
	public ArrayList<Samochod> getAuta() {
		return auta;
	}
	
}
