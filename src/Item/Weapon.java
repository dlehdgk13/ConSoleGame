package Item;

import java.util.HashMap;
import java.util.Map;

public class Weapon extends Item {

	int power;
	// 특수효과 및 기능 추가 예정
	
	public Weapon(String name, String type, int price, String grade,int power) {
		super(name, type, price, grade);
		this.power = power;
	}

	public int getPower() {
		return power;
	}

	public void setPower(int power) {
		this.power = power;
	}
}

