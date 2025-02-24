public class Main {
  public static void main(String[] args) {
    //.toString() = method inherited from the object class.
    //used to return a string representation of an object.
    //By default, it returns a hash code as a unique identifier
    //it can be overridden to provide meaningful details
    Car car = new Car("Ford", "Mustang", 2025, "Red");
    System.out.println(car); //returns a unique identifier
  }
}
