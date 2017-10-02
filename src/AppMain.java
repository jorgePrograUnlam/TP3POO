import rpg.Escudo;
import rpg.PocionDeAgua;
import rpg.Soldado;

public class AppMain {

	public static void main(String[] args) {
		// Probando soldado
		Soldado s1 = new Soldado(0);
		Soldado s2 = new Soldado(0);

		System.out.println(s2.getSalud());

		s1.ataca(s2);
		System.out.println(s2.getSalud());

		// Probando 1 Item Escudo
		Escudo escudo = new Escudo();

		s2.agarrarItem(escudo);

		s1.ataca(s2);
		System.out.println(s2.getSalud());

		// Probando 2 Item Escudo
		Escudo escudo2 = new Escudo();

		s2.agarrarItem(escudo2);//defensa de s2 0.8

		s1.ataca(s2);//recibo solo 2 ptos
		System.out.println(s2.getSalud());
		
		System.out.println(s1.getEnergia());//ataco 3 veces

		// Probando pocion de agua
		PocionDeAgua p = new PocionDeAgua();

		s1.agarrarItem(p);
		System.out.println(s1.getEnergia());

		// Probando tirar Items
		s2.tirarItem(escudo);

		s1.ataca(s2);
		System.out.println(s2.getSalud());//tiro un escudo. disminuye defensa

		s2.tirarItem(escudo2);
		s1.ataca(s2);
		System.out.println(s2.getSalud());
	}

}
