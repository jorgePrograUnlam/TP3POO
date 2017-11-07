package rpg;

/**
 * La Clase UnidadCapa. Hereda de la clase abstracta UnidadDecorada Solo se
 * aplica a las unidades que son del tipo Soldado. Aumenta el ataque del Soldado
 * que lo posea en un 10% Duplica la energia.
 */
public class UnidadCapa extends UnidadDecorada {

	private static final int MULTIPLICADOR_ENERGIA = 2;
	private static final double ATAQUE_PORCENTUAL = 0.9;

	public UnidadCapa(Unidad u) {
		super(u);
	}

	@Override
	public void ataca(Unidad otraUnidad) {
		otraUnidad.recibirDaño(unidadDecorada.getAtaque() * ATAQUE_PORCENTUAL);

	}

	@Override
	public double getAtaque() {
		return (unidadDecorada.getAtaque() * ATAQUE_PORCENTUAL);
	}

	@Override
	public int getEnergia() {
		return (unidadDecorada.getEnergia() * MULTIPLICADOR_ENERGIA);
	}

	@Override
	public double getAtaquePorcentual() {
		return ATAQUE_PORCENTUAL;
	}

	@Override
	public double getSalud() {
		return unidadDecorada.getSalud();
	}
}
