package Monsters;
import bases.Monster;
import utils.Dice;

public class Dragon extends Monster{
	public Dragon(String name,String wepon) {
		super(name,wepon);
		setHp(Dice.get(270,330));
		setOffensive(Dice.get(12,18));
	}
}
