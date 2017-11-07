package rpg;

/**
 * La Clase UnidadEscudo. Hereda de la clase abstracta UnidadDecorada Otorga
 * mayor defensa a la unidad que lo posea
 */
public class UnidadEscudo extends UnidadDecorada {

	private static final double DEFENSA_PORCENTUAL = 0.4;

	/**
	 * Crea una nueva unidad escudo.
	 *
	 * @param u
	 *            la unidad a decorar
	 */
	public UnidadEscudo(Unidad u) {
		super(u);
	}

	@Override
	public void recibirDaño(double n) {
		unidadDecorada.recibirDaño(n * DEFENSA_PORCENTUAL);
	}

	@Override
	public double getDefensaPorcentual() {
		return DEFENSA_PORCENTUAL;
	}

	@Override
	public double getSalud() {
		return unidadDecorada.getSalud();
	}

}
