/**
 * Shape
 */
public abstract class Shape {
  abstract double area();//abstarct method -> no body, define in the class you desire
  void display(){ //concrete method
    System.out.println("This is a shape");
  }
}
