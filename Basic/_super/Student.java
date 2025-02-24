public class Student extends Person {
  double gpa;

  Student(String first, String last, double gpa){
    //we cannot direcly create a object of class Student using this operator, we have to use super keyword
    //so we need to pass the arguement to the parent
    //as the first and last still belongs to the parent class
    //we have to call the parent constructor implicitly, if there are no default constructor
    //this is because, to ensure proper initiliasation of the objects of the class
    super(first, last); //this calls the constructor of the parent class;
    this.gpa = gpa;
  }
}
