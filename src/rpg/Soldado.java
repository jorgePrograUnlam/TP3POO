package rpg;

/**
 * La Clase Soldado.
 */
public class Soldado extends Unidad {

	/** energia para atacar. */
	private int energia;

	/** Constante ENERGIA_INICIAL. */
	private static final int ENERGIA_INICIAL = 100;
	
	/** Constante SALUD_INICIAL. */
	private static final double SALUD_INICIAL = 200;
	
	/** Constante DAÑO_INICIAL. */
	private static final double DAÑO_INICIAL = 10;

	/**
	 * constructor de soldado sin parametros
	 * deja al soldado en la posicion 0.
	 */
	public Soldado() {
		super(SALUD_INICIAL, DAÑO_INICIAL, 0);
		energia = ENERGIA_INICIAL;
	}

	/**
	 * constructor de saoldado con parametros
	 * crea un soldado con una posicion.
	 *
	 * @param posicion posicion donde se encuentra el soldado
	 */
	public Soldado(int posicion) {
		super(SALUD_INICIAL, DAÑO_INICIAL, posicion);
		energia = ENERGIA_INICIAL;
	}

	/**
	 * Restaura la energia a su valor inicial
	 */
	public void restaurarEnergia() {
		energia = ENERGIA_INICIAL;
	}

	/**
	 * Restaura el daño a su valor inicial
	 */
	public void restaurarDaño() {
		this.daño = DAÑO_INICIAL;
	}

	/**
	 * Multiplica energia
	 *
	 * @param valor multiplicador
	 */
	public void multiplicarEnergia(int valor) {
		energia *= valor;
		//	if(energia>100)
		//		energia=100;
	}

	/**
	 * Restar mitad de energia.
	 *
	 * @param valor the valor
	 */
	public void dividirEnergia(int valor) {
		energia /= valor;
	}



	/* (non-Javadoc)
	 * @see rpg.Unidad#ataca(rpg.Unidad)
	 */
	@Override
	public void ataca(Unidad u) {
		if (energia > 0 && energia <= 100) {
			energia -= 10;
			//if (u instanceof Soldado)
				u.recibirDaño(getAtaque());
		}
	}

	/**
	 * obtener la energia.
	 *
	 * @return la energia del soldado
	 */
	public int getEnergia() {
		return energia;
	}

}
