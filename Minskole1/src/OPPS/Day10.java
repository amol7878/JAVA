package OPPS;

public class Day10 {

	// Default
	// Public
	// Private
	// Protected

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PersonD d = new PersonD();
		d.display();

		PersonE e = new PersonE();
		e.display();

		PersonF f = new PersonF();
		// f.display();
		f.display2();

		PersonG g = new PersonG();
		g.display();
	}

}

class PersonD {
	void display() {
		System.out.println("Hello World ....");
	}
}

class PersonE {
	public void display() {
		System.out.println("Hello World .... ");
	}
}

class PersonF {
	private void display() {
		System.out.println("Hello World .... ");
	}

	public void display2() {
		System.out.println("Hello World 2");
		this.display();
	}
}

class PersonG {
	protected void display() {
		System.out.println("Hello World .... ");
	}

	public void display2() {
		System.out.println("Hello World 2");
		this.display();
	}
}
