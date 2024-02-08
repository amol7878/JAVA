package OPPS;

public class Day11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Database.getObj();
		Database.getObj();
	}

}

class Database {
	private static Database obj;

	private Database() {

	}

	public static Database getObj() {
		if (obj == null) {
			obj = new Database();
		}
		return obj;
	}
}
