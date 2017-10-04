import rpg.UnidadEscudo;
import rpg.Soldado;
import rpg.Unidad;

public class AppMain {

	public static void main(String[] args) {
				
		// Probando soldado
		Soldado s1 = new Soldado(0);
		Unidad s2 = new Soldado(0);

		System.out.println(s2.getSalud());			//200

		s1.atacar(s2);
		System.out.println(s2.getSalud());			//190

		// Probando 1 UnidadDecorada UnidadEscudo
		s2 = new UnidadEscudo(s2);

		s1.atacar(s2); //10*0.4=4  quito 4 daño
		System.out.println(s2.getSalud());			//186

		// Probando 2 UnidadDecorada UnidadEscudo
		s2 = new UnidadEscudo(s2);

		s1.atacar(s2);// (10*0.4=4)*0.4=1.6 quito 1.6 daño 
		System.out.println(s2.getSalud());			//184.4
		
		System.out.println(s1.getEnergia());//ataco 3 veces

		// Probando pocion de agua
		s1.tomarPocionDeAgua();
		System.out.println(s1.getEnergia());		//100

	}

}
