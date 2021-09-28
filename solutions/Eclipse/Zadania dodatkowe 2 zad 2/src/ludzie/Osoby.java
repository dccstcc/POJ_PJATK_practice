package ludzie;

public class Osoby implements Osoba {
	private String imie;
	private String nazwisko;
	private String dataUrodzenia;
	private String plec;
	
	Osoby (String imie, String nazwisko, String dataUrodzenia, String plec) {
		setImie(imie);
		setNazwisko(nazwisko);
		setDataUrodzenia(dataUrodzenia);
		setPlec(plec);
	}
	
	public String informacjaoOsobie () {
		String info = imie + " " + nazwisko +  ", data urodzenia: " + dataUrodzenia + ", " + plec;
		return info;
	}
	
	
	public void setImie(String imie) {
		this.imie = imie;
	}
	
	public void setNazwisko(String nazwisko) {
		this.nazwisko = nazwisko;
	}
	
	public void setDataUrodzenia(String data) {
		dataUrodzenia = data;
	}
	
	public void setPlec(String plec) {
		this.plec = plec;
	}
	
	public String getImie() {
		return imie;
	}
	
	public String getNazwisko() {
		return nazwisko;
	}
	
	public String getDataUrodzenia() {
		return dataUrodzenia;
	}
	
	public String getPlec() {
		return plec;
	}
}
