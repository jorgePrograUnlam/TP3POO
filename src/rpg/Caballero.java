package rpg;
public class Caballero extends Unidad {

	private Caballo caballo;

	public Caballero(int salud, int daño, int posicion) {
		super(salud, daño, posicion);
		// TODO Auto-generated constructor stub
	}

	public void calmarCaballo() {
		caballo.calmarse();
	}

	@Override
	public void ataca(Unidad u) {
		// TODO Auto-generated method stub

	}

	@Override
	public void agregarItem(Item i) {
		// TODO Auto-generated method stub

	}

}
