package Thread;

import Monster.Monster;
import User.Adventurer;

public class attackTypeThread implements Runnable{
	
	
	public void attackType(Adventurer hero,Monster monster,String type) {
		int poison = (int)((double)10 / (double)hero.getPower()* 100);
		int bleeding = (int)((double)15 / (double)hero.getPower()* 100);
		int burned = (int)((double)5 / (double)hero.getPower()* 100);
		int cut = (int)( (double)5 / (double)monster.getPower() * 100);
		
		
			if(type.equals("중독")) {
				System.out.println(monster.getName()+"가 중독되었습니다.");
				for(int i = 0 ; i < 3 ; i++ ) {
					monster.setHp(monster.getHp() - poison);
					System.out.println("중독: "+poison);
				}
			}else if(type.equals("출혈")){
				System.out.println(monster.getName()+"가 출혈이 일어났습니다.");
				for(int i = 0 ; i < 5 ; i++ ) {
					monster.setHp(monster.getHp() - bleeding);
					System.out.println("출혈: "+bleeding);
				}
			}else if(type.equals("절단")){
				System.out.println(monster.getName()+"가 절단 되었습니다.");
				//for(int i = 0 ; i < 5 ; i++ ) {
					monster.setPower(monster.getPower() - cut);
					System.out.println("절단: 공격력감소("+cut+")");
				//}
			}else if(type.equals("화상")){
				System.out.println(monster.getName()+"가 불타오릅니다.");
				for(int i = 0 ; i < 7 ; i++ ) {
					monster.setHp(monster.getHp() - burned);
					System.out.println("화상: "+burned);
				}
			}else if(type == null){System.out.println();}
	}

	@Override
	public void run() {
		try {
			Thread.sleep(2000);
		}catch(Exception e) {
			System.out.println(e.getMessage());
		}
		
	}
}
