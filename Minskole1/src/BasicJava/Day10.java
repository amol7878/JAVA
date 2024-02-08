package BasicJava;

public class Day10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Method
		// Action
		// Return Type

		// charAt()

		String first_Name = "chinmay";
		char q = first_Name.charAt(1);
		System.out.println(q);

		// length()

		String lastName = "Deshpande";
		int j = lastName.length();
		System.out.println(j);

		// SubString()

		String info = "JavaScript";

		// 0 1 2 3 4 5 6 7 8 9
		// j a v a s c r i p t

		String q2 = info.substring(2);
		System.out.println(q2);
		String q3 = info.substring(2, 7);
		System.out.println(q3);

		// toUppercase()
		String city = "pune";
		String q4 = city.toUpperCase();
		System.out.println(q4);

		// toLowercase()
		String city1 = "MUMBAI";
		String q5 = city1.toLowerCase();
		System.out.println(q5);

		// trim()

		String city3 = " goa ";
		System.out.println(city3.length());
		String q6 = city3.trim();
		System.out.println(q6);
		System.out.println(q6.length());

		// StartsWith()
		String city4 = "Chandrapur";
		boolean q7 = city4.startsWith("Ch");
		System.out.println(q7);

		boolean q8 = city4.startsWith("C");
		System.out.println(q8);

		// EndsWith()
		String city5 = "jaipur";
		boolean q9 = city5.endsWith("r");
		System.out.println(q9);

		boolean q10 = city5.endsWith("pur");
		System.out.println(q10);

		// replace()
		String info2 = " I am learning javascript and javascript is great";
		String q11 = info2.replace("I", "J");
		System.out.println(q11);

		// replaceFirst()

		String q12 = info.replaceFirst("javascript", "java");
		System.out.println(q12);

		// replaceAll()
		String q13 = info2.replaceAll("javascript", "java");
		System.out.println(q13);

		// contains

		String q14 = " I Am learning js";
		boolean a1 = q14.contains("learning");
		System.out.println(a1);

		// indexOf()

		String city33 = "pune";

		// 0 1 2 3
		// p u n e

		int a2 = city33.indexOf("u");
		System.out.println(a2);

		// lastIndexOf()

		String city44 = "chandrapur";
		// 0 1 2 3 4 5 6 7 8 9
		// c h a n d r a p u r

		int a3 = city44.indexOf("a");
		System.out.println(a3);

		int a4 = city44.lastIndexOf("a");
		System.out.println(a4);

		// Split()

		String infoa = "chinmay- deshpande-77770092441";
		String[] vl = infoa.split("-");// {"chinmay","deshpande","77770092441"}
		System.out.println(vl);

		for (int i = 0; i < vl.length; i++) {
			System.out.println(vl[i]);
		}
		// isEmpty()

		String h = "";
		System.out.println(h.isEmpty());

		String g = " ";
		System.out.println(h.isEmpty());
		System.out.println(g.isBlank());

		// isEqual();

		String a = "heloo";
		String b = "Heloo";

		System.out.println(a.equals(b));
		System.out.println(a.equals(b));

		System.out.println(a.equalsIgnoreCase(b));

	}

}
