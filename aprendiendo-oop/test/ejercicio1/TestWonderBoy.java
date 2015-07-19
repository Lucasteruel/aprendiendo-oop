package ejercicio1;

import junit.framework.Assert;

import org.junit.Before;
import org.junit.Test;

public class TestWonderBoy {
	private WonderBoy Fede;
	
	@Before
	public void init() {
		this.Fede = new WonderBoy(20,30);
	}
	
	@Test
	public void ConstructorVidaYEnergia() {
		Assert.assertEquals(this.Fede.getEnergia(), 30);
		Assert.assertEquals(this.Fede.getVida(), 20);
	}
	@Test
	public void Come2Manzanas(){
		for (int i = 0; i < 2;i++) {
			this.Fede.comer(new Manzana());
		}
		Assert.assertEquals(this.Fede.getEnergia(), 38);
	}
	@Test
	public void TomaLecheCortada(){
		this.Fede.comer(new LecheCortada());
		Assert.assertEquals(this.Fede.getEnergia(), 28);
	}
}
