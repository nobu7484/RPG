package bases;

import utils.Dice;

public abstract class Human extends Living{
	public Human(String name, String weapon) {
		super(name,weapon);
	}	
	@Override
	public void attack(Living target) {
		int damege = Dice.get(1,10)*offensive;
		target.setHp=(target.getHp()-damege);
		this.offensive--;
		System.out.println("%sが%sで%sで攻撃！%sに$dのダメージを与えた");
		System.out.println("しかし自分の攻撃力も1減少した。");
		
		

}
}