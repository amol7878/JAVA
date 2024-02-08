package OPPS;

public class Day8C {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DogN N = new DogN();
		N.sound();

		N.type();

		N.cityFound();
	}

}

interface AnimalN {
	public abstract void sound();

	public abstract void type();

	public abstract void cityFound();
}

class DogN implements AnimalN {

	@Override
	public void sound() {
		System.out.println("BOW BOW");
	}

	@Override
	public void type() {
		System.out.println("Animal");
	}

	@Override
	public void cityFound() {
		System.out.println("Pune");
	}
}