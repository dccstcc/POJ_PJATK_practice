package biblioteka;

public interface Czasopismo extends Operacja {
	public void setTytul (String tytul);
	public void setNumer (double numer);
	public void setRokWydania (int rokWydania);
	public void setRodzaj (String rodzaj);
	public String getTytul ();
	public double getNumer ();
	public int getRokWydania ();
	public String getRodzaj ();
}
