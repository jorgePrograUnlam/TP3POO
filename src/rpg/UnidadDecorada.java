package rpg;

/**
 *  Clase abstracta UnidadDecorada. Tiene como subclases: UnidadPuñal, UnidadEscudo, UnidadCapa, pocionDeAgua y UnidadPaqueteFlecha
 */
public abstract class UnidadDecorada extends Unidad{

	protected Unidad unidadDecorada;

	public UnidadDecorada(Unidad u) {
		super(u);
		this.unidadDecorada = u;
	}
	
	@Override
	public void ataca(Unidad otraUnidad) {
		unidadDecorada.ataca(otraUnidad);
		
	}

	@Override
	public boolean puedeAtacar(Unidad otraUnidad) {
		return unidadDecorada.puedeAtacar(otraUnidad);
	}

	public Unidad getUnidad() {
		return unidadDecorada;
	}
	
	@Override
	public void tomarPocionDeAgua() {
		unidadDecorada.tomarPocionDeAgua();
		
	}

}
