package assignment;

import java.util.Scanner;

public class ArthimeticOperations {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a,b,sum,sub,mul;
		float div; 
		Scanner s=new Scanner(System.in);
		System.out.println("enter the values of a and b:");
		a=s.nextInt();
		b=s.nextInt();
		s.close();
		 sum=a+b;
		 sub=a-b;
		 mul=a*b;
		 div=a/b; 
		 System.out.println("The Addition of "+ a + " and "+b+ " is : "+sum); 
		 System.out.println("The Subtraction of "+ a + " and "+b+ " is : "+sub);
		 System.out.println("The Multiplication of "+ a + " and "+b+ " is : "+mul); 
		 System.out.println("The Division of "+ a + " and "+b+ " is : "+div);

	}

}
