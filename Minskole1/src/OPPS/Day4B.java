package OPPS;

public class Day4B {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Son Amol = new Son("Jayvant", "Shinde", "Vilas", "Amol");
		System.out.println(Amol.firstName);
		System.out.println(Amol.lastName);
		System.out.println(Amol.fname);
		System.out.println(Amol.sname);

		Amol.displaySName();
		Amol.displayFnName();
		Amol.displayGName();

	}

}

class GrandFather {

	String firstName;
	String lastName;

	public GrandFather(String fn, String ln) {
		this.firstName = fn;
		this.lastName = ln;
	}

	public void displayGName() {
		System.out.println(this.firstName + this.lastName);
	}
}

class Father extends GrandFather {

	String fname;

	public Father(String fn, String ln, String ffn) {
		super(fn, ln);
		this.fname = ffn;
	}

	public void displayFnName() {
		System.out.println(this.fname + this.lastName);
	}
}

class Son extends Father {

	String sname;

	public Son(String fn, String ln, String ffn, String sn) {
		super(fn, ln, ffn);
		this.sname = sn;
	}

	public void displaySName() {
		System.out.println(this.sname + this.lastName);
	}
}
