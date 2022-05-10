package oopsdemo2;


public class SingleInheritanceDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Developer d1=new Developer(101,"james","jdbc");//invoke derived class constructor
		Developer d2=new Developer(102,"mike","kbc");
		
		d1.display();//child class object invokes the parent class method
		d1.display1();//child class
		d2.display();
		d2.display1();
		
	}

}
