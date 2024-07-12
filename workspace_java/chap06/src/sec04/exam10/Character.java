package sec04.exam10;

public class Character {
	private String name;
	private int hp;
	private int def;
	
	Character(String name){
		this.name = name;
		this.hp = 100;
		this.def = (int)(Math.random()*5) + 3; //3~7
	}
	/*
	 * 체력 100에서 시작 
	 * 방어력 : 특정 범위 안에서 random
	 * 메소드
	 * attack (% 또는 수치)
	 * heal   (% 또는 수치)
	*/
	
	/**
	 * attack : 내가 공격할 수치를 돌려줌
	 * @param 없음
	 * @return int 공격수치
	 */
	int attack() {
		return 10 + (int)(Math.random()*5); //10~14
	}
	/**
	 * hit : 내가 맞아서 체력이 줄어듬
	 * @param int 공격당한 수치
	 * @return 없음
	 */
	
	void hit(int damege) {
		hp -= damege - def;
		if (hp <= 0) {
			System.out.println("DIED");
		}
	}
	
}
