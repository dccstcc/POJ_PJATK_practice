//klasa powstala w celu obslugi wyjatku w razie niepoprawnego wpisu w formularzu

package symulator;

public class Wyjatki extends Exception {
	public Wyjatki (String arg) {
		super(arg);
	}
}
