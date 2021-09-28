
//klasa pozwala tworzyc interwaly czasowe miedzy wyswietlanymi wynikami

package symulator;

public class Spij {
	
	public Spij (int czas) {
	try {
		Thread.sleep(czas);
		}
	 catch (InterruptedException e) {
		System.out.println("Watek glowny przerwany");
}
}
}
