package lesson1;
//deriving from the polygon class, so Polygon is the base class while Rectangle is the derived class
//all protected and public members will be accessible

public class Rectangle extends Polygon {
	public double area() {
		return (height*width);
	}

}
