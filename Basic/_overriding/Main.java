/**
 * Main
 */
public class Main {

  public static void main(String[] args) {
    //Method Overriding = when a subclass provides its own implementation of a method that is
    //already defined. Allows for code reusabilty and give specific implementations.
    Dog dog = new Dog();
    Cat cat = new Cat();
    Fish fish = new Fish();
    dog.move();
    cat.move();
    fish.move();
  }
}
