package lesson1;

public class ClassesAndObject {

	public static void main(java.lang.String[] args) {
		// TODO Auto-generated method stub
		//This will show the object oriented part of java
		//every project has at least one class and one object
		//we can create different instances and objects for a class
		//we are working with student class in lesson 1
		//use getters and setters to set and obtain the values
		StudentClass mark = new StudentClass();// mark is an object
		mark.setId(1);
		mark.setName("Mark");
		mark.setAge(25);
		
		System.out.println(mark.getName() + " is " + mark.getAge() + " years old");
		
		StudentClass tom = new StudentClass();// mark is an object
		tom.setId(2);
		tom.setName("Tom");
		tom.setAge(32);
		
		System.out.println(tom.getName() + " is " + tom.getAge() + " years old");
	}

}
