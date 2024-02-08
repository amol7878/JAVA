package OPPS;

public class DayB {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TeacherB Amol = new TeacherB("Amol", "Shinde", "1129977766", 1200000);
		System.out.println(Amol.firstName);
		System.out.println(Amol.lastName);
		System.out.println(Amol.adharNo);
		System.out.println(Amol.salary);

		Amol.displayName();
		Amol.displaysalary();

	}

}

class StudentB {
	String firstName;
	String lastName;
	String adharNo;

	public StudentB(String fn, String ln, String adr) {
		this.firstName = fn;
		this.lastName = ln;
		this.adharNo = adr;
	}

	public void displayName() {
		System.out.println(this.firstName + this.lastName);
	}
}

class TeacherB extends StudentB {
	int salary;

	public TeacherB(String fn, String ln, String adr, int sy) {
		super(fn, ln, adr);
		this.salary = sy;
	}

	public void displaysalary() {
		System.out.println(this.salary);
	}
}