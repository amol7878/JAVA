package BasicJava;

public class Day3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// Comparison ==== > True Or False
		
		//<,>,<=,>=,!=,,==
		
		System.out.println(3>2); //True
		System.out.println(3<2); //False
		System.out.println(3<=2); //False
		System.out.println(3>=2); //True
		System.out.println(3>=3); //True
		System.out.println(3<=3); //True
		System.out.println(3!=3); //False
		System.out.println(3==3); //True
		
		//Logical Operator 
		
		//&& -AND
		
		//Truth
		//True && True ====>True
		//False&& True ====>False
		//True && False ===>False
		//False && False ===>False
		
		System.out.println(2==2 && 3==3);
		System.out.println(2!=2 && 3==3);
		System.out.println(2==2 && 3!=3);
		System.out.println(2!=2 && 3!=3);
		

		// || -OR
		
		//Truth
		//True || True ====>True
		//False || True ====>True
		//True || False ===>True
		//False || False ===>True
		
		System.out.println(2==2 || 3==3);
		System.out.println(2!=2 || 3==3);
		System.out.println(2==2 || 3!=3);
		System.out.println(2!=2 || 3!=3);
		
		// !-NOT
		
		System.out.println(!(12==12));
		System.out.println(!(12!=12));
		
		
		
		

	}

}
