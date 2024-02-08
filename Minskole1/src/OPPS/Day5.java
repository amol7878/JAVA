package OPPS;

public class Day5 {

	// Polymorphism -overloading
	// Same class ,same method and different signature

	public static void main(String[] args) {
		addition(1, 3);
		addition(1, 2, 3);
		addition(1, 2, 3, 4);

	}

	public static void addition(int x, int y) {
		System.out.println(x + y);
	}

	public static void addition(int x, int y, int z) {
		System.out.println(x + y + z);
	}

	public static void addition(int x, int y, int z, int a) {
		System.out.println(x + y + z + a);
	}

}
