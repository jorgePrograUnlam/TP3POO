package rpg;

/**
 * La Clase PaqueteFlecha. Hereda de la clase abstracta Item
 * Aplica solamente a la unidad del tipo Arquero
 * recarga la cantidad de flechas por defecto
 */
public class PaqueteFlecha extends Item {
	
	private static final int FLECHAS_POR_DEFECTO = 6;

	private int cantidad;

	/**
	 * crea un paquete con una cantidad de flechas por defecto
	 */
	public PaqueteFlecha() {
		this.cantidad = FLECHAS_POR_DEFECTO;
	}
	
	/**
	 * crea un paquete de flechas con una cantidad prestablecida
	 *
	 * @param cantidad la cantidad de flechas dentro del paquete
	 */
	public PaqueteFlecha(int cantidad) {
		this.cantidad = cantidad;
	}


	/* (non-Javadoc)
	 * @see rpg.Item#aplicarEfecto(rpg.Unidad)
	 */
	@Override
	public void aplicarEfecto(Unidad u) {
		if (u instanceof Arquero) {
			((Arquero) u).recargarFlechas(this);
		}

	}

	/* (non-Javadoc)
	 * @see rpg.Item#quitarEfecto(rpg.Unidad)
	 */
	@Override
	public void quitarEfecto(Unidad u) {
		

	}

	/**
	 * obtener la cantidad flechas.
	 *
	 * @return la cantidad de flechas del paquete.
	 */
	public int getCantidadFlechas() {
		return cantidad;
	}

}
