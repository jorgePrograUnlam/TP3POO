package rpg;

/**
 * La Clase UnidadPuñal. Hereda de la clase abstracta UnidadDecorada
 * Otorga mayor ataque a la unidad que lo posea.
 * Disminuye su defensa por cargar este UnidadDecorada.
 */
public class UnidadPuñal extends UnidadDecorada {

	private static double ATAQUE  = 3;
	private static double DEFENSA = 3;

	/**
	 * Crea una nueva unidad con puñal.
	 *
	 * @param u la unidad a decorar
	 */
	public UnidadPuñal(Unidad u) {
		super(u);
		aumentarBonusAtaque(ATAQUE);
		disminuirBonusDefensa(DEFENSA);
		unidadDecorada.aumentarBonusAtaque(ATAQUE);
		unidadDecorada.disminuirBonusDefensa(DEFENSA);
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
