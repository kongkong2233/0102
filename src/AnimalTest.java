class Animal {
	public void Sound() {
		System.out.println("�����Ҹ�");
	}
}

class Dog extends Animal {
	public void Sound() {
		System.out.println("�۸�");
	}
}

class Cat extends Animal {
	public void Sound() {
		System.out.println("�߿�");
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
