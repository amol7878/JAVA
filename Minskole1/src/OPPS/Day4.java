package OPPS;

public class Day4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TeacherC amol = new TeacherC("Amol", "Shinde", "1234", 1000000);
		System.out.println(amol.firstName);
		System.out.println(amol.lastName);
		System.out.println(amol.rollNo);
		System.out.println(amol.Salary);

		amol.displayName();
		amol.displaySalary();

	}

}

class StudentC {
	String firstName;
	String lastName;
	String rollNo;

	public StudentC(String fn, String ln, String rn) {
		this.firstName = fn;
		this.lastName = ln;
		this.rollNo = rn;
	}

	public void displayName() {
		System.out.println(this.firstName + this.lastName);
	}
}

class TeacherC extends StudentC {
	int Salary;

	public TeacherC(String fn, String ln, String rn, int sa) {
		super(fn, ln, rn);
		this.Salary = sa;
	}

	public void displaySalary() {
		System.out.println(this.Salary);
	}
}