package rpg;

/**
 * La Clase Puñal. Hereda de la clase abstracta Item
 * Otorga mayor ataque a la unidad que lo posea.
 * Disminuye su defensa por cargar este Item.
 */
public class Puñal extends Item {

	private static double ATAQUE  = 3;
	private static double DEFENSA = 3;

	/* (non-Javadoc)
	 * @see rpg.Item#aplicarEfecto(rpg.Unidad)
	 */
	@Override
	public void aplicarEfecto(Unidad u) {
		u.aumentarBonusAtaque(ATAQUE);
		u.disminuirBonusDefensa(DEFENSA);
		u.agregarItem(this);
	}

	/* (non-Javadoc)
	 * @see rpg.Item#quitarEfecto(rpg.Unidad)
	 */
	@Override
	public void quitarEfecto(Unidad u) {
		u.disminuirBonusAtaque(ATAQUE);
		u.aumentarBonusDefensa(DEFENSA);
		u.quitarItem(this);
	}

}
