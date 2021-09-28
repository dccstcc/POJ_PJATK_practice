//UZUPELNIJ!

public class Wyjatek extends Exception{
}

//-----------------

public class Wznawianie {
	
	static int ile = 3;  //tyle razy zg³aszamy wyj¹tek
	
	void f() {
		if (ile-- > 0) ;
	}
}

//-----------------

public class Test {

	public static void main(String[] args) {
	
		Wznawianie w = new Wznawianie();
		
		while (true)
		{
			try
			{
				
			}
			catch ()
			{
				System.out.println("Przechwycono blad typu: " + );
				continue;
			}
			System.out.println("Wyjatek przestal byc zglaszany - wyjscie");
			break;
		}
		System.out.println("Koniec");
	}
}