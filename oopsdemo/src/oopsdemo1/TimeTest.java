package oopsdemo1;

public class TimeTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Time t1=new Time(12,45,55);//invoke the constructor&initialise the values
        Time t2=new Time(10,30,30);
        t1.add(t2);//invoke add method & pass t2 obj to args
        System.out.println("The addition of 2 times:");
        t1.display();
	}

}
