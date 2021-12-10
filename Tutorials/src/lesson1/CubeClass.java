package lesson1;

public class CubeClass {
	int length;
	int  breadth;
	int height;
	
	public int CalcCubeVolume() {
		return (length * breadth * height);
	}
//we can have multiple constructors
	CubeClass() {
		length = 10;
		breadth = 8;
		height = 15;
	}
	
	CubeClass(int l, int b, int h) {
		length = l;
		breadth = b;
		height = h;
	}
}
