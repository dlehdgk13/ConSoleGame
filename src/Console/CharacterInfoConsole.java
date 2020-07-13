package Console;

import User.Adventurer;

public class CharacterInfoConsole {
	
    public void print(final Adventurer adventurer) {
        for (int i = 0; i < 60; i++) {
            System.out.println("");
        }
        System.out.println("==========================케릭터 정보 ==========================");
        System.out.println("이름: " + adventurer.getName());
        System.out.println("레벨: " + adventurer.getLevel());
        System.out.println("hp: " +  adventurer.getHp() + "/" +  adventurer.getMaxHp());
        System.out.println("mp: " +  adventurer.getMp() + "/" +  adventurer.getMaxMp());
        System.out.println("공격력: " + adventurer.getPower());
        System.out.println("방어력: " + adventurer.getDefense());
        System.out.println("스킬1: " + adventurer.getSkill1().getName() + "(기술레벨: " + adventurer.getSkill1().getLevel() + ")");
        System.out.println("스킬2: " + adventurer.getSkill2().getName() + "(기술레벨: " + adventurer.getSkill2().getLevel() + ")");
        System.out.println("스킬3: " + adventurer.getSkill3().getName() + "(기술레벨: " + adventurer.getSkill3().getLevel() + ")");
        System.out.println("스킬4: " + adventurer.getSkill4().getName() + "(기술레벨: " + adventurer.getSkill4().getLevel() + ")");
        System.out.println("스폐셜스킬: " + adventurer.getSpecialSkill().getName() + "(숙련도: " + adventurer.getSpecialSkill().getLevel() + ")");
        System.out.println("경험치: " + adventurer.getExp() + "/" + adventurer.getMaxExp());
        System.out.println("무기: " + ((adventurer.getWeapon() != null) ? adventurer.getWeapon().getName() : "장착x"));
        System.out.println("방어구: " + ((adventurer.getArmor() != null) ? adventurer.getArmor().getName() : "장착x"));
        System.out.println("===========================================================");
    }
}
	
	
	

