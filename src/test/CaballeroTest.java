package test;

import org.junit.Test;

import org.junit.Assert;

import rpg.Arquero;
import rpg.Caballero;
import rpg.Escudo;
import rpg.Lancero;
import rpg.PocionDeAgua;
import rpg.Puñal;
import rpg.Soldado;

public class CaballeroTest {

	@Test
	public void queCreaUnCaballero() {
		Caballero cab = new Caballero();
		Assert.assertEquals(200, cab.getSalud(), 0);
		Assert.assertEquals(50, cab.getAtaque(), 0);
	}

	@Test
	public void queAtacaSiEstaASuAlcance() {
		Caballero cab = new Caballero(3);
		Soldado sol = new Soldado(4);
		cab.ataca(sol);
		Assert.assertEquals(150, sol.getSalud(), 0);
	}

	@Test
	public void queNoAtacaSiNoEstaASuAlcance() {
		Caballero cab = new Caballero(3);
		Soldado sol = new Soldado(6);
		cab.ataca(sol);
		Assert.assertEquals(200, sol.getSalud(), 0);
	}

	@Test
	public void queAumentaDefensaConEscudo() {
		Caballero cab = new Caballero(3);
		Soldado sol = new Soldado(4);
		cab.agarrarItem(new Escudo());
		sol.ataca(cab);
		Assert.assertEquals(196, cab.getSalud(), 0);
	}

	@Test
	public void queAumentaAtaqueConPuñal() {
		Caballero cab = new Caballero(3);
		Soldado sol = new Soldado(4);
		cab.agarrarItem(new Puñal());
		cab.ataca(sol);
		Assert.assertEquals(147, sol.getSalud(), 0);
	}

	@Test
	public void queSuCaballoSePoneRebelde() {
		Caballero cab = new Caballero(1);
		Soldado sol = new Soldado(2);
		Lancero lan = new Lancero(2);
		Arquero arq = new Arquero(2);
		cab.ataca(sol);
		Assert.assertEquals(150, sol.getSalud(), 0);
		cab.ataca(lan);
		Assert.assertEquals(100, lan.getSalud(), 0);
		cab.ataca(arq);
		Assert.assertEquals(0, arq.getSalud(), 0);
		cab.ataca(sol);
		Assert.assertEquals(150, sol.getSalud(), 0);//se puso rebelde. No puede atacar
	}

	@Test
	public void queCaballoSeCalmaConPocionDeAgua(){
		Caballero cab = new Caballero(1);
		Soldado sol = new Soldado(2);
		Lancero lan = new Lancero(2);
		Arquero arq = new Arquero(2);
		cab.ataca(sol);
		cab.ataca(lan);
		cab.ataca(arq);
		cab.ataca(sol);
		Assert.assertEquals(150, sol.getSalud(), 0);//se puso rebelde. No puede atacar
		cab.agarrarItem(new PocionDeAgua());
		cab.ataca(sol);
		Assert.assertEquals(100, sol.getSalud(), 0);//se calmo. Puede atacar
	}
}
