package ejercicio1;

public abstract class Alimento {
	protected abstract int getEnergiaConsumida();

	public void consumirse(Personaje WB) {
		WB.setEnergia(WB.getEnergia() + this.getEnergiaConsumida());
	}
}