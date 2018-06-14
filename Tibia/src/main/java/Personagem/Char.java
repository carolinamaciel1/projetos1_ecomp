package Personagem;

public class Char {
	private TipoChar tipo;
	private String nick;
	private Intera��oPersonagem calculoIntera��o;
	private int ataque;
	private int hp;
	private TipoElemento elemento;
	
	public Char(TipoChar tipo,String nick,TipoElemento elemento) {
		this.elemento = elemento;
		this.nick = nick;
		switch(tipo) {
			case GUERREIRO:
				this.ataque = 80;
				this.hp = 200;
				this.calculoIntera��o = new Intera��oGuerreiro();
				break;
				
			case MAGO:
				this.ataque = 150;
				this.hp = 150;
				this.calculoIntera��o = new Intera��oMago();
				break;
				
			case ARQUEIRO:
				this.ataque = 200;
				this.hp = 100;
				this.calculoIntera��o = new Intera��oArqueiro();
				break;
				
		}
	}

	public void atacar(Demon demon) {
		this.calculoIntera��o.atacar(this,demon);
	}
	
	public TipoChar getTipo() {
		return tipo;
	}

	public void setTipo(TipoChar tipo) {
		this.tipo = tipo;
	}

	public String getNick() {
		return nick;
	}

	public void setNick(String nick) {
		this.nick = nick;
	}

	public Intera��oPersonagem getCalculoIntera��o() {
		return calculoIntera��o;
	}

	public void setCalculoIntera��o(Intera��oPersonagem calculoIntera��o) {
		this.calculoIntera��o = calculoIntera��o;
	}

	public int getHp() {
		return hp;
	}

	public void setHp(int hp) {
		this.hp = hp;
	}

	public int getAtaque() {
		return ataque;
	}

	public void setAtaque(int ataque) {
		this.ataque = ataque;
	}
	
	
		
}
