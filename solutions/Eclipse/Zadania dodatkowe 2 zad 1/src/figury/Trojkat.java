package figury;

public class Trojkat implements Wielokaty {
	
	double a;
	double b;
	double c;
	Wierzcholki A;
	Wierzcholki B;
	Wierzcholki C;
	double h;
	
	Trojkat() {
		
	}
	
	Trojkat(Wierzcholki A, Wierzcholki B, Wierzcholki C) {
		this.A = A;
		this.B = B;
		this.C = C;
	}
	
	Trojkat (double a, double b, double c) {
		this.a = a;
		this.b = b;
		this.c = c;
	}
	
	public void setDlugosciBokow (Wierzcholki A, Wierzcholki B, Wierzcholki C) {
		a = Math.abs(A.getX() - B.getX());
		double bx = Math.abs(B.getX() - C.getX());
		double by = Math.abs(B.getY() - C.getY());
		b = Math.sqrt(bx*bx+by*by);		
		double cx = Math.abs(A.getX() - C.getX());
		double cy = Math.abs(A.getY() - C.getY());
		c = Math.sqrt(cx*cx+cy*cy);
	}
	
	public void jakaFigura(){
		System.out.println("trójk¹t");
	}
	
	public double obwod() {
		return a+b+c;
	}
	
	public double obwod(double a, double b, double c) {
		return a+b+c;
	}
	
	public double obwod(Wierzcholki A, Wierzcholki B, Wierzcholki C) {
		a = Math.abs(A.getX() - B.getX());
		double bx = Math.abs(B.getX() - C.getX());
		double by = Math.abs(B.getY() - C.getY());
		b = Math.sqrt(bx*bx+by*by);		
		double cx = Math.abs(A.getX() - C.getX());
		double cy = Math.abs(A.getY() - C.getY());
		c = Math.sqrt(cx*cx+cy*cy);
		return a+b+c;
	}
	
	public double pole() {
		double p = 0.5*obwod();
		double Pole = Math.sqrt(p*(p-a)*(p-b)*(p-c));
		return Pole;
	}
	
	public double pole(double a, double b, double c) {
		double p = 0.5*obwod(a, b, c);
		double Pole = Math.sqrt(p*(p-a)*(p-b)*(p-c));
		return Pole;
	}
	
	public double pole(Wierzcholki A, Wierzcholki B, Wierzcholki C) {
		double p = 0.5*obwod(A, B, C);
		a = Math.abs(A.getX() - B.getX());
		double bx = Math.abs(B.getX() - C.getX());
		double by = Math.abs(B.getY() - C.getY());
		b = Math.sqrt(bx*bx+by*by);		
		double cx = Math.abs(A.getX() - C.getX());
		double cy = Math.abs(A.getY() - C.getY());
		c = Math.sqrt(cx*cx+cy*cy);
		double Pole = Math.sqrt(p*(p-a)*(p-b)*(p-c));
		return Pole;
	}
	
	public double pole(double h) {
		return 0.5*a*h;
	}
	
	public double pole(Wierzcholki A, Wierzcholki B, double h) {
		a = Math.abs(A.getX() - B.getX());
		return 0.5*a*h;
	}
	
	public int ileBokow() {
		return 3;
	}
	
	public void dlugosciBokow() {
		System.out.println("a: " + a);
		System.out.println("b: " + b);
		System.out.println("c: " + c);
	}
	
	public void dlugosciBokow(Wierzcholki A, Wierzcholki B, Wierzcholki C) {
		a = Math.abs(A.getX() - B.getX());
		double bx = Math.abs(B.getX() - C.getX());
		double by = Math.abs(B.getY() - C.getY());
		b = Math.sqrt(bx*bx+by*by);		
		double cx = Math.abs(A.getX() - C.getX());
		double cy = Math.abs(A.getY() - C.getY());
		c = Math.sqrt(cx*cx+cy*cy);
		System.out.println("a: " + a);
		System.out.println("b: " + b);
		System.out.println("c: " + c);
	}
	
	public void dlugosciBokow(double a, double b, double c) {
		System.out.println("a: " + a);
		System.out.println("b: " + b);
		System.out.println("c: " + c);
	}
	
	public void wspolrzedneWierzcholkow (Wierzcholki A, Wierzcholki B, Wierzcholki C) {
		System.out.println("Ax: " + A.getX() + ", Ay: " + A.getY());
		System.out.println("Bx: " + B.getX() + ", By: " + B.getY());
		System.out.println("Cx: " + C.getX() + ", Cy: " + C.getY());
	}
	
	public void wspolrzedneWierzcholkow () {
		System.out.println("Ax: " + A.getX() + ", Ay: " + A.getY());
		System.out.println("Bx: " + B.getX() + ", By: " + B.getY());
		System.out.println("Cx: " + C.getX() + ", Cy: " + C.getY());
	}
}
