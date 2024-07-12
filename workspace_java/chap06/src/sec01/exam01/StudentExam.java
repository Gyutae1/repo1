package sec01.exam01;

public class StudentExam {
	
	

	public static void main(String[] args) {
		
		Student s1 = new Student("박규태",30);
		System.out.println(s1.name);
		System.out.println(s1.age);
		System.out.println(s1.hasGlasses);
		
	
		s1.hasGlasses = false;
		
		System.out.println(s1.name);
		System.out.println(s1.age);
		System.out.println(s1.hasGlasses);
		
		Student s2 = new Student("현준수");
		System.out.println(s2);
//		s2.name = "현준수";
//		s2.age = 26;
		System.out.println(s2.name);
		System.out.println(s2.age);
		System.out.println(s1.name);
		System.out.println(s1);
		s1.study("제육");
		System.out.println(s1);
		s1.eat("제육");
		s1.sleep(2);
		System.out.println(s1);
		s1.game("포켓몬스터");
		System.out.println(s1);
		
		s1.game("포켓몬스터", 6);
		System.out.println(s1);
		System.out.println("-----------");
		ACademie a1 = new ACademie("천안");
		Student s3 = new Student("김승환");
		Student s4 = new Student("김아영");
		a1.join(s1);
		a1.join(s2);
		a1.join(s3);
		a1.join(s4);
		a1.join(new Student("최민수",30));
		a1.viewList();


	}
	
	static void view(Student s) {
//		String str = s.toString();
		int stress = s.game("포켓몬스터");
		System.out.println("이 학생의 스트레스는"+stress);
	}

}
