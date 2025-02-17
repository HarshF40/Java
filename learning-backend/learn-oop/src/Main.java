package src;
import java.util.ArrayList;

class Main {

	public static void main(String[] args) {

		Student s = new Student();
		System.out.println(s.get_verified());

		User u1 = new User("Yuki", User.Membership.Silver); //User() is a default constructor which helps us to make the object
		//u1.set_name("yuki");
		//u1.set_membership(User.Membership.Silver);

		User u2 = new User("Harsh", User.Membership.Gold);
		//u2.set_name("harsh");
		//u2.set_membership(User.Membership.Gold);

		User u3 = new User("Yuki", User.Membership.Silver);

		System.out.println(u1);
		System.out.println(u2); //println converts the address into string using toString, we can override that behaviour
		//System.out.println(u1.get_membership());
		//System.out.println(u2.get_membership());
		System.out.println(u1.equals(u3));

		//List -> interface
		//ArrayList -> implementation
		User.admins = new ArrayList<User>();
		User.admins.add(u1);
		User.admins.add(u2);
		User.admins.add(u3);
		User.admins.add(new User("Me", User.Membership.Bronze));
//		System.out.println(User.admins.get(0).get_name());
//		for(int i = 0; i < User.admins.size(); i++){ System.out.println(User.admins.get(i)); }
//		for(User u : User.admins) { System.out.println(u); }
//
		User.print_admins();
	}

}
