package utill;

import Map.Dungoun;

public class DungounList {

	MonsterList monster = new MonsterList();
	
	public Dungoun ratOyster() {
		Dungoun ratOyster = new Dungoun();
		ratOyster.setFloor(1);
		ratOyster.setBoss(monster.bossMonster().get("ratKing"));
		ratOyster.setNamed(monster.namedMonster().get("radBat"));
		ratOyster.setNomal(monster.nomalMonster().get("rat"));
		
		return ratOyster;
	}
	
	public Dungoun ghostOyster() {
		Dungoun ghostOyster = new Dungoun();
		ghostOyster.setFloor(2);
		ghostOyster.setBoss(monster.bossMonster().get("ghostKing"));
		ghostOyster.setNamed(monster.namedMonster().get("ghostGuard"));
		ghostOyster.setNomal(monster.nomalMonster().get("ghost"));
		
		return ghostOyster;
	}
	
	public Dungoun sejagHouse() {
		Dungoun sejagHouse = new Dungoun();
		sejagHouse.setFloor(3);
		sejagHouse.setBoss(monster.bossMonster().get("emissaryBoss"));
		sejagHouse.setNamed(monster.namedMonster().get("emissaryLeader"));
		sejagHouse.setNomal(monster.nomalMonster().get("emissary"));
		
		return sejagHouse;
	}
}
