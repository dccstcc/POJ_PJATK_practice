package biblioteka;

public interface Ksiazka extends Operacja {
	public void setAutor (String autor);
	public void setTytul (String tytul);
	public void setRokWydania (int rokWydania);
	public void setWydawnictwo (String wydawnictwo);
	public void setISBN (int ISBN);
	public String getAutor ();
	public String getTytul ();
	public int getRokwydania ();
	public String getWydawnictwo ();
	public int getISBN ();
}
