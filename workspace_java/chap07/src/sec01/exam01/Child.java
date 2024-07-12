package sec01.exam01;

public class Child extends Parent{
	
	// 기본생성자
	public Child() {
		super();
	}
	
	
//	Child(){
//		System.out.println("Child 기본 생성자");
//	}
	void setName(String name) {
		this.name = name;
	}
	void setName2(String n) {
		name = n;
	}
}
