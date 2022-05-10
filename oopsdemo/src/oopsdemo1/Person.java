package oopsdemo1;

import java.util.Scanner;

public class Person {
	String name,constituency;
    int age;
    Scanner s;
    public Person() {
    	
    System.out.println("Voter Eligibility App");
    age=0;
    name="";
    constituency="Bengaluru";
    s=new Scanner(System.in);
    }
	public Person(String name, String constituency, int age) {// parameterized with 3args
		this.name = name;
		this.constituency = constituency;
		this.age = age;
	}
	public Person(String name, int age) {//parameter with 2 args
		this.name = name;
		this.age = age;
		this.constituency="Mumbai";
		
	}
	void input()
    {
        System.out.println("Enter ur Name:");
        name=s.nextLine();
        System.out.println("Enter ur Age:");
        age=s.nextInt();
    }
   
    void print()
    {
        System.out.println("Name is :"+name);
        System.out.println("Age is :"+age);
        System.out.println("Constituency is :"+constituency);
    }
	
	
    
}
