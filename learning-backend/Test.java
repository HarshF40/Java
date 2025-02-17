//Everythin JAVA is based on classes and objects
//Public --> access modifier [can be used anywhere]
public class Test { //class name and file name should be same
		    //
	
	//main is the entry pint of the function
		    
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
		System.out.println(args); // this will print the address of the string
		//args stores the value passed in the command line arguements.. (Stored a string)
		System.out.println(args[0]);
		System.out.println(args[1]);
		System.out.println(args[2]);

		main2(args);

////////////////////////////////////////////////////////////////////////////////////////////////////////

		int a = 1;
		System.out.println(Integer.toString(a)); //Integer is a wrapper.. (class) that provides extra fuctionalities.
		String name = "YUki";
		//string is also a string based on the characters... which provides extra fiunctionalities
		System.out.println(name);
		//we dont need to declare any object of Integer or string as they are defined as static
//////////////////////////////////////////////LOOPs/////////////////////////////////////////////////////
		
		//for loop
		for(int i = 0; i < 10; i++) {
			System.out.print(i);
		}

		//while loop
		int i = 0;
		while(i < 10) {
			System.out.print(i++);
		}

	}

	public static void main2(String[] args) { //function defination
		System.out.println("Hello World");
	}

	public static void main3(String[] args) { //function defination
		System.out.println("Hello World");
	}

}
