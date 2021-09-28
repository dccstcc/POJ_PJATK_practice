public class DwaWyjatki{
   
    public static void main(String args[]) {
        
        Punkt punkt = null;
        int liczba=0;

        try{
            liczba = 10/0;
	    punkt.x = liczba;
        }

        catch(ArithmeticException blad){
            System.out.println("Nieprawidlowa operacja arytmetyczna");
            System.out.println(blad);
        } 

        catch(RuntimeException blad){
            System.out.println("Blad ogolny");
            System.out.println(blad);
        }    
        
 
    }
}

//----------------------------

public class Punkt{

     int x,y;

}
