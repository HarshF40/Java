public class Main {
  public static void main(String[] args) {
    //super = Refers to the parent class (subclass <- superclass)
    //Used in constructors and method overrding
    //calls the parent constructor to initialise attributes
    Person person = new Person("yuki", "gaonker");
    Student student = new Student("yukiJR", "gaonker", 9.6);
    person.showName();
    student.showName();
  }
}
