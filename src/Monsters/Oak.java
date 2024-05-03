package Monsters;
import bases.Monster;
import utils.Dice;

public class Oak extends Monster{
	public Oak(String name,String wepon) {
		super(name,wepon);
		setHp(Dice.get(170,230));
		setOffensive(Dice.get(9,15));
	}

}
