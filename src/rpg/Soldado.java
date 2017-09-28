package rpg;
public class Soldado extends Unidad {

	private int energia;

	private static final int ENERGIA_INICIAL = 100;
	private static final double SALUD_INICIAL = 200;
	private static final double DAÑO_INICIAL = 10;

	public Soldado() {
		super(SALUD_INICIAL, DAÑO_INICIAL, 0);
		energia = ENERGIA_INICIAL;
	}

	public Soldado(int posicion) {
		super(SALUD_INICIAL, DAÑO_INICIAL, posicion);
		energia = ENERGIA_INICIAL;
	}


	public void restaurarEnergia() {
		energia = ENERGIA_INICIAL;

	}

	public void multiplicarEnergia(int valor) {
		energia *= valor;
	}

	@Override
	public void ataca(Unidad u) {
		if (energia > 0 && energia <= 100) {
			energia -= 10;
			if (u instanceof Soldado)
				u.recibirDaño(getAtaque());
		}
	}

	public int getEnergia() {
		return energia;
	}


}
