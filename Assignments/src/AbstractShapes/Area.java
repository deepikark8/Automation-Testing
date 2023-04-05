package AbstractShapes;

public class Area extends Shape {
	
	public void RectangleArea(int length, int breadth) {
		int areaRectangle = length + breadth;
	    System.out.println("Area of Rectangle :" + areaRectangle);
	  }
	
	public void CircleArea(double radius) {
		double areaCircle = Math.PI*radius*radius;
		
	    System.out.println("Area of Circle : "+ areaCircle);
	  }
	
	public void SquareArea(double side) {
		double areaSquare = side * side;
	    System.out.println("Area of Square :"+areaSquare );
		
	}
	

}
