package OPPS;

public class Day5B {

	// Different class,same method and same signature(inheritance)
	// overriding

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SBI nagpur = new SBI();
		nagpur.loan();
		nagpur.save();

	}

}

class WorldBank {
	public void loan() {
		System.out.println("I am Loan from WorldBank");
	}

	public void save() {
		System.out.println("I am save from WorldBank");
	}
}

class SBI extends WorldBank {
	public void loan() {
		System.out.println("I am loan from SBI");
	}

	public void save() {
		System.out.println("I am Save from SBI");
	}
}

class PNB extends WorldBank {
	public void loan() {
		System.out.println("I am loan From PNB");
	}

	public void Save() {
		System.out.println("I am Save from PNB");
	}
}