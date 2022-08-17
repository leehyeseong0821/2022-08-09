package projectA14;
 

abstract class Shape1{
	public Shape1() {
		
	}
	
	public void Paint() {
		draw();
	}
	abstract public void draw();
}
abstract class ShapeC{
	String name;
	public void Paint() {
		System.out.println("도형을 그립니다.");
	}
}

abstract class Line extends Shape1{
	public String toString() {
	return "line";
	}
}

class Rect extends Shape1{
	@Override
	public void draw() {
		System.out.println("그림을 그립니다.");
		
	}
}





public class Shape {
 public static void main(String[] args) {
	
}
}
