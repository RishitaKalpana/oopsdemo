package basic;

import java.util.Scanner;

public class SwitchDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int number;
		String size;
		Scanner s=new Scanner(System.in);
		
		System.out.println("Enter ur Shirt Size:");
		number=s.nextInt();
		s.close();
		// switch statement to check size
	    switch (number) {
	    	case 1:
	    	case 2:
	    	case 3:
	    				size="Kids";
	    				break;
	      case 29:
	    	  		size = "Small";
	    	  		break;

	      case 42:
	    	  		size = "Medium";
	    	  		break;

	      case 44:
	    	  		size = "Large";
	    	  		break;

	      case 48:
	    	  		size = "Extra Large";
	    	  		break;
	      
	      default:
	    	  		size = "Unknown";
	    	  		break;

	    }
	    			System.out.println("Size: " + size);


	}

}
