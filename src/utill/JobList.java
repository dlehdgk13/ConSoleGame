package utill;

import java.util.Scanner;

import User.Adventurer;
import main.Skill;

public class JobList {

	public Adventurer warrior(String name) {
		
		Adventurer hero = new Adventurer(
					name, //이름
					150,    //hp
					150,	  //hpMax
					50,    //mp
					50,	  //mpMax
					10,    //power
					5,    //defense
					1.1,    //attackSpeed
					5,    //evasion
					0,    //exp
					50,    //maxExp
					1,    //level
					"sword",
					// 스킬명 ,스킬레벨 ,mp , damage , defense,hilling,coolTime
					new Skill("건곤대나이","중독",1,0, 10 ,50, 0, 0, 3),
					new Skill("누리의 기원",null,1,10, 10 ,0, 5, 100, 0), 
					new Skill("백호참","출혈",1,15, 50 ,50, 0, 0, 5),
					new Skill("초혼비무","절단",1,20, 100 ,150, 5, 0, 0),
					new Skill("어검술","절단",1,25, 200 ,300, 5, 0, 0),
					null,
					null
					);
			return hero;
		}
	
	public Adventurer thief(String name) {
		
		Adventurer hero = new Adventurer(
					name, //이름
					1000000,    //hp
					1000000,	  //hpMax
					500,    //mp
					500,	  //mpMax
					300,    //power
					5,    //defense
					1.1,    //attackSpeed
					10,    //evasion
					0,    //exp
					50,    //maxExp
					100,    //level
					"dagger",
					// 스킬명 ,스킬레벨 ,스킬 특성,mp , damage , defense,hilling,coolTime
					new Skill("비영승보","중독",1,5, 100 ,20, 0, 0, 3),
					new Skill("투명","절단",1,10,200 ,0, 5, 0, 0), 
					new Skill("필살검무","절단",1,15, 250 ,50, 0, 0, 5),
					new Skill("어검술","출혈",1,20,300 ,800, 5, 0, 0),
					new Skill("탈명사식'뇌","출혈",1,25, 400 ,1600, 5, 0, 0),
					null,
					null
					);
			return hero;
		}
	
	public Adventurer wizard(String name) {
		
		Adventurer hero = new Adventurer(
					name, //이름
					100,    //hp
					100,	  //hpMax
					50,    //mp
					50,	  //mpMax
					15,    //power
					5,    //defense
					1.1,    //attackSpeed
					10,    //evasion
					0,    //exp
					50,    //maxExp
					1,    //level
					"staff",
					// 스킬명 ,스킬레벨 ,mp , damage , defense,hilling,coolTime
					new Skill("작열주","화상",1,0, 10 ,100, 0, 0, 3),
					new Skill("뇌격주","화상",1,10, 200 ,0, 5, 100, 0), 
					new Skill("진 뇌격주","화상",1,15, 400 ,50, 0, 0, 5),
					new Skill("극진백열참주","화상",1,20, 800 ,150, 5, 0, 0),
					new Skill("헬파이어","화상",1,25, 200 ,1200, 5, 0, 0),
					null,
					null
					);
			return hero;
	}
}
