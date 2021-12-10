package lesson1;

public class ForLoops {

	public static void main(java.lang.String[] args) {
		// TODO Auto-generated method stub
		int[] myintarray3 = {100,40,44,55,73,89};
		/*
		 * inside for loop, we have the following:
		 * for (init; expression; increment)
		 * that is, index initialization, expression and index increment
		 */
		
		for (int index=0 ; index < 6 ; index++) {
			int b = myintarray3[index] + 10;
			System.out.println(b);
		}
		
		System.out.println("----------");
		
		for (int element : myintarray3) { //this stores the value of array one by one into element, preferred without indexing
			System.out.println(element);
		}
	}

}
