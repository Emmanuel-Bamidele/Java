package lesson1;

public class SwichStatement {

	public static void main(java.lang.String[] args) {
		// TODO Auto-generated method stub
		int score = 65;
		
		switch (score)
		{
		case 100 : //can evaluate multiple conditions, just don't add break until the end of the evaluation
		case 95 : 
		case 90 : 
			System.out.println("Very good");
			break;
		case 70 : 
		case 65 : 
		case 60 : 
			System.out.println("Good");
			break;
		case 50 : 
			System.out.println("Okay");
			break;
		case 20 : 
			System.out.println("Poor");
			break;
		default : 
			System.out.println("Undefined Grade");
			break;
		}
	}

}