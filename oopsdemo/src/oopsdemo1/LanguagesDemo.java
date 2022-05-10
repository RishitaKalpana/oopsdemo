package oopsdemo1;
//program to demonstrate constructors in java
class Language
{
	private String s;
	Language()//Implicit constructor
	{
		System.out.println("I am Implicit Constructor");
		s="Python";
	    System.out.println("HEllo from:"+s);
	}
	Language(String lang)//string lang is a parameter ......parameterized constructor
	{
		System.out.println("I am Parameterized Constructor");
		this.s=lang;
		System.out.println("Hello from:"+s);
	}
	Language(String lang,int ver)// with 2ARGUMENTS
	
	{
		System.out.println("");
		this.s=lang;
		/*this.version=ver;
		System.out.println("hello from:" "+s+" V."ver );*/
	}
}

public class LanguagesDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Language l1=new Language();//automatically invokes the implicit constructor
		Language l2=new Language("Ruby");//automatically invokes the parameterized constructor
		Language l3=new Language("Scala");
		Language l4=new Language();
	}

}
