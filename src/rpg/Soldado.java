package rpg;

/**
 * La Clase Soldado. Hereda de la clase abstracta Unidad.
 */
public class Soldado extends Unidad {

	private static final int ENERGIA_INICIAL = 100;
	
	private static final double SALUD_INICIAL = 200;
	
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
	 * constructor de soldado con parametros
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
	 * Multiplica energia
	 *
	 * @param valor Es el valor a multiplicar
	 */
	@Override
	public void multiplicarEnergia(int valor) {
		energia *= valor;
	}

	/**
	 * Restar mitad de energia.
	 *
	 * @param valor Es el valor que se le restara a la energia
	 */
	public void dividirEnergia(int valor) {
		energia /= valor;
	}

	/**
	 * depende del atributo energia del objeto
	 *
	 * @param u Es la unidad a la cual quiere atacar
	 * @return boolean devuelve true si puede atacar, false si no.
	 */
	@Override
	public boolean puedeAtacar(Unidad u) {
		return energia >= 10;
	}
	
	
	/* (non-Javadoc)
	 * @see rpg.Unidad#ataca(rpg.Unidad)
	 */
	@Override
	public void ataca(Unidad u) {
			energia -= 10;
			u.recibirDaño(getAtaque());
	}


	@Override
	public void tomarPocionDeAgua() {
		restaurarEnergia();
		
	}



}
