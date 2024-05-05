package Monsters;
import bases.Monster;
import utils.Dice;

public class Dragon extends Monster{
	public Dragon(String name,String wepon) {
		super(name,wepon);
		this.setHp(Dice.get(270,330));
		this.setOffensive(Dice.get(12,18));
	}
}
