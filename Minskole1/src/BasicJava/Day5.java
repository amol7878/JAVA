package BasicJava;

public class Day5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Switch Without Break

	
		// Program 2

		String city = "jaipure";
		switch (city) {
		case "pune":
			System.out.println("MH");
		case "indore":
			System.out.println("MP");
		case "Jaipure":
			System.out.println("RJ");
		default:
			System.out.println("Incoreect city Name");

		}

		String city2 = "indore";
		switch (city2) {
		case "pune":
			System.out.println("MH");
			break;
		case "indore":
			System.out.println("MP");
			break;
		case "Jaipure":
			System.out.println("RJ");
			break;
		default:
			System.out.println("Incoreect city Name");

		}

		// Program 3

		String city3 = "pune";
		switch (city3) {
		case "pune":
		case "nagpur":
			System.out.println("MH");
			break;
		case "indore":
		case "bhopal":
			System.out.println("MP");
			break;
		case "Jaipure":
		case "Udaipure":
			System.out.println("RJ");
			break;
		default:
			System.out.println("Incoreect city Name");

		}

		// Program 4

		int a = 10;
		int b = 50;
		int c = 300;

		if (a > b && a > c) {
			System.out.println("A is Greater");
		} else if (b > a && b > c) {
			System.out.println("B is Greater");
		} else {
			System.out.println("C is Greater");
		}

	}

}
