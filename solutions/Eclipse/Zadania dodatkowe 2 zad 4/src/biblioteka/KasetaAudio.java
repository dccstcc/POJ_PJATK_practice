package biblioteka;

import java.util.*;

public interface KasetaAudio extends Operacja {
	public void setNazwa(String nazwa);
	public void setSpisWykonawcow(String spisWykonawcow);
	public void setSpisUtworow(String spisUtworow);
	public String getNazwa();
	public ArrayList<String> getSpisWykonawcow();
	public ArrayList<String> getSpisUtworow();
}
