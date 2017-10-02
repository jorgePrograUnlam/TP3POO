package rpg;

/**
 * La Clase Caballero.
 */
public class Caballero extends Unidad {
	
	private static final double SALUD_INICIAL = 200;
	
	private static final double DAÑO_INICIAL = 50;
	
	private static final int DISTANCIA_MINIMA = 1;
	
	private static final int DISTANCIA_MAXIMA = 2;

	private Caballo caballo;

	/**
	 * Crea un caballero en la posicion 0
	 */
	public Caballero() {
		super(SALUD_INICIAL, DAÑO_INICIAL, 0);
		caballo = new Caballo();
	}
	
	/**
	 * Crea un caballero en una posicion 
	 *
	 * @param posicion la posicion donde se encuentra
	 */
	public Caballero(int posicion) {
		super(SALUD_INICIAL, DAÑO_INICIAL, posicion);
		caballo = new Caballo();
	}

	/**
	 * Calmar el caballo del caballero.
	 */
	public void calmarCaballo() {
		caballo.calmarse();
	}

	/* (non-Javadoc)
	 * @see rpg.Unidad#ataca(rpg.Unidad)
	 */
	@Override
	public void ataca(Unidad u) {
		int distancia = getDistancia(u); 
		
		if ( distancia >= DISTANCIA_MINIMA &&
			 distancia <= DISTANCIA_MAXIMA &&
			 !caballo.estaRebelde() 		  ) {
	
			u.recibirDaño(getAtaque());
			caballo.recibirAtaque();
		}

	}


}
