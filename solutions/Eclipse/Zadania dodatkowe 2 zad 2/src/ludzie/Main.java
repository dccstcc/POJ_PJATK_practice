package ludzie;

public class Main {

	public static void main(String[] args) {
		
		Osoby osoba = new Osoby("Jan", "Kowalski", "23 stycznia 1990", "mê¿czyzna");
		System.out.println(osoba.informacjaoOsobie());
		
		Stypendysta student = new Stypendysci(osoba, 26475, 650.0);
		System.out.println(student.informacjaoOsobie());
		
		osoba.setDataUrodzenia("24 paŸdzernika 1968");
		osoba.setImie("Katarzyna");
		osoba.setNazwisko("Nowak");
		osoba.setPlec("kobieta");
		
		Wykladowca wykladowca = new Wykladowcy(osoba, "profesor");
		System.out.println(wykladowca.informacjaoOsobie());
	}

}
