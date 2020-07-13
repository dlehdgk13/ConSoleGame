package Console;

import java.util.ArrayList;
import java.util.List;

import Item.Armor;
import Item.Potion;
import Item.Weapon;
import User.Inventory;

public class InventoryConsole {

	public void printin() {
        for (int i = 0; i < 1; i++) {
            System.out.println("");
        }
	}
	
    public void printHpPotions(Inventory inventory) {
    	printin();
		System.out.println("보유 체력 물약");
		System.out.println("===========================================================");
		System.out.println("1. 하급 hp포션(hp회복량: 50) : " + inventory.getLowHpPotions().size() + "개");
		System.out.println("2. 중급 hp포션(hp회복량: 100): " + inventory.getMidHpPotions().size() + "개");
		System.out.println("3. 상급 hp포션(hp회복량: 300): " + inventory.getHighHpPotions().size() + "개");
		System.out.println("===========================================================");
	}
    
    public void printMpPotions(Inventory inventory) {
    	printin();
		System.out.println("보유 기력 물약");
		System.out.println("===========================================================");
		System.out.println("1. 하급 mp포션(mp회복량: 50) : " + inventory.getLowMpPotions().size() + "개");
		System.out.println("2. 중급 mp포션(mp회복량: 100): " + inventory.getMidMpPotions().size() + "개");
		System.out.println("3. 상급 mp포션(mp회복량: 300): " + inventory.getHighMpPotions().size() + "개");
		System.out.println("===========================================================");
	}
    
    public void printBuffPotions(Inventory inventory) {
    	printin();
		System.out.println("보유 버프 물약");
		System.out.println("===========================================================");
		System.out.println("1. 방어력 상승 포션(방어력 20% 증가) : " + inventory.getDefensePotions().size() + "개");
		System.out.println("2. 공격력 상승 포션(공격력 20% 증가) : " + inventory.getPowerPotions().size() + "개");
		System.out.println("3. 공격속도 상승 포션(공격속도 20% 증가) : " + inventory.getAttackSpeedPotions().size() + "개");
		System.out.println("4. 회피율 상승 포션(회피율 20% 증가) : " + inventory.getEvasionPotions().size() + "개");
		System.out.println("===========================================================");
	}
   
    public void printWeapons(Inventory inventory) {
    	printin();
    	System.out.println("보유 무기");
        System.out.println("==========================================================================");
        if(inventory.getWeapons().size() > 0) {
	        for (int i = 0; i < inventory.getWeapons().size(); i++) {
	            Weapon  weapon = inventory.getWeapons().get(i);
	            System.out.println((i + 1) + ". " + weapon.getName() + "(공격력 " + (int) weapon.getPower() + ")");
	        }
        }else {
        	System.out.println("보유한 무기가 없습니다.");
        }    
        System.out.println("==========================================================================");
    }

    public void printArmors(Inventory inventory) {
    	printin();
    	System.out.println("보유 방어구");
        System.out.println("==========================================================================");
        if(inventory.getArmors().size() > 0) {
        	for (int i = 0; i < inventory.getArmors().size(); i++) {
	        	Armor  armor = inventory.getArmors().get(i);
	            System.out.println((i + 1) + ". " + armor.getName() + "(방어력 " + (int) armor.getDefense() + ")");
	        }
        }else {
        	System.out.println("보유한 방어구가 없습니다.");
        } 
        System.out.println("==========================================================================");
    }
}
