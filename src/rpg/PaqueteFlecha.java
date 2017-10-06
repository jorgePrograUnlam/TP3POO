package rpg;

/**
 * La clase PaqueteFlecha.
 */
public class PaqueteFlecha {
	
	private int flechas;

	/**
	 * Crea un nuevo paquete de flechas
	 *
	 * @param f la cantida de flechas de l paquete
	 */
	public PaqueteFlecha(int f) {
		flechas = f;
	}

	/**
	 * Obtener las flehas que hay dentro del paquete
	 *
	 * @return la cantidad de flechas dentro del paquete
	 */
	public int getFlehas() {
		return flechas;
	}

}
