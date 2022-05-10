package oopsdemo2;	

	//child class-inheritance-is a relationship
		public class Developer extends Employee
		{
			String technology;
			public Developer(int empId, String name,String tech ) {
				super(empId, name);//invokes a base class constructor(employee)
				this.technology=tech;
			}
			void display1()
			{
				System.out.println("Technology used:"+technology);
			}
	     

}
