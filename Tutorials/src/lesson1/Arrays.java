package lesson1;

public class Arrays {

	public static void main(java.lang.String[] args) {
		// TODO Auto-generated method stub
		// storing more values in an array
		int[] myintarray = {1,2,3,4,5}; //method one - preferred
		int myintarray2[] = {1,2,3,4,5,6}; //method two
		
		//index starts from 0, the arrays contains elements
		System.out.println(myintarray[0]);
		
		System.out.println("----");
		//To print all the elements
		int index = 0;
		
		while (index < 6) {
				
		System.out.println(myintarray2[index]);
		index++;
		}

	}

}
