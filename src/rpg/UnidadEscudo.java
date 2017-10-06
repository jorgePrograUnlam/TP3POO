package rpg;

/**
 * La Clase UnidadEscudo. Hereda de la clase abstracta UnidadDecorada
 * Otorga mayor defensa a la unidad que lo posea
 */
public class UnidadEscudo extends UnidadDecorada {

	private static final double DEFENSA_PORCENTUAL = 0.4;
	
	/**
	 * Crea una nueva unidad escudo.
	 *
	 * @param u la unidad a decorar
	 */
	public UnidadEscudo(Unidad u) {
		super(u);
		aumentarDefensaPorcentual(DEFENSA_PORCENTUAL);
		unidadDecorada.aumentarDefensaPorcentual(DEFENSA_PORCENTUAL);
	}



	/* (non-Javadoc)
	 * @see rpg.UnidadDecorada#ataca(rpg.Unidad)
	 */
	@Override
	public void ataca(Unidad otraUnidad) {
		super.ataca(otraUnidad);
	}



	/* (non-Javadoc)
	 * @see rpg.UnidadDecorada#puedeAtacar(rpg.Unidad)
	 */
	@Override
	public boolean puedeAtacar(Unidad otraUnidad) {
		return super.puedeAtacar(otraUnidad);
	}
	
	/* (non-Javadoc)
	 * @see rpg.UnidadDecorada#tomarPocionDeAgua()
	 */
	@Override
	public void tomarPocionDeAgua() {
		super.tomarPocionDeAgua();
		
	}


}
