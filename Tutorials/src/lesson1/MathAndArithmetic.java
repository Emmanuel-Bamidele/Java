package lesson1;

public class MathAndArithmetic {

	public static void main(java.lang.String[] args) {
		// TODO Auto-generated method stub
		double x, y, answer1, answer2, answer3, answer4, answer3b;
		x = 200;
		y = 11;
		answer1 = x + y;
		answer2 = x - y;
		answer3 = x / y; //when two integers are divided, we will get integer
		answer3b = x % y; //get the remainder of the division - called modulus
		answer4 = x * y;
		
		System.out.println("Addition = " + answer1);
		System.out.println("Substraction = " + answer2);
		System.out.println("Division = " + answer3);
		System.out.println("Remainder = " + answer3b);
		System.out.println("Multiplication = " + answer4);
		

	}

}
