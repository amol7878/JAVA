package OPPS;

public class Day11B {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// Access Modifire
		// public ,default, Protected, Private
		
		
		
		DatabaseB b= DatabaseB.createObj();
		b.getConnection();
		
		DatabaseB c = DatabaseB.createObj();
		c.getConnection();

	}

}

class DatabaseB {
	private static DatabaseB obj; //null
	private DatabaseB() {
		
	}
	
	public static DatabaseB createObj() {
		if(obj == null) {
			obj =new DatabaseB();
		}
		return obj;
	}
	public void getConnection() {
		System.out.println("connected to DB");
	}
}