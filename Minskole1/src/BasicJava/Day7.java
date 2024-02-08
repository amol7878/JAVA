package BasicJava;

public class Day7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// for loop

		// Break Statement with for Loop

		for (int i = 0; i <= 5; i++) {// 1//2//3
			if (i == 3) {
				break;
			}
			System.out.println(i);// 0//1//2
		}

		for (int i = 5; i >= 1; i--) {// 4//3
			System.out.println(i);// 5//4//3
			if (i == 3) {
				break;
			}
		}

		// continue with for
		for (int i = 1; i <= 5; i++) {// 2//3//4//5//6
			if (i == 3) {
				continue;
			}
			System.out.println(i);// 1//2//4//5
		}

	}

}
