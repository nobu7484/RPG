package Humans;
import bases.Human;
import utils.Dice;

public class Fighter extends Human{
	public Fighter(String name,String wepon) {
		super(name,wepon);
		setHp(Dice.get(240,300));
		setOffensive(Dice.get(17,23));
	}

}
