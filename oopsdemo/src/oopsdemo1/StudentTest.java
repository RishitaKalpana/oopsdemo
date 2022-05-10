package oopsdemo1;

public class StudentTest {
    //main class
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        
		 //Create object/instance of a student class
		Student s1=new Student();
		Student s2=new Student();
		Student s3=new Student();
		//invoke methods for students class
		s1.inputDetails();
		s2.inputDetails();
		s3.inputDetails();
		//invoke methods of student class using dot operator
		 
		float tot1=s1.calculate();
		float tot2=s2.calculate();
		float tot3=s3.calculate();
		 
		s1.displayDetails();
		System.out.println("Total Displayed from the main:"+tot1);
		s2.displayDetails();
		System.out.println("Total Displayed from the main:"+tot2);
		s3.displayDetails();
		System.out.println("Total Displayed from the main:"+tot3);
		
		
		
		
	}

}
