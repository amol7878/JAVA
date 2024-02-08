package OPPS;

public class Day7A {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// WorldBankC india = new WorldBankC();

		SBIC LAXMI = new SBIC();
		LAXMI.loan();
		LAXMI.save();
		LAXMI.BranchName();

		PNBC PC = new PNBC();
		PC.loan();
		PC.save();

	}

}

// No Object Creation For Abstract class

abstract class WorldBankC {

	public abstract void save();

	public abstract void loan();
}

class SBIC extends WorldBankC {
	@Override
	public void save() {
		System.out.println("Save from SBI C");
	}

	@Override
	public void loan() {
		System.out.println("Loan From SBI C");
	}

	public void BranchName() {
		System.out.println("Branch Name Nagpure");
	}

}

class PNBC extends WorldBankC {
	@Override
	public void save() {
		System.out.println("Save from PNB C");
	}

	@Override
	public void loan() {
		System.out.println("Loan From PNB C");
	}

}