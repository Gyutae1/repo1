package sec01.exam01;

public class Parent {
	String name = "Parent의 name";
	
	Parent(){
		System.out.println("Parent 기본 생성자");
	}
	String getName() {
		System.out.println("Parent의 getName 실행");
		return this.name;
	}
	
}
