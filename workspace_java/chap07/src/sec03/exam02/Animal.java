package sec03.exam02;

// 추상 클래스
// 추상 메소드를 가질 수 있다
// new 할 수 없다
public abstract class Animal {
	
	String kind;
	
	void breathe() {
		System.out.println("후욱 후욱");
	}
	
	abstract void sound();
}
