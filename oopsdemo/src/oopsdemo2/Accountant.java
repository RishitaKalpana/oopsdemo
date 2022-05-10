package oopsdemo2;
//child class derived from Employee parent class
public class Accountant extends Employee {
    String tech, task;
    
	public Accountant(int empId, String name,String t1,String t2) {
		super(empId, name);//calls base class constructor and pass args
		this.task=t1;
		this.tech=t2;
		
	}
	void print() {
		super.display();// invokes base class display() method
        System.out.println("Accountant Task :"+task);
        System.out.println("Softwares used :"+tech);
	}

}
