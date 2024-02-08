package BasicJava;

public class Day4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//One input multiple outcome
		
		//numT >0 && numT <= 5  ======> 10% Discount
		//numT >5 && numT <= 10  ======> 20% Discount
		//numT >10              =======>30% Discount
		
//		int numT=7;
//		
//		if(numT>0 && numT<=5) {
//			System.out.println("10% Discount");
//		}
//		if(numT>5 && numT<=10) {
//			System.out.println("20% Discount");
//		}
//		if(numT>10) {
//			System.out.println("30% Discount");
//		}
		
		
		
		//Program 2
		
		int numT=-21;
		
		if(numT>0 && numT<=5) {
			System.out.println("10% Discount");
		}
		else if(numT>5 && numT<=10) {
			System.out.println("20% Discount");
		}
		else if(numT>10) {
			System.out.println("30% Discount");
		}
		else {
			System.out.println("Incorrect Input");
		}
		
		//Program 3
		
//		int marks =92;
//		
//		if(marks>90) {
//			System.out.println("GradeA");
//		}
//		if(marks>75) {
//			System.out.println("GradeB");
//		}
//		if(marks>65) {
//			System.out.println("GradeC");
//		}
		
		//Program 4
	
		int marksB=55;
		
		if(marksB>90) {
			System.out.println("GradeA");
		}
		else if(marksB>75) {
			System.out.println("GradeB");
		}
		else if(marksB>65) {
			System.out.println("GradeC");
		}
		else {
			System.out.println("Fail Please Try Again");
		}
		
		//Program 5
		
		int a =100;
		int b =800;
		
		if(a>b) {
			System.out.println("A Is Greater");
		}
		else {
			System.out.println("B is Greater");
		}
		
		//Program 6
		
		int x=10;
		int y=50;
		int z=300;
		
		if(x>y && x>z) {
			System.out.println("X is Greate");
		}
		else if(y>x && y>z) {
			System.out.println("Y is greater");
		}
		else {
			System.out.println("Z is Greater");
		}
		
		
		//Program 7
		
		int q=8;
		int r=40;
		
		if(q>r) {
			System.out.println("Q is Greater");
		}
		else {
			System.out.println("R is Greter");
		}
		
		String Result = q>r?"Q is Greter":"R is Greater";
		System.out.println(Result);
		
		//Program 8
		
		int age=18;
		String Result2 = age>=17?"Can Drive":"Cannot Drive";
		System.out.println(Result2);

	}

}
