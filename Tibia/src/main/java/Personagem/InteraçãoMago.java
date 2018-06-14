package Personagem;

public class Intera��oMago implements Intera��oPersonagem {

	@Override
	public void atacar(Char umChar,Demon demon) {
		if(umChar.getTipo().equals(TipoElemento.FOGO)) {
			System.out.println("Magias de fogo n�o tem efeito");
			demon.setHp(demon.getHp());
		} else if(umChar.getTipo().equals(TipoElemento.GELO)) {
			System.out.println("Magias de gelo s�o o ponto fraco do monstro!Voc� o derrotou!");
			demon.setHp(0);
		} else if(umChar.getTipo().equals(TipoElemento.TERRA)) {
			System.out.println("Magias de terra causaram dano ao monstro!");
			demon.setHp(demon.getHp() - umChar.getAtaque() + demon.getDefesa());
		}
	}

	@Override
	public void defender(Char umChar, Demon demon) {
		
	}

}
