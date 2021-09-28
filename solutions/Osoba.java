public abstract class Osoba{
  
   private String nazwisko, imie;
   private int ksiazki;

   public Osoba(){
      nazwisko = "";
      imie = "";
      ksiazki = 0;
   }

   public Osoba(String nazwisko,String imie,int ksiazki){

      // ..... uzupelnij
   }

   public String PodajNazwisko(){
      return nazwisko;
   }

   public String Dane(){   
      String s;
      s = nazwisko + "   " + imie + ",  wypozyczone ksiazki  = " + ksiazki;
      return s; 
   }

   public boolean SprawdzKsiazki(){
      return ksiazki > 5;
   }

   public abstract String PodajStanowisko();
   public abstract boolean Sprawdz();

}

// -------------------------------------------------

class Naukowiec extends Osoba{

   private int godziny;

   public Naukowiec(String nazwisko, String imie, int ksiazki, int godziny){
    
      // ..... uzupelnij

   public String Dane(){
      
      // ..... uzupelnij
   }

   public String PodajStanowisko(){
      
      return "NAUKOWIEC";
   }

   public boolean Sprawdz(){
      
      return godziny < 210;
   }
}

// -------------------------------------------------

class Student extends Osoba{

   private int jednostki;

   public Student(String nazwisko, String imie, int ksiazki, int jednostki){
      
      // ..... uzupelnij
   }

   public String Dane(){
      
      // ..... uzupelnij
   }

   public String PodajStanowisko(){
      
      return "STUDENT";
   }
   
    public boolean Sprawdz(){
      
      return jednostki < 20;
   }
}
