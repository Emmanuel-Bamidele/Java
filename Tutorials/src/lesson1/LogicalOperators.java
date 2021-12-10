package lesson1;

public class LogicalOperators {

	public static void main(java.lang.String[] args) {
		// TODO Auto-generated method stub
		int Subject1 = 40;
		int Subject2 = 60;
		
		// && shows AND operators
		// || shows OR operators
		
		if ((Subject1 >= 70) || (Subject2 >= 35) && (Subject2 == 35)) {
			System.out.println("The condition is true");
		}
		else {
			System.out.println("The condition is not true");
		}

	}

}
