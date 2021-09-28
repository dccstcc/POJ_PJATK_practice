package samochody;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Samochod {
	private String marka;
	private double cena;
	private double przebieg;
	private Date rocznik;
	private String region;
	private String miasto;
	private boolean czyUszkodzony;
	private boolean czyNowy;
	private Date dataOgloszenia;
	
	Samochod() {
		
	}
	
	Samochod (String marka, double cena, double przebieg, String rocznik_YYYY_MM_DD, String region, String miasto, boolean czyUszkodzony, boolean czyNowy) {
		dodajOgloszenie(marka, cena, przebieg, rocznik_YYYY_MM_DD, region, miasto, czyUszkodzony, czyNowy);
	}
	
	public void dodajOgloszenie(String marka, double cena, double przebieg, String rocznik_YYYY_MM_DD, String region, String miasto, boolean czyUszkodzony, boolean czyNowy) {
		setMarka(marka);
		setCena(cena);
		setPrzebieg(przebieg);
		setRocznik(rocznik_YYYY_MM_DD);
		setRegion(region);
		setMiasto(miasto);
		setCzyUszkodzony(czyUszkodzony);
		setCzyNowy(czyNowy);
		setDataOgloszenia();
	}
	
	public void setMarka(String marka) {
		this.marka = marka;
	}
	
	public void setCena(double cena) {
		this.cena = cena;
	}
	
	public void setPrzebieg(double przebieg) {
		this.przebieg = przebieg;
	}
	
	public void setRocznik (String rocznik_RRRR_MM_DD) {
		SimpleDateFormat formatuj = new SimpleDateFormat("yyyy/MM/dd");
		Date data = null;
		try {
			data = formatuj.parse(rocznik_RRRR_MM_DD);
		}
		catch (ParseException e) {
			e.printStackTrace();
		}
		rocznik = data;
	}
	
	public void setRegion (String region) {
		this.region = region;
	}
	
	public void setMiasto(String miasto) {
		this.miasto = miasto;
	}
	
	public void setCzyUszkodzony (boolean T_F) {
		czyUszkodzony = T_F;
	}
	
	public void setCzyNowy (boolean T_F) {
		czyNowy = T_F;
	}
	
	public void setDataOgloszenia() {
		Date data = new Date();
		dataOgloszenia = data;
	}
	
	public void setDataOgloszenia(String dataOgloszenia_RRRR_MM_DD) {
		SimpleDateFormat formatuj = new SimpleDateFormat("yyyy/MM/dd");
		Date data = null;
		try {
			data = formatuj.parse(dataOgloszenia_RRRR_MM_DD);
		}
		catch (ParseException e) {
			e.printStackTrace();
		}
		dataOgloszenia = data;
	}
	
	public String getMarka() {
		return marka;
	}
	
	public double getCena() {
		return cena;
	}
	
	public double getPrzebieg() {
		return przebieg;
	}
	
	public String getRocznik () {
		return rocznik.toString();
	}
	
	public String getRegion() {
		return region;
	}
	
	public String getMiasto() {
		return miasto;
	}
	
	public String getCzyUszkodzony() {
		String s;
		 s = (czyUszkodzony) ? ("uszkodzony") : ("sprawny");
		return s;
	}
	
	public String getCzyNowy() {
		String s;
		 s = (czyNowy) ? ("nowy/nieuzywany") : ("uzywany");
		return s;
	}
	
	public String getDataOgloszenia() {
		return dataOgloszenia.toString();
	}
	
	public boolean getCzyUszkodzonyTF() {
		return czyUszkodzony;
	}
	
	public boolean getCzyNowyTF() {
		return czyNowy;
	}
	
	public Date getRocznikDate() {
		return rocznik;
	}
	
	public Date getDataOgloszeniaDate() {
		return dataOgloszenia;
	}
}
