package lesson1;

public class Methods {

	public static void main(java.lang.String[] args) {
		// TODO Auto-generated method stub
		// Methods are the same as Functions in Python, it execute a piece of code
		//Method cannot be main because there can be only one main which is already there
		myFirstMethod("Bamidele");
		myFirstMethod("Emmanuel");
		myFirstMethod("Java");
		
		System.out.println("------------");
		
		int sum = Addition(100,20);
		int result = sum * 15;
		System.out.println(sum);
		System.out.println(result);
		
		System.out.println("------------");

		int multiply = Multiply(100,20);
		int result2 = sum * 15;
		System.out.println(multiply);
		System.out.println(result2);
	}
	
	public static void myFirstMethod(java.lang.String name) {
		//public means it is accessible anywhere inside 
		//void means we are not returning anything
		//myFirstmethod is the method name
		//in the round bracket, we can pass an argument
		//the statement is in the {} 
		System.out.println("My Method will return " + name);
	}
	
	public static int Addition(int a, int b) { 
		//change void to int if we want to return int value
		//System.out.println(a+b);
		return a+b;
	}
	
	public static int Multiply(int a, int b) { 
		//change void to int if we want to return int value
		//System.out.println(a+b);
		return a*b;
	}
}
