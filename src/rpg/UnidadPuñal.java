package rpg;

/**
 * La Clase UnidadPuñal. Hereda de la clase abstracta UnidadDecorada Otorga
 * mayor ataque a la unidad que lo posea. Disminuye su defensa por cargar este
 * UnidadDecorada.
 */
public class UnidadPuñal extends UnidadDecorada {

	private static double ATAQUE = 3;
	private static double DEFENSA = 3;

	/**
	 * Crea una nueva unidad con puñal.
	 *
	 * @param u
	 *            la unidad a decorar
	 */
	public UnidadPuñal(Unidad u) {
		super(u);
	}

	@Override
	public void ataca(Unidad otraUnidad) {
		otraUnidad.recibirDaño(unidadDecorada.getAtaque() + ATAQUE);

	}

	@Override
	public void recibirDaño(double n) {
		unidadDecorada.recibirDaño(n + DEFENSA);
	}

	@Override
	public double getAtaque() {
		return (unidadDecorada.getAtaque() + ATAQUE);
	}

	@Override
	public double getSalud() {
		return unidadDecorada.getSalud();
	}
}
