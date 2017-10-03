package rpg;

/**
 * La Clase Lancero. Hereda de la clase abstracta Unidad
 */
public class Lancero extends Unidad {

	private static final double SALUD_INICIAL = 150;

	private static final double DAÑO_INICIAL = 25;

	private static final int DISTANCIA_MINIMA = 1;

	private static final int DISTANCIA_MAXIMA = 3;

	/**
	 * crea un lancero en la posicion 0
	 */
	public Lancero() {
		super(SALUD_INICIAL, DAÑO_INICIAL, 0);

	}

	/**
	 * crea un lancero en una posicion fijada
	 *
	 * @param posicion
	 *            la posicion donde estara
	 */
	public Lancero(int posicion) {
		super(SALUD_INICIAL, DAÑO_INICIAL, posicion);

	}
	
	
	/**
	 * depende de la distancia entre atacante y el atacado
	 *
	 * @param u es la unidad a la cual se quiere atacar
	 * @return boolean devuelve true si puede atacar, false si no.
	 */
	@Override
	public boolean puedeAtacar(Unidad u) {
		int distancia = getDistancia(u);
		return distancia >= DISTANCIA_MINIMA && distancia <= DISTANCIA_MAXIMA;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see rpg.Unidad#ataca(rpg.Unidad)
	 */
	@Override
	public void ataca(Unidad u) {
		u.recibirDaño(getAtaque());
	}

}
