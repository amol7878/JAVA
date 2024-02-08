package OPPS;

public class Day1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Person Amol = new Person();
		System.out.println(Amol.firstName);
		System.out.println(Amol.lastName);
		System.out.println(Amol.age);
		Amol.displayName();

		Person chinmay = new Person();
		System.out.println(chinmay.firstName);
		System.out.println(chinmay.lastName);
		System.out.println(chinmay.age);
		chinmay.displayName();

		chinmay.firstName = "Chinmay";
		chinmay.lastName = "Deshpande";
		chinmay.age = 33;
		chinmay.displayName();

		// Setting the value at the time of object creation

		Person2 Amol2 = new Person2("Amol2", "Shinde2", 23);
		System.out.println(Amol2.firstName);
		System.out.println(Amol2.lastName);
		System.out.println(Amol.age);
		Amol2.displayName();

		Person2 Chinmay2 = new Person2("chinmay2", "deshpande2", 44);
		System.out.println(Chinmay2.firstName);
		System.out.println(Chinmay2.lastName);
		System.out.println(Chinmay2.age);
		Chinmay2.displayName();

	}

}

class Person {
	String firstName = "Amol";
	String lastName = "Shinde";
	int age = 30;

	public void displayName() {
		System.out.println(this.firstName + this.lastName);
	}
}

class Person2 {

	String firstName;
	String lastName;
	int age;

	public Person2(String fn, String ln, int ag) {
		this.firstName = fn;
		this.lastName = ln;
		this.age = ag;
	}

	public void displayName() {
		System.out.println(this.firstName + this.lastName);
	}
}
