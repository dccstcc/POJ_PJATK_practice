package klasy;
import java.util.*;

public class Plyty {
	//zbior plyt
	ArrayList <Plyta> zbior = new ArrayList<Plyta>(); 
	
	//konstruktor
	Plyty (Plyta plyta) {
		zbior.add(plyta);
	}
	
	// funkcja dodaje plyte do zbioru
	public void addPlyta (Plyta plyta) {
		zbior.add(plyta);
	}
	// funkcja wyswietla tytuly plyt ze zbioru
	public void wyswietlTytulyPlyt() {
		for (Plyta p: zbior) {
			p.wyswietlTytulPlyty();
		}
	}
	
	
}
