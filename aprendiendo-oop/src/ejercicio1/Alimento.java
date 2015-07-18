package ejercicio1;

public abstract class Alimento {
	protected abstract int getEnergiaConsumida();

	public void consumirse(WonderBoy WB) {
		WB.setEnergia(WB.getEnergia() + this.getEnergiaConsumida());
	}
}