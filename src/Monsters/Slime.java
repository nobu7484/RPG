package Monsters;
import bases.Monster;
import utils.Dice;

public class Slime extends Monster{
	public Slime(String name,String wepon) {
		super(name,wepon);
		this.setHp(Dice.get(70,130));
		this.setOffensive(Dice.get(5,11));
		
	}

}
