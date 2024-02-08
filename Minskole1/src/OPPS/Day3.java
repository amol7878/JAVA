package OPPS;

public class Day3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Student Amol = new Student();
		System.out.println(Amol.firstName);
		System.out.println(Amol.lastName);
		System.out.println(Amol.AdharNo);
		Amol.displaName();

		Teacher AmolT = new Teacher();
		System.out.println(AmolT.firstName);
		System.out.println(AmolT.lastName);
		System.out.println(AmolT.AdharNo);
		System.out.println(AmolT.Salary);
		AmolT.displaName();
		AmolT.didplaySalary();

	}

}

class Student {
	String firstName = "chinmay";
	String lastName = "Deshpande";
	String AdharNo = "123";

	public void displaName() {
		System.out.println(this.firstName + this.lastName);
	}
}

// Repetition 

//class Teacher {
//	String firstName = "chinmay";
//	String lastName = "Deshpande";
//	String AdharNo = "1234";
//	int Salary = 2223333;
//
//	public void displayName() {
//		System.out.println(this.firstName + this.lastName);
//	}
//
//	public void Salary() {
//		System.out.println(this.Salary);
//	}
//}

class Teacher extends Student {
	int Salary = 22233221;

	public void didplaySalary() {
		System.out.println(this.Salary);
	}
}
