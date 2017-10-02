package rpg;

/**
 * La Clase Item.
 */
public abstract class Item {

	/**
	 * Aplica el efecto de un item
	 *
	 * @param u sobre la unidad u.
	 */
	public abstract void aplicarEfecto(Unidad u);

	/**
	 * Quitar efecto de un item
	 *
	 * @param u sobre la unidad u.
	 */
	public abstract void quitarEfecto(Unidad u);

}
