package Item;

import java.util.HashMap;
import java.util.Map;

public class Armor extends Item{

	
	int defense;
	
	public Armor(String name, String type, int price, String grade,int defense) {
		super(name, type, price, grade);
		this.defense = defense;
	}


	
	public int getDefense() {
		return defense;
	}


	public void setDefense(int defense) {
		this.defense = defense;
	}

	
}
