package symulator;

//formularz podrozy
public interface FormularzInterfejs {
	//wypisuje formularz do wypelnienia
	public void wypisz() throws Wyjatki;
	//potwierdza wypelnienie formularza
	public void podziekuj();
	//podsumowuje wypelniony formularz
	public void podsumowanie();
}
