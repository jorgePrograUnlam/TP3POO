package rpg;

/**
 * La Clase UnidadPuñal. Hereda de la clase abstracta UnidadDecorada
 * Otorga mayor ataque a la unidad que lo posea.
 * Disminuye su defensa por cargar este UnidadDecorada.
 */
public class UnidadPuñal extends UnidadDecorada {

	private static double ATAQUE  = 3;
	private static double DEFENSA = 3;

	public UnidadPuñal(Unidad u) {
		super(u);
		aumentarBonusAtaque(ATAQUE);
		unidadDecorada.aumentarBonusAtaque(ATAQUE);
		disminuirBonusDefensa(DEFENSA);
		unidadDecorada.disminuirBonusDefensa(DEFENSA);
	}


	@Override
	public void ataca(Unidad otraUnidad) {
		super.ataca(otraUnidad);
		
	}

	@Override
	public boolean puedeAtacar(Unidad otraUnidad) {
		return super.puedeAtacar(otraUnidad);
	}


	@Override
	public void tomarPocionDeAgua() {
		super.tomarPocionDeAgua();
		
	}

}
