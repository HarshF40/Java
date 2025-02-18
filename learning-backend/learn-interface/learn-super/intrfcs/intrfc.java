package intrfcs;
//interfaces are blueprints for classes

//interfaces is used for i) Multiple inheritance
//			ii) Abstraction
// it has abstract methods and static constants; static -> belongs to class rather than the object and constant -> is defined by the keyword final -> which means unmodifiable value
// new classes will not extend this interface but rather implment it
// inerfaces allow static methods or data types as they belong to the class and not the object
// we cannot make object of interface, because there is no implementation so no point
public interface intrfc {
	public abstract void eat(); //writing public and abstarct is reduntant in interfaces, they are automatically public abstract
	int MAX_AGE = 105;
	void sleep(); //this is also public abstract
	public static void sayHi(){
		System.out.println("hi");
	}

	//this is a concrete method
	//this method cannot be accessed by the interface
	//this method can be accessed by the implmentors of this interface
	default void run() { //this will be directly inherited by the children
		System.out.println("animal is running");
	}
}
