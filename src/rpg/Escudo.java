package rpg;

/**
 * La Clase Escudo.
 */
public class Escudo extends Item {

	private static final double DEFENSA_PORCENTUAL = 0.4;
	
	/* (non-Javadoc)
	 * @see rpg.Item#aplicarEfecto(rpg.Unidad)
	 */
	@Override
	public void aplicarEfecto(Unidad u) {
		u.aumentarDefensaPorcentual(DEFENSA_PORCENTUAL);
		u.agregarItem(this);

	}

	/* (non-Javadoc)
	 * @see rpg.Item#quitarEfecto(rpg.Unidad)
	 */
	@Override
	public void quitarEfecto(Unidad u) {
		u.disminuirDefensaPorcentual(DEFENSA_PORCENTUAL);
		u.quitarItem(this);
	}

}
