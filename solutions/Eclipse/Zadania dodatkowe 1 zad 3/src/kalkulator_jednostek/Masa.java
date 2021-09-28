package kalkulator_jednostek;

public interface Masa {
	public double kilogramToGram(double ilosc);
	public double kilogramToTona(double ilosc);
	public double kilogramToKwintal(double ilosc);
	public double kilogramToFuntBrytyjski(double ilosc);
	public double kilogramToUncja(double ilosc);
	
	public double gramToKilogram(double ilosc);
	public double gramToTona(double ilosc);
	public double gramToKwintal(double ilosc);
	public double gramToFuntBrytyjski(double ilosc);
	public double gramToUncja(double ilosc);

	public double kwintalToKilogram(double ilosc);
	public double kwintalToGram(double ilosc);
	public double kwintalToTona(double ilosc);
	public double kwintalToFuntBrytyjski(double ilosc);
	public double kwintalToUncja(double ilosc);

	public double funtBrytyjskiToKilogram(double ilosc);
	public double funtBrytyjskiToGram(double ilosc);
	public double funtBrytyjskiToTona(double ilosc);
	public double funtBrytyjskiToKwintal(double ilosc);
	public double funtBrytyjskiToUncja(double ilosc);

	public double uncjaToKilogram(double ilosc);
	public double uncjaToGram(double ilosc);
	public double uncjaToTona(double ilosc);
	public double uncjaToKwintal(double ilosc);
	public double uncjaToFuntBrytyjski(double ilosc);
}
