package oopsdemo3;
 abstract class Animal
{
	public void eat()
	{
		System.out.println("I can Eat");
	}
	abstract void makeSound();//abstract method without Body
	
		
	
}
 class Dog extends Animal{
	 
 
 @Override
 void makeSound() {
 	// TODO Auto-generated method stub
	 System.out.println("Bark");
 }
}
class Cat extends Animal
{
	@Override
	void makeSound() {
		// TODO Auto-generated method stub
		System.out.println("Meow Meow");
		
	}
}
public class AnimalAbstractionTest {

	public static void main(String[] args) {

       //Animal a=new Animal();//complier error -cannot create instance of Abstract class
       Dog d1=new Dog();
       d1.makeSound();
       d1.eat();
       Cat c1=new Cat();
       c1.eat();
       c1.makeSound();
       
	}

}




	

