package ludzie;

public class Studenci extends Osoby implements Student {
	
	private int numerIndeksu;
	
	Studenci(String imie, String nazwisko, String dataUrodzenia, String plec, int numerIndeksu) {
		super (imie, nazwisko, dataUrodzenia, plec);
		setNumerIndeksu(numerIndeksu);
	}
	
	Studenci (Osoby osoba, int numerIndeksu) {
		super(osoba.getImie(), osoba.getNazwisko(), osoba.getDataUrodzenia(), osoba.getPlec());
		setNumerIndeksu(numerIndeksu);
	}
	
	
	public void setNumerIndeksu(int indeks) {
		numerIndeksu = indeks;
	}
	
	public int getNumerIndeksu() {
		return numerIndeksu;
	}
	
	public String informacjaoOsobie () {
		String info = super.informacjaoOsobie() + ", indeks: " + numerIndeksu;
		return info;
	}
}
