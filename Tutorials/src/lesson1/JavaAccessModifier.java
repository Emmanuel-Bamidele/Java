package lesson1;

/*
 * Modifier			Class 				Package				Subclass 			World
 * public			  Y					   Y				    Y				  Y
 * protected		  Y					   Y				    Y				  N
 * no modifier  	  Y					   Y				    N				  N
 * private			  Y					   N				    N				  N
 */

public class JavaAccessModifier {
	java.lang.String name;
	int age;
	
	//not a good practice to make it available outside your package, so making it protected/private is advised
	public java.lang.String grade; //visible everywhere
	public int id; ////visible everywhere
	
	//making it private, using getter and setter is the only way to access this
	private java.lang.String team; //visible everywhere
	private int balance; ////visible everywhere
	public java.lang.String getTeam() {
		return team;
	}
	public void setTeam(java.lang.String team) {
		this.team = team;
	}
	public int getBalance() {
		return balance;
	}
	public void setBalance(int balance) {
		this.balance = balance;
	}
}
