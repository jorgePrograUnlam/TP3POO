package test;

import org.junit.Test;

import org.junit.Assert;

import rpg.Escudo;
import rpg.Lancero;
import rpg.Puñal;
import rpg.Soldado;

public class LanceroTest {
	
	@Test
	public void queSeCreaLancero(){
		Lancero lan=new Lancero();
		Assert.assertEquals(150, lan.getSalud(),0);
		Assert.assertEquals(25, lan.getAtaque(),0);
	}
	
	@Test
	public void queNoPuedeAtacarSiEstaFueraDeSuAlcance(){
		Lancero lan=new Lancero();
		Soldado sol=new Soldado(50);
		lan.atacar(sol);
		Assert.assertEquals(200, sol.getSalud(),0);	
	}
	
	@Test
	public void queAtacaSiEstaASuAlcance(){
		Lancero lan=new Lancero();
		Soldado sol=new Soldado(2);
		lan.atacar(sol);
		Assert.assertEquals(175,sol.getSalud(),0);
		
	}

	@Test
	public void queAumentaDefensaConEscudo(){
		Lancero lan=new Lancero();
		Soldado sol=new Soldado(50);
		lan.agarrarItem(new Escudo());
		sol.atacar(lan);
		Assert.assertEquals(146,lan.getSalud(),0);		
	}
	
	@Test
	public void queAumentaAtaqueConPuñal(){
		Lancero lan=new Lancero();
		Soldado sol=new Soldado(2);
		lan.agarrarItem(new Puñal());
		lan.atacar(sol);
		Assert.assertEquals(172, sol.getSalud(),0);
	}
	
	@Test
	public void queDisminuyeDefensaConPuñal(){
		Lancero lan=new Lancero();
		Soldado sol=new Soldado(5);
		lan.agarrarItem(new Puñal());
		sol.atacar(lan);
		Assert.assertEquals(137, lan.getSalud(),0);
	}
	
	@Test
	public void queUtilizaPuñalYEscudo(){
		Lancero lan=new Lancero();
		Soldado sol=new Soldado(2);
		lan.agarrarItem(new Escudo());
		lan.agarrarItem(new Puñal());
		sol.atacar(lan);
		Assert.assertEquals(143,lan.getSalud(),0);
	}
	
}
