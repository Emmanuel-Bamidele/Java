package lesson1;

public class StudentClass {
	//variables stored for Students
	//define variables, then go to source and generate getters and setters because direct use is not advaisable
	int id;
	java.lang.String name;
	int age;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
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
