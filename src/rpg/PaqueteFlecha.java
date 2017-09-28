package rpg;
public class PaqueteFlecha extends Item {

	private int cantidad;

	public PaqueteFlecha(int cantidad) {
		this.cantidad = cantidad;
	}

	public int obtenerCantidadDeFlechas() {
		return 0;
	}

	@Override
	public void aplicarEfecto(Unidad u) {
		// TODO Auto-generated method stub

	}

	@Override
	public void quitarEfecto(Unidad u) {
		// TODO Auto-generated method stub

	}

	public int getCantidadFlechas() {
		return cantidad;
	}

}
