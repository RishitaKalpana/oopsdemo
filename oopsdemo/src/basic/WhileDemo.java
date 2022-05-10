package basic;

public class WhileDemo {
	/*
	 * Program to display numbers from 1 to 10.
	 *
	 * Understand the concept of Loop.
	 * Loop - A set of statements executing repeatedly , until a particular
	 * condition is TRUE.
	 */

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i=1;
		while(i<=10) {
			
			System.out.println(i+ " kal");
			i=i+1;
			
			
		}
		System.out.println("Exiting the loop.....");
		System.out.println("****Reverse loop******");
        
		int j=10;
		while(j>=1) {
			
			System.out.println(j);
			j=j-1;
		}
	}

}
