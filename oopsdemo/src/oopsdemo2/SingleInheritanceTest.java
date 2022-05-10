package oopsdemo2;
//parent/base/super class
class Animal 
{
	String name; //properties
	public void eat()   //methods
	{
		System.out.println(" i can eat");
	}
}
//inherit animal class
//child/sub/derived class
class Dog extends Animal
{
	public void display() {
		System.out.println("My Name is:"+name);
	}
}

public class SingleInheritanceTest {

	public static void main(String[] args) {
		// create& initialise the object of  subclass
		Dog labrador=new Dog();
		//access field of super class
		labrador.name="Simba";
		//call method of derived class using derived class object
		labrador.display();
		//call method of super class using derived class object
		labrador.eat();
		
       
	}

}
