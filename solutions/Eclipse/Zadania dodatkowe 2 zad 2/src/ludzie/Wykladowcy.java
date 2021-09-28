package ludzie;

public class Wykladowcy extends Osoby implements Wykladowca {
	
	private String tytulNaukowy;
	
	Wykladowcy (String imie, String nazwisko, String dataUrodzenia, String plec, String tytulNaukowy) {
		super (imie, nazwisko, dataUrodzenia, plec);
		setTytulNaukowy(tytulNaukowy);
	}
	
	Wykladowcy (Osoby osoba, String tytulNaukowy) {
		super(osoba.getImie(), osoba.getNazwisko(), osoba.getDataUrodzenia(), osoba.getPlec());
		setTytulNaukowy(tytulNaukowy);
	}
	
	public void setTytulNaukowy(String tytul) {
		tytulNaukowy = tytul;
	}
	
	public String getTytulNaukowy() {
		return tytulNaukowy;
	}
	
	public String informacjaoOsobie () {
		String info = super.informacjaoOsobie() + ", Tytul naukowy: " + tytulNaukowy;
		return info;
	}
	
}
