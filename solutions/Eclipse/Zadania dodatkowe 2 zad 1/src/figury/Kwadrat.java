package figury;

public class Kwadrat implements Wielokaty {
	double a;
	Wierzcholki A;
	Wierzcholki B;
	Wierzcholki C;
	Wierzcholki D;
	double przekatna = a*Math.sqrt(2);
	
	Kwadrat() {
		
	}
	
	Kwadrat(double a) {
		this.a = a;
	}
	
	Kwadrat(Wierzcholki A, Wierzcholki B, Wierzcholki C, Wierzcholki D) {
		this.A = A;
		this.B = B;
		this.C = C;
		this.D = D;
	}
	
	public void jakaFigura() {
		System.out.println ("kwadrat");
	}
	
	public double obwod() {
		return 4*a;
	}
	
	public double obwod(double a) {
		return 4*a;
	}
	
	public double obwodAB(Wierzcholki A, Wierzcholki B) {
		a = Math.abs(A.getX() - B.getX());
		return 4*a;
	}
	
	public double obwodCD(Wierzcholki C, Wierzcholki D) {
		a = Math.abs(A.getX() - B.getX());
		return 4*a;
	}
	
	public double obwodAD(Wierzcholki A, Wierzcholki D) {
		a = Math.abs(A.getY() - D.getY());
		return 4*a;
	}
	
	public double obwodBC(Wierzcholki B, Wierzcholki C) {
		a = Math.abs(B.getY() - C.getY());
		return 4*a;
	}
	
	public double obwodAC(Wierzcholki A, Wierzcholki C) {
		a = Math.abs(A.getX() - C.getX());
		return 4*a;
	}
	
	public double obwodBD(Wierzcholki B, Wierzcholki D) {
		a = Math.abs(B.getX() - D.getX());
		return 4*a;
	}
	
	public double pole() {
		return a*a;
	}
	
	public double pole(double a) {
		return a*a;
	}
	
	public double poleAB(Wierzcholki A, Wierzcholki B) {
		a = Math.abs(A.getX() - B.getX());
		return a*a;
	}
	
	public double poleCD(Wierzcholki C, Wierzcholki D) {
		a = Math.abs(A.getX() - B.getX());
		return a*a;
	}
	
	public double poleAD(Wierzcholki A, Wierzcholki D) {
		a = Math.abs(A.getY() - D.getY());
		return a*a;
	}
	
	public double poleBC(Wierzcholki B, Wierzcholki C) {
		a = Math.abs(B.getY() - C.getY());
		return a*a;
	}
	
	public double poleAC(Wierzcholki A, Wierzcholki C) {
		a = Math.abs(A.getX() - C.getX());
		return a*a;
	}
	
	public double poleBD(Wierzcholki B, Wierzcholki D) {
		a = Math.abs(B.getX() - D.getX());
		return a*a;
	}
	
	public int ileBokow() {
		return 4;
	}
	
	public void dlugosciBokow() {
		System.out.println("a: " + a);
	}
	
	public void dlugosciBokow(double a) {
		System.out.println("a: " + a);
	}
	
	public void dlugosciBokowAB(Wierzcholki A, Wierzcholki B) {
		a = Math.abs(A.getX() - B.getX());
		System.out.println("a: " + a);
	}
	
	public void dlugosciBokowCD(Wierzcholki C, Wierzcholki D) {
		a = Math.abs(A.getX() - B.getX());
		System.out.println("a: " + a);
	}
	
	public void dlugosciBokowAD(Wierzcholki A, Wierzcholki D) {
		a = Math.abs(A.getY() - D.getY());
		System.out.println("a: " + a);
	}
	
	public void dlugosciBokowBC(Wierzcholki B, Wierzcholki C) {
		a = Math.abs(B.getY() - C.getY());
		System.out.println("a: " + a);
	}
	
	public void dlugosciBokowAC(Wierzcholki A, Wierzcholki C) {
		a = Math.abs(A.getX() - C.getX());
		System.out.println("a: " + a);
	}
	
	public void dlugosciBokowBD(Wierzcholki B, Wierzcholki D) {
		a = Math.abs(B.getX() - D.getX());
		System.out.println("a: " + a);
	}
	
	public void wspolrzedneWierzcholkow () {
		System.out.println("Ax: " + A.getX() + ", Ay: " + A.getY());
		System.out.println("Bx: " + B.getX() + ", By: " + B.getY());
		System.out.println("Cx: " + C.getX() + ", Cy: " + C.getY());
		System.out.println("Dx: " + D.getX() + ", Dy: " + D.getY());
	}
	
	public void wspolrzedneWierzcholkow (Wierzcholki A, Wierzcholki B, Wierzcholki C, Wierzcholki D) {
		System.out.println("Ax: " + A.getX() + ", Ay: " + A.getY());
		System.out.println("Bx: " + B.getX() + ", By: " + B.getY());
		System.out.println("Cx: " + C.getX() + ", Cy: " + C.getY());
		System.out.println("Dx: " + D.getX() + ", Dy: " + D.getY());
	}

}
