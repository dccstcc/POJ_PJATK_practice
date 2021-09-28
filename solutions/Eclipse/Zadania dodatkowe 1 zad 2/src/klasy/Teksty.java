package klasy;

public class Teksty {
	//przykladowe teksty
	public static String nowyTekst;
	public static final String alfabet = new String("abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ");
	public static final String tekstPolski = new String("za¿ó³æ gêœl¹ jaŸñ");
	public static final String tekst = new String("Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat. Duis aute irure dolor in reprehenderit in voluptate velit esse cillum dolore eu fugiat nulla pariatur. Excepteur sint occaecat cupidatat non proident, sunt in culpa qui officia deserunt mollit anim id est laborum.");
	
	//konstruktor tworzy nowy tekst
	Teksty (String tekst) {
		 nowyTekst = new String(tekst);
	}
}
