package figury;

public class Odcinek implements FiguryGeometryczne {
	
	double a;
	
	Odcinek() {
		
	}
	
	Odcinek(double a) {
		this.a = a;
	}
	
	public double getDlugosc() {
		return a;
	}
	
	public double getDlugosc(double a) {
		return a;
	}
	
	public void jakaFigura(){
		System.out.println("odcinek");
	}
	
	public double obwod() {
		return 0.0;
	}
	
	public double pole() {
		return 0.0;
	}
}
