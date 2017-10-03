package rpg;

/**
 *  Clase abstracta Item. Tiene como subclases: Puñal, Escudo, Capa, pocionDeAgua y PaqueteFlecha
 */
public abstract class Item {

	/**
	 * Aplica el efecto de un item. Varia dependiendo de que subclase es
	 *
	 * @param u unidad a la que se le va a aplicar el efecto por obtener el item.
	 */
	public abstract void aplicarEfecto(Unidad u);

	/**
	 * Quitar efecto de un item. Varia dependiendo de que subclase es
	 *
	 * @param u unidad a la que se le quitara el efecto por haberle retirado el item.
	 */
	public abstract void quitarEfecto(Unidad u);

}
