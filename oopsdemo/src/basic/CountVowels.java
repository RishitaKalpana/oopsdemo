package basic;

import java.util.Scanner;

/*
 * program to count vowels in a string-a,e,i,o,u
 */

public class CountVowels {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//String s="java is fun";
		Scanner scan=new Scanner(System.in);
		System.out.println("enter the String:");
		String s=scan.nextLine();//method takes sentence input
		scan.close();
        int count=0;
       System.out.println("the length of the string:"+s.length());
        for(int i=0;i<s.length();i++)
        {
            if(s.charAt(i) =='a' || s.charAt(i) =='e' || s.charAt(i) =='i' ||
                    s.charAt(i) =='o' || s.charAt(i) =='u')
            {
                count+=1;
                System.out.println("Vowel found : "+s.charAt(i));
            }
           
        }
        System.out.println("Total no. of vowels in string :"+count);

	}

}
