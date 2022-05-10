package assignment;

import java.util.Scanner;

public class FahrenheittoCelsius {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int f,c;
        Scanner s=new Scanner(System.in);

        System.out.println("Enter the value:");
        f=s.nextInt();
        c=5*(f-32)/9;
        System.out.println(c);
        
        s.close();
         
	}

}
