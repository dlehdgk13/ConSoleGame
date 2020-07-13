package User;

import Monster.Monster;

public abstract class Character {

	String name;
	int hp;
	int maxHp;
	int mp;
	int maxMp;
	int power;
	int defense;
	double attackSpeed;
	int evasion;
	int exp;
	int maxExp;
	int level;
	String weaponType;
	
	public Character(String name,
				int hp,
				int maxHp,
				int mp,
				int maxMp,
				int power,
				int defense,
				double attackSpeed,
				int evasion,
				int exp,
				int maxExp,
				int level,
				String weaponType) {
		this.name = name;
		this.hp = hp;
		this.maxHp = maxHp;
		this.mp = mp;
		this.maxMp = maxMp;
		this.power = power;
		this.defense =defense;
		this.attackSpeed = attackSpeed;
		this.evasion =evasion;
		this.exp = exp;
		this.maxExp = maxExp;
		this.level = level;
		this.weaponType = weaponType;
	}



	public abstract int attack(Monster monster);
	
	public abstract void die();
	
	public abstract void levelUp(Adventurer hero);
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
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

	public int getMaxExp() {
		return maxExp;
	}

	public void setMaxExp(int maxExp) {
		this.maxExp = maxExp;
	}

	public int getLevel() {
		return level;
	}

	public void setLevel(int level) {
		this.level = level;
	}

	public String getWeaponType() {
		return weaponType;
	}

	public void setWeaponType(String weaponType) {
		this.weaponType = weaponType;
	}

	
	
}
