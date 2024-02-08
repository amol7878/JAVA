package BasicJava;

public class Day11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Why Array ??

		// int a = 10;
		// int b = 20;

		// dataType [] arrName = new dataType[arraySize]
		int[] marks = new int[5];

		marks[0] = 1;
		marks[1] = 2;
		marks[2] = 3;
		marks[3] = 4;
		marks[4] = 5;
		// marks [5] = 6;
		System.out.println(marks[3]);

		String names[] = new String[5];
		names[0] = "Poorva";
		names[1] = "Sarika";
		names[2] = "Mayuri";
		names[3] = "Mayuri K";
		names[4] = "Komal";

		// 0 1 2 3
		String cities[] = { "chandrapur", "nagpur", "pune", "nagpure" };
		System.out.println(cities[3]);

		// length

		System.out.println(cities.length);

//	    int n [] = {11,22,33,44,55};
//	    for(int i=0;i<n.length;i++) {
//	    	System.out.println(i);
//	    }

//	    for (int i=0; i<n.length; i++) {
//	    	System.out.println(n[i]);
//	    }

		String namess[] = { "nagpur", "vijaypur", "sagmner" };
		for (int i = 0; i < namess.length; i++) {
			System.out.println(namess[i]);
		}

		// for each
		for (String x : namess) {
			System.out.println(x);
		}

		int n2[] = { 11, 22, 33, 44, 55 };

		for (int element : n2) {
			System.out.println(element);
		}

		// Multiple dimensional array

	}

}
