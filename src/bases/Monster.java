package bases;

import utils.Dice;

public abstract class Monster extends Living {
	public Monster(String name,String wepon) {
		super(name,wepon);
	}	
	@Override
	public void attack(Living target) {
		int damege = Dice.get(1,10)*this.offensive;
		target.setHp(target.getHp()-damege);
		this.offensive--;
		System.out.printf("%Sが%sで攻撃！%sに%dのダメージを与えた。",getName(),getWeapon(),target.getName(),damege);
		
		
}
}