package oopsdemo1;

public class TraineeTest {

	public static void main(String[] args) {
		Trainee t1=new Trainee();//invokes implicit constructor
		t1.display();
		
		Trainee t2=new Trainee(222,"james","java",3000);//invokes parameterized constructorTrainee t1=new Trainee();
		t2.display();
		

	}

}
