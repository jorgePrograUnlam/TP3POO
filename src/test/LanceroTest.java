package test;

import org.junit.Test;

import org.junit.Assert;

import rpg.UnidadEscudo;
import rpg.Lancero;
import rpg.UnidadPuñal;
import rpg.Soldado;
import rpg.Unidad;

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
		Unidad lan=new Lancero();
		Soldado sol=new Soldado(50);
		lan = new UnidadEscudo(lan);
		sol.atacar(lan);
		Assert.assertEquals(146,lan.getSalud(),0);		
	}
	
	@Test
	public void queAumentaAtaqueConPuñal(){
		Unidad lan=new Lancero();
		Soldado sol=new Soldado(2);
		lan = new UnidadPuñal(lan);
		lan.atacar(sol);
		Assert.assertEquals(172, sol.getSalud(),0);
	}
	
	@Test
	public void queDisminuyeDefensaConPuñal(){
		Unidad lan=new Lancero();
		Soldado sol=new Soldado(5);
		lan = new UnidadPuñal(lan);
		sol.atacar(lan);
		Assert.assertEquals(137, lan.getSalud(),0);
	}
	
	@Test
	public void queUtilizaEscudoYPuñal(){
		Unidad lan=new Lancero();
		Soldado sol=new Soldado(2);
		lan = new UnidadEscudo(new UnidadPuñal(lan));
		//lan.agarrarItem(new UnidadPuñal());
		sol.atacar(lan);
		Assert.assertEquals(143,lan.getSalud(),0);
	}
	
}
