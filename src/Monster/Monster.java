package Monster;

import java.util.Random;

import Item.Potion;
import Item.Weapon;
import Map.Dungoun;
import Thread.SoundThread;
import Thread.attackTypeThread;
import Thread.monterAttackTypeThread;
import User.Adventurer;
import User.Inventory;
import main.Skill;
import utill.ItemList;

public  class Monster {


	String name;
	String explanation; //몹설명
	String attackScript; //일반 공격 대사
	String grade; //등급
	int hp;
	int maxHp;
	int mp;
	int maxMp;
	int power;
	int defense;
	double attackSpeed;
	int evasion;
	int exp;
	int money;
	int level;
	int angerGauge;		// 100이되면 분노스킬 사용
	Skill skill;
	Skill angerSkill;
	Potion hpPotion;
	Potion mpPotion;
	Weapon weapon1;
	Weapon weapon2;
	Weapon weapon3;
	
	
	public Monster (
			String name,
			String explanation, //몹설명
			String attackScript, //일반 공격 
			String grade,
			int hp,
			int maxHp,
			int mp,
			int maxMp,
			int power,
			int defense,
			double attackSpeed,
			int evasion,
			int exp,
			int money,
			int level,
			int angerGauge,
			Skill skill ,
			Skill angerSkill,
			Potion hpPotion,
			Potion mpPotion,
			Weapon weapon1,
			Weapon weapon2,
			Weapon weapon3) {
		this.name = name;
		this.explanation = explanation;
		this.attackScript = attackScript;
		this.grade = grade;
		this.hp = hp;
		this.maxHp = maxHp;
		this.mp = mp;
		this.maxMp = maxMp;
		this.power = power;
		this.defense = defense;
		this.attackSpeed = attackSpeed;
		this.evasion = evasion;
		this.exp = exp;
		this.money = money;
		this.level = level;		
		this.angerGauge = angerGauge;
		this.skill = skill;
		this.angerSkill = angerSkill;
		this.hpPotion = hpPotion;
		this.mpPotion = mpPotion;
		this.weapon1 = weapon1;
		this.weapon2 = weapon2;
		this.weapon3 = weapon3;
		
	}
	
	
	public  int attack(Adventurer user) {
		SoundThread punch = new SoundThread("Punch.mp3", false);
		punch.start();
		System.out.println(this.attackScript);
        int damage = 0;
        if(this.power > user.getDefense()) {
            damage = this.power - user.getDefense();
            System.out.println(user.getName()+"에게 "+damage+"의 피해를 주었습니다.");
        }else if(this.power < user.getDefense()) {
        	damage = 0;
            System.out.println(user.getName()+"에게 "+damage+"의 피해를 주었습니다.");
        }
        user.setHp(user.getHp() - damage);
        System.out.println(user.getName()+"의 남은 체력"+user.getHp());  
		
        return damage;
	};
	
	public  void die(Adventurer hero ,Inventory inventory) {
		System.out.println("");
		System.out.println("===== 승리 =====");
		hero.setExp(this.getExp()+hero.getExp());
		int giveMoney= inventory.getMoney() + this.getMoney();
		inventory.setMoney(giveMoney);
		System.out.println("획득 경험치: "+this.getExp());
		System.out.println("획등 금전:"+giveMoney);
		System.out.println("");
	 	SoundThread Mdie = new SoundThread("팡파레한번.mp3", false);
		Mdie.start();
	 	SoundThread money = new SoundThread("money.mp3", false);
	 	money.start();
 };
	
	public  void drop(Dungoun dungoun,Monster monster,Inventory inventory) {
        Random random = new Random();
        int DropCount = random.nextInt(5) + 1;
        int ItemDropCount = random.nextInt(10) + 1;
		if(dungoun.getFloor() == 1 && (monster.getGrade().equals("nomal") || monster.getGrade().equals("named") || monster.getGrade().equals("boss") )) {
			 for (int i = 0; i < DropCount; i++) {
		            if (DropCount > 2) {
		            	inventory.lowHpPotions.add(monster.getHpPotion());
		            }else if(DropCount <= 2 ) {
		            	inventory.lowMpPotions.add(monster.getMpPotion());
		            }
			 }
			 if(ItemDropCount == 1 && monster.getGrade().equals("named")) {
			     System.out.println(monster.weapon1.getName()+" 획득");
				 inventory.weapons.add(monster.weapon1);
			 }else if(ItemDropCount == 2 && monster.getGrade().equals("named")) {
			     System.out.println(monster.weapon2.getName()+" 획득");
				 inventory.weapons.add(monster.weapon2);
			 }else if(ItemDropCount == 3 && monster.getGrade().equals("named")) {
			     System.out.println(monster.weapon3.getName()+" 획득");
				 inventory.weapons.add(monster.weapon3);
			 }else if(ItemDropCount == 4 && monster.getGrade().equals("boss")) {
			     System.out.println(monster.weapon3.getName()+" 획득");
				 inventory.weapons.add(monster.weapon1);
			 }else if(ItemDropCount == 5 && monster.getGrade().equals("boss")) {
			     System.out.println(monster.weapon3.getName()+" 획득");
				 inventory.weapons.add(monster.weapon2);
			 }else if(ItemDropCount == 6 && monster.getGrade().equals("boss")) {
			     System.out.println(monster.weapon3.getName()+" 획득");
				 inventory.weapons.add(monster.weapon3);
			 }
		     if(DropCount > 2) {
		        System.out.println(monster.getHpPotion().getName()+":"+DropCount+"개  획득");
		     }else if(DropCount <= 2) {
		        System.out.println(monster.getMpPotion().getName()+"="+DropCount+"개 획득");
		     }
		}
	 	SoundThread drop = new SoundThread("전설.mp3", false);
	 	drop.start();
		System.out.println("");
	};

	public  void useSkill(Adventurer hero) {
		int damage = 0;
			if(this.getMp() >= this.skill.getMp()) {
				if(this.skill.getDamage() > hero.getDefense()) {
	            	damage = this.skill.getDamage() - hero.getDefense();
	            	System.out.println(this.skill.getName()+"!");
	                System.out.println(hero.getName()+"에게 "+damage+"만큼의 피해를 주었습니다.");
	                monterAttackTypeThread attackType = new monterAttackTypeThread();
	    			attackType.attackType(hero, this, this.skill.getSkillType());
				}else if(this.skill.getDamage() <= hero.getDefense()) {
	            	System.out.println(this.skill.getName()+"!");
		            System.out.println(hero.getName()+"에게 "+damage+"만큼의 피해를 주었습니다.");
	                monterAttackTypeThread attackType = new monterAttackTypeThread();
	    			attackType.attackType(hero, this, this.skill.getSkillType());
				}
			 	SoundThread named = new SoundThread("monsterSkill.mp3", false);
			 	named.start();
			}else {
				System.out.println("기력이 부족합니다.");
				this.attack(hero);
			}
			hero.setHp(hero.getHp() - damage);
        System.out.println(hero.getName()+"의 남은 체력 :"+hero.getHp());
	};


	public  void useAngrySkill(Adventurer hero) {
		int damage = 0;
		if(this.getMp() >= this.angerSkill.getMp()) {
				if(this.angerSkill.getDamage() > hero.getDefense()) {
	            	damage = this.angerSkill.getDamage() - hero.getDefense();
	            	System.out.println(this.angerSkill.getName()+"!");
	                System.out.println(hero.getName()+"에게 "+damage+"만큼의 피해를 주었습니다.");
	                monterAttackTypeThread attackType = new monterAttackTypeThread();
	    			attackType.attackType(hero, this, this.angerSkill.getSkillType());
				}else if(this.angerSkill.getDamage() <= hero.getDefense()) {
	            	System.out.println(this.angerSkill.getName()+"!");
		            System.out.println(hero.getName()+"에게 "+damage+"만큼의 피해를 주었습니다.");
	                monterAttackTypeThread attackType = new monterAttackTypeThread();
	    			attackType.attackType(hero, this, this.angerSkill.getSkillType());
				}
			 	SoundThread boss = new SoundThread("boosAngrySkill.mp3", false);
			 	boss.start();
			}else {
				System.out.println("기력이 부족합니다.");
				this.attack(hero);
			}
		hero.setHp(hero.getHp() - damage);
		System.out.println(hero.getName()+"의 남은 체력 :"+hero.getHp());
    };
	
	public String getAttackScript() {
		return attackScript;
	}


	public void setAttackScript(String attackScript) {
		this.attackScript = attackScript;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getExplanation() {
		return explanation;
	}


	public void setExplanation(String explanation) {
		this.explanation = explanation;
	}


	public String getGrade() {
		return grade;
	}


	public void setGrade(String grade) {
		this.grade = grade;
	}


	public int getHp() {
		return hp;
	}


	public void setHp(int hp) {
		this.hp = hp;
	}


	public int getMaxHp() {
		return maxHp;
	}


	public void setMaxHp(int maxHp) {
		this.maxHp = maxHp;
	}


	public int getMp() {
		return mp;
	}


	public void setMp(int mp) {
		this.mp = mp;
	}


	public int getMaxMp() {
		return maxMp;
	}


	public void setMaxMp(int maxMp) {
		this.maxMp = maxMp;
	}


	public int getPower() {
		return power;
	}


	public void setPower(int power) {
		this.power = power;
	}


	public int getDefense() {
		return defense;
	}


	public void setDefense(int defense) {
		this.defense = defense;
	}


	public double getAttackSpeed() {
		return attackSpeed;
	}


	public void setAttackSpeed(double attackSpeed) {
		this.attackSpeed = attackSpeed;
	}


	public int getEvasion() {
		return evasion;
	}


	public void setEvasion(int evasion) {
		this.evasion = evasion;
	}


	public int getExp() {
		return exp;
	}


	public void setExp(int exp) {
		this.exp = exp;
	}


	public int getMoney() {
		return money;
	}


	public void setMoney(int money) {
		this.money = money;
	}


	public int getLevel() {
		return level;
	}


	public void setLevel(int level) {
		this.level = level;
	}


	public int getAngerGauge() {
		return angerGauge;
	}


	public void setAngerGauge(int angerGauge) {
		this.angerGauge = angerGauge;
	}


	public Skill getSkill() {
		return skill;
	}


	public void setSkill(Skill skill) {
		this.skill = skill;
	}


	public Skill getAngerSkill() {
		return angerSkill;
	}


	public void setAngerSkill(Skill angerSkill) {
		this.angerSkill = angerSkill;
	}


	public Potion getHpPotion() {
		return hpPotion;
	}


	public void setHpPotion(Potion hpPotion) {
		this.hpPotion = hpPotion;
	}


	public Potion getMpPotion() {
		return mpPotion;
	}


	public void setMpPotion(Potion mpPotion) {
		this.mpPotion = mpPotion;
	}


	public Weapon getWeapon1() {
		return weapon1;
	}


	public void setWeapon1(Weapon weapon1) {
		this.weapon1 = weapon1;
	}


	public Weapon getWeapon2() {
		return weapon2;
	}


	public void setWeapon2(Weapon weapon2) {
		this.weapon2 = weapon2;
	}


	public Weapon getWeapon3() {
		return weapon3;
	}


	public void setWeapon3(Weapon weapon3) {
		this.weapon3 = weapon3;
	}


}
