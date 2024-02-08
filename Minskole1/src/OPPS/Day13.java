package OPPS;

public class Day13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Program 1

//		System.out.println("Hello");
//		System.out.println(10/0);
//		System.out.println("BYE");

		// Program 2

		System.out.println("hello");

		try {
			System.out.println(10 / 0);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}

		System.out.println("BYE");

		// Program 3

//		System.out.println("Hello 2");
//		try {
//			System.out.println(10 / 5);
//			int arr[] = { 11, 22, 33, 44 };
//			for (int i = 0; i < arr.length; i++) {
//				System.out.println(i);
//				System.out.println(arr[i]);
//			}
//
//		} catch (ArithmeticException e) {
//			System.out.println("Incorrect Input");
//
//		} catch (ArrayIndexOutOfBoundsException e) {
//			System.out.println(e.getMessage());
//		} catch (Exception e) {
//			System.out.println(e.getMessage());
//		}
//
//		System.out.println("BYE");
//		
		
		// Program 4

		System.out.println("Hello 2");
		try {
			System.out.println(10 / 5);
			int arr[] = { 11, 22, 33, 44 };
			for (int i = 0; i < arr.length; i++) {
				System.out.println(i);
				System.out.println(arr[i]);
			}

		} catch (ArithmeticException e) {
			System.out.println("Incorrect Input");

		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println(e.getMessage());
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		finally {
			System.out.println("I WIll Execute any time any Where");
		}
         
		System.out.println("BYE");
	}

}
