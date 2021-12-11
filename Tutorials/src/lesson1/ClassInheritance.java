package lesson1;

public class ClassInheritance {
	
	/*
	 * Class inheritance - classes can be extended
	 * Creating new class which retains the characteristics of the base class
	 * I will use Rectangle, polygon and triangle classes to exemplify this and then access the result here
	 */

	public static void main(java.lang.String[] args) {
		// TODO Auto-generated method stub
		Rectangle rect = new Rectangle();
		Triangle tri = new Triangle();
		
		//because they  extends Polygon, they can also access a method from Polygon
		rect.set_values(10, 15);
		tri.set_values(10, 15);
		
		//we can then call the method from their own classes
		System.out.println("The area of the rectangle is: " + rect.area());
		System.out.println("The area of the triangle is: " + tri.area());
	

	}

}
