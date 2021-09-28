package kalkulator_jednostek;

public class Ilosci implements Ilosc {
	public double kopaToTuzin(double ilosc) {
		double pom = ilosc*60;
		return pom/12;
	}
	
	public double kopaToMendel(double ilosc){
		double pom = ilosc*60;
		return pom/15;
	}

	public double tuzinToKopa(double ilosc) {
		double pom = ilosc*12;
		return pom/60;
	}

	public double tuzinToMendel(double ilosc) {
		double pom = ilosc*12;
		return pom/15;
	}
	
	public double mendelToTuzin(double ilosc) {
		double pom = ilosc*15;
		return pom/12;
	}

	public double mendelToKopa(double ilosc) {
		double pom = ilosc*15;
		return pom/60;
	}


}
