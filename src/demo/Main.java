package demo;
import java.util.ArrayList;
import java.util.List;

import Humans.Brave;
import Humans.Fighter;
import Humans.Wizard;
import Monsters.Dragon;
import Monsters.Oak;
import Monsters.Slime;
import bases.Human;
import bases.Living;
import bases.Monster;
import utils.Dice;


public class Main {
	private static Human choiceHuman;
	private static Living choiceMonster;

	public static void main(String[] args) {
		System.out.println("★★ ==== 戦いの開始だ！！ ==== ★★");
		Human Brave= new Brave("沖田総司","剣");
		Human Fighter= new Fighter("金太郎","斧");
		Human Wizard = new Wizard("安倍晴明","魔法");
		
		List<Human> humans = new ArrayList<>();
		humans.add(Brave);
		humans.add(Fighter);
		humans.add(Wizard);
		
		Monster Slime=new Slime("キングスライム","体当たり");
		Monster Oak=new Oak("オークキング","槍");
		Monster Dragon=new Dragon("紅龍","炎");
		
		List<Monster> monsters = new ArrayList<>();
		monsters.add(Slime);
		monsters.add(Oak);
		monsters.add(Dragon);
		
		showGroupInfos(humans, monsters);
		
		int count = 1;
		
	while (true) {
		System.out.printf("\n★ 第%d回戦 ==========\n", count);
		System.out.println("\n[人間のターン！]\n");
		
		Human human = choiceHuman(humans);
		Monster monster = choiceMonster(monsters);
	
		human.attack(monster);
			
		if(monster.getHp()<=0) {
		System.out.printf("%sは倒れた。",monster.getName());
		monsters.remove(monster);
				
		if(monsters.isEmpty()) {
		System.out.println("人間グループの勝利");
		break;
		}
	}
		
		
		System.out.println("\n[モンスターのターン！]\n");
				
		choiceHuman(humans);
		choiceMonster(monsters);
				
		monster.attack(human);
		
		if(human.getHp()<=0) {
		System.out.printf("%sは倒れた。",human.getName());
		humans.remove(human);
		
		if(humans.isEmpty()) {
		System.out.println("人間グループの敗北");
		break;
		}
	}
		
		showGroupInfos(humans, monsters);
					
		count++;
		
		}
		
		showGroupInfos(humans, monsters);
	
		
		
	}
		
		

	
				
	public static Monster choiceMonster(List<Monster> monsters) {
		Monster monster = monsters.get(Dice.get(0, monsters.size() - 1));
		System.out.printf("モンスターグループから 「%s」 のお出ましだ！\n", monster.getName());
		return monster;
	}

	

	public static Human choiceHuman(List<Human> humans) {
		Human human = humans.get(Dice.get(0, humans.size() - 1));
		System.out.printf("人間グループから 「%s」 のお出ましだ！\n", human.getName());
		return human;
	}

	public static void showGroupInfos(List<Human> humans, List<Monster> monsters) {

		System.out.println("\n## === グループ情報 === ##");
		System.out.printf("# [人間グループ]: %d人\n", humans.size());
		for (Human human : humans) {
			System.out.println(human);
		}

		System.out.printf("\n# [モンスターグループ]: %d人\n", monsters.size());
		for (Monster monster : monsters) {
			System.out.println(monster);
		}
	}

}