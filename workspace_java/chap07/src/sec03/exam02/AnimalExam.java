package sec03.exam02;

public class AnimalExam {

	public static void main(String[] args) {
		
		Dog dog = new Dog();
		
		Cat cat = new Cat();
		
		dog.sound();
		dog.breathe();
		
		cat.sound();
		dog.breathe();
		
		Animal a = dog;
		a.sound();
	}

}
