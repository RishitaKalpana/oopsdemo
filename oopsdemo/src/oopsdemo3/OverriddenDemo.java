package oopsdemo3;//refer again
class SoftwareEngineer
{
	protected String name,tech;
    protected double salary;
	public SoftwareEngineer(String name, String tech, double salary) {
		this.name = name;
		this.tech = tech;
		this.salary = salary;
	}
    
    final void display()
    {
    	System.out.println(name+" "+tech+" "+salary);
    }
    void work()
    {
    	System.out.println("Coding&Testing");
    }
}
class Developer extends SoftwareEngineer
{

	public Developer(String name, String tech, double salary) {
		super(name, tech, salary);
		
	}
		void work()//overridden method
		{
			System.out.println("Coding Using:"+tech);
		}
	
}
class Tester extends SoftwareEngineer
{

	public Tester(String name, String tech, double salary) {
		super(name, tech, salary);
	}
		void work()//overridden method
		{
			System.out.println("Testing Using:"+tech);
		}
	}

	

	


public class OverriddenDemo {
	public static void main(String[] args) {
		SoftwareEngineer s1=new SoftwareEngineer("Navin","java fullstack",350000);	
		Developer d1=new Developer("Gosling","java",250000);
		Tester t1=new Tester("Mike","Jmeter",200000);
		d1.display();//invokes base class method
		d1.work();
		t1.display();
		t1.work();//invokes dervied class overridden method
				
		
	}

}
