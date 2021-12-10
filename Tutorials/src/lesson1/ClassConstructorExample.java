package lesson1;

public class ClassConstructorExample {

	public static void main(java.lang.String[] args) {
		// TODO Auto-generated method stub
		CubeClass FirstCube = new CubeClass(); // CubeClass is the constructor of the created CubeClass, always same as class name
		//constructors are used to initialize value in a class
		System.out.println(FirstCube.CalcCubeVolume());
		
		System.out.println("-------");
		
		CubeClass SecondCube = new CubeClass(15,15,15);
		System.out.println(SecondCube.CalcCubeVolume());

	}

}
