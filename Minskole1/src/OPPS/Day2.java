package OPPS;

public class Day2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Vehical audi = new Vehical();

		System.out.println(audi.color);
		System.out.println(audi.type);

		audi.displayColor();

		String ty = audi.displayType();
		System.out.println(ty);

		Vehical audi2 = new Vehical();
		System.out.println(audi2.color);
		System.out.println(audi2.type);

		audi2.displayColor();
		String ty2 = audi2.displayType();
		System.out.println(ty2);

		audi2.color = "blue";
		audi2.type = "SUV";

		audi2.displayColor();
		String ty3 = audi2.displayType();
		System.out.println(ty3);

		Vehical2 audi3 = new Vehical2("SUV", "Purple");
		audi3.displayColor();
		String ty5 = audi3.displaType();
		System.out.println(ty5);

		Vehical2 audi4 = new Vehical2("sedane", "black");
		audi4.displayColor();
		String ty6 = audi4.displaType();
		System.out.println(ty6);

		Vehical3 audi5 = new Vehical3();
		System.out.println(audi5.color);
		System.out.println(audi5.type);

		audi5.setColor("orange");
		audi5.setType("Jeep");

		System.out.println(audi5.color);
		System.out.println(audi5.type);

	}

}

// User Defined Data Type

class Vehical {

	String type = "sedane";
	String color = "Red";

	public void displayColor() {
		System.out.println(this.color);
	}

	public String displayType() {
		return this.type;
	}
}

class Vehical2 {
	String type;
	String color;

	public Vehical2(String ty, String cl) {
		this.type = ty;
		this.color = cl;
	}

	public void displayColor() {
		System.out.println(this.color);
	}

	public String displaType() {
		return this.type;
	}
}

class Vehical3 {
	String color;
	String type;

	public String setColor(String cl) {
		this.color = cl;
		return this.color;
	}

	public String setType(String ty) {
		this.type = ty;
		return this.type;
	}

}