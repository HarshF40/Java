package intrfcs;

public class Dog implements intrfc {

	@Override
	public void eat(){
		System.out.println("Dog is eating");
	}

	@Override
	public void sleep(){
		System.out.println("Dog is sleeping");
	}

}
