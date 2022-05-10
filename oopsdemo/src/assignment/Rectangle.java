package assignment;

import java.util.Scanner;

public class Rectangle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double l,b;
		double area;
		Scanner s=new Scanner(System.in);
		System.out.println("enter the l and b values:");
		l=s.nextDouble();
		b=s.nextDouble();
		s.close();
		area=(int)(l*b);
		System.out.println("the area of a Rectangle is:"+area);
		

	}

}
