package kalkulator_jednostek;

public class Temperatury implements Temperatura {
	
	public double kelvinToCelsjusz(double ilosc) {
		return ilosc-273.15;
	}

	public double kelvinToFahrenheit(double ilosc) {
		double pom = kelvinToCelsjusz(ilosc);
		return celsjuszToFahrenheit(pom);
	}

	public double celsjuszToKelvin(double ilosc) {
		return ilosc+273.15;
	}

	public double celsjuszToFahrenheit(double ilosc) {
		return 32+((9/5)*ilosc);
	}
	
	public double fahrenheitToKelvin(double ilosc) {
		double pom = fahrenheitToCelsjusz(ilosc);
		return celsjuszToKelvin(pom);
	}
	
	public double fahrenheitToCelsjusz(double ilosc) {
		double pom = ilosc-32;
		return pom*5/9;
	}



}
