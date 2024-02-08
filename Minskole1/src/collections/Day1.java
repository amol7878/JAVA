package collections;

public class Day1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int ia = 10;
		System.out.println(ia);

		System.out.println("Hello");
		String firstName = "Chinmay";

		for (int i = 0; i < firstName.length(); i++) {
			// System.out.println(i);
			System.out.println(firstName.charAt(i));
		}

		Person Amol = new Person("amol", "rao");
		Person Chinmay = new Person("chinmay", "deshpande");
		Person Poorva = new Person("poorva", "vyas");
		Person Sarika = new Person("sarika", "pansare");

		// int

		// int[] d = { 11, 22, 33, 44, 55 };
		int[] d2 = new int[5];
		d2[0] = 1;
		d2[1] = 1;
		d2[2] = 1;
		d2[3] = 1;
		d2[4] = 1;

		// String

		// String [] names = {"amol","chinmay","sarika","poorva","ram"};
		String[] names2 = new String[2];
		names2[0] = "chinmay";
		names2[1] = "chinmayy";

		// Person

		// Person [] Students =new Person [5];
		Person[] Studentss = { Amol, Chinmay, Poorva, Sarika };

		for (int i = 0; i < Studentss.length; i++) {
			System.out.println(Studentss[i].first_Name);
			System.out.println(Studentss[i].last_Name);
			Studentss[i].displayName();
		}
		
		for(Person student:Studentss) {
			System.out.println(student.first_Name);
			System.out.println(student.last_Name);
			student.displayName();
		}

	}

}

// User Defined Data Types
// Properties And Methods

class Person {
	String first_Name;
	String last_Name;

	public Person(String fn,String ln) {
		this.first_Name = fn;
		this.last_Name = ln;
	}

	public void displayName() {
		System.out.println(this.first_Name + this.last_Name);
	}
}