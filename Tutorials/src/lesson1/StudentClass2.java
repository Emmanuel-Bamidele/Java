package lesson1;

public class StudentClass2 {
	java.lang.String name;
	int age;
	static int StudentsNumber = 0; //declared static so it can be shared by all instances
	
	StudentClass2() {
		StudentsNumber++;
	}
	public static int returnNoOfStudents() {
		return StudentsNumber;
	}
	
	public java.lang.String getName() {
		return name;
	}
	public void setName(java.lang.String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
}
