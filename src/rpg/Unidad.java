package rpg;

/**
 * La clase Abstracta Unidad. Tiene como subclases: Soldado, Guerrero, Caballero y Lancero
 */
public abstract class Unidad {

	protected double salud;

	private double defensa;
	
	private double bonusDefensa;

	protected double ataque;
	
	private double bonusAtaque;

	protected double daño;
	
	protected int energia; 

	private int posicion;

	
	public Unidad (Unidad u) {
		this.salud = u.salud;
		this.defensa = u.defensa;
		this.bonusDefensa = u.bonusDefensa;
		this.ataque = u.ataque;
		this.bonusAtaque = u.bonusAtaque;
		this.daño = u.daño;
		this.posicion = u.posicion;
		this.energia = u.energia;
		
	}
	
	/**
	 * Crea una unidad con parametros.
	 *
	 * @param salud la salud
	 * @param daño el daño
	 * @param posicion la posicion
	 */
	public Unidad(double salud, double daño, int posicion) {
		this.salud = salud;
		this.defensa = 1;
		this.bonusDefensa = 0;
		this.ataque = 1;
		this.bonusAtaque = 0;
		this.daño = daño;
		this.posicion = posicion;
	}

	/**
	 * Obtener la distancia a otro unidad.
	 *
	 * @param o otra unidad
	 * @return la distancia a otra unidad
	 */
	public int getDistancia(Unidad o) {
		return Math.abs(posicion - o.posicion);
	}
	
	/**
	 * Template Method
	 * permite que cada tipo de unidad implemente 
	 * los metodos puedeAtacar y ataca
	 * de manera distinta
	 * @param u unidad que va a ser atacada
	 */
	public void atacar(Unidad u){
		if(puedeAtacar(u))
			ataca(u);
	}

	/**metodo que se utiliza dentro del metodo atacar
	 * Ataca a otra unidad. Su implementacion depende del tipo de unidad
	 *
	 * @param otraUnidad la unidad que recibe el ataque
	 */
	public abstract void ataca(Unidad otraUnidad);
	
	/**
	 * metodo que se utiliza dentro del metodo atacar
	 * @param otraUnidad unidad a la cual quiere atacar
	 * @return boolean que indica si puede atacar o no
	 */
	public abstract boolean puedeAtacar(Unidad otraUnidad);

	/**
	 * Aumentar la defensa porcentual contra ataques.
	 *
	 * @param n porcentaje a aumentar
	 */
	public void aumentarDefensaPorcentual(double n) {
		defensa *= n;
	}

	/**
	 * Disminuir la defensa porcentual contra ataques.
	 *
	 * @param n porcentaje a disminuir
	 */
	public void disminuirDefensaPorcentual(double n) {
		defensa /= n;
	}
	
	/**
	 * Aumentar el ataque porcentual del daño
	 *
	 * @param n cantidad a aumentar
	 */
	public void aumentarAtaquePorcentual(double n) {
			ataque *= n;
	}
	
	/**
	 * Disminuye el ataque porcentual del daño
	 *
	 * @param n cantidad a disminuir
	 */
	public void disminuirAtaquePorcentual(double n) {
			ataque /= n;
	}

	
	/**
	 * Aumentar bonus defensa.
	 *
	 * @param n defensa
	 */
	public void aumentarBonusDefensa(double n) {
		bonusDefensa += n;
	}
	
	/**
	 * Disminuir bonus defensa.
	 *
	 * @param n defensa
	 */
	public void disminuirBonusDefensa(double n) {
		bonusDefensa -= n;
	}
	
	/**
	 * Aumentar bonus ataque.
	 *
	 * @param n ataque
	 */
	public void aumentarBonusAtaque(double n) {
		bonusAtaque += n;
	}
	
	/**
	 * Disminuir bonus ataque.
	 *
	 * @param n ataque
	 */
	public void disminuirBonusAtaque(double n) {
		bonusAtaque -= n;
	}

	/**
	 * Recibir daño de un ataque.
	 *
	 * @param n ataque del enemigo
	 */
	public void recibirDaño(double n) {
		salud -= (n * defensa) - bonusDefensa;
	}
	
	/**
	 * Obtener el ataque en base al daño
	 *
	 * @return el ataque que tiene la unidad
	 */
	public double getAtaque() {
		return (daño * ataque) + bonusAtaque;
	}

	
	/**
	 * Obtener la salud.
	 *
	 * @return la salud de la unidad
	 */
	public double getSalud() {
		return salud;
	}
	
	
	/**
	 * Multiplica energia
	 *
	 * @param valor Es el valor a multiplicar
	 */
	public void multiplicarEnergia(int valor) {
		energia *= valor;
	}

	/**
	 * Obtener la posicion de la unidad
	 * 
	 * @return devuelve la posicion donde se encuentra
	 */
	public int getPosicion() {
		return posicion;
	}
	
	/**
	 * obtener la energia.
	 *
	 * @return la energia de la unidad
	 */
	public int getEnergia() {
		return energia;
	}
	
	public abstract void tomarPocionDeAgua();


}
