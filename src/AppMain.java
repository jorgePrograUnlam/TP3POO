import rpg.Escudo;
import rpg.PocionDeAgua;
import rpg.Soldado;

public class AppMain {

	public static void main(String[] args) {
				
		// Probando soldado
		Soldado s1 = new Soldado(0);
		Soldado s2 = new Soldado(0);

		System.out.println(s2.getSalud());			//200

		s1.atacar(s2);
		System.out.println(s2.getSalud());			//190

		// Probando 1 Item Escudo
		Escudo escudo = new Escudo();

		s2.agarrarItem(escudo);

		s1.atacar(s2); //10*0.4=4  quito 4 daño
		System.out.println(s2.getSalud());			//186

		// Probando 2 Item Escudo
		Escudo escudo2 = new Escudo();

		s2.agarrarItem(escudo2);//

		s1.atacar(s2);// (10*0.4=4)*0.4=1.6 quito 1.6 daño 
		System.out.println(s2.getSalud());			//184.4
		
		System.out.println(s1.getEnergia());//ataco 3 veces

		// Probando pocion de agua
		PocionDeAgua p = new PocionDeAgua();

		s1.agarrarItem(p);
		System.out.println(s1.getEnergia());		//100

		// Probando tirar Items
		s2.tirarItem(escudo);

		s1.atacar(s2); //quito 4						//180.4
		System.out.println(s2.getSalud());//tiro un escudo. disminuye defensa

		s2.tirarItem(escudo2);						
		s1.atacar(s2); //quito 10
		System.out.println(s2.getSalud());			//170.4
	}

}
