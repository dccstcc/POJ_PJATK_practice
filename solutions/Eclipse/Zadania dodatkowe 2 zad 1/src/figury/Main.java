package figury;

public class Main {

	public static void main(String[] args) {
		FiguryGeometryczne figura;
		figura = new Odcinek(3);
		figura.jakaFigura();
		Odcinek odcinek = (Odcinek) figura;
		System.out.println("dlugosc: " + odcinek.getDlugosc());
		System.out.println ("");
		
		Kolo kolo = new Kolo(12.3);
		kolo.jakaFigura();
		System.out.println("promien: " + kolo.getPromien());
		System.out.println("obwod: " + kolo.obwod());
		System.out.println("pole: " + kolo.pole());
		System.out.println ("");

		Wierzcholki A = new Wierzcholki(2.3, 3.55);
		Wierzcholki B = new Wierzcholki(45.45, 3.55);
		Wierzcholki C = new Wierzcholki(4, 9);
		
		Trojkat trojkat = new Trojkat(A, B, C);
		trojkat.jakaFigura();
		System.out.println ("iloœæ boków: " + trojkat.ileBokow());
		trojkat.dlugosciBokow(A, B, C);
		System.out.println ("pole: " + trojkat.pole());
		System.out.println ("obwod: " + trojkat.obwod());
		trojkat.wspolrzedneWierzcholkow();
		System.out.println ("");
		
		A = new Wierzcholki(-2, -2);
		B = new Wierzcholki(2, -2);
		C = new Wierzcholki(2, 2);
		Wierzcholki D = new Wierzcholki(-2, 2);
		
		Kwadrat kwadrat = new Kwadrat(A, B, C, D);
		kwadrat.jakaFigura();
		System.out.println("ilosc bokow: " + kwadrat.ileBokow());
		kwadrat.wspolrzedneWierzcholkow();
		System.out.println("pole: " + kwadrat.poleAC(A,C));
		System.out.println("obwod: " + kwadrat.obwodBD(B,D));
}

}
