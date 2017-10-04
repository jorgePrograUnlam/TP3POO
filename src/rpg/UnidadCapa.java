package rpg;

/**
 * La Clase UnidadCapa. Hereda de la clase abstracta UnidadDecorada
 * Solo se aplica a las unidades que son del tipo Soldado.
 * Aumenta el ataque  del Soldado que lo posea en un 10%
 * Duplica la energia.
 */
public class UnidadCapa extends UnidadDecorada {

	private static final int MULTIPLICADOR_ENERGIA = 2;
	private static final double ATAQUE_PORCENTUAL = 0.9;

	public UnidadCapa(Unidad u) {
		super(u);
		aumentarAtaquePorcentual(ATAQUE_PORCENTUAL);
		unidadDecorada.aumentarAtaquePorcentual(ATAQUE_PORCENTUAL);
		multiplicarEnergia(MULTIPLICADOR_ENERGIA);
		unidadDecorada.multiplicarEnergia(MULTIPLICADOR_ENERGIA);
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
