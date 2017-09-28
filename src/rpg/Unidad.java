package rpg;
import java.util.LinkedList;

public abstract class Unidad {

	protected LinkedList<Item> items;

	private double salud;

	private double defensa;

	protected double ataque;

	protected double daño;

	private int posicion;

	public Unidad(double salud, double daño, int posicion) {
		this.items = new LinkedList<Item>();
		this.salud = salud;
		this.defensa = 0;
		this.ataque = 0;
		this.daño = daño;
		this.posicion = posicion;
	}

	public int getDistancia(Unidad o) {
		return Math.abs(posicion - o.posicion);
	}

	public abstract void ataca(Unidad u);

	public void aumentarDefensa(double n) {
		if (defensa + n < 1)
			defensa += n;
	}

	public void disminuirDefensa(double n) {
		defensa -= n;
	}

	public void aumentarAtaque(double n) {
		ataque += n;
	}

	public void aumentarDaño(double n) {
		daño += daño;
	}

	public void recibirDaño(double n) {
		salud -= n - (n * defensa);
	}

	public void agarrarItem(Item i) {
		i.aplicarEfecto(this);
	}

	public void agregarItem(Item i) {
		items.add(i);
	}

	public void tirarItem(Item i) {
		i.quitarEfecto(this);
	}

	public void quitarItem(Item i) {
		items.remove(i);
	}

	public double getSalud() {
		return salud;
	}

	public double getAtaque() {
		return daño + (daño * ataque);
	}

}
