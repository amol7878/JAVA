package OPPS;

public class Day8B {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Dogq M = new Dogq();
		M.type();
		M.sound();

		Catq N = new Catq();
		N.type();
		N.sound();

	}

}

// Object cannot Be Created for Abstract class 
// Abstract class can have Abstract as well as normal Method

abstract class Animalq {
	public void type() {
		System.out.println(" I Belong to Animal category");
	}

	public abstract void sound();
}

class Dogq extends Animalq {

	@Override
	public void sound() {
		System.out.println("BOW BOW");
	}
}

class Catq extends Animalq {
	@Override
	public void sound() {
		System.out.println("MEOW MEOW");
	}
}