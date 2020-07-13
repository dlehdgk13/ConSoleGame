package utill;

import java.util.HashMap;
import java.util.Map;

import Monster.Monster;
import main.Skill;

public class MonsterList {

	ItemList item = new ItemList();
	
	public Map<String, Monster> nomalMonster() {
		Map<String, Monster> nomalMonster = new HashMap<>();
		
		Monster rabbit = new Monster(
				"토끼",				//이름
				"매우 약한 야생의 토끼",	//몹설명
				"물기!",				//기본공격명
				"nomal",		    //등급
				50,					//hp
				50,				 	//maxHp
				0,					//mp
				0,					//maxMp
				5,					//power
				0,					//defense
				1,					//attackSpeed
				0, 					//evasion
				5,                  //exp
				10,					//money
				1, 					//level
				0,					//angerGauge
				null, 				//skill
				null,				//angerSkill
				null,				//hp포션
				null,				//mp포션
				null,				//무기1
				null, 				//무기2
				null				//무기3
				);                
		nomalMonster.put("rabbit",rabbit);
		
		Monster squirrel = new Monster(
										"다람쥐",				//이름
										"매우 약한 야생의 다람쥐",	//몹설명
										"할퀴기!",			//기본공격명
										"nomal",		    //등급
										100,				//hp
										100,				//maxHp
										0,					//mp
										0,					//maxMp
										10,					//power
										0,					//defense
										1,					//attackSpeed
										0, 					//evasion
										10,                 //exp
										10,					//money
										1, 					//level
										0,					//angerGauge
										null, 				//skill
										null,				//angerSkill
										null,				//hp포션
										null,				//mp포션
										null,				//무기1
										null,				//무기2
										null	
										);                
		nomalMonster.put("squirrel",squirrel);
		
		Monster rat = new Monster(
										"쥐",				//이름
										"쥐굴에서 볼 수 있는 가장 작은쥐",	//몹설명
										"물기!",				//기본공격명
										"nomal",		    //등급
										150,					//hp
										150,				 	//maxHp
										0,					//mp
										0,					//maxMp
										30,					//power
										10,					//defense
										1,					//attackSpeed
										10, 					//evasion
										30,                  //exp
										30,					//money
										5,                //level
										0,					//angerGauge
										null, 				//skill
										null,				//angerSkill
										item.hpPotion().get(0),				//hp포션
										item.mpPotion().get(0),				//mp포션
										null,				//무기1
										null, 				//무기2
										null				//무기3
										);                
		nomalMonster.put("rat",rat);

		Monster ghost = new Monster(
				"유령",				//이름
				"유령굴의 주민",	//몹설명
				"공포",				//기본공격명
				"nomal",		    //등급
				300,					//hp
				300,				 	//maxHp
				0,					//mp
				0,					//maxMp
				60,					//power
				20,					//defense
				1,					//attackSpeed
				20, 					//evasion
				60,                  //exp
				60,					//money
				5,                //level
				0,					//angerGauge
				null, 				//skill
				null,				//angerSkill
				item.hpPotion().get(1),				//hp포션
				item.mpPotion().get(1),				//mp포션
				null,				//무기1
				null, 				//무기2
				null				//무기3
				);                
		nomalMonster.put("ghost",ghost);
		
		Monster emissary = new Monster(
				"밀정",				//이름
				"부여성을 염탐하러온 타국의 밀정",	//몹설명
				"낫 배기!",				//기본공격명
				"nomal",		    //등급
				600,					//hp
				600,				 	//maxHp
				0,					//mp
				0,					//maxMp
				120,					//power
				40,					//defense
				1,					//attackSpeed
				20, 					//evasion
				120,                  //exp
				120,					//money
				5,                //level
				0,					//angerGauge
				null, 				//skill
				null,				//angerSkill
				item.hpPotion().get(2),				//hp포션
				item.mpPotion().get(2),				//mp포션
				null,				//무기1
				null, 				//무기2
				null				//무기3
				);                
		nomalMonster.put("emissary",emissary);
		return nomalMonster;
	}
	

	public Map<String, Monster> namedMonster() {
		Map<String, Monster> namedMonster = new HashMap<>();
		
		Monster radBat = new Monster(
										"빨간박쥐",			//이름
										"흡혈 박쥐",			//몹설명
										"물기!",				//기본공격명
										"named",		    //등급
										250,				//hp
										50,				//maxHp
										50,					//mp
										50,					//maxMp
										50,					//power
										10,					//defense
										1,					//attackSpeed
										10, 				//evasion
										100,                 //exp
										100,					//money
										10,                  //level
										0,					//angerGage
										new Skill("흡혈!","출혈", 1, 0, 5, 70, 0, 10, 5), //스킬(스킬명,스킬 레벨,사용가능 레벨,mp,damage,defense,hilling,coolTime) 
										null,				//angerSkill
										item.hpPotion().get(0),				//hp포션
										item.mpPotion().get(0),				//mp포션
										item.weapon().get(0),				//무기1
										item.weapon().get(1), 				//무기2
										item.weapon().get(2)				//무기3
										);                
		namedMonster.put("radBat",radBat);

		Monster ghostGuard = new Monster(
				"유령수문장",			//이름
				"유령굴을 지키는 수문장",			//몹설명
				"유령검술!",				//기본공격명
				"named",		    //등급
				500,				//hp
				500,				//maxHp
				100,					//mp
				100,					//maxMp
				100,					//power
				20,					//defense
				1,					//attackSpeed
				20, 				//evasion
				200,                 //exp
				200,					//money
				10,                  //level
				0,					//angerGage
				new Skill("홀리기!","공포", 1, 0, 10, 140, 0, 10, 5), //스킬(스킬명,스킬 레벨,사용가능 레벨,mp,damage,defense,hilling,coolTime) 
				null,				//angerSkill
				item.hpPotion().get(1),				//hp포션
				item.mpPotion().get(1),				//mp포션
				item.weapon().get(3),				//무기1
				item.weapon().get(4), 				//무기2
				item.weapon().get(5)				//무기3
				);                
		namedMonster.put("ghostGuard",ghostGuard);
		
		Monster emissaryLeader = new Monster(
				"밀정단장",			//이름
				"밀정들의 단장",			//몹설명
				"수리검 투척!",				//기본공격명
				"named",		    //등급
				1000,				//hp
				1000,				//maxHp
				200,					//mp
				200,					//maxMp
				200,					//power
				40,					//defense
				1,					//attackSpeed
				20, 				//evasion
				400,                 //exp
				400,					//money
				10,                  //level
				0,					//angerGage
				new Skill("독침", "중독",1, 0, 20, 280, 0, 10, 5), //스킬(스킬명,스킬 레벨,사용가능 레벨,mp,damage,defense,hilling,coolTime) 
				null,				//angerSkill
				item.hpPotion().get(2),				//hp포션
				item.mpPotion().get(2),				//mp포션
				item.weapon().get(6),				//무기1
				item.weapon().get(7), 				//무기2
				item.weapon().get(8)				//무기3
				);                
		namedMonster.put("emissaryLeader",emissaryLeader);

		return namedMonster;
	}
	
	
	public Map<String, Monster> bossMonster() {
		Map<String, Monster> bossMonster = new HashMap<>();
		Monster ratKing = new Monster(
										"쥐왕",			//이름
										"쥐굴의 왕",			//몹설명
										"찌르기!",				//기본공격명
										"boss",		    //등급
										1000,				//hp
										1000,				//maxHp
										500,					//mp
										500,					//maxMp
										250,					//power
										50,					//defense
										1.5,					//attackSpeed
										20, 				//evasion
										250,                 //exp
										500,					 //money
										20,                  //level
										0,					//angerGage
										new Skill("쥐왕의 연격!","절단", 1, 0, 25, 300, 0, 0, 2), //스킬(스킬명,스킬 레벨,사용가능 레벨,mp,damage,defense,hilling,coolTime)
										new Skill("왕의 위엄!","공포", 1, 0, 100, 600, 0, 0, 5), //스킬(스킬명,스킬 레벨,사용가능 레벨,mp,damage,defense,hilling,coolTime));
										item.hpPotion().get(0),				//hp포션
										item.mpPotion().get(0),				//mp포션
										item.bossWeapon().get(0),				//무기1
										null, 				//무기2
										null				//무기3
										);                
		bossMonster.put("ratKing",ratKing);
		
		Monster ghostKing = new Monster(
				"불연",			//이름
				"유령굴의 왕",			//몹설명
				"베어 가르기!",				//기본공격명
				"boss",		    //등급
				2000,				//hp
				2000,				//maxHp
				1000,					//mp
				1000,					//maxMp
				500,					//power
				100,					//defense
				1.5,					//attackSpeed
				20, 				//evasion
				500,                 //exp
				1000,					 //money
				20,                  //level
				0,					//angerGage
				new Skill("겁주기!","공포", 1, 0, 25, 600, 0, 0, 2), //스킬(스킬명,스킬 레벨,사용가능 레벨,mp,damage,defense,hilling,coolTime)
				new Skill("귀곡성!","출혈" ,1, 0, 100, 1200, 0, 0, 5), //스킬(스킬명,스킬 레벨,사용가능 레벨,mp,damage,defense,hilling,coolTime));
				item.hpPotion().get(1),				//hp포션
				item.mpPotion().get(1),				//mp포션
				item.bossWeapon().get(1),				//무기1
				null, 				//무기2
				null				//무기3
				);                
		bossMonster.put("ghostKing",ghostKing);	
		
		Monster emissaryBoss = new Monster(
				"밀정두목",			//이름
				"밀정들의 두목",			//몹설명
				"폭탄 받아라!",				//기본공격명
				"boss",		    //등급
				4000,				//hp
				4000,				//maxHp
				2000,					//mp
				2000,					//maxMp
				1000,					//power
				100,					//defense
				1.5,					//attackSpeed
				20, 				//evasion
				2000,                 //exp
				3000,					 //money
				20,                  //level
				0,					//angerGage
				new Skill("폭팔 수리검!","화상" ,1, 0, 100, 1200, 0, 0, 2), //스킬(스킬명,스킬 레벨,사용가능 레벨,mp,damage,defense,hilling,coolTime)
				new Skill("암살!","절단", 1, 0, 200, 2400, 0, 0, 5), //스킬(스킬명,스킬 레벨,사용가능 레벨,mp,damage,defense,hilling,coolTime));
				item.hpPotion().get(1),				//hp포션
				item.mpPotion().get(1),				//mp포션
				item.bossWeapon().get(1),				//무기1
				null, 				//무기2
				null				//무기3
				);                
		bossMonster.put("emissaryBoss",emissaryBoss);	
		
	return bossMonster;
	}
}
