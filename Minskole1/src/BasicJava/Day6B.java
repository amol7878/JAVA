package BasicJava;

public class Day6B {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Print 1 to 5

		System.out.println(1);
		System.out.println(2);
		System.out.println(3);
		System.out.println(4);
		System.out.println(5);

		// for Loop

		// for(initialization ; conditionCheck ; increment/decrement{
		// Statement
		// }

		// Program 1
		for (int i = 1; i <= 3; i++) {// 2//3//4
			System.out.println("Hello");// Hello//Hello//hello
		}
		// Program 2
		for (int i = 1; i <= 3; i++) {// 2//3//4
			System.out.println(i);// 1//2//3
		}
		// Program 3
		// print 1 to 5
		for (int i = 1; i <= 5; i++) {// 2//3//4//5//6
			System.out.println(i);// 1//2//3//4//5
		}
		// Program 4
		// print 5 to 1
		for (int i = 5; i >= 1; i--) {// 4//3//2//1//0
			System.out.println(i);// 5//4//3//2//1
		}

		// Program 5
		// Table 2
		for (int i = 2; i <= 20; i=i+2) {// 4//6//====//22
			System.out.println(i);// 2//4//6//-----20
		}
		
		// Program 6
		// Table 5
		for(int i=50;i>=5;i=i-5) {//45//---------0
			System.out.println(i);//50//45///-----5
		}
		
		//While Loop

	}

}
