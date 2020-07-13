package utill;

import Map.Shop;
import User.Adventurer;

public class ShopList {
	
	ItemList itemList = new ItemList(); 
	
	public Shop ItemShop(Adventurer hero) {
		Shop ItemShop = new Shop(itemList.weapon(), itemList.armor(), itemList.hpPotion(),itemList.mpPotion(),itemList.buffPotion(hero));
		
		return ItemShop;
	}
	
}
