package test;

import org.junit.Assert;
import org.junit.Test;

import rpg.UnidadCapa;
import rpg.UnidadEscudo;
import rpg.Soldado;
import rpg.Unidad;

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
		Unidad uno=new Soldado(0);
		Unidad otro=new Soldado(0);
		otro = new UnidadEscudo(otro);
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
		uno.tomarPocionDeAgua();
		Assert.assertEquals(100,uno.getEnergia(),0);
	}
	
	@Test
	public void queDuplicaEnergiaConCapa(){
		Unidad uno=new Soldado(0);
		Unidad otro=new Soldado(0);
		Assert.assertEquals(100,uno.getEnergia(),0);
		for(int i=0;i<5;i++)
			uno.atacar(otro);
		Assert.assertEquals(50, uno.getEnergia(),0);
		uno = new UnidadCapa(uno);
		Assert.assertEquals(100,uno.getEnergia(),0 );
		Assert.assertEquals(9,uno.getAtaque(),0);		

	}
	
	@Test
	public void queReduceAtaqueConCapa(){
		Unidad uno=new Soldado(0);
		Soldado otro=new Soldado(0);
		uno = new UnidadCapa(uno);
		uno.atacar(otro);
		Assert.assertEquals(9, uno.getAtaque(),0);
		Assert.assertEquals(191,otro.getSalud(),0);
	}
	
	
}
