public class Tablica2{

    private int[] tablica = new int[10];
	
    public int pobierzElement(int indeks){
        return tablica[indeks];
    }

    public void ustawElement(int indeks, int wartosc){
        tablica[indeks] = wartosc;
    }
}


//-----------------------------------


public class Test{
   
    public static void main(String args[]) {
        
        Tablica2 tablica = new Tablica2();

        tablica.ustawElement(5,10);
        int liczba = tablica.pobierzElement(10);
        System.out.println(liczba);
    }

}
