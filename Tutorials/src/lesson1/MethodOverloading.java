package lesson1;

public class MethodOverloading {

	public static void main(java.lang.String[] args) {
		// TODO Auto-generated method stub
		//Java will know when to use which method depending on the data type provide 
		System.out.println(Add(2,4));
		System.out.println(Add(2.6,4.9));
		System.out.println(Add("Hello ","World"));
	}

	public static int Add(int x, int y) {
		return (x-y);
	}
	
	public static double Add(double x, double y) {
		return (x+y);
	}
	
	public static java.lang.String Add(java.lang.String x, java.lang.String y) {
		return (x+y);
	}
}
