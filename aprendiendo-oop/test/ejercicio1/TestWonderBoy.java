package ejercicio1;

import junit.framework.Assert;

import org.junit.Test;

public class TestWonderBoy {
	@Test
	public void ConstructorVidaYEnergia() {
		WonderBoy Fede = new WonderBoy(20,30);
		Assert.assertEquals(Fede.getEnergia(), 30);
		Assert.assertEquals(Fede.getVida(), 20);
	}
}
