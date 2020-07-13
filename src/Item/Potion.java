package Item;

import java.util.HashMap;
import java.util.Map;

import Monster.Monster;
import User.Adventurer;

public class Potion extends Item{


	String effect;    //사용 효과
	int hp;			  //체력
	int mp;			  //기력
	int power;		  //공격력
	int defense;	  //방어력
	double attackSpeed;  //공격속도
	int evasion;      //회피율
	int exp;	      //경험치
	int coolTime;     //재사용 대기시간
	int useTime;     //적용시간


	public Potion(String name, String type, int price, String grade,String effect,int hp,int mp,int power,int defense,double attackSpeed,int evasion,int exp,int coolTime,int useTime) {
		super(name, type, price, grade);
		this.effect = effect;
		this.hp = hp;
		this.mp = mp;
		this.power = power;
		this.defense =defense;
		this.attackSpeed = attackSpeed;
		this.evasion = evasion;
		this.exp = exp;
		this.coolTime = coolTime;
		this.useTime = useTime;
	}


	public String getEffect() {
		return effect;
	}


	public void setEffect(String effect) {
		this.effect = effect;
	}


	public int getHp() {
		return hp;
	}


	public void setHp(int hp) {
		this.hp = hp;
	}


	public int getMp() {
		return mp;
	}


	public void setMp(int mp) {
		this.mp = mp;
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


	public int getCoolTime() {
		return coolTime;
	}


	public void setCoolTime(int coolTime) {
		this.coolTime = coolTime;
	}


	public int getUseTime() {
		return useTime;
	}


	public void setUseTime(int useTime) {
		this.useTime = useTime;
	}

}
