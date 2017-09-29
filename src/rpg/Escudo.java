package rpg;
public class Escudo extends Item {

	private static final double AUMENTA_DEFENSA = 0.6;//este valor deberia ser 0.6
	//se recibira el 40% del ataque, por lo tanto su defensa es el 60% del ataque
	@Override
	public void aplicarEfecto(Unidad u) {
		u.aumentarDefensa(AUMENTA_DEFENSA);
		u.agregarItem(this);

	}

	@Override
	public void quitarEfecto(Unidad u) {
		u.disminuirDefensa(AUMENTA_DEFENSA);
		u.quitarItem(this);
	}

}
