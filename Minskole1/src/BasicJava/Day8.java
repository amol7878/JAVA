package BasicJava;

public class Day8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Print Hello 3 Times
		// Initialization

		int q1 = 1;
		while (q1 <= 3) {// condition check
			System.out.println("Hello");
			q1++;// increment//Decrement
		}

		// Program 2

		int q2 = 1;
		while (q2 <= 3) {
			System.out.println(q2);
			q2++;
		}

		// Program 3

		int q3 = 1;
		while (q3 <= 5) {
			System.out.println(q3);
			q3++;
		}

		// Program 4

		int q4 = 5;
		while (q4 >= 1) {
			System.out.println(q4);
			q4--;
		}

		// Table of Two

		int q5 = 2;
		while (q5 <= 20) {
			System.out.println(q5);
			q5 = q5 + 2;
		}

		// Table of 5 in Reverse

		int q6 = 50;
		while (q6 >= 5) {
			System.out.println(q6);
			q6 = q6 - 5;
		}

		// Break with while Loop

		int q7 = 1;
		while (q7 <= 5) {
			if (q7 == 3) {
				break;
			}
			System.out.println(q7);// 1//2
			q7++;// 2//3
		}

		// Continue with while Loop

		int q8 = 1;
		while (q8 <= 5) {

			if (q8 == 3) {
				q8++;//4
				continue;
			}
			System.out.println(q8);//1//2//4//5
			q8++;//2//3//5//6
		}

	}

}
