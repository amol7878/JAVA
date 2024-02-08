package BasicJava;

public class Pract {

	public static void main(String[] args) {

   int q2 = GreaterNum(100,40,5);
   
	switch(q2) {
	case 1:
		System.out.println("X is Greater");
		break;
	case 2:
		System.out.println("Y Is greater");
		break;
	case 3:
		System.out.println("Z Is greater");
	}
	
	
		
			
	}
	public static int GreaterNum(int x,int y,int z ) {
		if(x>y && x>z) {
			return 1;
		}else if(y>x && y>z) {
			return 2;
		}
		else {
			return 3;
		}
	}

}
