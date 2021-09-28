package biblioteka;

public class Czasopisma implements Czasopismo {
	private String tytul;
	private double numer;
	private int rokWydania;
	private String rodzaj;
	
	Czasopisma (String tytul, double numer, int rokWydania, String rodzaj) {
		setTytul(tytul);
		setNumer(numer);
		setRokWydania(rokWydania);
		setRodzaj(rodzaj);
	}
		
	public void setTytul (String tytul) {
		this.tytul = tytul;
	}
	
	public void setNumer (double numer) {
		this.numer = numer;
	}
	
	public void setRokWydania (int rokWydania) {
		this.rokWydania = rokWydania;
	}
	
	public void setRodzaj (String rodzaj) {
		this.rodzaj = rodzaj;
	}
	
	public String getTytul () {
		return tytul;
	}
	
	public double getNumer () {
		return numer;
	}
	
	public int getRokWydania () {
		return rokWydania;
	}
	
	public String getRodzaj () {
		return rodzaj;
	}
	
	public String getInfo() {
		String info = "***Czasopismo*** " + "tytul: "  + tytul + ", numer wydania: " + numer + ", rok wydania: "  + rokWydania + ", rodzaj czasopisma: " + rodzaj;
		return info;
	}
	
	public String coToZaZbior() {
		return "czasopisma";
	}
}
