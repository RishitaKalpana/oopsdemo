package oopsdemo3;

public class Director extends Employee{
	double transportAllowance;

	public Director(String name, double basic, String address,double ta) {
		super(name, basic, address);
		// TODO Auto-generated constructor 
        this.transportAllowance=ta;
	}
	void show() {
        super.show();
        System.out.println("TransportAllowance: \t" + transportAllowance);
	}

	@Override
	double totalPay() {
		// TODO Auto-generated method stub
		
	     double totalAmount = 0;
	           double houseRentAllowance = (basic * 0.20);
	           double dearnessAllowance = (basic * 0.5);
	           double medicalAllowance = 4500;
	           double entertainmentAllowance = 5000;
	           totalAmount = basic + houseRentAllowance + dearnessAllowance
	                 + medicalAllowance + entertainmentAllowance + transportAllowance;
	           return totalAmount;
	   
	}

}
