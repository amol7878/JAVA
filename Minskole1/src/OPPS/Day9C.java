package OPPS;

public class Day9C {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TeacherHH ninad = new TeacherHH("Amol", "Shinde", 23, "34554433344");
		ninad.displayName();
		ninad.displayCountryName();
	}

}

interface Rule {
	public void displayCountryName();
}

class StudentH {
	String firstName;
	String lastName;
	int age;

	public StudentH(String fn, String ln, int ag) {
		this.firstName = fn;
		this.lastName = ln;
		this.age = ag;
	}

	public void displayName() {
		System.out.println(this.firstName + this.lastName);
	}
}

class TeacherHH extends StudentH implements Rule {
	String salary;

	public TeacherHH(String fn, String ln, int ag, String sy) {
		super(fn, ln, ag);
		this.salary = sy;
	}

	@Override
	public void displayCountryName() {
		System.out.println("India");
	}
}