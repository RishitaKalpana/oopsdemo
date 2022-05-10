package oopsdemo3;

public class AbstractDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         Trainee t1=new Marks("John","New York",1001,35);//upcasting
         t1.show();//invokes abstract base class method
         double marks=t1.calculateMarks();
         System.out.println(t1+" "+marks);
	}

}
