package rpg;
public class Caballo {

	private static int CANTIDAD_DE_ATAQUES = 3;

	private int ataques;

	public Caballo() {
		ataques = 0;
	}

	public Boolean estaRebelde() {
		return (ataques > CANTIDAD_DE_ATAQUES);
	}

	public void recibirAtaque() {
		ataques++;
	}

	public void calmarse() {
		ataques = 0;
	}

}
