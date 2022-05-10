package oopsdemo3;

public class Marks extends Trainee {
	
      private double marks;
	public Marks(String name, String address, int number,double m) {
		super(name, address, number);
		this.marks=m;
		// TODO Auto-generated constructor stub
	}
	@Override
	public double calculateMarks() {
		// TODO Auto-generated method stub
		System.out.println("Calculate the marks:");
		return (marks*2);
	}

} 
