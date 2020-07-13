package utill;

import java.util.Random;
import java.util.Scanner;

import Console.InventoryConsole;
import Map.Dungoun;
import Monster.Monster;
import Thread.LevelUpThread;
import Thread.LoadingThread;
import Thread.SoundThread;
import Thread.TimeTherd;
import User.Adventurer;
import User.Inventory;

public class utill {

    public static void printSpace() {
        for (int i = 0; i < 3; i++) {
            System.out.println("");
        }
    }
	
    public void start() {
		printSpace();
        System.out.println("게임을 시작하시려면 아무 숫자나 눌러주세요");
		Scanner sc = new Scanner(System.in);
		String start = sc.next();
        
		if(start != null) {
	        System.out.println("짭람의 나라에 오신걸 환영합니다.");
		}else {System.out.println("숫자를 입력해 주세요");}
    
    };
    
    public Adventurer characterChoice() {
		printSpace();
        System.out.println("이름을 입력해 주세요");
		Scanner sc = new Scanner(System.in);
		String name = sc.next();
    	
		System.out.println("직업을 선택해 주세요");
		System.out.println("1.전사");
		System.out.println("2.도적");
		System.out.println("3.주술사");
		Scanner sc2 = new Scanner(System.in);
		int jobChoice = sc2.nextInt();
		
		JobList job = new JobList();
		
		Adventurer hero = null;
		
		if(jobChoice == 1) {
		 	hero = job.warrior(name);
		}else if(jobChoice == 2) {
			hero = job.thief(name);
		}else if(jobChoice == 3) {
			hero = job.wizard(name);
		}else {
			System.out.println("다시 입력해 주세요");
		}
		printSpace();
    	return hero;
    };

	public int town() {
		//printSpace();
		int num=0;
		System.out.println("== 부여성 ==");
		System.out.println();
		System.out.println("행동을 선택해 주세요");
		System.out.println("0.인벤토리");
		System.out.println("1.내정보");
		System.out.println("2.장터");
		System.out.println("3.몬스터굴");
		Scanner sc = new Scanner(System.in);
		int move = sc.nextInt();
		if(move == 1) {
			num = 1;
		}else if(move == 2) {
			num = 2;
		}else if (move == 3) {
			num = 3;
		}
		
		return num;
	}
	
	//인벤토리 관련
	public void showInventory(InventoryConsole inventoryList,Inventory inventory) {
		inventoryList.printHpPotions(inventory);
		inventoryList.printMpPotions(inventory);
		inventoryList.printBuffPotions(inventory);
		inventoryList.printWeapons(inventory);
		inventoryList.printArmors(inventory);
	}
	
	public int itemUse() {
		int select = 0;
		while(true){	
			System.out.println("");
			System.out.println("0.나가기");
			System.out.println("1.포션사용");
			System.out.println("2.장비 장착");
			Scanner sc = new Scanner(System.in);
			select = sc.nextInt();
				if(select >= 0 && select <3) {
					break;
				}else {
					System.out.println("다시 선택해 주세요");
				}
			}
		return select;
	}
	
	//아이템 사용 및 장착 관련
	public int selectPotion(Inventory inventory,InventoryConsole inventoryList) {
		int select = 0;
		while(true) {
			System.out.println("사용할 포션종류를 선택");
			System.out.println("1.hp 포션");
			System.out.println("2.mp 포션");
			Scanner sc = new Scanner(System.in);
			select = sc.nextInt();
			if(select == 1) {
				inventoryList.printHpPotions(inventory);
				break;
			}else if(select == 2) {
				inventoryList.printHpPotions(inventory);
				break;
			}/*else if(select == 3) {
				inventoryList.printHpPotions(inventory);
				break;
			}*/else {
				System.out.println("다시 입력 해주세요");
			}
		}
		return select;
	}
	
	public int selectWeapon(Inventory inventory,InventoryConsole inventoryList) {
		int select = 0;
		while(true) {
			System.out.println("장착할 장비 종류를 선택");
			System.out.println("0.나가기");
			System.out.println("1.무기");
			System.out.println("2.방어구");
			Scanner sc = new Scanner(System.in);
			select = sc.nextInt();
			if(select == 0) {
				break;
			}
			else if(select == 1) {
				inventoryList.printWeapons(inventory);
				break;
			}else if(select == 2) {
				inventoryList.printArmors(inventory);
				break;
			}/*else if(select == 3) {
				inventoryList.printHpPotions(inventory);
				break;
			}*/else {
				System.out.println("다시 입력 해주세요");
			}
		}
		return select;
	}
    //전투관련
    public void heroBattle(Adventurer hero,Monster monster) {
		System.out.println("== 전투 ==");
		System.out.println();
		System.out.println("행동을 선택해 주세요");
		System.out.println("1.포션 사용");
		System.out.println("2.일반 공격");
		System.out.println("3.스킬 사용");
		Scanner sc = new Scanner(System.in);
		int select = sc.nextInt();
		if(select == 1) {
			hero.attack(monster);
		}
		
    	
    };
    
	
	//상점관련
	public int seilBuy() {
		int seilbuy = 0;
		while(true) {
			printSpace();
			System.out.println("== 상점  ==");
			System.out.println();
			System.out.println("행동을 선택해 주세요");
			System.out.println("1.구매");
			System.out.println("2.판매");
			Scanner sc = new Scanner(System.in);
			int select =sc.nextInt();
			if(select == 1) {
				seilbuy = 1;
				break;
			}else if(select == 2) {
				seilbuy = 2;
				break;
			}else {
				System.out.println();
				System.out.println("다시 입력해 주세요");
				System.out.println();
			}
		}
		return seilbuy;
	}
	public int shopChoice(int seilbuy) {
			printSpace();
			int type = 0;
			while(true) {
				System.out.println("== 상점  ==");
				System.out.println();
				if(seilbuy == 1) {
					System.out.println("구매 할 물품을 선택해 주세요");
				}
				if(seilbuy == 2) {
					System.out.println("판매 할 물품을 선택해 주세요");
				}
				System.out.println("0.나가기");
				System.out.println("1.포션");
				System.out.println("2.무기");
				System.out.println("3.장비");
				Scanner sc2 = new Scanner(System.in);
				type =sc2.nextInt();
				if(type == 0 ) {
					Thread moveToTown = new Thread(new LoadingThread("moveToTown"));
	        		moveToTown.start();
                    try {
                        moveToTown.join();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    
					break;
				}else if( type == 1 || type == 2 || type == 3) {
					break;
				}else {
					System.out.println();
					System.out.println("다시 입력해 주세요");
					System.out.println();
				}
			};
		return type;
	}
	
	public int potionChoice(int seilBuy) {
		int potionTypeNum = 0;
		System.out.println();
		while(true) {
			if(seilBuy == 1) {
				System.out.println("구매할 포션의 종류를 선택해 주세요");
			}else if(seilBuy == 2) {
				System.out.println("판매할 포션의 종류를 선택해 주세요");
			}
		System.out.println("1.Hp 포션");
		System.out.println("2.Mp 포션");
		System.out.println("3.버프 포션");
    	Scanner scan = new Scanner(System.in);
    	potionTypeNum = scan.nextInt();
			if(potionTypeNum >= 1 && potionTypeNum <= 3) {
				break;
			}else {
				System.out.println();
				System.out.println("다시 입력해 주세요");
				System.out.println();
			}
		}
    	return potionTypeNum;
	};
	
	public int seilPotionChoice() {
		int select = 0;
		while(true) {
		System.out.println("판매하고자 하는 포션의 번호를 선택해 주세요");
    	Scanner scan = new Scanner(System.in);
    	 select = scan.nextInt();
			if(select >= 1 && select <= 4) {
				break;
			}else {
				System.out.println();
				System.out.println("다시 입력해 주세요");
				System.out.println();
			}
		}
    	return select;
	};
	
	public int seilWeaponChoice(Inventory inventory) {
		int select = 0;
		while(true) {
		System.out.println("판매하고자 하는 무기의 번호를 선택해 주세요");
    	Scanner scan = new Scanner(System.in);
    	 select = scan.nextInt();
    	int size = inventory.getWeapons().size();
			if(size > 0 && size < size+1) {
				break;
			}else {
				System.out.println();
				System.out.println("다시 입력해 주세요");
				System.out.println();
			}
		}
    	return select;
	};
	
	public int seilArmorChoice(Inventory inventory) {
		int select = 0;
		while(true) {
		System.out.println("판매하고자 하는 방어구의 번호를 선택해 주세요");
    	Scanner scan = new Scanner(System.in);
    	 select = scan.nextInt();
    	int size = inventory.getArmors().size();
			if(size > 0 && size < size+1) {
				break;
			}else {
				System.out.println();
				System.out.println("다시 입력해 주세요");
				System.out.println();
			}
		}
    	return select;
	};
	////////////////////////////////////////////////////////////////////////////////
	
	//던전관련
	public int dungoun() {
		//printSpace();
		int num = 0;
		while(true) {
			System.out.println("== 던전  ==");
			System.out.println();
			System.out.println("입장할 사냥터를 선택해 주세요");
			System.out.println("1.쥐굴");
			System.out.println("2.유령굴");
			System.out.println("3.비밀세작의집");
			Scanner sc = new Scanner(System.in);
			num =sc.nextInt();
			if(num == 0 || num == 1 || num == 2 || num == 3) {
				break;
			}else {
					System.out.println();
					System.out.println("다시 입력해 주세요");
					System.out.println();
			}
		}
		return num;
	}
	
	public Dungoun selectFightStage(int num,DungounList dungounList) {
		Thread startFighting = new Thread(new LoadingThread("loading"));
		startFighting.start();
        try {
        	startFighting.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
		
		printSpace();
		Dungoun dungoun = new Dungoun();
		if( num == 1) {
			//SoundThread ratSound = new SoundThread("쥐굴.mp3", false);
			System.out.println("쥐굴에 입장하였습니다.");
			dungoun = dungounList.ratOyster();
			//ratSound.start();
		}else if( num == 2) {
			System.out.println("유령굴에 입장 하셨습니다.");
			dungoun = dungounList.ghostOyster();
		}else if( num == 3) {
			System.out.println("비밀 세작의 집 에 입장 하셨습니다.");
			dungoun = dungounList.sejagHouse();
		}
		return dungoun;
	}
	

	//전투 포션사용
	public int usePotionChoice() {
		int potionTypeNum = 0;
		System.out.println();
		while(true) {
			System.out.println("사용할 포션의 종류를 선택해 주세요");
			System.out.println("1.Hp 포션");
			System.out.println("2.Mp 포션");
			System.out.println("3.버프 포션");
	    	Scanner scan = new Scanner(System.in);
	    	potionTypeNum = scan.nextInt();
			if(potionTypeNum >= 1 && potionTypeNum <= 3) {
				break;
			}else {
				System.out.println();
				System.out.println("다시 입력해 주세요");
				System.out.println();
			}
		}
    	return potionTypeNum;
	};
	
	public void  fight(Dungoun dungoun,Adventurer hero,Inventory inventory,InventoryConsole inventoryList) {
        Random random = new Random();

		Thread startFighting = new Thread(new LoadingThread("startFighting"));
		startFighting.start();
        try {
        	startFighting.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        int  monsterNum = random.nextInt(10) + 1;//80~100%데미지
		String dia; // 1 이면 유저 2면 몬스터
		int UserAttackCount = 0; // 3 이되면 공속이 빠른쪽이 한번더 공격
		int MonsterAttackCount = 0; // 3 이되면 공속이 빠른쪽이 한번더 공격
		Monster monster = null;
        if(monsterNum <= 7 ) {
        	monster = dungoun.getNomal();
    		System.out.println();
        	System.out.println(monster.getName()+" 를 마주쳤습니다! ");
        	System.out.println("설명 = "+monster.getExplanation());
    		System.out.println("== 전투 ==");
    		System.out.println();
    		System.out.println(monster.getHp());
    	}else if(monsterNum >7 && monsterNum <10) {
        	monster = dungoun.getNamed();
    		System.out.println();
        	System.out.println(monster.getName()+" 를 마주쳤습니다! ");
        	System.out.println("설명 = "+monster.getExplanation());
    		System.out.println("== 전투 ==");
    		System.out.println();
    	}else if(monsterNum >= 10) {
        	monster = dungoun.getBoss();
    		System.out.println();
        	System.out.println(monster.getName()+" 를 마주쳤습니다! ");
        	System.out.println("설명 = "+monster.getExplanation());
    		System.out.println("== 전투 ==");
    		System.out.println();
    	};
    	
    	
    	
    	int move = 0;
    	while(true) {
    		System.out.println("행동을 선택해 주세요");
    		System.out.println("0.도망 가기");
    		System.out.println("1.포션 사용");
    		System.out.println("2.일반 공격");
    		System.out.println("3.스킬 사용");
    		System.out.println();
    		System.out.println("===== "+hero.getName()+" 의 상태 =====");
    		System.out.println("최대체력/체력");
    		System.out.println(hero.getMaxHp()+"/"+hero.getHp());
    		System.out.println("최대기력/기력");
    		System.out.println(hero.getMaxMp()+"/"+hero.getMp());
    		System.out.println();
    		Scanner sc = new Scanner(System.in);
    		int select = sc.nextInt();
    		if(select == 0) {
    			Thread moveToTown = new Thread(new LoadingThread("moveToTown"));
                moveToTown.start();
                try {
                    moveToTown.join();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
    			break;
    		}else if(select == 1) {
    			//포션 사용시
    		    int potionTypeNum = usePotionChoice();
    		    if(potionTypeNum == 1) {
	       			inventoryList.printHpPotions(inventory);
	       		}else if(potionTypeNum == 2) {
	       			inventoryList.printMpPotions(inventory);
	       		}else if(potionTypeNum == 3) {
	       			inventoryList.printBuffPotions(inventory);
	       		}
    			hero.usePotion(hero, inventory, potionTypeNum);
    		}else if(select == 2) {
        		//공격속도가 빠른 사람이 선공
        		if(hero.getAttackSpeed() > monster.getAttackSpeed()) {
        			System.out.println("====="+hero.getName()+"의 공격=====");
        			hero.attack(monster);
        			UserAttackCount++;
        			System.out.println();
        		}else if(hero.getAttackSpeed() < monster.getAttackSpeed()){
        			System.out.println("====="+monster.getName()+"의 공격=====");
        			int monsterHpPercent= monster.getHp() * 100 / monster.getMaxHp();
        			if(monsterHpPercent <= 60 && monsterHpPercent > 30  && ( monster.getGrade().equals("nomal") || monster.getGrade().equals("boss") ) ) { 
						monster.useSkill(hero);
						
					}else if(monsterHpPercent <= 30 && monster.getGrade().equals("boss")) {
						monster.useAngrySkill(hero);
					}else {
						monster.attack(hero);
					}
        			MonsterAttackCount++;
        			System.out.println();
        		}
        		
        		//유저 사망
        		if(hero.getHp() <= 0) {
        			hero.die();
        			break;
        		//몬스터 사망
        		}else if(monster.getHp() <= 0) {
        			monster.die(hero, inventory);
        			monster.drop(dungoun, monster, inventory);
        			break;
        		}
        		
        		//공격 속도가 빠른사람이 3번쨰 공격을 할시 추가타
        		if(UserAttackCount == 3) {
        			hero.attack(monster);
        			UserAttackCount = 0;
        		}else if(MonsterAttackCount == 3){
        			monster.attack(hero);
        			MonsterAttackCount = 0;
        		}
        		
        		//공격속도 가 느린사람의 후공
        		if(hero.getAttackSpeed() < monster.getAttackSpeed()) {
        			System.out.println("====="+hero.getName()+"의 공격=====");
        			hero.attack(monster);
        			System.out.println();
        		}else if(hero.getAttackSpeed() > monster.getAttackSpeed()){
        			System.out.println("====="+monster.getName()+"의 공격=====");
        			int monsterHpPercent= monster.getHp() * 100 / monster.getMaxHp();
        			if(monsterHpPercent <= 60 && monsterHpPercent > 30  && ( monster.getGrade().equals("named") || monster.getGrade().equals("boss") ) ) { 
						monster.useSkill(hero);
					}else if(monsterHpPercent <= 30 && monster.getGrade().equals("boss")) {
						monster.useAngrySkill(hero);
					}else {
						monster.attack(hero);
					}
        				System.out.println();
        		}
        	
        	}else if(select == 3) {
        		//스킬사용시
        		if(hero.getAttackSpeed() > monster.getAttackSpeed()) {
        			System.out.println("====="+hero.getName()+"의 공격=====");
	    			hero.useSkill(monster);
	    			UserAttackCount++;
        		}else if(hero.getAttackSpeed() < monster.getAttackSpeed()){
        			System.out.println("====="+monster.getName()+"의 공격=====");
        			int monsterHpPercent= monster.getHp() * 100 / monster.getMaxHp();
					if(monsterHpPercent <= 80 ) { 
						if(monsterHpPercent <= 30 ) {
							monster.useAngrySkill(hero);
						}else {
						monster.useSkill(hero);
						}
					}else {
						monster.attack(hero);
					}
        			MonsterAttackCount++;
        			System.out.println();
        		}
        		
        		//유저 사망
        		if(hero.getHp() <= 0) {
        			hero.die();
        			break;
        		//몬스터 사망
        		}else if(monster.getHp() <= 0) {
        			monster.die(hero, inventory);
        			monster.drop(dungoun, monster, inventory);
        			break;
        		}
        		
        		//공격 속도가 빠른사람이 3번쨰 공격을 할시 추가타
        		if(UserAttackCount == 3) {
        			hero.attack(monster);
        			UserAttackCount = 0;
        		}else if(MonsterAttackCount == 3){
        			monster.attack(hero);
        			MonsterAttackCount = 0;
        		}
        		
        		//공격속도 가 느린사람의 후공
        		if(hero.getAttackSpeed() < monster.getAttackSpeed()) {
        			System.out.println("====="+hero.getName()+"의 공격=====");
	    			hero.useSkill(monster);
        			System.out.println();
        		}else if(hero.getAttackSpeed() > monster.getAttackSpeed()){
        			System.out.println("====="+monster.getName()+"의 공격=====");
        			int monsterHpPercent= monster.getHp() * 100 / monster.getMaxHp();
					if(monsterHpPercent <= 60 && monsterHpPercent > 30  && ( monster.getGrade().equals("named") || monster.getGrade().equals("boss") ) ) { 
						monster.useSkill(hero);
					}else if(monsterHpPercent <= 30 && monster.getGrade().equals("boss")) {
						monster.useAngrySkill(hero);
					}else {
						monster.attack(hero);
					}
        			System.out.println();
        		}
        	}
    		
    		//유저 사망
    		if(hero.getHp() <= 0) {
    			hero.die();
    			break;
    		//몬스터 사망
    		}else if(monster.getHp() <= 0) {
    			monster.die(hero, inventory);
    			monster.drop(dungoun, monster, inventory);
    			break;
    		}
        }

		/*Thread loading = new Thread( new LoadingThread("moveToTown"));
		System.out.println();
		loading.start();
		 try {
			 loading.join();
	        } catch (InterruptedException e) {
	            e.printStackTrace();
	     }
	     */
		//return 0;
	}
}
