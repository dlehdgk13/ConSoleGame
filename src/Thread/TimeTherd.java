package Thread;

import Monster.Monster;
import utill.MonsterList;

public class TimeTherd implements Runnable{
	
	private int time = 0; //낮밤을 나누기위한 변수
	private int power = 0; //낮밤을 나누기위한 변수
	
	public void timeThred(Monster monster) {
		while(true) {
			if(time == 0) {
				System.out.println();
				System.out.println("============");
				System.out.println("아침이 밝았습니다.");
				System.out.println("============");
				System.out.println();
				monster.setPower(monster.getPower() - power);
				time = 1;
			}else if(time == 1) {
				System.out.println();
				System.out.println("============");
				System.out.println("날이 어두워집니다.");
				System.out.println("몬스터들이 강해집니다.");
				System.out.println("============");
				System.out.println();
				power = (int)((double)20 / (double)monster.getPower() * 100);
				monster.setPower(monster.getPower()+ power);
				time = 0;
			
			}
		}
	}
	
	@Override
	public void run() {
		try{
		     Thread.sleep(60000);
		    } catch (InterruptedException e){
		     e.printStackTrace();
		    }

		}
	
}
