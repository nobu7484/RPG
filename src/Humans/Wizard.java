package Humans;

import bases.Human;
import utils.Dice;

public class Wizard extends Human{
	public Wizard(String name,String wepon) {
		super(name,wepon);
		setHp(Dice.get(120,180));
		setOffensive(Dice.get(12,18));

}
}
