package rpg;

/**
 * La Clase PocionDeAgua. Hereda de la clase abstracta Item
 * solo actua sobre la unidad del tipo soldado y caballero
 * Si es un Soldado, le restaura su energia
 * Si es una Caballero, calma a su caballo
 */
public class PocionDeAgua extends Item {

	/* (non-Javadoc)
	 * @see rpg.Item#aplicarEfecto(rpg.Unidad)
	 */
	@Override
	public void aplicarEfecto(Unidad u) {
		if (u instanceof Soldado) {
			Soldado s = (Soldado) u;
			s.restaurarEnergia();
		}

		if (u instanceof Caballero) {
			((Caballero) u).calmarCaballo();
		}

	}

	/* (non-Javadoc)
	 * @see rpg.Item#quitarEfecto(rpg.Unidad)
	 */
	@Override
	public void quitarEfecto(Unidad u) {

	}

}
