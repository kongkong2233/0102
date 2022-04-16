class Animal {
	public void Sound() {
		System.out.println("悼拱家府");
	}
}

class Dog extends Animal {
	public void Sound() {
		System.out.println("港港");
	}
}

class Cat extends Animal {
	public void Sound() {
		System.out.println("具克");
	}
}
public class AnimalTest {
	public static void main(String[] args) {
		Animal a1, a2;
		
		a1 = new Dog();
		a2 = new Cat();
		
		a1.Sound();
		a2.Sound();
	}
}
