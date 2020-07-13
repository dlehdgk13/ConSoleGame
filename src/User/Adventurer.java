package User;

import java.util.Scanner;

import Item.Armor;
import Item.Potion;
import Item.Weapon;
import Monster.Monster;
import Thread.LevelUpThread;
import Thread.LoadingThread;
import Thread.SkillSoundThread;
import Thread.SoundThread;
import Thread.attackTypeThread;
import main.Skill;
import utill.ItemList;


public class Adventurer extends Character{



	Skill skill1;
	Skill skill2;
	Skill skill3;
	Skill skill4;
	Skill specialSkill;
	Weapon weapon;
    Armor armor;
	
	public Adventurer(String name, int hp, int maxHp, int mp, int maxMp, int power, int defense, double attackSpeed,
			int evasion, int exp, int maxExp, int level,String weaponType,Skill skill1,Skill skill2,Skill skill3,Skill skill4,Skill specialSkill,
			 Weapon weapon,
			 Armor armor) {
		super(name, hp, maxHp, mp, maxMp, power, defense, attackSpeed, evasion, exp, maxExp, level,weaponType);
		this.skill1 = skill1;
		this.skill2 = skill2;
		this.skill3 = skill3;
		this.skill4 = skill4;
		this.specialSkill = specialSkill;
		this.weapon = weapon;
		this.armor =armor;
	}
	
	public void skillSound(Adventurer hero, int type) {
	
			if(hero.getWeaponType().equals("sword") && type == 1) {
				SkillSoundThread	geongon = new SkillSoundThread("건곤대나이.mp3", false);
				geongon.start();
				 try {
					 geongon.join();
			        } catch (InterruptedException e) {
			            e.printStackTrace();
			     }
			}else if(hero.getWeaponType().equals("sword") && type == 2) {
				SkillSoundThread	nule = new SkillSoundThread("누리의 기원.mp3", false);
				nule.start();
				 try {
					 nule.join();
			        } catch (InterruptedException e) {
			            e.printStackTrace();
			     }
			}else if(hero.getWeaponType().equals("sword") && type == 3) {
				SkillSoundThread	 backhoe = new SkillSoundThread("백호참.mp3", false);
				backhoe.start();
				 try {
					 backhoe.join();
			        } catch (InterruptedException e) {
			            e.printStackTrace();
			     }
			}else if(hero.getWeaponType().equals("sword") && type == 4) {
				SkillSoundThread	 chohon = new SkillSoundThread("초혼비무.mp3", false);
				chohon.start();
				 try {
					 chohon.join();
			        } catch (InterruptedException e) {
			            e.printStackTrace();
			     }
			}else if(hero.getWeaponType().equals("dagger") && type == 1) {
				SkillSoundThread	skill1 = new SkillSoundThread("비영승보.mp3", false);
				skill1.start();
				 try {
					 skill1.join();
			        } catch (InterruptedException e) {
			            e.printStackTrace();
			     }
			}else if(hero.getWeaponType().equals("dagger") && type == 2) {
				SkillSoundThread	skill2 = new SkillSoundThread("투명.mp3", false);
				skill2.start();
				 try {
					 skill2.join();
			        } catch (InterruptedException e) {
			            e.printStackTrace();
			     }
			}else if(hero.getWeaponType().equals("dagger") && type == 3) {
				SkillSoundThread	 skill3 = new SkillSoundThread("필살검무.mp3", false);
				skill3.start();
				 try {
					 skill3.join();
			        } catch (InterruptedException e) {
			            e.printStackTrace();
			     }
			}else if(hero.getWeaponType().equals("dagger") && type == 4) {
				SkillSoundThread	 skill4 = new SkillSoundThread("어검술.mp3", false);
				skill4.start();
				 try {
					 skill4.join();
			        } catch (InterruptedException e) {
			            e.printStackTrace();
			     }
			}else if(hero.getWeaponType().equals("staff") && type == 1) {
				SkillSoundThread	 skill1 = new SkillSoundThread("작열주.mp3", false);
				skill1.start();
				 try {
					 skill1.join();
			        } catch (InterruptedException e) {
			            e.printStackTrace();
			     }
			}else if(hero.getWeaponType().equals("staff") && type == 2) {
				SkillSoundThread	 skill2 = new SkillSoundThread("뇌격주.mp3", false);
				skill2.start();
				 try {
					 skill2.join();
			        } catch (InterruptedException e) {
			            e.printStackTrace();
			     }
			}else if(hero.getWeaponType().equals("staff") && type == 3) {
				SkillSoundThread	 skill3 = new SkillSoundThread("진 뇌격주.mp3", false);
				skill3.start();
				 try {
					 skill3.join();
			        } catch (InterruptedException e) {
			            e.printStackTrace();
			     }
			}else if(hero.getWeaponType().equals("staff") && type == 4) {
				SkillSoundThread	 skill4 = new SkillSoundThread("극진백열참주.mp3", false);
				skill4.start();
				 try {
					 skill4.join();
			        } catch (InterruptedException e) {
			            e.printStackTrace();
			     }
			}
		
	}
	
	
	
	public int useSkill(Monster monster) {
        int damage = 0;
		while(true) {
			System.out.println("사용할 기술의 번호를 입력");
			System.out.println("1."+this.skill1.getName()+"(소모 기력:"+this.skill1.getMp()+")");
			System.out.println("2."+this.skill2.getName()+"(소모 기력:"+this.skill2.getMp()+")");
			System.out.println("3."+this.skill3.getName()+"(소모 기력:"+this.skill3.getMp()+")");
			System.out.println("4."+this.skill4.getName()+"(소모 기력:"+this.skill4.getMp()+")");
			Scanner sc = new Scanner(System.in);
			int select = sc.nextInt();
			System.out.println("");
			if(select == 1 && this.getLevel() >= this.skill1.getUseLevel() ) {
				if(this.getMp() >= this.skill1.getMp()) {
					if(this.skill1.getDamage() > monster.getDefense()) {
		            	damage = this.skill1.getDamage() - monster.getDefense();
		            	this.setMp(this.getMp() - this.skill1.getMp());
		            	System.out.println(this.skill1.getName()+"!");
		                System.out.println(monster.getName()+"에게 "+damage+"만큼의 피해를 주었습니다.");
		    			skillSound(this, select);
		    			attackTypeThread attackType = new attackTypeThread();
		    			attackType.attackType(this, monster, skill1.getSkillType());
					}else if(this.skill1.getDamage() <= monster.getDefense()) {
		            	System.out.println(this.skill1.getName()+"!");
		            	this.setMp(this.getMp() - this.skill1.getMp());
			            System.out.println(monster.getName()+"에게 "+damage+"만큼의 피해를 주었습니다.");
		    			skillSound(this, select);
		    			attackTypeThread attackType = new attackTypeThread();
		    			attackType.attackType(this, monster, skill1.getSkillType());
					}
				}else {
					System.out.println("기력이 부족합니다.");
					this.attack(monster);
				}
		        monster.setHp(monster.getHp() - damage);
		        System.out.println(monster.getName()+"의 남은 체력 :"+monster.getHp());
				break;
			}else if(select == 2 && this.getLevel() >= this.skill2.getUseLevel()) {
				if(this.getMp() >= this.skill2.getMp()) {
					if(this.skill2.getDamage() > monster.getDefense()) {
		            	System.out.println(this.skill2.getName()+"!");
		            	damage = this.skill2.getDamage() - monster.getDefense();
		            	this.setMp(this.getMp() - this.skill2.getMp());
		                System.out.println(monster.getName()+"에게 "+damage+"만큼의 피해를 주었습니다.");
		    			skillSound(this, select);
		    			attackTypeThread attackType = new attackTypeThread();
		    			attackType.attackType(this, monster, skill2.getSkillType());
					}else if(this.skill2.getDamage() <= monster.getDefense()) {
		            	System.out.println(this.skill2.getName()+"!");
		            	this.setMp(this.getMp() - this.skill2.getMp());
			            System.out.println(monster.getName()+"에게 "+damage+"만큼의 피해를 주었습니다.");
		    			skillSound(this, select);
		    			attackTypeThread attackType = new attackTypeThread();
		    			attackType.attackType(this, monster, skill2.getSkillType());
					}

				}else {
					System.out.println("기력이 부족합니다.");
					this.attack(monster);
			        System.out.println(monster.getName()+"의 남은 체력 :"+monster.getHp());
				}
		        monster.setHp(monster.getHp() - damage);
				break;
			}else if(select == 3 && this.getLevel() >= this.skill3.getUseLevel()) {
				if(this.getMp() >= this.skill3.getMp()) {
					if(this.skill3.getDamage() > monster.getDefense()) {
		            	System.out.println(this.skill3.getName()+"!");
		            	damage = this.skill3.getDamage() - monster.getDefense();
		            	this.setMp(this.getMp() - this.skill3.getMp());
		                System.out.println(monster.getName()+"에게 "+damage+"만큼의 피해를 주었습니다.");
		    			skillSound(this, select);
		    			attackTypeThread attackType = new attackTypeThread();
		    			attackType.attackType(this, monster, skill3.getSkillType());
					}else if(this.skill3.getDamage() <= monster.getDefense()) {
		            	System.out.println(this.skill3.getName()+"!");
		            	this.setMp(this.getMp() - this.skill3.getMp());
			            System.out.println(monster.getName()+"에게 "+damage+"만큼의 피해를 주었습니다.");
		    			skillSound(this, select);
		    			attackTypeThread attackType = new attackTypeThread();
		    			attackType.attackType(this, monster, skill3.getSkillType());
					}
				}else {
					System.out.println("기력이 부족합니다.");
					this.attack(monster);
				}
		        monster.setHp(monster.getHp() - damage);
		        System.out.println(monster.getName()+"의 남은 체력 :"+monster.getHp());
				break;
			}else if(select == 4 && this.getLevel() >= this.skill4.getUseLevel()) {
				if(this.getMp() >= this.skill4.getMp()) {
					if(this.skill4.getDamage() > monster.getDefense()) {
		            	System.out.println(this.skill4.getName()+"!");
		            	this.setMp(this.getMp() - this.skill4.getMp());
		            	damage = this.skill4.getDamage() - monster.getDefense();
		                System.out.println(monster.getName()+"에게 "+damage+"만큼의 피해를 주었습니다.");
		    			skillSound(this, select);
		    			attackTypeThread attackType = new attackTypeThread();
		    			attackType.attackType(this, monster, skill4.getSkillType());
					}else if(this.skill4.getDamage() <= monster.getDefense()) {
		            	System.out.println(this.skill4.getName()+"!");
		            	this.setMp(this.getMp() - this.skill4.getMp());
			            System.out.println(monster.getName()+"에게 "+damage+"만큼의 피해를 주었습니다.");
		    			skillSound(this, select);
		    			attackTypeThread attackType = new attackTypeThread();
		    			attackType.attackType(this, monster, skill4.getSkillType());
					}
				}else {
					System.out.println("기력이 부족합니다.");
					this.attack(monster);
				}
		        monster.setHp(monster.getHp() - damage);
		        System.out.println(monster.getName()+"의 남은 체력 :"+monster.getHp());
				break;
			}else {
				System.out.println("스킬 사용 가능 레벨이 아닙니다.");
			}
		}
		return damage;
	}
	
	@Override
	public int attack(Monster monster) {
		 SoundThread attackSound = new SoundThread("attack.mp3", false);
		 attackSound.start();
		int attack=monster.getHp()-this.getPower();
		System.out.println("일반 공격");
        int damage = 0;
        if(this.power > monster.getDefense()) {
            damage = this.power - monster.getDefense();
            System.out.println(monster.getName()+"에게 "+damage+"만큼의 피해를 주었습니다.");
        }else if(this.power <= monster.getDefense()) {
        	damage = 0;
            System.out.println(monster.getName()+"에게 "+damage+"만큼의 피해를 주었습니다.");
        }
        monster.setHp(monster.getHp() - damage);
        System.out.println(monster.getName()+"의 남은 체력"+monster.getHp());
        return damage;
	}
	
	@Override
	public void die() {	
		 SoundThread dieSound = new SoundThread("lose.mp3", false);
		 dieSound.start();
		 System.out.println("사망 하여 마을로 되돌아 갑니다.");
		 int dieExp = this.exp/2;
		 this.exp = dieExp;
		 System.out.println("경험치"+dieExp+"로 감소되었 습니다.");
		 this.setHp(this.getMaxHp());
	     Thread loading = new Thread(new LoadingThread("loading"));
		 loading.start();
	}
	
	@Override
	public void levelUp(Adventurer hero) {
		SoundThread dieSound = new SoundThread("level_up.mp3", false);
		dieSound.start();
		Thread levelUp = new Thread( new LevelUpThread());
			
			levelUp.start();
	        try {
	            levelUp.join();
	        } catch (InterruptedException e) {
	            e.printStackTrace();
	        }
	        while(true) {
				this.setLevel(this.getLevel()+1);
				this.setPower(this.getPower() + 20);
				this.setMaxHp(this.getMaxHp() + 100);
				this.setMaxMp(this.getMaxMp() + 100);
				this.setMaxExp(this.getMaxExp()*2);
				System.out.println();
		        System.out.println("축하드립니다. 레벨업을 하셨습니다!!");
				System.out.println("레벨 = "+this.getLevel());
				System.out.println("최대 체력 ="+this.getMaxHp());
				System.out.println("최대 기력 ="+this.getMaxMp());
				System.out.println("필요 경험치량 ="+(this.getMaxExp() - this.getExp()));
				System.out.println("");
			    this.setHp(this.getMaxHp());
			    this.setMp(this.getMaxMp());
				if(hero.getExp() < hero.getMaxExp()) {
					break;
				}
	        }
	}
	
	//아이템 사용
	public void usePotion(Adventurer hero,Inventory inventory,int potionTypeNum) {
		ItemList item = new ItemList();
    	//포션 먹은 효과음쓰래드 
		System.out.println("사용할 포션을 선택하세요");
		Scanner sc = new Scanner(System.in);
		int selectNum = sc.nextInt();
		int usePotionNum = selectNum;
		if(potionTypeNum == 1) {
        	Potion hpPotion = null;
        	if(usePotionNum == 1 && inventory.getLowHpPotions().size() > 0) {
	        	 hpPotion =inventory.getLowHpPotions().get(0);
	        	 
        		int heroHp = hero.getHp() + hpPotion.getHp();
        			if(heroHp >hero.getMaxHp()) {
        				heroHp = hero.getMaxHp(); 
        			}
        		hero.setHp(heroHp);
	        	inventory.lowHpPotions.remove(0);
	        	System.out.println();
	        	System.out.println(hpPotion.getName()+"(회복량: "+hpPotion.getHp()+")"+" 사용");
	        	System.out.println("최대체력/체력");
	        	System.out.println(hero.getMaxHp()+"/"+hero.getHp());
	        	System.out.println();
	        	usePotionSound();
        	}else if(usePotionNum == 2 && inventory.getMidHpPotions().size() > 0) {
        		hpPotion =inventory.getMidHpPotions().get(0);
        		int heroHp = hero.getHp() + hpPotion.getHp();
        			if(heroHp >hero.getMaxHp()) {
        				heroHp = hero.getMaxHp(); 
        			}
        		hero.setHp(heroHp);
	        	inventory.midHpPotions.remove(0);
	        	System.out.println(hpPotion.getName()+"(회복량: "+hpPotion.getHp()+")"+" 사용");
	        	System.out.println("최대체력/체력");
	        	System.out.println(hero.getMaxHp()+"/"+hero.getHp());
	        	usePotionSound();
        	}else if(usePotionNum == 3 && inventory.getHighHpPotions().size() > 0) {
        		hpPotion =inventory.getHighHpPotions().get(0);
        		int heroHp = hero.getHp() + hpPotion.getHp();
    			if(heroHp >hero.getMaxHp()) {
    				heroHp = hero.getMaxHp(); 
    			}
	    		hero.setHp(heroHp);
	        	inventory.highHpPotions.remove(0);
	        	System.out.println(hpPotion.getName()+"(회복량: "+hpPotion.getHp()+")"+" 사용");
	        	System.out.println("최대체력/체력");
	        	System.out.println(hero.getMaxHp()+"/"+hero.getHp());
	        	usePotionSound();
        	}else {
        		System.out.println();
        		System.out.println("보유 포션이 부족합니다.");
        		System.out.println();
        	}
        	
		}else if(potionTypeNum == 2) {
			Potion MpPotion = null;
        	if(usePotionNum == 1 && inventory.getLowMpPotions().size() > 0) {
        		MpPotion =inventory.getLowMpPotions().get(0);
	        	 
        		int heroMp = hero.getMp() + MpPotion.getMp();
        		
        		if(heroMp >hero.getMaxMp()) {
        				heroMp = hero.getMaxMp(); 
        		}
        		hero.setMp(heroMp);
	        	inventory.lowMpPotions.remove(0);
	        	System.out.println();
	        	System.out.println(MpPotion.getName()+"(회복량: "+MpPotion.getMp()+")"+"사용");
	        	System.out.println("최대기력/기력");
	        	System.out.println(hero.getMaxMp()+"/"+hero.getMp());
	        	System.out.println();
	        	usePotionSound();
        	}else if(usePotionNum == 2 && inventory.getMidMpPotions().size() > 0) {
        		MpPotion =inventory.getMidMpPotions().get(0);
        		int heroMp = hero.getMp() + MpPotion.getMp();
        		
    			if(heroMp >hero.getMaxMp()) {
    					heroMp = hero.getMaxMp(); 
    			}
        		hero.setMp(heroMp);
	        	inventory.midMpPotions.remove(0);
	        	System.out.println(MpPotion.getName()+"(회복량: "+MpPotion.getMp()+")"+" 사용");
	        	System.out.println("최대기력/기력");
	        	System.out.println(hero.getMaxMp()+"/"+hero.getMp());
	        	usePotionSound();
        	}else if(usePotionNum == 3 && inventory.getHighMpPotions().size() > 0) {
        		MpPotion =inventory.getHighMpPotions().get(0);
        		int heroMp = hero.getMp() + MpPotion.getMp();
        		
    			if(heroMp >hero.getMaxMp()) {
    					heroMp = hero.getMaxMp(); 
    			}
        		hero.setMp(heroMp);
	        	inventory.highMpPotions.remove(0);
	        	System.out.println(MpPotion.getName()+"(회복량: "+MpPotion.getMp()+")"+" 사용");
	        	System.out.println("최대기력/기력");
	        	System.out.println(hero.getMaxMp()+"/"+hero.getMp());
	        	usePotionSound();
        	}
        	else {
        		System.out.println();
        		System.out.println("보유 포션이 부족합니다.");
        		System.out.println();
        	}
		}else if(potionTypeNum == 3) {
			System.out.println("1");
			Potion buffPotion = inventory.getDefensePotions().get(0);;
    		int coolTime = 0;
    		int buff = 0;
        	if(usePotionNum == 1 && inventory.getDefensePotions().size() > 0) {
        		buffPotion =inventory.getDefensePotions().get(0);
        		buff = hero.getDefense() + buffPotion.getDefense();
        		if(buffPotion.getCoolTime() == 0) {		

	        		buffPotion.setCoolTime(1);
	        		hero.setDefense(buff);
		        	inventory.defensePotions.remove(0);
		        	System.out.println();
		        	System.out.println(buffPotion.getName()+"(방어력 증가량: "+buffPotion.getDefense()+")");
		        	System.out.println();
		        	usePotionSound();
        		}
        	}else if(usePotionNum == 2 && inventory.getPowerPotions().size() > 0) {
        		buffPotion =inventory.getPowerPotions().get(0);
        		buff = hero.getPower() + buffPotion.getPower();

	        		//buffPotion.setCoolTime(1);
	        		hero.setDefense(buff);
		        	inventory.powerPotions.remove(0);
		        	System.out.println();
		        	System.out.println(buffPotion.getName()+"(공격력 증가량: "+buffPotion.getPower()+")");
		        	System.out.println();
		        	usePotionSound();
        	}else if(usePotionNum == 3 && inventory.getAttackSpeedPotions().size() > 0) {
        		buffPotion =inventory.getAttackSpeedPotions().get(0);
        		double speedBuff = hero.getAttackSpeed() + buffPotion.getAttackSpeed();
        			
	        		//buffPotion.setCoolTime(1);
	        		hero.setAttackSpeed(speedBuff);
		        	inventory.attackSpeedPotions.remove(0);
		        	System.out.println();
		        	System.out.println(buffPotion.getName()+"(공격속도 증가량: "+buffPotion.getAttackSpeed()+")");
		        	System.out.println();
		        	usePotionSound();
        		
        	}else if(usePotionNum == 4 && inventory.getEvasionPotions().size() > 0) {
        		buffPotion =inventory.getEvasionPotions().get(0);
        		buff = hero.evasion + buffPotion.getEvasion();
        			
	        		//buffPotion.setCoolTime(1);
	        		hero.setEvasion(buff);
		        	inventory.evasionPotions.remove(0);
		        	System.out.println();
		        	System.out.println(buffPotion.getName()+"(회피율 증가량: "+buffPotion.getEvasion()+")");
		        	System.out.println();
		        	usePotionSound();
        	}
		}
	}
	
						//종류		//구입선택한 번호   //포션종류 선택      // 인벤토리
	public  void buyItem(int type,int selectNum,int potionTypeNum,Inventory inventory,Adventurer hero) {
        ItemList item = new ItemList();
         //count = 0;
        int buyNum = selectNum -1;
        int useMoney = 0;
        int count = 0;
    	System.out.println();
    	if(type == 1) {
	    	System.out.println("구매할 개수를 입력해 주세요");
	    	Scanner scan = new Scanner(System.in);
	    	 count = scan.nextInt();
	    	System.out.println();
    	}
    	if(type == 1 &&  potionTypeNum == 1) {
        	//사고자 하는 아이템을 변수화
        	Potion hpPotion = item.hpPotion().get(buyNum);
        	useMoney = hpPotion.getPrice() * count;
        	if(hpPotion.getGrade().equals("low") && inventory.getMoney() > useMoney) {
	        	for(int i= 0; i <count ; i++) {
	        		inventory.lowHpPotions.add(hpPotion);
	        	}
	        	System.out.println(hpPotion.getName()+"="+count+"개 구입");
        	}else if(hpPotion.getGrade().equals("mid") && inventory.getMoney() > useMoney) {
	        	for(int i= 0; i <count ; i++) {
	        		inventory.midHpPotions.add(hpPotion);
	        	}
	        	System.out.println(hpPotion.getName()+"="+count+"개 구입");
        	}else if(hpPotion.getGrade().equals("high") && inventory.getMoney() > useMoney) {
	        	for(int i= 0; i <count ; i++) {
	        		inventory.highHpPotions.add(hpPotion);
	        	}
	        	System.out.println(hpPotion.getName()+"="+count+"개 구입");
        	}else {
        		System.out.println();
        		System.out.println("보유 금전이 부족합니다.");
        		System.out.println();
        	}
	        if(inventory.getMoney() > useMoney) {
	    		inventory.setMoney(inventory.money - useMoney );
	    		System.out.println("지출 금전 ="+useMoney);
	    		System.out.println("보유 금전 ="+inventory.getMoney());
	        	System.out.println();
	        }
	        	
        } 
        //mp포션
        if(type == 1 && potionTypeNum == 2) {
        	//사고자 하는 아이템을 변수화
        	Potion mpPotion = item.mpPotion().get(buyNum);
        	useMoney = mpPotion.getPrice() * count;
        	if(mpPotion.getGrade().equals("low") && inventory.getMoney() > useMoney) {
	        	for(int i= 0; i <count ; i++) {
	        		inventory.lowMpPotions.add(mpPotion);
	        	}
	        	System.out.println(mpPotion.getName()+"="+count+"개 구입");
	        	
        	}else if(mpPotion.getGrade().equals("mid") && inventory.getMoney() > useMoney) {
	        	for(int i= 0; i <count ; i++) {
	        		inventory.midMpPotions.add(mpPotion);
	        	}
	        	System.out.println(mpPotion.getName()+"="+count+"개 구입");
	        	
        	}else if(mpPotion.getGrade().equals("high") && inventory.getMoney() > useMoney) {
	        	for(int i= 0; i <count ; i++) {
	        		inventory.highMpPotions.add(mpPotion);
	        	}
	        	System.out.println(mpPotion.getName()+"="+count+"개 구입");
	        	
        	}else {
        		System.out.println();
        		System.out.println("보유 금전이 부족합니다.");
        		System.out.println();
        	}
	        if(inventory.getMoney() > useMoney) {
	    		inventory.setMoney(inventory.money - useMoney );
	    		System.out.println("지출 금전 ="+useMoney);
	    		System.out.println("보유 금전 ="+inventory.getMoney());
	        	System.out.println();
	        }
        	
        }
        //버프 포션
        if(type == 1 &&  potionTypeNum == 3) {
        	//사고자 하는 아이템을 변수화
        	Potion buffPotion = item.buffPotion(hero).get(buyNum);
        	useMoney = buffPotion.getPrice() * count;
        	if(buffPotion.getName().equals("방어력 상승 포션") && inventory.getMoney() > useMoney) {
	        	for(int i= 0; i <count ; i++) {
	        		inventory.defensePotions.add(buffPotion);
	        	}
	        	System.out.println(buffPotion.getName()+"="+count+"개 구입");
	        	
        	}else if(buffPotion.getName().equals("공격력 상승 포션") && inventory.getMoney() > useMoney) {
	        	for(int i= 0; i <count ; i++) {
	        		inventory.powerPotions.add(buffPotion);
	        	}
	        	System.out.println(buffPotion.getName()+"="+count+"개 구입");
	        	
        	}else if(buffPotion.getName().equals("공격속도 상승 포션") && inventory.getMoney() > useMoney) {
	        	for(int i= 0; i <count ; i++) {
	        		inventory.attackSpeedPotions.add(buffPotion);
	        	}
	        	System.out.println(buffPotion.getName()+"="+count+"개 구입");
	        	
        	}else if(buffPotion.getName().equals("회피율 상승 포션") && inventory.getMoney() > useMoney) {
	        	for(int i= 0; i <count ; i++) {
	        		inventory.evasionPotions.add(buffPotion);
	        	}
	        	System.out.println(buffPotion.getName()+"="+count+"개 구입");
	        	
        	}else {
        		System.out.println();
        		System.out.println("보유 금전이 부족합니다.");
        		System.out.println();
        	}
	        if(inventory.getMoney() > useMoney) {
	    		inventory.setMoney(inventory.money - useMoney );
	    		System.out.println("지출 금전 ="+useMoney);
	    		System.out.println("보유 금전 ="+inventory.getMoney());
	        	System.out.println();
	        }
        	
        }
        if(type == 2) {
        	//사고자 하는 아이템을 변수화
        	Weapon weapon = item.weapon().get(buyNum);
        	if(inventory.getMoney() > weapon.getPrice()) {
	        		inventory.weapons.add(weapon);
	        	System.out.println("구입 = "+weapon.getName());
	    
	        	useMoney = weapon.getPrice();
        	}else{
        		System.out.println();
        		System.out.println("금액이 부족합니다.");
        	}	
	        if(inventory.getMoney() > useMoney) {
	    		inventory.setMoney(inventory.money - useMoney );
	    		System.out.println("지출 금전 ="+useMoney);
	    		System.out.println("보유 금전 ="+inventory.getMoney());
	        	System.out.println();
	        }
        }

        if(type == 3) {
        	//사고자 하는 아이템을 변수화
        	Armor armor = item.armor().get(buyNum);
        	if(inventory.getMoney() > armor.getPrice()) {
	        	inventory.armors.add(armor);
	        	System.out.println("구입 = "+armor.getName());

	        	useMoney = armor.getPrice();
        	}else{
        		System.out.println();
        		System.out.println("금액이 부족합니다.");
        	}	
	        if(inventory.getMoney() > useMoney) {
	    		inventory.setMoney(inventory.money - useMoney );
	    		System.out.println("지출 금전 ="+useMoney);
	    		System.out.println("보유 금전 ="+inventory.getMoney());
	        	System.out.println();
	        }
        	
        }
        
	}
	
	//구매
	public void useMoney(Inventory inventory , int useMoney) {
		inventory.setMoney(inventory.money - useMoney );
		System.out.println("획득 금전 ="+useMoney);
		System.out.println("보유 금전 ="+inventory.getMoney());
    	System.out.println();
		 	SoundThread money = new SoundThread("money.mp3", false);
		 	money.start();
	}
	
	//판매
	public void getMoney(Inventory inventory , int getMoney) {
		inventory.setMoney(inventory.money + getMoney );
		System.out.println("획득 금전 ="+getMoney);
		System.out.println("보유 금전 ="+inventory.getMoney());
    	System.out.println();
		 	SoundThread money = new SoundThread("money.mp3", false);
		 	money.start();
	}
	
	public void seilItem(int type,int selectNum,int potionTypeNum,Inventory inventory,Adventurer hero) {
		 ItemList item = new ItemList();
         //count = 0;
        int seilNum = selectNum -1;
        int getMoney = 0;
        int count = 0;
    	System.out.println();
    	if(type == 1) {
	    	System.out.println("판매할 개수를 입력해 주세요");
	    	Scanner scan = new Scanner(System.in);
	    	 count = scan.nextInt();
	    	System.out.println();
    	}
    	if(type == 1 &&  potionTypeNum == 1) {
        	//팔고자 하는 아이템을 변수화
        	Potion hpPotion = item.hpPotion().get(seilNum);
        	getMoney = (hpPotion.getPrice() * count)/2 ;
        	if(hpPotion.getGrade().equals("low") && inventory.getLowHpPotions().size() > 0) {
	        	for(int i= 0; i <count ; i++) {
	        		inventory.lowHpPotions.remove(0);
	        	}
	        	System.out.println(hpPotion.getName()+"="+count+"개 판매");
	        	getMoney(inventory, getMoney);
        	}else if(hpPotion.getGrade().equals("mid") && inventory.getMidHpPotions().size() > 0) {
	        	for(int i= 0; i <count ; i++) {
	        		inventory.midHpPotions.remove(0);
	        	}
	        	System.out.println(hpPotion.getName()+"="+count+"개 판매");
	        	getMoney(inventory, getMoney);
        	}else if(hpPotion.getGrade().equals("high") && inventory.getHighHpPotions().size() > 0) {
	        	for(int i= 0; i <count ; i++) {
	        		inventory.highHpPotions.remove(0);
	        	}
	        	System.out.println(hpPotion.getName()+"="+count+"개 판매");
	        	getMoney(inventory, getMoney);
        	}else {
        		System.out.println();
        		System.out.println("보유 포션이 부족합니다.");
        		System.out.println();
        	}
        }
    	if(type == 1 &&  potionTypeNum == 2) {
        	//팔고자 하는 아이템을 변수화
        	Potion mpPotion = item.mpPotion().get(seilNum);
        	getMoney = (mpPotion.getPrice() * count)/2 ;
        	if(mpPotion.getGrade().equals("low") && inventory.getLowMpPotions().size() > 0) {
	        	for(int i= 0; i <count ; i++) {
	        		inventory.lowMpPotions.remove(0);
	        	}
	        	System.out.println(mpPotion.getName()+"="+count+"개 판매");
	        	getMoney(inventory, getMoney);
        	}else if(mpPotion.getGrade().equals("mid") && inventory.getMidMpPotions().size() > 0) {
	        	for(int i= 0; i <count ; i++) {
	        		inventory.midMpPotions.remove(0);
	        	}
	        	System.out.println(mpPotion.getName()+"="+count+"개 판매");
	        	getMoney(inventory, getMoney);
        	}else if(mpPotion.getGrade().equals("high") && inventory.getHighMpPotions().size() > 0) {
	        	for(int i= 0; i <count ; i++) {
	        		inventory.highMpPotions.remove(0);
	        	}
	        	System.out.println(mpPotion.getName()+"="+count+"개 판매");
	        	getMoney(inventory, getMoney);
        	}else {
        		System.out.println();
        		System.out.println("보유 포션이 부족합니다.");
        		System.out.println();
        	}
        }
    	if(type == 1 &&  potionTypeNum == 3) {
        	//팔고자 하는 아이템을 변수화
        	Potion buffPotion = item.buffPotion(hero).get(seilNum);
        	getMoney = (buffPotion.getPrice() * count)/2;
        	if(buffPotion.getName().equals("방어력 상승 포션") && inventory.getDefensePotions().size() > 0) {
	        	for(int i= 0; i <count ; i++) {
	        		inventory.defensePotions.remove(0);
	        	}
	        	System.out.println(buffPotion.getName()+"="+count+"개 판매");
	        	getMoney(inventory, getMoney);
	        	
        	}else if(buffPotion.getName().equals("공격력 상승 포션") && inventory.getDefensePotions().size() > 0) {
	        	for(int i= 0; i <count ; i++) {
	        		inventory.powerPotions.remove(0);
	        	}
	        	System.out.println(buffPotion.getName()+"="+count+"개 판매");
	        	getMoney(inventory, getMoney);
	        	
        	}else if(buffPotion.getName().equals("공격속도 상승 포션") && inventory.getDefensePotions().size() > 0) {
	        	for(int i= 0; i <count ; i++) {
	        		inventory.attackSpeedPotions.remove(0);
	        	}
	        	System.out.println(buffPotion.getName()+"="+count+"개 판매");
	        	getMoney(inventory, getMoney);
	        	
        	}else if(buffPotion.getName().equals("회피율 상승 포션") && inventory.getDefensePotions().size() > 0) {
	        	for(int i= 0; i <count ; i++) {
	        		inventory.evasionPotions.remove(0);
	        	}
	        	System.out.println(buffPotion.getName()+"="+count+"개 판매");
	        	getMoney(inventory, getMoney);
	        	
        	}else {
        		System.out.println();
        		System.out.println("보유 포션이 부족합니다.");
        		System.out.println();
        	}
    	}
    	
    	if(type == 2) {
            Weapon  weapon = inventory.getWeapons().get(seilNum);
        	//System.out.println(weapon.getPrice());
        	//System.out.println(price);
    		getMoney = weapon.getPrice()/2;
    		
    		inventory.weapons.remove(seilNum);
    		
        	System.out.println("판매 = "+weapon.getName());
    		getMoney(inventory, getMoney);
    	}
    	
    	if(type == 3) {
        	Armor armor = inventory.getArmors().get(seilNum);
    		getMoney = armor.getPrice()/2;
    		
    		inventory.armors.remove(seilNum);
    		
        	System.out.println("판매 = "+armor.getName());
    		getMoney(inventory, getMoney);
    	}
	}
	
	public void usePotionSound() {
		SoundThread usePotionSound = new SoundThread("potion.mp3", false);
		usePotionSound.start();
        try {
        	usePotionSound.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
	}
	
	
	public void invenUsePotion(Adventurer hero,Inventory inventory,int potionTypeNum) {
		ItemList item = new ItemList();
    	//포션 먹은 효과음쓰래드 
		System.out.println("사용할 포션을 선택하세요");
		Scanner sc = new Scanner(System.in);
		int selectNum = sc.nextInt();
		int usePotionNum = selectNum-1;
		if(potionTypeNum == 1) {
        	Potion hpPotion = null;
        	if(selectNum == 1 && inventory.getLowHpPotions().size() > 0) {
	        	 hpPotion =inventory.getLowHpPotions().get(0);
	        	 
        		int heroHp = hero.getHp() + hpPotion.getHp();
        			if(heroHp >hero.getMaxHp()) {
        				heroHp = hero.getMaxHp(); 
        			}
        		hero.setHp(heroHp);
	        	inventory.lowHpPotions.remove(0);
	        	System.out.println();
	        	System.out.println(hpPotion.getName()+"(회복량: "+hpPotion.getHp()+")"+" 사용");
	        	System.out.println("최대체력/체력");
	        	System.out.println(hero.getMaxHp()+"/"+hero.getHp());
	        	System.out.println();
	        	usePotionSound();
        	}else if(selectNum == 2 && inventory.getMidHpPotions().size() > 0) {
        		hpPotion =inventory.getMidHpPotions().get(0);
        		int heroHp = hero.getHp() + hpPotion.getHp();
        			if(heroHp >hero.getMaxHp()) {
        				heroHp = hero.getMaxHp(); 
        			}
        		hero.setHp(heroHp);
	        	inventory.midHpPotions.remove(0);
	        	System.out.println(hpPotion.getName()+"(회복량: "+hpPotion.getHp()+")"+" 사용");
	        	System.out.println("최대체력/체력");
	        	System.out.println(hero.getMaxHp()+"/"+hero.getHp());
	        	usePotionSound();
        	}else if(selectNum == 3 && inventory.getHighHpPotions().size() > 0) {
        		hpPotion =inventory.getHighHpPotions().get(0);
        		int heroHp = hero.getHp() + hpPotion.getHp();
    			if(heroHp >hero.getMaxHp()) {
    				heroHp = hero.getMaxHp(); 
    			}
	    		hero.setHp(heroHp);
	        	inventory.highHpPotions.remove(0);
	        	System.out.println(hpPotion.getName()+"(회복량: "+hpPotion.getHp()+")"+" 사용");
	        	System.out.println("최대체력/체력");
	        	System.out.println(hero.getMaxHp()+"/"+hero.getHp());
	        	usePotionSound();
        	}else {
        		System.out.println();
        		System.out.println("보유 포션이 부족합니다.");
        		System.out.println();
        	}
        	
		}else if(potionTypeNum == 2) {
			Potion MpPotion = null;
        	if(selectNum == 1 && inventory.getLowMpPotions().size() > 0) {
        		MpPotion =inventory.getLowMpPotions().get(0);
	        	 
        		int heroMp = hero.getMp() + MpPotion.getMp();
        		
        		if(heroMp >hero.getMaxMp()) {
        				heroMp = hero.getMaxMp(); 
        		}
        		hero.setHp(heroMp);
	        	inventory.lowMpPotions.remove(0);
	        	System.out.println();
	        	System.out.println(MpPotion.getName()+"(회복량: "+MpPotion.getMp()+")"+"사용");
	        	System.out.println("최대기력/기력");
	        	System.out.println(hero.getMaxMp()+"/"+hero.getMp());
	        	System.out.println();
	        	usePotionSound();
        	}else if(selectNum == 2 && inventory.getMidMpPotions().size() > 0) {
        		MpPotion =inventory.getMidMpPotions().get(0);
        		int heroMp = hero.getMp() + MpPotion.getMp();
        		
    			if(heroMp >hero.getMaxMp()) {
    					heroMp = hero.getMaxMp(); 
    			}
    			hero.setHp(heroMp);
	        	inventory.midHpPotions.remove(0);
	        	System.out.println(MpPotion.getName()+"(회복량: "+MpPotion.getMp()+")"+" 사용");
	        	System.out.println("최대기력/기력");
	        	System.out.println(hero.getMaxMp()+"/"+hero.getMp());
	        	usePotionSound();
        	}else if(selectNum == 3 && inventory.getHighMpPotions().size() > 0) {
        		MpPotion =inventory.getHighMpPotions().get(0);
        		int heroMp = hero.getMp() + MpPotion.getMp();
        		
    			if(heroMp >hero.getMaxMp()) {
    					heroMp = hero.getMaxMp(); 
    			}
    			hero.setHp(heroMp);
	        	inventory.highMpPotions.remove(0);
	        	System.out.println(MpPotion.getName()+"(회복량: "+MpPotion.getMp()+")"+" 사용");
	        	System.out.println("최대기력/기력");
	        	System.out.println(hero.getMaxMp()+"/"+hero.getMp());
	        	usePotionSound();
        	}else {
        		System.out.println();
        		System.out.println("보유 포션이 부족합니다.");
        		System.out.println();
        	}
		}
		/*else if(potionTypeNum == 3) {
			Potion buffPotion = null;
        	if(selectNum == 1 && inventory.getPowerPotions().size() > 0) {
        		buffPotion =inventory.getPowerPotions().get(0);
	        	 
        		int heroPower = hero.getHp() + buffPotion.getPower();
        			if(heroHp >hero.getMaxHp()) {
        				heroHp = hero.getMaxHp(); 
        			}
        		hero.setHp(heroHp);
	        	inventory.lowHpPotions.remove(0);
	        	System.out.println();
	        	System.out.println(hpPotion.getName()+"(회복량: "+hpPotion.getHp()+")"+" 사용");
	        	System.out.println("최대체력/체력");
	        	System.out.println(hero.getMaxHp()+"/"+hero.getHp());
	        	System.out.println();
        	}
		}
		*/
	}
	
	public void equipSound() {
		SoundThread equip = new SoundThread("equip.mp3", false);
		equip.start();
	} 
	
	
	
	public void setWeapon(Adventurer hero,Inventory inventory) {
		Weapon weapon = null;
		while(true) {	
			 System.out.println("장착할 무기의 번호를 선택");
			 System.out.println("0.나가기");
			 Scanner scan = new Scanner(System.in);
			 int num = scan.nextInt();
			 if(num == 0) {
				 break;
			 }
			 int weaponNum = num -1;
			  weapon = inventory.getWeapons().get(weaponNum);
		     if(hero.getWeapon() == null && weapon.getType() == hero.getWeaponType() || weapon.getType().equals("boss")) {
			     hero.weapon = weapon;
			     System.out.println(hero.weapon.getName()+" 을 장착 했습니다.");
			     hero.setPower(hero.getPower()+hero.weapon.getPower());

			     inventory.weapons.remove(weaponNum);
			     equipSound();
			     break;
		     }else if(hero.getWeapon() != null  && weapon.getType() == hero.getWeaponType() || weapon.getType().equals("boss")) {
		    	 //기존 장착중인 무기 공격력 빼기
		    	 hero.setPower(hero.getPower()-hero.weapon.getPower());
		    	 //기존 장착중 무기 인벤토리에 넣기
		    	 inventory.weapons.add(hero.weapon);
		    	 hero.weapon = weapon;
			     System.out.println(hero.weapon.getName()+" 을 장착 했습니다.");
			     //장착한 무기의 공격력 추가
			     hero.setPower(hero.getPower()+hero.weapon.getPower());

			     inventory.weapons.remove(weaponNum);
			     equipSound();
			     break;
		     }else{
		    	 System.out.println("장착 가능한 무기가 아닙니다.");
		    	 System.out.println("다시 선택해 주세요");
		     }
		}
	}
	
	public void setArmor(Adventurer hero,Inventory inventory) {
		 Armor armor = null;
		while(true) {	
			 System.out.println("장착할 방어구의 번호를 선택");
			 System.out.println("0.나가기");
			 Scanner scan = new Scanner(System.in);
			 int num = scan.nextInt();
			 if(num == 0) {
				 break;
			 }
			 int armorNum = num -1;
			 armor = inventory.getArmors().get(armorNum);
		     if(hero.getArmor() == null ) { //&& armor.getType() == hero.getWeaponType() || armor.getType().equals("boss")
			    // System.out.println(armor.getName());
			    // System.out.println(armor.getDefense());
			     hero.armor = armor;
			     System.out.println(hero.armor.getName()+" 을 장착 했습니다.");
			     hero.setDefense(hero.getPower()+hero.armor.getDefense());
			     inventory.armors.remove(armorNum);
			     equipSound();
			     break;
		     }else if(hero.getArmor() != null  ) { //&& armor.getType() == hero.getWeaponType() || armor.getType().equals("boss")
		    	 //기존 장착중인 무기 공격력 빼기
		    	 hero.setDefense(hero.getDefense()-hero.armor.getDefense());
		    	 //기존 장착중 무기 인벤토리에 넣기
		    	 inventory.armors.add(hero.armor);
		    	 hero.armor = armor;
			     System.out.println(hero.armor.getName()+" 을 장착 했습니다.");
			     //장착한 무기의 공격력 추가
			     hero.setDefense(hero.getDefense()+hero.armor.getDefense());
			     inventory.armors.remove(armorNum);
			     equipSound();
			     break;
		     }else{
		    	 System.out.println("장착 가능한 무기가 아닙니다.");
		    	 System.out.println("다시 선택해 주세요");
		     }
		}
	}
	
	public Skill getSkill1() {
		return skill1;
	}
	public void setSkill1(Skill skill1) {
		this.skill1 = skill1;
	}
	public Skill getSkill2() {
		return skill2;
	}
	public void setSkill2(Skill skill2) {
		this.skill2 = skill2;
	}
	public Skill getSkill3() {
		return skill3;
	}
	public void setSkill3(Skill skill3) {
		this.skill3 = skill3;
	}
	public Skill getSkill4() {
		return skill4;
	}
    public Weapon getWeapon() {
		return weapon;
	}
	public void setWeapon(Weapon weapon) {
		this.weapon = weapon;
	}
	public Armor getArmor() {
		return armor;
	}
	public void setArmor(Armor armor) {
		this.armor = armor;
	}
	public void setSkill4(Skill skill4) {
		this.skill4 = skill4;
	}
	public Skill getSpecialSkill() {
		return specialSkill;
	}
	public void setSpecialSkill(Skill specialSkill) {
		this.specialSkill = specialSkill;
	}
}
