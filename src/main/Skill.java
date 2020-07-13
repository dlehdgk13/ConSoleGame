package main;


public class Skill {

	private String name;//스킬 명
	private String skillType; // 스킬 타입
	private int level;//스킬 레벨
	private int useLevel; //사용 가능 레벨
	private int mp;
	private int damage;
	private int defense;
	private int hilling;
	private int coolTime;  // 자신의 턴이 몇번 지나면 될지 사용 예정
			// 쿨타임 변수 만들어서 사용 

	public Skill(
				String name,
				String skillType,
				int level,
				int useLevel,
				int mp,
				int damage,
				int defense,
				int hilling,
				int coolTime) {
		this.name = name;
		this.skillType = skillType;
		this.level = level;
		this.useLevel = useLevel;
		this.mp = mp;
		this.damage = damage;
		this.defense = defense;
		this.hilling = hilling;
		this.coolTime = coolTime;
	};

	public String getSkillType() {
		return skillType;
	}

	public void setSkillType(String skillType) {
		this.skillType = skillType;
	}
	public int getUseLevel() {
		return useLevel;
	}

	public void setUseLevel(int useLevel) {
		this.useLevel = useLevel;
	}

	public int getDefense() {
		return defense;
	}

	public void setDefense(int defense) {
		this.defense = defense;
	}

	public int getHilling() {
		return hilling;
	}

	public void setHilling(int hilling) {
		this.hilling = hilling;
	}

	public int getCoolTime() {
		return coolTime;
	}

	public void setCoolTime(int coolTime) {
		this.coolTime = coolTime;
	}
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getLevel() {
		return level;
	}

	public void setLevel(int level) {
		this.level = level;
	}

	public int getMp() {
		return mp;
	}

	public void setMp(int mp) {
		this.mp = mp;
	}

	public int getDamage() {
		return damage;
	}

	public void setDamage(int damage) {
		this.damage = damage;
	}
}
