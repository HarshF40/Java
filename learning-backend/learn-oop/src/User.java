package src;

import java.util.List;

public class User {

	public enum Membership {
		Bronze,
		Silver,
		Gold;
	}

	private String name;
	private String membership;

	//constructor
	public User(String name, Membership membership) {
		set_name(name);
		set_membership(membership);
	}

	public User() {}

	//overriding toString for custom behaviour
	public String toString() {
		return get_name() + " " + get_membership();
	}

	//overriding equals for custom behaviour
	public boolean equals(User user) {
		if(get_name() == user.get_name() && get_membership() == user.get_membership()) {
			return true;
		} else {
			return false;
		}
	}

	//static variable
	public static List<User> admins;

	//static method
	public static void print_admins(){
		for(User u : admins) {
			System.out.println(u);
		}
	}

	
	void set_name(String name) {
		this.name = name;
	}

	String get_name() {
		return this.name;
	}

	//method overloading
	void set_membership(Membership membership) {
		this.membership = membership.name();
	}

	String get_membership() {
		return this.membership;
	}
}
