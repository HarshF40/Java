//Everythin JAVA is based on classes and objects
//Public --> access modifier [can be used anywhere]
public class Test { //class name and file name should be same
		    
	//only one class can be public in a file
	//the public class name should match with the file name

	//this functions will still run even if no object is created
	//this is because static
	//static --> doesnt depend on object, it will be automatically assigned memory
	//the fucntion can be used without creating object
	//return type here void
	//
	//main function should always be static as it should run without any object

	//the compiler runs only this method when run , becuase its the default behaviour
	public static void main(String[] args) { //function defination
		System.out.println(args);
	}

	public static void main2(String[] args) { //function defination
		System.out.println("Hello World");
	}

	public static void main3(String[] args) { //function defination
		System.out.println("Hello World");
	}

}
