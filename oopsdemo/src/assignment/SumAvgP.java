package assignment;

import java.util.Scanner;

public class SumAvgP {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in); 
		int num1,num2,num3,sum,product;
		float avg;
		System.out.println("Enter 3 Numbers : ");
		num1=s.nextInt();
		num2=s.nextInt();
		num3=s.nextInt();
		s.close();
		sum=num1+num2+num3; 
		avg=(float)sum/3;
		product=num1*num2*num3;
		System.out.println("The Sum of 3 Numbers is : "+sum);
		System.out.println("The Average of 3 Numbers is :"+avg);
		System.out.println("The Product of 3 Numbers is :"+product);
		int x = (num1 > num2 && num1 > num3) ? num1 : (num2 > num3) ? num2 : num3; 
        int y = (num1 < num2 && num1 < num3) ? num1 : (num2 < num3) ? num2 : num3; 
        System.out.println("Largetst Number : "+x); 
        System.out.println("Smallest Number : "+y); 
			
			
		}
		

	}


