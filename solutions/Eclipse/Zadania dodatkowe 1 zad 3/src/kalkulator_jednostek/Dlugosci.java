package kalkulator_jednostek;

public class Dlugosci implements Dlugosc {
	
	public double metrToMilimetr(double ilosc) {
		return ilosc*1000;
	}

	public double metrToCal(double ilosc) {
		double pom = ilosc*1000;
		return pom/25.4;
	}

	public double metrToYard(double ilosc) {
		return ilosc/0.9144;
	}

	public double metrToMilaMorska(double ilosc){
		return ilosc/1852;
	}

	public double metrToMilaAngielska(double ilosc) {
		return ilosc/1609.344;
	}
	
	public double milimetrToMetr(double ilosc) {
		return  ilosc/1000;
	}

	public double milimetrToCal(double ilosc) {
		return ilosc/25.4;
	}

	public double milimetrToYard(double ilosc) {
		double pom = milimetrToMetr(ilosc);
		return metrToYard(pom);
	}
	
	public double milimetrToMilaMorska(double ilosc) {
		double pom = milimetrToMetr(ilosc);
		return metrToMilaMorska(pom);
	}
	
	public double milimetrToMilaAngielska(double ilosc) {
		double pom = milimetrToMetr(ilosc);
		return metrToMilaAngielska(pom);
	}

	public double calToMetr(double ilosc) {
		double pom = ilosc*25.4;
		return milimetrToMetr(pom);
	}

	public double calToMilimetr(double ilosc) {
		double pom = calToMetr(ilosc);
		return metrToMilimetr(pom);
	}

	public double calToYard(double ilosc) {
		double pom = calToMetr(ilosc);
		return metrToYard(pom);
	}

	public double calToMilaMorska(double ilosc) {
		double pom = calToMetr(ilosc);
		return metrToMilaMorska(pom);
	}

	public double calToMilaAngielska(double ilosc) {
		double pom = calToMetr(ilosc);
		return metrToMilaAngielska(pom);
	}
	
	public double yardToMetr(double ilosc){
		return ilosc*0.9144;
	}
	
	public double yardToMilimetr(double ilosc) {
		double pom = yardToMetr(ilosc);
		return metrToMilimetr(pom);
	}
		
	public double yardToCal(double ilosc) {
		double pom = yardToMetr(ilosc);
		return metrToCal(pom);
	}

	public double yardToMilaMorska(double ilosc) {
		double pom = yardToMetr(ilosc);
		return metrToMilaMorska(pom);
	}

	public double yardToMilaAngielska(double ilosc) {
		double pom = yardToMetr(ilosc);
		return metrToMilaAngielska(pom);
	}
	
	public double milaMorskaToMetr(double ilosc) {
		return ilosc*1852;
	}
	
	public double milaMorskaToMilimetr(double ilosc) {
		double pom = milaMorskaToMetr(ilosc);
		return metrToMilimetr(pom);
	}
	
	public double milaMorskaToCal(double ilosc) {
		double pom = milaMorskaToMetr(ilosc);
		return metrToCal(pom);
	}

	public double milaMorskaToYard(double ilosc) {
		double pom = milaMorskaToMetr(ilosc);
		return metrToYard(pom);
	}

	public double milaMorskaToMilaAngielska(double ilosc) {
		double pom = milaMorskaToMetr(ilosc);
		return metrToMilaAngielska(pom);
	}

	public double milaAngielskaToMetr(double ilosc) {
		return ilosc*1609.344;
	}

	public double milaAngielskaToMilimetr(double ilosc) {
		double pom = milaAngielskaToMetr(ilosc);
		return metrToMilimetr(pom);
	}

	public double milaAngielskaToCal(double ilosc) {
		double pom = milaAngielskaToMetr(ilosc);
		return metrToCal(pom);
	}

	public double milaAngielskaToYard(double ilosc) {
		double pom = milaAngielskaToMetr(ilosc);
		return metrToYard(pom);
	}
	
	public double milaAngielskaToMilaMorska(double ilosc) {
		double pom = milaAngielskaToMetr(ilosc);
		return metrToMilaMorska(pom);
	}


}
