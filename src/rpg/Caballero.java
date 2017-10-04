package rpg;

/**
 * La Clase Caballero. Hereda de la clase unidad
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

	/**
	 * depende de la distancia entre atacante y el atacado
	 * y del estado del caballo
	 * @param u es la unidad a la cual se quiere atacar
	 * @return boolean devuelve true si puede atacar, false si no.
	 */
	@Override
	public boolean puedeAtacar(Unidad u) {
		int distancia = getDistancia(u); 	
		return distancia >= DISTANCIA_MINIMA &&distancia <= DISTANCIA_MAXIMA &&!caballo.estaRebelde();
	}
	/* (non-Javadoc)
	 * @see rpg.Unidad#ataca(rpg.Unidad)
	 */
	@Override
	public void ataca(Unidad u) {
			u.recibirDaño(getAtaque());
			caballo.recibirAtaque();
	}

	@Override
	public void tomarPocionDeAgua() {
		calmarCaballo();
	}


}
