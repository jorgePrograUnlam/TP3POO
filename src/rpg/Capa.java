package rpg;

public class Capa extends Item {

	private static final int MULTIPLICADOR_ENERGIA = 2;
	private static final double REDUCE_ATAQUE = 0.1;

	@Override
	public void aplicarEfecto(Unidad u) {
		if (u instanceof Soldado) {
			Soldado soldado = (Soldado) u;
			soldado.reduceFuerzaDeDaño(REDUCE_ATAQUE);//daño!=ataque?
			soldado.multiplicarEnergia(MULTIPLICADOR_ENERGIA);
			soldado.agregarItem(this);
			u = soldado;
		}
	}

	@Override
	public void quitarEfecto(Unidad u) {
		if (u instanceof Soldado) {
			Soldado soldado = (Soldado) u;
			soldado.restarMitadDeEnergia(MULTIPLICADOR_ENERGIA);
			soldado.restaurarDaño();
			soldado.quitarItem(this);
		}
	}

}
