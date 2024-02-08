package BasicJava;

public class Day2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		addA();
		addA();
		addA();
		addA();

		addB(13, 4);
		addB(155, 78);

		int q1 = addC(16, 12);
		System.out.println(q1);
		System.out.println(q1 + q1);
		System.out.println(q1 * 0.10);
	}

	// Function Without Parameter And Without Return Type

	public static void addA() {
		System.out.println(8 + 1);
	}

	// Function With Parameter And Without Return Type

	public static void addB(int x, int y) {
		System.out.println(x + y);
	}

	
	// 100 -show
	// 100 -given

	// Function With Parameter And With Return Type

	public static int addC(int x, int y) {
		return x + y;
	}

}
