public class Main {
  public static void main(String[] args) {
    //Composition = Represents a "part-of" relationship beween objects.
    //For example, an engine is "Part of" a car
    //Allows complex objects to be constructed from smaller objects
    Car car = new Car("Toyota", 1995, "V8");
    System.out.println(car.model);
    System.out.println(car.year);
    System.out.println(car.engine.type);

    car.start();
  }
}
