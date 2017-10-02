package rpg;

/**
 * La Clase Caballo.
 */
public class Caballo {

	private static int CANTIDAD_DE_ATAQUES = 3;

	private int ataques;

	/**
	 * Constructor del caballo
	 */
	public Caballo() {
		ataques = 0;
	}

	/**
	 * Si el caballo esta rebelde.
	 *
	 * @return si el caballo esta rebelde
	 */
	public Boolean estaRebelde() {
		return (ataques > CANTIDAD_DE_ATAQUES);
	}

	/**
	 * Recibir ataque.
	 */
	public void recibirAtaque() {
		ataques++;
	}

	/**
	 * El caballo se calma.
	 */
	public void calmarse() {
		ataques = 0;
	}

}
