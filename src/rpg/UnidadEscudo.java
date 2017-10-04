package rpg;

/**
 * La Clase UnidadEscudo. Hereda de la clase abstracta UnidadDecorada
 * Otorga mayor defensa a la unidad que lo posea
 */
public class UnidadEscudo extends UnidadDecorada {

	private static final double DEFENSA_PORCENTUAL = 0.4;
	
	public UnidadEscudo(Unidad u) {
		super(u);
		aumentarDefensaPorcentual(DEFENSA_PORCENTUAL);
		unidadDecorada.aumentarDefensaPorcentual(DEFENSA_PORCENTUAL);
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
