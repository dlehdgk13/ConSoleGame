package Map;

import java.util.ArrayList;
import java.util.Scanner;

import Item.Armor;
import Item.Potion;
import Item.Weapon;


public class Shop {

	ArrayList<Weapon> weapons;
	 ArrayList<Armor> armors;
	 ArrayList<Potion> hpPotions;
	 ArrayList<Potion> mpPotions;
	 ArrayList<Potion> buffPotions;
	
	 public Shop(
			 ArrayList<Weapon> weapons,
			 ArrayList<Armor> armors,
			 ArrayList<Potion> hpPotions,
			 ArrayList<Potion> mpPotions,
			 ArrayList<Potion> buffPotions) {
		 this.weapons = weapons;
		 this.armors =armors;
		 this.hpPotions = hpPotions;
		 this.mpPotions = mpPotions;
		 this.buffPotions = buffPotions;
	 }
	 //Scanner scan,

	 	public int seilList(int type,int potionTypeNum){
	 		
	 		
				if(type == 1) {

					System.out.println("포션명/가격/효과");
					if(potionTypeNum == 1) {
						for (int index = 0; index < this.getHpPotions().size(); index++) {
							System.out.println((index+1)+"."+this.getHpPotions().get(index).getName()
									+"/"+this.getHpPotions().get(index).getPrice()
									+"/"+this.getHpPotions().get(index).getEffect());
						}
					}else if(potionTypeNum == 2) {	
						for (int index = 0; index < this.getMpPotions().size(); index++) {
							System.out.println((index+1)+"."+this.getMpPotions().get(index).getName()
									+"/"+this.getMpPotions().get(index).getPrice()
									+"/"+this.getMpPotions().get(index).getEffect());
						}
					}else if(potionTypeNum == 3) {	
						for (int index = 0; index < this.getBuffPotions().size(); index++) {
							System.out.println((index+1)+"."+this.getBuffPotions().get(index).getName()
									+"/"+this.getBuffPotions().get(index).getPrice()
									+"/"+this.getBuffPotions().get(index).getEffect());
						}
					}
				}
	 		
			else if(type == 2) {
	 			System.out.println("구입할  무기의 번호를 입력하세요");
				System.out.println("무기명/가격/공격력");
					for (int index = 0; index < this.getWeapons().size(); index++) {
						System.out.println((index+1)+"."+this.getWeapons().get(index).getName()
								+"/"+this.getWeapons().get(index).getPrice()
								+"/"+this.getWeapons().get(index).getPower());
					}
	 		}else if(type == 3) {
	 			System.out.println("구입할 방어구의 번호를 입력하세요");
				System.out.println("방어구명/가격/방어력");
				for (int index = 0; index < this.getArmors().size(); index++) {
					System.out.println((index+1)+"."+this.getArmors().get(index).getName()
							+"/"+this.getArmors().get(index).getPrice()
							+"/"+this.getArmors().get(index).getDefense());
				}
	 		}
				
			Scanner sc = new Scanner(System.in);
			int selectType =sc.nextInt();
			
			return selectType;
	 	}
	
	 	
	 	
	 	
	 	
	 	
	 		public ArrayList<Weapon> getWeapons() {
				return weapons;
			}


			public void setWeapons(ArrayList<Weapon> weapons) {
				this.weapons = weapons;
			}


			public ArrayList<Armor> getArmors() {
				return armors;
			}


			public void setArmors(ArrayList<Armor> armors) {
				this.armors = armors;
			}


			public ArrayList<Potion> getHpPotions() {
				return hpPotions;
			}


			public void setHpPotions(ArrayList<Potion> hpPotions) {
				this.hpPotions = hpPotions;
			}


			public ArrayList<Potion> getMpPotions() {
				return mpPotions;
			}


			public void setMpPotions(ArrayList<Potion> mpPotions) {
				this.mpPotions = mpPotions;
			}


			public ArrayList<Potion> getBuffPotions() {
				return buffPotions;
			}


			public void setBuffPotions(ArrayList<Potion> buffPotions) {
				this.buffPotions = buffPotions;
			}


}
