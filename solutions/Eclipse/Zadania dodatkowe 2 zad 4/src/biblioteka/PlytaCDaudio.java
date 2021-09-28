package biblioteka;

import java.util.*;

public interface PlytaCDaudio extends Operacja {
	public void setTytul(String tytul);
	public void setSpisWykowawcow(String wykonawca);
	public void setSpisUtworow(String utwor);
	public void setTypNosnika(String typNosnika);
	public String getTytul();
	public ArrayList<String> getSpisWykonawcow();
	public ArrayList<String> getSpisUtworow();
	public String getTypNosnika();
}
