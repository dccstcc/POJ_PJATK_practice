package kalkulator_jednostek;

public class Moce implements Moc {
	
	public double watToKonMechaniczny(double ilosc) {
		return ilosc/735.498;
	}
	
	public double konMechanicznyToWat(double ilosc) {
		return ilosc*735.498;
	}


}
