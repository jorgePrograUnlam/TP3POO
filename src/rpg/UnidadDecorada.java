package rpg;

/**
 *  Clase abstracta UnidadDecorada. Tiene como subclases: UnidadPuñal, UnidadEscudo, UnidadCapa, pocionDeAgua y UnidadPaqueteFlecha
 */
public abstract class UnidadDecorada extends Unidad{

	protected Unidad unidadDecorada;

	/**
	 * Crea una nueva unidad decorada.
	 *
	 * @param u the u
	 */
	public UnidadDecorada(Unidad u) {
		super(u);
		this.unidadDecorada = u;
	}
	
	/* (non-Javadoc)
	 * @see rpg.Unidad#ataca(rpg.Unidad)
	 */
	@Override
	public void ataca(Unidad otraUnidad) {
		unidadDecorada.ataca(otraUnidad);
		
	}

	/* (non-Javadoc)
	 * @see rpg.Unidad#puedeAtacar(rpg.Unidad)
	 */
	@Override
	public boolean puedeAtacar(Unidad otraUnidad) {
		return unidadDecorada.puedeAtacar(otraUnidad);
	}
	
	/* (non-Javadoc)
	 * @see rpg.Unidad#tomarPocionDeAgua()
	 */
	@Override
	public void tomarPocionDeAgua() {
		unidadDecorada.tomarPocionDeAgua();
		
	}

}
