package lesson1;

import java.util.Scanner;

public class TakeUserInput {

	public static void main(java.lang.String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner (System.in);
		System.out.println("Enter Some Number: ");
		int user_input_number = scan.nextInt(); //expecting an integer
		System.out.println("The entered value is: ");
		System.out.print(user_input_number); //printing  breaking the line
		
		Scanner scan1 = new Scanner (System.in);
		System.out.println("Enter Some Decimal Value: ");
		double user_input_double = scan1.nextDouble(); //expecting a double datatype
		System.out.println("The entered double is: ");
		System.out.print(user_input_double); //printing  breaking the line

		Scanner scan2 = new Scanner (System.in);
		System.out.println("Enter Some Strings: ");
		java.lang.String user_input_string = scan2.nextLine(); //expecting a double datatype
		System.out.println("The entered sting is: ");
		System.out.print(user_input_string); //printing  breaking the line
	}

}
