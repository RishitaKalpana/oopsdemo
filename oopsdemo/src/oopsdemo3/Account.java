package oopsdemo3;

public class Account {
	String name;
    protected double balance;
    
	public Account(String name, double balance) {
		this.name = name;
		this.balance = balance;
	}

	public String getName() {   //setters to set the values here constructor is used instead of setters
		return name;
	}

	public double getBalance() {
		return balance;
	}
	final void deposit(double amt) {// final methods cannot be overridden

		balance += amt;
        System.out.println("Depositing: " + amt);
    }

     void withdraw(double amt) { //this can be overridden

        balance -= amt;
        System.out.println("WithDrawing: " + amt);

 

    }
    

}
