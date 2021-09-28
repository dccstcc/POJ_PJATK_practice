package wektor;

public class Main {

	public static void main(String[] args) {
		double [] tab = new double[10];
		for(int i = 0; i<10; i++) {
			tab[i] = i+i*0.1;
		}
		
		Wektor wektor = new Wektor(tab);
		System.out.println("element o indeksie 5:");
		System.out.println(wektor.get(5));
		
		System.out.println("Wyswietlam wektor:");
		wektor.show(wektor.wektor);
		System.out.println("");
		
		System.out.println("ustawiam element 22.5 na ideksie 5:");
		wektor.set(5, 22.5);
		
		System.out.println("Wyswietlam wektor:");
		wektor.show(wektor.wektor);
		System.out.println("");
		
		System.out.println("wartoœæ maksymalna:");
		System.out.println(wektor.max());

		System.out.println("wartoœæ minimalna:");
		System.out.println(wektor.min());
		
		System.out.println("wektor nr 1:");
		wektor.show(wektor.wektor);
		System.out.println("");
		
		double [] tab2 = new double[14];
		for(int i = 0; i<14; i++) {
			tab2[i] = 3*i+i*0.5;
		}
		Wektor wektor2 = new Wektor(tab2);
		
		System.out.println("wektor nr 2:");
		wektor.show(wektor2.wektor);
		System.out.println("");
		
		System.out.println("sumujê wektor nr 1 i 2 po indeksach");
		wektor.add2v(wektor2.wektor);
		System.out.println(wektor.toString());
		
		System.out.println("liczba elementów wektora:");
		System.out.println(wektor.size());
		
		System.out.println("Sortowanie asc");
		wektor.show(wektor.sort('+'));
		System.out.println("");
		System.out.println("Sortowanie desc");
		wektor.show(wektor.sort('-'));
		System.out.println("");

}
}