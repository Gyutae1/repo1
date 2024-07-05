package sec01.exam01;

public class Student {
	String name;
	int age;
	String addr;
	int gender;
	String major;
	boolean hasGlasses;
	int intel = 0; // 지식
	int stress = 0;	// 스트레스 수치
	int hp = 100; // 체력
	int hungry = 0; // 공복감
	

	
	Student(String name,int age){
		this.name = name;
		this.age = age;
	}
	Student(String name){
		this(name,0);
	}
	
	// 행동
	// 공부, 식사, 수면, 게임
	
	// 공부
	// 공부한 내용을 출력하고
	// 지식이 높아지고
	// 스트레스 높아지고
	// 체력 낮아지고
	// 공복감 높아지고
	
	// 전달인자 : String 공부한 내용(과목)
	// 리턴타입 : 없음
	int study(String subject) {
		System.out.println(subject+"을(를) 공부했다");
		
		
		intel += 5;
		stress += 10;
		hp--;
		hungry++;
		
		return intel;
	}

	// 식사
	// 먹은 음식을 출력하고
	// 체력 조금 올라가고
	// 스트레스 조금 낮아지고
	// 공복감 많이 낮아지고
	// 전달인자 : String
	// 리턴타입 : int 공복감
	
	int eat(String F) {
		System.out.println(F+"를 먹었다");
		hp++;
		stress--;
		hungry -= 10;
		return hungry;
		
	}

	// 수면
	// 수면 시간 출력하고
	// 수면시간 * 10 만큼 체력을 올리고
	// 수면시간 * 10 만큼 스트레스가 내려가고
	// 공복감은 수면시간 * 5 만큼 올라가고
	// 전달인자 : int
	
	
	void sleep(int x) {
		System.out.println(x+"시간 잤다.");
		hp += x*10;
		stress -= x*10;
		hungry += x*5;
	}
	
	// study메소드를 활용한 게임
	int game(String title) {
		System.out.println(title+"게임을 했다");
		study(title);
		hp -= 10;
		stress -= 5;
		return stress;
	}
	int game(String title,int hour) {
		if(hour <= 0 ) {
			System.out.println("시간을 다시 입력해주세요");
		} else if (hour > 0) {
			System.out.println(title+"게임을"+hour+"시간만 하다");
			for(double i = 0 ; i < hour;i += 0.5) {
				System.out.println("한판만 더 하자");
			}
			if(hour <= 2) {
				System.out.println("오늘 좀 안됐다 그만하자");
				stress += 5;
			} else if (hour <= 4) {
				System.out.println("간단하게 한게임 했다");
				stress -= 10;
			} else if (hour > 4) {
				System.out.println("오늘 신났다");
				stress -= 20;
			}
			study(title);
		}
		return stress;
	}
	
	
	
	int study(String subject,int x) {
		System.out.println(subject+"을(를) 공부했다");
		
		
		intel += 5;
		stress += x;
		hp--;
		hungry++;
		
		return intel;
	}
	
	String Students() {
		
		String result = "이름는 "+name+"나이는"+age;
		return result;
	}
	
	
	
	
	
	// 내 정보 보기
	@Override
	public String toString() {
		return "Student [name=" + name + ", age=" + age + ", addr=" + addr + ", gender=" + gender + ", major=" + major
				+ ", hasGlasses=" + hasGlasses + ", intel=" + intel + ", stress=" + stress + ", hp=" + hp + ", hungry="
				+ hungry + "]";
	}
	
	
	

	

}
