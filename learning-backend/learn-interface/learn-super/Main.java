public class Main {

	public static void main(String[] args) {
		Child child = new Child(18, "yuki");
		Parent parent = new Parent(22, "Yuki Sr");
		System.out.println(child.age);
		System.out.println(child.name);
		parent.dialogue();
		child.dialogue();
	}
}
