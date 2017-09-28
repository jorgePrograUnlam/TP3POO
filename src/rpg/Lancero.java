package rpg;
public class Lancero extends Unidad {

	private int flechas;

	private static final int FLECHAS_INICIAL = 20;

	public Lancero(int salud, int daño, int posicion) {
		super(salud, daño, posicion);
		flechas = FLECHAS_INICIAL;
	}

	public void recargarFlechas(Item i) {
		PaqueteFlecha pf =(PaqueteFlecha) i;
		if (pf.getCantidadFlechas() == 6) {
			flechas += 6;
		}
			
	}


	@Override
	public void ataca(Unidad u) {
		// TODO Auto-generated method stub

	}


}
