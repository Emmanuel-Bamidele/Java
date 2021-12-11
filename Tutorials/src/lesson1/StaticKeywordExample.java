package lesson1;

public class StaticKeywordExample {

	public static void main(java.lang.String[] args) {
		// TODO Auto-generated method stub
		StudentClass2 mark = new StudentClass2();
		System.out.println(StudentClass2.returnNoOfStudents());
		System.out.println(mark.returnNoOfStudents());
		StudentClass2 tom = new StudentClass2();
		System.out.println(StudentClass2.returnNoOfStudents());
		System.out.println(tom.returnNoOfStudents());
		
		//we can see that the StudentsNumber which was static was shared by both the instances. 
		//It can either be called by the instance or the class it self
		//System.out.println(StudentClass2.returnNoOfStudents());

	}

}
