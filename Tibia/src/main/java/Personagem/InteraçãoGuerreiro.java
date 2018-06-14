package Personagem;

public class InteraçãoGuerreiro implements InteraçãoPersonagem {

	@Override
	public void atacar(Char umChar, Demon demon) {
		if(umChar.getTipo().equals(TipoElemento.FOGO)){
			System.out.println("Ataques de fogo causam metade do dano");
			demon.setHp(demon.getHp()- (umChar.getAtaque()/2));
		} else if(umChar.getTipo().equals(TipoElemento.GELO)) {
			System.out.println("Ataques de gelo causam o dobro do dano");
			demon.setHp(demon.getHp() - (2 * umChar.getAtaque()));
		} else if(umChar.getTipo().equals(TipoElemento.TERRA)) {
			System.out.println("Ataques de terra causa dano normal");
			demon.setHp(demon.getHp() - umChar.getAtaque());
		}
		
	}

	@Override
	public void defender(Char umChar, Demon demon) {
		// TODO Auto-generated method stub
		
	}

	
	
}
