package BasicJava;

public class Day6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int q1 = GreaterNum(100, 40, 5);// 3
		switch (q1) {
		case 1:
			System.out.println("X is Greater");
			break;
		case 2:
			System.out.println("Y is Greater");
			break;
		case 3:
			System.out.println("Z is Greater");
			break;
		}

	}

	public static int GreaterNum(int x, int y, int z) {
		if (x > y && x > z) {
			return 1;
		} else if (y > x && y > z) {
			return 2;
		}
		else{
			return 3;
		}
	}

}
