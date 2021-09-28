package kalkulator_jednostek;

public class Objetosci implements Objetosc {
	
	public double metrSzesciennyToLitr (double ilosc) {
		return 0.001*ilosc;
	}
	
	public double metrSzesciennyToKwaterka (double ilosc) {
		double pom = metrSzesciennyToLitr(ilosc);
		return 0.25*pom;
	}

	public double metrSzesciennyToGalonAngielski (double ilosc) {
		double pom = metrSzesciennyToLitr(ilosc);
		return pom/4.5456;
	}

	public double litrToMetrSzescienny (double ilosc) {
		return ilosc/1000;
	}
	
	public double litrToKwaterka (double ilosc) {
		return ilosc*4;
	}

	public double litrToGalonAngielski (double ilosc) {
		double pom = litrToMetrSzescienny(ilosc);
		return metrSzesciennyToGalonAngielski(pom);
	}

	public double kwaterkaToMetrSzescienny (double ilosc) {
		double pom = ilosc/4;
		return litrToMetrSzescienny(pom);
	}
	
	public double kwaterkaToLitr (double ilosc) {
		double pom = kwaterkaToMetrSzescienny(ilosc);
		return metrSzesciennyToLitr(pom);
	}
	
	public double kwaterkaToGalonAngielski (double ilosc) {
		double pom = kwaterkaToMetrSzescienny(ilosc);
		return metrSzesciennyToGalonAngielski(pom);
	}

	public double galonAngielskiToMetrSzescienny (double ilosc) {
		double pom = ilosc*4.5456;
		return litrToMetrSzescienny(pom);
	}

	public double galonAngielskiToLitr (double ilosc) {
		double pom = galonAngielskiToMetrSzescienny(ilosc);
		return metrSzesciennyToLitr(pom);
	}

	public double galonAngielskiToKwaterka (double ilosc) {
		double pom = galonAngielskiToMetrSzescienny(ilosc);
		return metrSzesciennyToKwaterka(pom);
	}



}
