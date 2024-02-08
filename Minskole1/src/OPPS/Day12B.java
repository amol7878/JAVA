package OPPS;

enum SizeP {
	SMALL, MEDIUM, LARGE, EXTRALARGE, M
}

public class Day12B {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Test aa = new Test(SizeP.M);// SMALL
		aa.orderPizza();
	}

}

class Test {
	SizeP pizzaSize;

	public Test(SizeP p) {
		this.pizzaSize = p;
	}

	public void orderPizza() {
		switch (pizzaSize) {

		case SMALL:
			System.out.println("I Oreder Small Pizza");
			break;
		case MEDIUM:
			System.out.println("I order Midium Pizza");
			break;
		case LARGE:
			System.out.println("I Order Larg Pizza ");
			break;
		case EXTRALARGE:
			System.out.println("I oder Extra Large Pizza");
			break;
		default:
			System.out.println("I Am of Default Type M");
		}

	}
}