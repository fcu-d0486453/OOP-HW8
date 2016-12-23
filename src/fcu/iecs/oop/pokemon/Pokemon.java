package fcu.iecs.oop.pokemon;

public abstract class Pokemon implements Fightable{

	private final PokemonType Type;
	private		  String  	  nickName;		
	private		  int         cp;
	
	public abstract void attack();

	public Pokemon(String nickName, PokemonType type, int cp) {
		super();
		Type = type;
		this.nickName = nickName;
		this.cp = cp;
	}

	public String getNickName() {
		return nickName;
	}

	public void setNickName(String nickName) {
		this.nickName = nickName;
	}

	public int getCp() {
		return cp;
	}

	public void setCp(int cp) {
		this.cp = cp;
	}

	public PokemonType getType() {
		return Type;
	}
	
	
}
