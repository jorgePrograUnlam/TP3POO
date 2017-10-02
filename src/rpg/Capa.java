package rpg;

/**
 * La Clase Capa.
 */
public class Capa extends Item {

	private static final int MULTIPLICADOR_ENERGIA = 2;
	private static final double ATAQUE_PORCENTUAL = 0.9;

	/* (non-Javadoc)
	 * @see rpg.Item#aplicarEfecto(rpg.Unidad)
	 */
	@Override
	public void aplicarEfecto(Unidad u) {
		if (u instanceof Soldado) {
			Soldado soldado = (Soldado) u;
			soldado.aumentarAtaquePorcentual(ATAQUE_PORCENTUAL);
			soldado.multiplicarEnergia(MULTIPLICADOR_ENERGIA);
			soldado.agregarItem(this);
		}
	}

	/* (non-Javadoc)
	 * @see rpg.Item#quitarEfecto(rpg.Unidad)
	 */
	@Override
	public void quitarEfecto(Unidad u) {
		if (u instanceof Soldado) {
			Soldado soldado = (Soldado) u;
			soldado.disminuirAtaquePorcentual(ATAQUE_PORCENTUAL);
			soldado.dividirEnergia(MULTIPLICADOR_ENERGIA);
			soldado.quitarItem(this);
		}
	}

}
