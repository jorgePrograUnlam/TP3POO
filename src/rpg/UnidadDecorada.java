package rpg;

/**
 * Clase abstracta UnidadDecorada. Tiene como subclases: UnidadPuñal,
 * UnidadEscudo, UnidadCapa, pocionDeAgua y UnidadPaqueteFlecha
 */
public abstract class UnidadDecorada extends Unidad {

	protected Unidad unidadDecorada;

	/**
	 * Crea una nueva unidad decorada.
	 *
	 * @param u
	 *            the u
	 */
	public UnidadDecorada(Unidad u) {
		this.unidadDecorada = u;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see rpg.Unidad#ataca(rpg.Unidad)
	 */
	@Override
	public void ataca(Unidad otraUnidad) {
		otraUnidad.recibirDaño(unidadDecorada.getAtaque());

	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see rpg.Unidad#puedeAtacar(rpg.Unidad)
	 */
	@Override
	public boolean puedeAtacar(Unidad otraUnidad) {
		return unidadDecorada.puedeAtacar(otraUnidad);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see rpg.Unidad#tomarPocionDeAgua()
	 */
	@Override
	public void tomarPocionDeAgua() {
		unidadDecorada.tomarPocionDeAgua();

	}

	@Override
	public double getAtaquePorcentual() {
		return unidadDecorada.getAtaquePorcentual();
	}

	@Override
	public double getDefensaPorcentual() {
		return unidadDecorada.getDefensaPorcentual();
	}

}
