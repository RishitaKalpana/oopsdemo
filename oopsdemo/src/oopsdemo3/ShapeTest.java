package oopsdemo3;
//rectangle code incomplete
public class ShapeTest {

	public static void main(String[] args) {
		// Programming for interfaces  not Implementation
	     IShape shape=new Circle(10);
	       
	        System.out.println("Using Interface :"+shape.LABLE);
	       
	        shape.draw();
	       
	        System.out.println("Area of Circle with radius  is :"+shape.getArea());
	       
	        //switching from one implementation to another easily
	        //shape=new Rectangle(10,7);
	       
	        shape.draw();
	        System.out.println("Area of Rectangle is :"+shape.getArea());
}
}
