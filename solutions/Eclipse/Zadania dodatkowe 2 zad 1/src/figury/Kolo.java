package figury;

public class Kolo implements FiguryGeometryczne{
	
	double r;
	
	Kolo() {
		
	}
	
	Kolo(double r) {
		this.r = r;
	}
	
	public double getPromien () {
		return r;
	}
	
	public double getPromien (double r) {
		return r;
	}
	
	public void jakaFigura(){
		System.out.println("ko³o");
	}
	
	public double obwod() {
		return 2*pi*r;
	}
	
	public double obwod(double r) {
		return 2*pi*r;
	}
	
	public double pole() {
		return pi*r*r;
	}
	
	public double pole(double r) {
		return pi*r*r;
	}
}
