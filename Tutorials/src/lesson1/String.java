package lesson1;

public class String {

	public static void main(java.lang.String[] args) {
		// TODO Auto-generated method stub
		//String is a sequence of characters or character arrays
		java.lang.String myString = "Hello World";
		System.out.println(myString);
		
		//String methods
		//length
		int myStringLength = myString.length();
		System.out.println("--------------------");
		System.out.println(myStringLength);
		
		//lower case
		java.lang.String myStringlower = myString.toLowerCase();
		System.out.println("--------------------");
		System.out.println(myStringlower);
		
		//upper case
		java.lang.String myStringupper = myString.toUpperCase();
		System.out.println("--------------------");
		System.out.println(myStringupper);
		
		//Concatenate
		java.lang.String myStringconc = "Hello " + "World " + "by " + "Bamidele";
		System.out.println("--------------------");
		System.out.println(myStringconc);
		//System.out.println(string1.concat(string2));// : appends a string to end of another
		
		//Replace
		java.lang.String myStringReplace = myStringconc.replace(" ", "-");
		System.out.println("--------------------");
		System.out.println(myStringReplace);
		
		//Others
		// myString.charAt(0) : character at index 0
		//System.out.println(myString.compareTo(myStringconc));// : Compares two strings lexicographically, returns 0 if the same
		//System.out.println(myString.compareToIgnoreCase(myStringconc));// : Compares two strings lexicographically
		//System.out.println(myString.concat(myStringconc));// : appends a string to end of another
		//System.out.println(myString.contains("Hel")); //returns true if true, and false if otherwise
		//System.out.println(myString.endsWith("Hel")); //returns true if true, and false if otherwise
		//System.out.println(myString.equals(myStringconc));// : returns true if true, and false if otherwise
		//System.out.println(myString.equalsIgnoreCase(myStringconc));// : returns true if true, and false if otherwise
		/*
		 * others are
		 * startsWith(), format(), isEmpty(), matches(), replaceFirst(), replaceLast(), split(), trim(), indexOf(),
		 * etc- https://www.w3schools.com/java/java_ref_string.asp 
		 */
	}

}
