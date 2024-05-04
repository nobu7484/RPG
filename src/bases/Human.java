package bases;

import utils.Dice;

public abstract class Human extends Living{
	
	public Human(String name, String weapon) {
		super(name,weapon);
	}	
	@Override
	public void attack(Living target) {
		int damege = Dice.get(1,10)*this.offensive;
		target.hp=(target.getHp()-damege);
		this.offensive--;
		System.out.format("%sが%sで攻撃！%sに%dのダメージを与えた。", this.name, this.weapon,target.getName(),damege);
		System.out.println("しかし自分の攻撃力も1減少した。");
		
		

}
}