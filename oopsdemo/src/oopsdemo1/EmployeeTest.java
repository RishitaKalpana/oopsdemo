package oopsdemo1;
//main class to test Employee class methods
public class EmployeeTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//create Objects e1,e2,e3 of Employee Class
		Employee e1=new Employee();
		Employee e2=new Employee();
		Employee e3=new Employee();
		//invoke(function calling) methods
		e1.inputEmployeeDetails();
		e2.inputEmployeeDetails();
		e3.inputEmployeeDetails();
		
		e1.calculateNetSalary();
		e2.calculateNetSalary();
		e3.calculateNetSalary();
		  
		e1.displayEmployeeDetails();
		e2.displayEmployeeDetails();
		e3.displayEmployeeDetails();

	}

}
