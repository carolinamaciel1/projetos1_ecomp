package Personagem;

public class Demon {
	private int ataque;
	private int defesa;
	private int hp;
	
	public Demon() {
		this.ataque = 100;
		this.defesa = 30;
		this.hp = 250;
	}


	public int getAtaque() {
		return ataque;
	}


	public void setAtaque(int ataque) {
		this.ataque = ataque;
	}


	public int getDefesa() {
		return defesa;
	}


	public void setDefesa(int defesa) {
		this.defesa = defesa;
	}


	public int getHp() {
		return hp;
	}


	public void setHp(int hp) {
		this.hp = hp;
	}

	
}
