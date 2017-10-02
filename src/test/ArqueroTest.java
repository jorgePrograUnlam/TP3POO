package test;

import org.junit.Assert;
import org.junit.Test;

import rpg.Arquero;
import rpg.PaqueteFlecha;
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

		arq.ataca(sold);

		Assert.assertTrue(200 == sold.getSalud());

	}

	@Test
	public void arqueroAtacaEnRango() {
		Arquero arq = new Arquero(0);
		Soldado sold = new Soldado(3);

		arq.ataca(sold);

		Assert.assertTrue(195 == sold.getSalud());

	}

	@Test
	public void queRecargaFlechas() {
		Arquero arq = new Arquero(0);
		Soldado sold = new Soldado(3);
		for (int i = 0; i < 20; i++) {
			arq.ataca(sold);
		}
		Assert.assertEquals(100, sold.getSalud(), 0);
		Assert.assertEquals(0,arq.getFlechas());
		arq.agarrarItem(new PaqueteFlecha());
		Assert.assertEquals(6,arq.getFlechas());
		
	}

}
