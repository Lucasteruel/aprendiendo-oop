package ejercicio1;

public class WonderBoy {
	private int energia;
	private int vida;
	//Constructor
	public WonderBoy(int vida, int energia) {
		this.setEnergia(energia);
		this.setVida(vida);
	}
	//Setters & Getters
	public void setEnergia(int energia) {
		this.energia = energia;
	}
	public int getEnergia() {
		return this.energia;
	}
	public void setVida(int vida){
		this.vida = vida;
	}
	public int getVida() {
		return this.vida;
	}
}