package lesson1;

public class IncrementAndAssignment {

	public static void main(java.lang.String[] args) {
		// TODO Auto-generated method stub
		int x = 10;
		int y = 11;
		int z = 5;
		int a = 15;
		// method one: x = x + 1;
		x++; //increases by one, called post-increment, increases after x is assigned
		y = ++y; //pre-increment, increases before x is assigned
		z += 5; //assignment operator 
		a *= 2; //assignment operator 
		System.out.println("x = " + x);
		System.out.println("y = " + y);
		System.out.println("z = " + z);
		System.out.println("a = " + a);

	}

}
