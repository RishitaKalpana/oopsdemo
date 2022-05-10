package basic;

public class TernaryDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=10,b=20,max;
		System.out.println("First no: "+a);
		System.out.println("Second no: "+b);
		max=(a>b) ? a:b;
		String msg=(a>b)? "A is greatest":"B is Greatest";
	    
		System.out.println("Greatest no: "+msg);
		
	}

}
