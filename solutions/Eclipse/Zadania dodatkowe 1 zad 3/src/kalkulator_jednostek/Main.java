package kalkulator_jednostek;

public class Main {

	public static void main(String[] args) {
		Dlugosc dlugosc = new Dlugosci();
		Ilosc ilosc = new Ilosci();
		Masa masa = new Masy();
		Moc moc = new Moce();
		Objetosc objetosc = new Objetosci();
		Temperatura temperatura = new Temperatury();
		
		double ilosc1 = 2.5;
		System.out.println(ilosc1 + " metra = " + dlugosc.metrToCal(ilosc1) + " cali");
		
		double ilosc2 = 1.34;
		System.out.println(ilosc2 + " metra = " + dlugosc.metrToYard(ilosc2) + " yarda");
		
		double ilosc3 = 1000;
		System.out.println(ilosc3 + " milimetr�w = " + dlugosc.milimetrToYard(ilosc3) + " yarda");
		
		double ilosc4 = 43;
		System.out.println(ilosc4 + " tuziny = " + ilosc.tuzinToMendel(ilosc4) + " Mendli");
		
		double ilosc5 = 576.34;
		System.out.println(ilosc5 + " uncji = " + masa.uncjaToGram(ilosc5) + " gram�w");
		
		double ilosc6 = 85.5;
		System.out.println(ilosc6 + " KM = " + moc.konMechanicznyToWat(ilosc6) + " wat�w");
		
		double ilosc7 = 100.3;
		System.out.println(ilosc7 + " galon�w angielskich = " + objetosc.galonAngielskiToLitr(ilosc7) + " litr�w");
		
		double ilosc8 = 36.6;
		System.out.println(ilosc8 + " Fahrenheit�w = " + temperatura.fahrenheitToCelsjusz(ilosc8) + " stopni Celsjusza");
	}

}
