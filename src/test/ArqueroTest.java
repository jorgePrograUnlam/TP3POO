package test;

import org.junit.Assert;
import org.junit.Test;

import rpg.Arquero;
import rpg.Escudo;
import rpg.PaqueteFlecha;
import rpg.Puñal;
import rpg.Soldado;

public class ArqueroTest {

	@Test
	public void crearArquero() {

		Arquero arq = new Arquero(0);

		Assert.assertEquals(20, arq.getFlechas());
		Assert.assertEquals(50, arq.getSalud(), 0);
		Assert.assertEquals(5, arq.getAtaque(), 0);
		Assert.assertEquals(0, arq.getPosicion());

	}

	@Test
	public void arqueroAtacaFueraDeRango() {
		Arquero arq = new Arquero(0);
		Soldado sold = new Soldado(1);

		arq.atacar(sold);
		Assert.assertEquals(200,sold.getSalud(),0);
//		Assert.assertTrue(200 == sold.getSalud());

	}

	@Test
	public void arqueroAtacaEnRango() {
		Arquero arq = new Arquero(0);
		Soldado sold = new Soldado(3);

		arq.atacar(sold);

		Assert.assertTrue(195 == sold.getSalud());

	}

	@Test
	public void queRecargaFlechas() {
		Arquero arq = new Arquero(0);
		Soldado sold = new Soldado(3);
		for (int i = 0; i < 20; i++) {
			arq.atacar(sold);
		}
		Assert.assertEquals(100, sold.getSalud(), 0);
		Assert.assertEquals(0, arq.getFlechas());
		arq.agarrarItem(new PaqueteFlecha());
		Assert.assertEquals(6, arq.getFlechas());
	}
	
	@Test
	public void queNoPuedeAtacarSinFlechas(){
		Arquero arq = new Arquero(0);
		Soldado sold = new Soldado(3);
		for (int i = 0; i < 20; i++) {
			arq.atacar(sold);
		}
		Assert.assertEquals(0,arq.getFlechas());
		arq.atacar(sold);
		Assert.assertEquals(100,sold.getSalud(),0);
	}
	
	@Test
	public void queAumentaDefensaConEscudo(){
		Arquero arq = new Arquero(0);
		Soldado sold = new Soldado(3);
		arq.agarrarItem(new Escudo());
		sold.atacar(arq);
		Assert.assertEquals(46, arq.getSalud(),0);
	}
	
	@Test
	public void queAumentaAtaqueConPuñal(){
		Arquero arq = new Arquero(0);
		Soldado sold = new Soldado(3);
		arq.agarrarItem(new Puñal());
		arq.atacar(sold);
		Assert.assertEquals(8, arq.getAtaque(),0);
		Assert.assertEquals(192,sold.getSalud(),0);
	}

	@Test
	public void queDisminuyeDefensaConPuñal(){
		Arquero arq = new Arquero(0);
		Soldado sold = new Soldado(3);
		arq.agarrarItem(new Puñal());
		sold.atacar(arq);
		Assert.assertEquals(37, arq.getSalud(),0);	
	}
	
	@Test
	public void queUtilizaPuñalYEscudo(){
		Arquero arq = new Arquero(0);
		Soldado sold = new Soldado(3);
		arq.agarrarItem(new Escudo());
		arq.agarrarItem(new Puñal());
		sold.atacar(arq);
		Assert.assertEquals(43, arq.getSalud(),0.01);
	}
	
	
}
