package oopsdemo1;

public class BookTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//invoke setter methods-input
     Book b1=new Book();
     b1.setBookId(101);
     b1.setBookName("Programming in C");
     b1.setPrice(500);
     b1.setPublisher("Prime Books");
	
	//invoke getter methods-output
	System.out.println("........Book Store........");
	b1.display();
	System.out.println(b1.getBookId()+" "+b1.getBookName()+" "+b1.getPrice()+" "+b1.getPublisher());
	System.out.println("Discounted Price of a Book:"+b1.discountprice());
	System.out.println(b1);//invoke toString() method to Instance class(if not book address is given)
	
	Book b2=new Book();
    
    b2.setBookId(102);
    b2.setBookName("Python");
    b2.setPrice(600);
    b2.setPublisher("BPB Publisher");
   
    System.out.println("******* Book Details ********");
    System.out.println(b2.getBookId()+ " "+b2.getBookName()+" "+b2.getPrice()+" "+b2.getPublisher());
    System.out.println("Discounted Price of Book :"+b2.discountprice());   
    System.out.println(b2);
	}    	
}
