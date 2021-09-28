package kalkulator_jednostek;

public class Masy implements Masa {
	public double kilogramToGram(double ilosc) {
		return ilosc*1000;
	}

	public double kilogramToTona(double ilosc) {
		return ilosc/1000;
	}

	public double kilogramToKwintal(double ilosc) {
		return ilosc/100;
	}

	public double kilogramToFuntBrytyjski(double ilosc) {
		return ilosc*0.453592;
	}

	public double kilogramToUncja(double ilosc) {
		double pom = kilogramToGram(ilosc);
		return pom/28.35;
	}

	public double gramToKilogram(double ilosc) {
		return ilosc/1000;
	}

	public double gramToTona(double ilosc) {
		double pom = gramToKilogram(ilosc);
		return kilogramToTona(pom);
	}

	public double gramToKwintal(double ilosc) {
		double pom = gramToKilogram(ilosc);
		return kilogramToKwintal(pom);
	}
	
	public double gramToFuntBrytyjski(double ilosc) {
		double pom = gramToKilogram(ilosc);
		return kilogramToFuntBrytyjski(pom);
	}
	
	public double gramToUncja(double ilosc) {
		double pom = gramToKilogram(ilosc);
		return kilogramToUncja(pom);
	}

	public double kwintalToKilogram(double ilosc) {
		return ilosc*100;
	}

	public double kwintalToGram(double ilosc) {
		double pom = kwintalToKilogram(ilosc);
		return kilogramToGram(pom);
	}
	
	public double kwintalToTona(double ilosc) {
		double pom = kwintalToKilogram(ilosc);
		return kilogramToTona(pom);
	}

	public double kwintalToFuntBrytyjski(double ilosc) {
		double pom = kwintalToKilogram(ilosc);
		return kilogramToFuntBrytyjski(pom);
	}
	
	public double kwintalToUncja(double ilosc) {
		double pom = kwintalToKilogram(ilosc);
		return kilogramToUncja(pom);
	}

	public double funtBrytyjskiToKilogram(double ilosc) {
		return ilosc/0.453592;
	}

	public double funtBrytyjskiToGram(double ilosc) {
		double pom = funtBrytyjskiToKilogram(ilosc);
		return kilogramToGram(pom);
	}

	public double funtBrytyjskiToTona(double ilosc) {
		double pom = funtBrytyjskiToKilogram(ilosc);
		return kilogramToTona(pom);
	}

	public double funtBrytyjskiToKwintal(double ilosc) {
		double pom = funtBrytyjskiToKilogram(ilosc);
		return kilogramToKwintal(pom);
	}

	public double funtBrytyjskiToUncja(double ilosc) {
		double pom = funtBrytyjskiToKilogram(ilosc);
		return kilogramToUncja(pom);
	}

	public double uncjaToKilogram(double ilosc) {
		double pom = ilosc*28.35;
		return gramToKilogram(pom);
	}
	
	public double uncjaToGram(double ilosc) {
		double pom = uncjaToKilogram(ilosc);
		return kilogramToGram(pom);
	}

	public double uncjaToTona(double ilosc) {
		double pom = uncjaToKilogram(ilosc);
		return kilogramToTona(pom);
	}
	
	public double uncjaToKwintal(double ilosc) {
		double pom = uncjaToKilogram(ilosc);
		return kilogramToKwintal(pom);
	}
	
	public double uncjaToFuntBrytyjski(double ilosc) {
		double pom = uncjaToKilogram(ilosc);
		return kilogramToFuntBrytyjski(pom);
	}


}
