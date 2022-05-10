package basic;

import java.util.Scanner;

public class Greatest2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a,b;
        Scanner s=new Scanner(System.in);

        System.out.println("Enter 2 numbers:");
        a=s.nextInt();
        b=s.nextInt();
     
        s.close();
        if(a>b)
        {
        	System.out.println(a+ " is Greatest");
        }
        else 
        {
        	System.out.println(b+ " is Greatest");
        }

	}

}
