package intrfcs;

public class Main {
	public static void main(String[] args) {
		Dog dog = new Dog();
		dog.eat();
		dog.sleep();
		System.out.println(Dog.MAX_AGE);
		intrfc.sayHi();
		dog.run();
	}
}

