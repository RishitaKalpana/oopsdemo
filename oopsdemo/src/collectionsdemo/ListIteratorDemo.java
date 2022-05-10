package collectionsdemo;
//Program to traverse list in forward & backward direction
//using ListIterator
import java.util.LinkedList;
import java.util.ListIterator;

public class ListIteratorDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Create a LinkedList
        LinkedList<String> linkedlist = new LinkedList<String>();
     
        // Add elements to LinkedList
        linkedlist.add("Delhi");
        linkedlist.add("Agra");
        linkedlist.add("Mysore");
        linkedlist.add("Chennai");
        linkedlist.add("Pune");
     
        // Obtaining ListIterator-traverse in both forward and backward direction
        ListIterator<String> listIt = linkedlist.listIterator();
     
        // Iterating the list in forward direction
        System.out.println("Forward iteration:");
        while(listIt.hasNext()){
           System.out.println(listIt.next());
        }

 

        // Iterating the list in backward direction
        System.out.println("\nBackward iteration:");
        while(listIt.hasPrevious()){
           System.out.println(listIt.previous());
    
    }
        
 
	}

}