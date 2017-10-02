package rpg;

/**
 * La Clase Lancero.
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
	 * @param posicion la posicion donde estara
	 */
	public Lancero(int posicion) {
		super(SALUD_INICIAL, DAÑO_INICIAL, posicion);
		
	}

	/* (non-Javadoc)
	 * @see rpg.Unidad#ataca(rpg.Unidad)
	 */
	@Override
	public void ataca(Unidad u) {
		int distancia = getDistancia(u); 
		
		if ( distancia >= DISTANCIA_MINIMA && 
			 distancia <= DISTANCIA_MAXIMA    ) {
				u.recibirDaño(getAtaque());
		}

	}


}
