package oopsdemo1;
/*
 * The meaning of Encapsulation, is to make sure that "sensitive" data is hidden from users. 
 * To achieve this, you must:
   declare class variables/attributes as private
   provide public get and set methods to access and update the value of a private variable
   
   The get method returns the value of the variable name.

 

   The set method takes a parameter (newName) and assigns it to the name variable. 
 */
public class Book {
	//properties
    private int bookId;
    private String bookName;
    private float price;
    private String publisher;
    //Generate getters and setters-place a line in new blank line and Right CLick
   //Source--->Generate Getters and Setters--->select All-->click on Generate
	public int getBookId() {
		return bookId;
	}
	public void setBookId(int bookId) {
		this.bookId = bookId;
	}
	public String getBookName() {
		return bookName;
	}
	public void setBookName(String bookName) {
		this.bookName = bookName;
	}
	public float getPrice() {
		return price;
	}
	public void setPrice(float price) {
		this.price = price;
	}
	public String getPublisher() {
		return publisher;
	}
	public void setPublisher(String publisher) {
		this.publisher = publisher;
	}
	void display()
	{
		System.out.println(".....Regal BookStore.....");
	}
	float discountprice()
	{
		return((this.price)-(this.price*.10f));
	}
	@Override

    //Generate toString() Methods-converts an object(b1) into String
	public String toString() {
		return "Book [bookId=" + bookId + ", bookName=" + bookName + ", price=" + price + ", publisher=" + publisher
				+ "]";
	}
    
	
	
	
}
