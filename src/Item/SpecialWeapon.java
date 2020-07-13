package Item;

import java.util.HashMap;
import java.util.Map;

public class SpecialWeapon extends Item{

	int power;
	//기능 추가 예쩡
	
	public SpecialWeapon(String name, String type, int price, String grade,int power) {
		super(name, type, price, grade);
		this.power = power;
	}

	
	public Map<String, SpecialWeapon> specialWeapon() {
		Map<String, SpecialWeapon> specialWeapon = new HashMap<>();
		
		SpecialWeapon bossWeapon1 = new SpecialWeapon(
				"보스 무기1",
				"specialWeapon",
				1500,
				"low",
				50);
		specialWeapon.put("bossWeapon1",bossWeapon1);
		
		SpecialWeapon bossWeapon2 = new SpecialWeapon(
				"보스 무기1",
				"specialWeapon",
				2500,
				"mid",
				100);
		specialWeapon.put("bossWeapon2",bossWeapon2);
		
		SpecialWeapon bossWeapon3 = new SpecialWeapon(
				"보스 무기3",
				"specialWeapon",
				5000,
				"high",
				150);
		specialWeapon.put("bossWeapon3",bossWeapon3);
		
		return specialWeapon;
	}
	
}
