package assignment;

import java.util.Scanner;

public class RobertsMarks {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       int sub1,sub2,sub3,total;
	   float percent;
       Scanner s=new Scanner(System.in);
       System.out.println("enter the 3  subjects marks:");
       sub1=s.nextInt();
       sub2=s.nextInt();
       sub3=s.nextInt();
       s.close();
       
       total=sub1+sub2+sub3;
       percent=(total/3);
       System.out.println("Total Marks:"+total);
       System.out.println("percentage Marks: "+percent+"%");
	}

}
