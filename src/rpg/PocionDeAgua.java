package rpg;
public class PocionDeAgua extends Item {

	@Override
	public void aplicarEfecto(Unidad u) {
		if (u instanceof Soldado) {
			Soldado s = (Soldado) u;
			s.restaurarEnergia();
		}

		if (u instanceof Caballero) {
			((Caballero) u).calmarCaballo();
		}

	}

	@Override
	public void quitarEfecto(Unidad u) {
		// TODO Auto-generated method stub

	}

}
