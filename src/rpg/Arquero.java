package rpg;

/**
 * La Clase Arquero. Hereda de la clase abstracta Unidad
 */
public class Arquero extends Unidad {

	private static final double SALUD_INICIAL = 50;

	private static final double DAÑO_INICIAL = 5;

	private static final int FLECHAS_INICIAL = 20;

	private static final int RECARGA_FLECHAS = 6;

	private static final int DISTANCIA_MINIMA = 2;

	private static final int DISTANCIA_MAXIMA = 5;

	private int flechas;

	/**
	 * Constructor sin parametros lo deja en la posicion 0
	 */
	public Arquero() {
		super(SALUD_INICIAL, DAÑO_INICIAL, 0);
		flechas = FLECHAS_INICIAL;
	}

	/**
	 * Crea al arquero en una posicion
	 *
	 * @param posicion
	 *            la posicion donde se encuentra
	 */
	public Arquero(int posicion) {
		super(SALUD_INICIAL, DAÑO_INICIAL, posicion);
		flechas = FLECHAS_INICIAL;
	}

	/**
	 * Recargar flechas de un paquete de flechas
	 *
	 * @param pf
	 *            un paquete de flechas
	 */
	public void recargarFlechas(PaqueteFlecha pf) {
		if (pf.getFlehas() == RECARGA_FLECHAS)
			flechas+=6;
	}

	/**
	 * depende de la distancia entre atacante y el atacado
	 * y de la cantidad de flechas que posea el atacante	 *
	 * @param u es la unidad a la cual se quiere atacar
	 * @return boolean devuelve true si puede atacar, false si no.
	 */
	@Override
	public boolean puedeAtacar(Unidad u) {
		int distancia = getDistancia(u);
		return (distancia >= DISTANCIA_MINIMA && distancia <= DISTANCIA_MAXIMA && flechas > 0);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see rpg.Unidad#ataca(rpg.Unidad)
	 */
	@Override
	public void ataca(Unidad u) {
			flechas--;
			u.recibirDaño(getAtaque());
	}

	/**
	 * Obtener la cantidad de flechas del arquero
	 * 
	 * @return la cantidad de fechas que tiene el arquero
	 */
	public int getFlechas() {
		return flechas;
	}

	@Override
	public void tomarPocionDeAgua() {
		
	}

}
