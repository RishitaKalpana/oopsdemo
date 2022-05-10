package exceptiondemo;
//User defined Exception class

public class InSufficientFundsException extends Exception {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private double amount;
	
	

	public InSufficientFundsException(double amount) {
		this.amount = amount;
	}

    

	public static long getSerialversionuid() {
		return serialVersionUID;
	}



	public double getAmount() {
		return amount;
	}



	
}
