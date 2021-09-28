package biblioteka;

public class Ksiazki implements Ksiazka {
	private String autor;
	private String tytul;
	private int rokWydania;
	private String wydawnictwo;
	private int ISBN;
	
	Ksiazki (String autor, String tytul, int rokWydania, String wydawnictwo, int ISBN) {
		setAutor(autor);
		setTytul(tytul);
		setRokWydania(rokWydania);
		setWydawnictwo(wydawnictwo);
		setISBN(ISBN);
	}
		
	public void setAutor (String autor) {
		this.autor = autor;
	}
	
	public void setTytul (String tytul) {
		this.tytul = tytul;
	}
	
	public void setRokWydania (int rokWydania) {
		this.rokWydania = rokWydania;
	}
	
	public void setWydawnictwo (String wydawnictwo) {
		this.wydawnictwo = wydawnictwo;
	}
	
	public void setISBN (int ISBN) {
		this.ISBN = ISBN;
	}
	
	public String getAutor () {
		return autor;
	}
	
	public String getTytul () {
		return tytul;
	}
	
	public int getRokwydania () {
		return rokWydania;
	}
	
	public String getWydawnictwo () {
		return wydawnictwo;
	}
	
	public int getISBN () {
		return ISBN;
	}
	
	public String getInfo() {
		String info = "***Ksiazka*** " + " autor: "  + autor + ", tytul: " + tytul + ", rok wydania: "  + rokWydania + ", wydawnictwo: " + wydawnictwo + ", ISBN: "  + ISBN;
		return info;
	}
	
	public String coToZaZbior() {
		return "ksiazki";
	}
	
	
}
