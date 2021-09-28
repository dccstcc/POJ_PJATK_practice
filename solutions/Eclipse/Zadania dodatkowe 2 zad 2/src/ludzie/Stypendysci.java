package ludzie;

public class Stypendysci extends Studenci implements Stypendysta {
	
	private double kwotaStypendium;

	Stypendysci (String imie, String nazwisko, String dataUrodzenia, String plec, int numerIndeksu, double kwotaStypendium) {
		super (imie, nazwisko, dataUrodzenia, plec, numerIndeksu);
		setKwotaStypendium(kwotaStypendium);
	}
	
	Stypendysci (Studenci student, double kwotaStypendium) {
		super(student.getImie(), student.getNazwisko(), student.getDataUrodzenia(), student.getPlec(), student.getNumerIndeksu());
		setKwotaStypendium(kwotaStypendium);
	}
	
	Stypendysci (Osoby osoba, int numerIndeksu, double kwotaStypendium) {
		super(osoba.getImie(), osoba.getNazwisko(), osoba.getDataUrodzenia(), osoba.getPlec(), numerIndeksu);
		setKwotaStypendium(kwotaStypendium);
	}
	
	public void setKwotaStypendium(double stypendium) {
		this.kwotaStypendium = stypendium;
	}
	
	public double getKwotaStypendium() {
		return kwotaStypendium;
	}
	
	public String informacjaoOsobie () {
		String info = super.informacjaoOsobie() + ", kwota stypendium: " + kwotaStypendium;
		return info;
	}
}
