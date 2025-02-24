public class Main {
  public static void main(String[] args) {
    // abstract = Used to define abstract classes and methods
    // Abstraction is the process of hiding implementation details
    // and showing only the essential features
    // Abstarct classes cannot be instantiated directly 
    // can contain 'abstract' methods (which must be implmented)
    // can contain 'concrete' methods (which are inherite\) 
    Circle circle = new Circle(3);
    Triangle triangle = new Triangle(4, 5);
    Rectangle rectangle = new Rectangle(6, 7);

    System.out.println(circle.area());
    System.out.println(triangle.area());
    System.out.println(rectangle.area());
  }
}
