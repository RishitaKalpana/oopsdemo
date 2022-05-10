package assignment;

import java.util.Scanner;

public class TrianglePattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i,j,n;
		Scanner s=new Scanner(System.in);
		System.out.println("enter the no:");
		n=s.nextInt();
		for(i=1;i<=n;i++)
		{
			for(j=n;j>=i;j--)
			{
				System.out.print(j);
				
			}
			System.out.println(" ");
		}
		

	}

}
