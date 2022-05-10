package oopsdemo2;
/*
 * program to implement single inhertiance
 */

public class AccountantTest {
	public static void main(String[] args) {
		Accountant ac1=new Accountant(201,"Gaurav Sharma","Process Salary of Employees","SAP");
		Accountant ac2=new Accountant(205,"Mary John","Payment to Vendors","Tally");
		ac1.display();
		ac1.print();
		ac2.display();
		ac2.print();
	}

}
