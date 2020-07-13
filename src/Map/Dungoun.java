package Map;

import java.util.HashMap;
import java.util.Map;

import Monster.Monster;

public class Dungoun {

	int floor;
	Monster boss;
	Monster named;
	Monster nomal;
	
	public int getFloor() {
		return floor;
	}
	public void setFloor(int floor) {
		this.floor = floor;
	}
	public Monster getBoss() {
		return boss;
	}
	public void setBoss(Monster boss) {
		this.boss = boss;
	}
	public Monster getNamed() {
		return named;
	}
	public void setNamed(Monster named) {
		this.named = named;
	}
	public Monster getNomal() {
		return nomal;
	}
	public void setNomal(Monster nomal) {
		this.nomal = nomal;
	}
}
