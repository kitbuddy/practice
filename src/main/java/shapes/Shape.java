package shapes;

public  abstract class Shape {

	public abstract void drawShape();
}


class Square extends Shape {

	@Override
	public void drawShape() {
		System.out.println("Drawing a square");		
	}
}


class Circle extends Shape {

	@Override
	public void drawShape() {
		System.out.println("Drawing a Circle");		
	}
}


class Rectangle extends Shape {

	@Override
	public void drawShape() {
		System.out.println("Drawing a Rectangle");		
	}
}


 class ShapeFactory {
	
	public  void drawShape(String shape) {
		
		if(shape.equals("Square")) {
			Square sObj = new Square();
			sObj.drawShape();
		}
		else if (shape.equals("Circle")) {
			Circle cObj = new Circle();
			cObj.drawShape();
		}
		else if (shape.equals("Rectangle")) {
			Rectangle rObj = new Rectangle();
			rObj.drawShape();
		}else {
			System.out.printf("Drawing %s is not supported", shape);
		}
		
	}
	
	public static void main(String[] args) {
		
		 ShapeFactory ssF = new ShapeFactory();
		 
		 ssF.drawShape("Rectangle");
	}
}
 
 
 
 
 
 
 
 
 
 
 
 