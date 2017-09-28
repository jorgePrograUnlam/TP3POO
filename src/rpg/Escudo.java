package rpg;
public class Escudo extends Item {

	private static final double AUMENTA_DEFENSA = 0.4;

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
