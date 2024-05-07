package bases;

import utils.Dice;

public abstract class Human extends Living{
	public Human(String name, String weapon) {
		super(name,weapon);
	}	
	@Override
	public void attack(Living target) {
		int damege = Dice.get(1,10)*this.offensive;
		target.setHp(target.getHp()-damege);
		this.offensive--;
		System.out.printf("%Sが%sで攻撃！%sに%dのダメージを与えた。",getName(),getWeapon(),target.getName(),damege);
		System.out.println("しかし自分の攻撃力も1減少した。");
		
		

}
}