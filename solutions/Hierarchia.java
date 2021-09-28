public class Hierarchia{
   
    public static void main(String args[]) {
        
        try
        {
            int liczba = 10/0;
        }
        catch(RuntimeException blad)
        {
            System.out.println("Wystapil blad: " + blad);
        }    
	catch(ArithmeticException blad)
        {
            System.out.println("Wystapil blad: " + blad);
        } 
    }
}
