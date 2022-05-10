package oopsdemo3;
//Rectangle class is implementing Shape Interface
public class Rectangle1 implements IShape {
     private double width;
     private double height;
     
     
	public Rectangle1(double width, double height) {
		this.width = width;
		this.height = height;
	}

	@Override
	public void draw() {
		// TODO Auto-generated method stub

	}

	@Override
	public double getArea() {
		// TODO Auto-generated method stub
		return 0;
	}

}
