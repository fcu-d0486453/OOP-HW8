package fcu.iecs.oop.pokemon;

public class Bulbasaur extends Pokemon{
	
	public void attack(){
		System.out.println("Tackle¡K");
	}

	public Bulbasaur(String nickName , PokemonType type, int cp) {
		super(nickName,type,  cp);
	}
	
}
