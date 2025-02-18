public class Child extends Parent {

	//this will inherit the property the things of
	public Child(int age, String name){
		super(age, name); //this only works in the constructor, by calling this constructor teh pvalues will be stored for teh child object as it is called from child and this operator is used...
	}

	//overriding method
	@Override
	public void dialogue(){
		System.out.println("No i wont study");
	}
	
}
