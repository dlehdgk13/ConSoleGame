package User;

import java.util.List;

import Item.Armor;
import Item.Potion;
import Item.Weapon;

public class Inventory {

	public int money;
	public List<Weapon> weapons;
	public  List<Armor> armors;
	public List<Potion> lowHpPotions;
	public List<Potion> midHpPotions;
	public List<Potion> highHpPotions;
	public List<Potion> lowMpPotions;
	public List<Potion> midMpPotions;
	public List<Potion> highMpPotions;
	public List<Potion> defensePotions;
	public List<Potion> powerPotions;
	public List<Potion> attackSpeedPotions;
	public List<Potion> evasionPotions;

    public Inventory(	
    		int money,
    		List<Weapon> weapons,
    		List<Armor> armors,
    		List<Potion> lowHpPotions,
    		List<Potion> midHpPotions,
    		List<Potion> highHpPotions,
    		List<Potion> lowMpPotions,
    		List<Potion> midMpPotions,
    		List<Potion> highMpPotions,
    		List<Potion> defensePotions,
    		List<Potion> powerPotions,
    		List<Potion> attackSpeedPotions,
    		List<Potion> evasionPotions
    		) {
    	this.money = money;
    	this.weapons = weapons;
    	this.armors = armors;
    	this.lowHpPotions = lowHpPotions;
    	this.midHpPotions = midHpPotions;
    	this.highHpPotions = highHpPotions;
    	this.lowMpPotions = lowMpPotions;
    	this.midMpPotions = midMpPotions;
    	this.highMpPotions = highMpPotions;
    	this.defensePotions = defensePotions;
    	this.powerPotions = powerPotions;
    	this.attackSpeedPotions = attackSpeedPotions;
    	this.evasionPotions = evasionPotions;
    	
    }

	public int getMoney() {
		return money;
	}

	public void setMoney(int money) {
		this.money = money;
	}

	public List<Weapon> getWeapons() {
		return weapons;
	}

	public void setWeapons(List<Weapon> weapons) {
		this.weapons = weapons;
	}

	public List<Armor> getArmors() {
		return armors;
	}

	public void setArmors(List<Armor> armors) {
		this.armors = armors;
	}

	public List<Potion> getLowHpPotions() {
		return lowHpPotions;
	}

	public void setLowHpPotions(List<Potion> lowHpPotions) {
		this.lowHpPotions = lowHpPotions;
	}

	public List<Potion> getMidHpPotions() {
		return midHpPotions;
	}

	public void setMidHpPotions(List<Potion> midHpPotions) {
		this.midHpPotions = midHpPotions;
	}

	public List<Potion> getHighHpPotions() {
		return highHpPotions;
	}

	public void setHighHpPotions(List<Potion> highHpPotions) {
		this.highHpPotions = highHpPotions;
	}

	public List<Potion> getLowMpPotions() {
		return lowMpPotions;
	}

	public void setLowMpPotions(List<Potion> lowMpPotions) {
		this.lowMpPotions = lowMpPotions;
	}

	public List<Potion> getMidMpPotions() {
		return midMpPotions;
	}

	public void setMidMpPotions(List<Potion> midMpPotions) {
		this.midMpPotions = midMpPotions;
	}

	public List<Potion> getHighMpPotions() {
		return highMpPotions;
	}

	public void setHighMpPotions(List<Potion> highMpPotions) {
		this.highMpPotions = highMpPotions;
	}

	public List<Potion> getDefensePotions() {
		return defensePotions;
	}

	public void setDefensePotions(List<Potion> defensePotions) {
		this.defensePotions = defensePotions;
	}

	public List<Potion> getPowerPotions() {
		return powerPotions;
	}

	public void setPowerPotions(List<Potion> powerPotions) {
		this.powerPotions = powerPotions;
	}

	public List<Potion> getAttackSpeedPotions() {
		return attackSpeedPotions;
	}

	public void setAttackSpeedPotions(List<Potion> attackSpeedPotions) {
		this.attackSpeedPotions = attackSpeedPotions;
	}

	public List<Potion> getEvasionPotions() {
		return evasionPotions;
	}

	public void setEvasionPotions(List<Potion> evasionPotions) {
		this.evasionPotions = evasionPotions;
	}
    
    
}
