package lesson1;
/*
 * Final keyword is used in the following ways:
 * 
 * A final class cannot be subclassed, if a class is final, we cannot use it to extend another class
 * A final method cannot be overridden by subclass
 * A final variable can only be initialize once
 */

public class FinalKeyword {
	public final int number;
	
	FinalKeyword() {
		number = 10;
	}

}
