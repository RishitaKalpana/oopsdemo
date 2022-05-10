package assignment;

import java.util.Scanner;

public class Multiple {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a,b;
        Scanner s=new Scanner(System.in);

        System.out.println("Enter the values:");
        a=s.nextInt();
        b=s.nextInt();
        s.close();
        
        if(b%a==0)
        	System.out.println("is a multiple");
        else
        	System.out.println("is not a multiple");
        
	}

}
