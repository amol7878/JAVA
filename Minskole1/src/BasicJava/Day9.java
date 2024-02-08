package BasicJava;

public class Day9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//String
		//Properties and Methods
		//Data Type
		//Loop
		//Retrieve
		//Delete
		//update
		//Add
		
		String first_Name = new String("Amol");
		String last_Name = "Shinde";
		
		//String Stores the value by index
		
		String city = "Pune";
		System.out.println(city);
		
		// 0 1 2 3
		// P u n e
		
		System.out.println(city.charAt(0));
		System.out.println(city.charAt(1));
		System.out.println(city.charAt(2));
		System.out.println(city.charAt(3));
		
		//Printing every Character Of String
		
		String city2 = "Chandrapur";
		for (int i=0;i<city2.length();i++) {
			//System.out.println(i);
			System.out.println(city2.charAt(i));
		}
		
		//Print The character in Reverse
		
		//Length -1 is always the last index
		
		for (int i=city2.length()-1;i>=0;i--) {
			System.out.println(city2.charAt(i));
		}
		
		//Program 2
		
		// int + int =====>int
		//int + String ====>String
		//String + int ====>String
		//String + String =====> String
		
		int a = 10;
		int b = 50;
		String c ="Hello";
		System.out.println(a+b+c);
		System.out.println(b+c+a);
		System.out.println(c+a+b);
		
		
		String first_Namea = "Sarika";
		String last_Nameb = "Pansare";
		
		System.out.println("My first Name is "+first_Namea+" My lst name is "+last_Nameb);
		
		String greeting = "Hello";
		String greet =greeting.concat("world !");
		System.out.println(greet);
		
		// charAt()
		// length()
		// concat()
		
		// Program 3 
		
		String first_Name2 ="Amol";
		String Uppercase = first_Name2.toUpperCase();
		System.out.println(Uppercase);
		
		//Program 4
		String first_Name3 ="AMOL";
		String Lowercase = first_Name3.toLowerCase();
		System.out.println(Lowercase);
		
		//SusbString
		
		//equals()

		//contains()
		
		
		
		
		
		
		
		

	}

}
