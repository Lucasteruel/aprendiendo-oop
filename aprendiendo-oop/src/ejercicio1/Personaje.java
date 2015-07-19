package ejercicio1;

public abstract class Personaje {
	protected int energia;
	protected int vida;
	
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
	
	public void comer(Alimento alimento) {
		alimento.consumirse(this);
	}
}
