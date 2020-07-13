package utill;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

import Item.Armor;
import Item.Potion;
import Item.Weapon;
import User.Adventurer;

public class ItemList {
	//방어구
	public ArrayList<Armor> armor() {  
		ArrayList<Armor> armor = new ArrayList<>();
		
		Armor lowArmor = new Armor(
				"하급 방어구", 
				"armor", 
				500,
				"low", 
				20);
		armor.add(lowArmor);
		
		Armor midArmor = new Armor(
				"중급 방어구", 
				"armor", 
				1000,
				"mid", 
				50);
		armor.add(midArmor);
		
		Armor highArmor = new Armor(
				"상급 방어구", 
				"armor", 
				1500,
				"high", 
				100);
		armor.add(highArmor);
		return armor;
	}
	
	//무기
	public ArrayList<Weapon> weapon() {
		ArrayList<Weapon> weapon = new ArrayList<>();
		
		Weapon lowSword = new Weapon(
				"하급 검",    	//name
				"sword",	//type
				500, 		//price
				"low",		//grade
				20			//power
				);
		weapon.add(lowSword);
		
		Weapon lowDagger = new Weapon(
				"하급 단검",    	//name
				"dagger",	//type
				500, 		//price
				"low",		//grade
				20		//power
				);
		weapon.add(lowDagger);
		
		Weapon lowStaff = new Weapon(
				"하급 스태프",    	//name
				"staff",	//type
				500, 		//price
				"low",		//grade
				20		//power
				);
		weapon.add(lowStaff);
		
		Weapon midSword = new Weapon(
				"중급 검",    	//name
				"sword",	//type
				1000, 		//price
				"mid",		//grade
				20			//power
				);
		weapon.add(midSword);
		
		Weapon midDagger = new Weapon(
				"중급 단검",    	//name
				"sword",	//type
				1000, 		//price
				"mid",		//grade
				100		//power
				);
		weapon.add(midSword);
		
		Weapon midStaff = new Weapon(
				"중급 스태프",    	//name
				"sword",	//type
				1000, 		//price
				"mid",		//grade
				100		//power
				);
		weapon.add(midStaff);
		
		Weapon highSword = new Weapon(
				"상급 검",    	//name
				"sword",	//type
				1000, 		//price
				"high",		//grade
				20			//power
				);
		weapon.add(highSword);
		
		Weapon highDagger = new Weapon(
				"상급 단검",    	//name
				"sword",	//type
				1000, 		//price
				"high",		//grade
				100		//power
				);
		weapon.add(highDagger);
		
		Weapon highStaff = new Weapon(
				"상급 스태프",    	//name
				"sword",	//type
				1000, 		//price
				"high",		//grade
				100		//power
				);
		weapon.add(highStaff);
		return weapon;
	}
	
	public ArrayList<Weapon> bossWeapon() {
		ArrayList<Weapon> bossWeapon = new ArrayList<>();
		Weapon ratWeapon = new Weapon(
				"쥐왕의 무기",    	//name
				"boss",	//type
				10000, 		//price
				"boss",		//grade
				200			//power
				);
		bossWeapon.add(ratWeapon);
		
		Weapon ghostWeapon = new Weapon(
				"유령왕의 무기",    	//name
				"boss",	//type
				20000, 		//price
				"boss",		//grade
				400		//power
				);
		bossWeapon.add(ghostWeapon);
		
		Weapon sejakWeapon = new Weapon(
				"세작왕의 무기",    	//name
				"boss",	//type
				30000, 		//price
				"boss",		//grade
				800		//power
				);
		bossWeapon.add(sejakWeapon);
		
		return bossWeapon;
	}
	
	//hp포션
	public ArrayList<Potion> hpPotion() {
		ArrayList<Potion> hpPotion = new ArrayList<>();
		//ArrayList<Potion> hpPotion = new ArrayList<>();
		
		Potion lowHpPotion = new Potion(
					"하급 hp포션", 	//이름
					"hpPotion",		//타입
					50,				//가격
					"low", 			//등급
					"체력 50 회복",		//사용 효과
					50,				//hp
					0,				//mp
					0,				//power;
					0,				//defense;
					0, 				//attackSpeed;
					0, 				//evasion;
					0,				//exp;
					0, 				//coolTime;
					0				//useTime;
					);
		hpPotion.add(lowHpPotion);
		
		Potion midHpPotion = new Potion(
					"중급 hp포션", 	//이름
					"hpPotion",		//타입
					100,			//가격
					"mid", 			//등급
					"체력 100 회복",	//사용 효과
					100,			//hp
					0,				//mp
					0,				//power;
					0,				//defense;
					0, 				//attackSpeed;
					0, 				//evasion;
					0,				//exp;
					0, 				//coolTime;
					0				//useTime;
					);
			hpPotion.add(midHpPotion);
		
		Potion highHpPotion = new Potion(
					"상급 hp포션", 	//이름
					"hpPotion",		//타입
					250,			//가격
					"high", 		//등급
					"체력 300 회복",	//사용 효과
					300,			//hp
					0,				//mp
					0,				//power;
					0,				//defense;
					0, 				//attackSpeed;
					0, 				//evasion;
					0,				//exp;
					0, 				//coolTime;
					0				//useTime;
					);
			hpPotion.add(highHpPotion);
		
		return hpPotion;
	}
	
	//MpPotion
	public ArrayList<Potion> mpPotion() {
		ArrayList<Potion> mpPotion = new ArrayList<>();
		//ArrayList<Potion> hpPotion = new ArrayList<>();
		
		Potion lowMpPotion = new Potion(
				"하급 Mp포션", 	//이름
				"mpPotion",		//타입
				50,				//가격
				"low", 			//등급
				"기력 50 회복",		//사용 효과
				0,				//hp
				50,				//mp
				0,				//power;
				0,				//defense;
				0, 				//attackSpeed;
				0, 				//evasion;
				0,				//exp;
				0, 				//coolTime;
				0				//useTime;
				);
		mpPotion.add(lowMpPotion);
		
		Potion midMpPotion = new Potion(
				"중급 mp포션", 	//이름
				"mpPotion",		//타입
				100,			//가격
				"mid", 			//등급
				"기력 100 회복",	//사용 효과
				0,				//hp
				100,			//mp
				0,				//power;
				0,				//defense;
				0, 				//attackSpeed;
				0, 				//evasion;
				0,				//exp;
				0, 				//coolTime;
				0				//useTime;
				);
		mpPotion.add(midMpPotion);
		
		Potion highHpPotion = new Potion(
				"상급 mp포션", 	//이름
				"mpPotion",		//타입
				250,			//가격
				"high", 		//등급
				"기력 300 회복",	//사용 효과
				0,				//hp
				300,			//mp
				0,				//power;
				0,				//defense;
				0, 				//attackSpeed;
				0, 				//evasion;
				0,				//exp;
				0, 				//coolTime;
				0				//useTime;
				);
		mpPotion.add(highHpPotion);
		
		return mpPotion;
	}
	
	
	public ArrayList<Potion> buffPotion(Adventurer hero) {
		ArrayList<Potion> buffPotion = new ArrayList<>();
		//ArrayList<Potion> hpPotion = new ArrayList<>();
		// = new Adventurer();
		
		
		Potion defensePotion = new Potion(
				"방어력 상승 포션", 					//이름
				"buffPotion",					//타입
				500,							//가격
				null, 							//등급
				"방어력 20% 증가",					//사용 효과
				0,								//hp
				0,							//mp
				0,								//power;
				hero.getDefense() * 20 / 100,	//defense;
				0, 								//attackSpeed;
				0, 								//evasion;
				0,								//exp;
				0, 								//coolTime;
				180								//useTime;
				);
		buffPotion.add(defensePotion);

		Potion powerPotion = new Potion(
				"공격력 상승 포션", 					//이름
				"buffPotion",					//타입
				500,							//가격
				null, 							//등급
				"공격력 20% 증가",					//사용 효과
				0,								//hp
				0,							//mp
				hero.getPower() * 20 / 100,		//power;
				0,								//defense;
				0, 								//attackSpeed;
				0, 								//evasion;
				0,								//exp;
				0, 								//coolTime;
				180								//useTime;
				);
		buffPotion.add(powerPotion);
		
		Potion attackSpeedPotion = new Potion(
				"공격속도 상승 포션", 				//이름
				"buffPotion",					//타입
				500,							//가격
				null, 							//등급
				"공격속도 20% 증가",					//사용 효과
				0,								//hp
				0,								//mp
				0,								//power;
				0,								//defense;
				(hero.getAttackSpeed() * 20 / 100), 								//attackSpeed;
				0, 								//evasion;
				0,								//exp;
				0, 								//coolTime;
				180								//useTime;
				);
		buffPotion.add(attackSpeedPotion);
		
		Potion evasionPotion = new Potion(
				"회피율 상승 포션", 				//이름
				"buffPotion",					//타입
				500,							//가격
				null, 							//등급
				"회피율 20% 증가",					//사용 효과
				0,								//hp
				0,								//mp
				0,								//power;
				0,								//defense;
				0, 								//attackSpeed;
				hero.getEvasion() * 20 / 100, 	//evasion;
				0,								//exp;
				0, 								//coolTime;
				180								//useTime;
				);
		buffPotion.add(evasionPotion);
		
		/*Potion expPotion = new Potion();
		expPotion.type = "buffPotion";
		expPotion.name = "경험치획득률 상승 포션";
		//expPotion.exp = hero.getEvasion() * 20 / 100;   추후 추가예ㅇ
		expPotion.useTime = 180;         
		expPotion.pirce = 500;
		expPotion.effect = "회피율 20% 증가";
		buffPotion.put("expPotion",expPotion);*/
		
		return buffPotion;
	}

}
