package OPPS;

public class Day4C {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SonM Amol = new SonM("Ujjwala", "Shinde", "Amol");
		System.out.println(Amol.firstName);
		System.out.println(Amol.lastName);
		System.out.println(Amol.sname);

		Amol.displayMName();
		Amol.displaySName();

		DaughterM Arati = new DaughterM("Ujjwala", "Shinde", "Arati");
		System.out.println(Arati.firstName);
		System.out.println(Arati.lastName);
		System.out.println(Arati.dname);

		Arati.displayMName();
		Arati.displayDName();

	}

}

class Mother {

	String firstName;
	String lastName;

	public Mother(String fn, String ln) {
		this.firstName = fn;
		this.lastName = ln;

	}

	public void displayMName() {
		System.out.println(this.firstName + this.lastName);
	}
}

class SonM extends Mother {

	String sname;

	public SonM(String fn, String ln, String sn) {
		super(fn, ln);
		this.sname = sn;
	}

	public void displaySName() {
		System.out.println(this.sname +this.lastName);
	}
}

class DaughterM extends Mother {

	String dname;

	public DaughterM(String fn, String ln, String dn) {
		super(fn, ln);
		this.dname = dn;
	}

	public void displayDName() {
		System.out.println(this.dname + this.lastName);
	}
}