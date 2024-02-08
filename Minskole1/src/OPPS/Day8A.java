package OPPS;

public class Day8A {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SBIq a = new SBIq();
		a.save();
		a.loan();

		PNBq b = new PNBq();
		b.loan();
		b.save();
	}

}

abstract class WorldBankq {
	public abstract void save();

	public abstract void loan();
}

class SBIq extends WorldBankq {
	@Override
	public void save() {
		System.out.println("I Am From SBI Save");
	}

	@Override
	public void loan() {
		System.out.println("I Am From SBI Loan");
	}
}

class PNBq extends WorldBankq {
	@Override
	public void save() {
		System.out.println("I Am From PNB Save");
	}

	@Override
	public void loan() {
		System.out.println("I Am From PNB Loan");
	}
}