package main;

import java.util.ArrayList;

import Console.CharacterInfoConsole;
import Console.InventoryConsole;
import Item.Potion;
import Map.Dungoun;
import Thread.LoadingThread;
import Thread.OpeningThread;
import Thread.SoundThread;
import Thread.TimeTherd;
import User.Adventurer;
import User.Inventory;
import utill.DungounList;
import utill.ItemList;
import utill.ShopList;
import utill.utill;

public class Main {

	public static void main(String[] args) throws InterruptedException { 
		
		// 구동 메소드 모음
		utill utill = new utill(); //구동 메소드 모음
		
		// 콘솔창 모음
		CharacterInfoConsole characterInfo = new CharacterInfoConsole(); //캐릭터 정보
		InventoryConsole inventoryList = new InventoryConsole(); //인벤토리 정보
        ShopList shopList = new ShopList(); // 상점 목록
		
		// 리스트 모음
		DungounList dungounList = new DungounList(); 
		Dungoun dungoun = new Dungoun();
		
		//음악 스레드
		SoundThread openingSound = new SoundThread("title.mp3", true); //시작 곡
		SoundThread townSound = new SoundThread("부여성.mp3", true);  // 마을
		SoundThread shopSound = new SoundThread("shop.mp3", true); // 상점
		SoundThread ratSound = new SoundThread("쥐굴.mp3", true);
		SoundThread ghostSound = new SoundThread("유령굴.mp3", true);
		SoundThread emissarySound = new SoundThread("비밀세작.mp3", true);
		
		//시간 관련 스레드
	    Thread timeTherd = new Thread(new TimeTherd());
		
		//로딩 스레드
        
		
		
		// 테스트용 아이템호출
		ItemList item = new ItemList();
		
		//인벤토리
        Inventory inventory =new Inventory(
        		0,
        		new ArrayList<>(),
                new ArrayList<>(),
                new ArrayList<Potion>(),
                new ArrayList<Potion>(),
                new ArrayList<Potion>(),
                new ArrayList<Potion>(),
                new ArrayList<Potion>(),
                new ArrayList<Potion>(),
                new ArrayList<Potion>(),
                new ArrayList<Potion>(),
                new ArrayList<Potion>(),
                new ArrayList<Potion>()
        		);
		
	    Thread opening = new Thread(new OpeningThread());
		opening.start();
        openingSound.start();
        try {
        	opening.join(); //끝나고 난후 넘어가기
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        
        utill.start(); // 게임 시작
        Adventurer hero = null;
		//SoundThread button = new SoundThread("button.mp3", false);
		//button.start();

		

    	
    	while(true) {
    		hero = utill.characterChoice(); //캐릭터 선택
            Thread initCharacter = new Thread(new LoadingThread("initCharacter"));
            initCharacter.start();
            try {
            	initCharacter.join(); //끝나고 난후 넘어가기
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
    		if(hero != null) {
    			break;
    		}
    	}
        openingSound.finish();
        
        //테스트용
    	inventory.lowHpPotions.add(item.hpPotion().get(0));
    	inventory.lowHpPotions.add(item.hpPotion().get(0));
		inventory.midHpPotions.add(item.hpPotion().get(1));
		inventory.highHpPotions.add(item.hpPotion().get(2));
		inventory.lowMpPotions.add(item.mpPotion().get(0));
		inventory.midMpPotions.add(item.mpPotion().get(1));
		inventory.highMpPotions.add(item.mpPotion().get(2));
		inventory.defensePotions.add(item.buffPotion(hero).get(0));
		inventory.powerPotions.add(item.buffPotion(hero).get(1));
		inventory.attackSpeedPotions.add(item.buffPotion(hero).get(2));
		inventory.evasionPotions.add(item.buffPotion(hero).get(3));
		inventory.weapons.add(item.weapon().get(2));
		inventory.weapons.add(item.weapon().get(1));
		inventory.weapons.add(item.weapon().get(0));
		inventory.armors.add(item.armor().get(0));
		inventory.armors.add(item.armor().get(1));
		
		//음악 스래드 관련 변수
		int rat = 0;
		int ghost = 0;
		int emissary = 0;
		int shop = 0;
		
		synchronized (townSound) {	
		townSound.start();
		}
		
		timeTherd.start();
        loop1:
        while(true) {
    		synchronized (townSound) {	
				Thread.sleep(500);
    			townSound.resume();
    		}
			/*synchronized (townSound) {	   
					townSound.notify();
			}*/
        	int move = utill.town();
        	if(move == 0) {
        		utill.showInventory(inventoryList, inventory);
        		while(true) {
        			int selectNum = utill.itemUse();
        			if(selectNum == 0) {
        				break;
        			}else if(selectNum == 1) {
        				//포션사용
				       	int potionTypeNum = utill.selectPotion(inventory, inventoryList);
				       	hero.invenUsePotion(hero, inventory, potionTypeNum);
        				break;
        			}else if(selectNum == 2) {
        				//장비장착
        				int weaponArmorType = utill.selectWeapon(inventory, inventoryList);
        				if(weaponArmorType == 1) {
        					//무기
        					hero.setWeapon(hero,inventory);
            				break;
        				}else if(weaponArmorType == 2) {
        					//장비
        					hero.setArmor(hero, inventory);
            				break;
        				}
        			}
        		}
        	}
        	else if(move == 1) {//내정보
        		characterInfo.print(hero);
        	}else if(move == 2) {//장터
        		//장터 음악 쓰래드 시작
    			synchronized (townSound) {	   
    				townSound.suspend();
    			}
    			synchronized (shopSound) {
    				if(shop == 0) {
    	        		shopSound.start();
    	        		shop = 1;
    				}else if(shop == 1){
        				Thread.sleep(500);
    					shopSound.resume();
    				}
    			}
    			int potionTypeNum = 0;
    			int seilBuy = 0;
					seilBuy = utill.seilBuy();
        		if(seilBuy == 1) {
        			while(true) {
				        	int type = utill.shopChoice(seilBuy);
				        	if(type == 0) {
				        		break;
				        	}else if(type == 1) {
						       	potionTypeNum = utill.potionChoice(seilBuy);
						    }
					        int selectNum = shopList.ItemShop(hero).seilList(type,potionTypeNum);//선택한 번호의 아이탬 리스트 보여주기
					        hero.buyItem(type, selectNum,potionTypeNum,inventory,hero);
	        		}
        		}
        		else if(seilBuy == 2) {
        			int selectNum = 0;
    				while(true) {		
			        		int type = utill.shopChoice(seilBuy);
			        		if(type == 0) {
			        			break;
			        		}else if(type == 1) {
						       	potionTypeNum = utill.potionChoice(seilBuy);
						       		if(potionTypeNum == 1) {
						       			inventoryList.printHpPotions(inventory);
						       		}else if(potionTypeNum == 2) {
						       			inventoryList.printMpPotions(inventory);
						       		}else if(potionTypeNum == 3) {
						       			inventoryList.printBuffPotions(inventory);
						       		}
						       	selectNum =utill.seilPotionChoice();
						       	hero.seilItem(type, selectNum, potionTypeNum, inventory, hero);
			        		}else if(type == 2) {
			        			inventoryList.printWeapons(inventory);
			        			selectNum = utill.seilWeaponChoice(inventory);
						       	hero.seilItem(type, selectNum, potionTypeNum, inventory, hero);
			        		}else if(type == 3) {
			        			inventoryList.printArmors(inventory);
			        			selectNum = utill.seilArmorChoice(inventory);
						       	hero.seilItem(type, selectNum, potionTypeNum, inventory, hero);
			        		}
	        		}
	            }
        		
        		
        		//장터 음악 쓰래드 종료
    			synchronized (shopSound) {	   
    				shopSound.suspend();
    			}
        	}else if(move == 3) {//던전입장 후 전투
        		while(true) {
        			int dungounNum = utill.dungoun();
	        			synchronized (townSound) {
	        				townSound.suspend();
	        			}
        			if(dungounNum == 1) {
            			synchronized (ratSound) {
                				if(rat == 0) {
                					ratSound.start();
                					rat = 1;
                				}else if(rat == 1){
        	        				Thread.sleep(500);
                					ratSound.resume();
                				}
            			}
        			}else if(dungounNum == 2) {
            			synchronized (ghostSound) {
                				if(ghost == 0) {
                					ghostSound.start();
                					ghost = 1;
                				}else if(ghost == 1){
        	        				Thread.sleep(500);
                					ghostSound.resume();
                				}
            			}
        			}else if(dungounNum == 3) {
            			synchronized (emissarySound) {
                				if(emissary == 0) {
                					emissarySound.start();
                					emissary = 1;
                				}else if(emissary == 1){
        	        				Thread.sleep(500);
                					emissarySound.resume();
                				}
            			}
        			}
        			dungoun = utill.selectFightStage(dungounNum, dungounList);
        			utill.fight(dungoun, hero, inventory, inventoryList);
        			if(hero.getExp() >= hero.getMaxExp()) {
        				hero.levelUp(hero);
        			}
        			Thread loading = new Thread( new LoadingThread("moveToTown"));
        			System.out.println();
        			loading.start();
        			 try {
        				 loading.join();
        		        } catch (InterruptedException e) {
        		            e.printStackTrace();
        		     }
        			
        			if(dungounNum == 1) {
            				ratSound.suspend();
        			}if(dungounNum == 2) {
            				ghostSound.suspend();
        			}if(dungounNum == 3) {
            				emissarySound.suspend();
        			}
        			break;
        		}
        	}
        }
	}

}
