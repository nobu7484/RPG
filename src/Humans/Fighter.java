package Humans;
import bases.Human;
import utils.Dice;

public class Fighter extends Human{
	public Fighter(String name,String wepon) {
		super(name,wepon);
		this.setHp(Dice.get(240,300));
		this.setOffensive(Dice.get(17,23));
	}

}
