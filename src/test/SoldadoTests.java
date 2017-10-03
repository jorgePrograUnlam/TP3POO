package test;

import org.junit.Assert;
import org.junit.Test;

import rpg.Capa;
import rpg.Escudo;
import rpg.PocionDeAgua;
import rpg.Soldado;

public class SoldadoTests {
	@Test
	public void queInicializaSoldado(){
		Soldado uno=new Soldado();
		Assert.assertEquals(100,uno.getEnergia(),0);
		Assert.assertEquals(200,uno.getSalud(),0);
		Assert.assertEquals(10, uno.getAtaque(),10);
	}
	
	@Test
	public void queRestaSaludAlAtacado(){
		Soldado uno=new Soldado(0);
		Soldado otro=new Soldado(0);
		uno.atacar(otro);
		Assert.assertEquals(190,otro.getSalud(),0);
		uno.atacar(otro);
		Assert.assertEquals(180, otro.getSalud(),0);
		for(int i=0;i<8;i++){
			uno.atacar(otro);
		}
		Assert.assertEquals(100,otro.getSalud(),0);
	}
	
	@Test
	public void queRestaEnergiaCuandoAtaca(){
		Soldado uno=new Soldado(0);
		Soldado otro=new Soldado(0);
		for(int i =0;i<20;i++){
			uno.atacar(otro);
		}
		Assert.assertEquals(0, uno.getEnergia(),0);
		Assert.assertEquals(100,otro.getSalud(),0);
		uno.atacar(otro);		
		Assert.assertEquals(0,uno.getEnergia(),0);

	}

	@Test
	public void queAumentaDefensaCuandoAgarraEscudo(){
		Soldado uno=new Soldado(0);
		Soldado otro=new Soldado(0);
		otro.agarrarItem(new Escudo());
		uno.atacar(otro);
		Assert.assertEquals(196, otro.getSalud(),0);//de 10 recibe el 40%.. recibe 4		
	}
	
	@Test
	public void queRecuperaEnergiaConPocion(){
		Soldado uno=new Soldado(0);
		Soldado otro=new Soldado(0);
		for(int i=0;i<10;i++)
			uno.atacar(otro);
		Assert.assertEquals(0,uno.getEnergia(),0);
		uno.agarrarItem(new PocionDeAgua());
		Assert.assertEquals(100,uno.getEnergia(),0);
	}
	
	@Test
	public void queDuplicaEnergiaConCapa(){
		Soldado uno=new Soldado(0);
		Soldado otro=new Soldado(0);
		Assert.assertEquals(100,uno.getEnergia(),0);
		for(int i=0;i<5;i++)
			uno.atacar(otro);
		Assert.assertEquals(50, uno.getEnergia(),0);
		uno.agarrarItem(new Capa());
		Assert.assertEquals(100,uno.getEnergia(),0 );
		Assert.assertEquals(9,uno.getAtaque(),0);		

	}
	
	@Test
	public void queReduceAtaqueConCapa(){
		Soldado uno=new Soldado(0);
		Soldado otro=new Soldado(0);
		uno.agarrarItem(new Capa());
		uno.atacar(otro);
		Assert.assertEquals(9, uno.getAtaque(),0);
		Assert.assertEquals(191,otro.getSalud(),0);
	}
	
	@Test
	public void quRetiraEfectosAlTirarCapa(){
		Soldado uno=new Soldado();
		Capa capa=new Capa();
		uno.agarrarItem(capa);
		Assert.assertEquals(9, uno.getAtaque(),0);
		Assert.assertEquals(200, uno.getEnergia(),0);
		uno.tirarItem(capa);
		Assert.assertEquals(10, uno.getAtaque(),0);
		Assert.assertEquals(100, uno.getEnergia(),0);
	}
	
}
