package fileio;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class BufferedWriterDemo {//while reading and writing it improves the performance 

	public static void main(String[] args) {
		try { 
            // Creating Writer obj in Append mode -true
            FileWriter writer = new FileWriter("c:/demo/names.txt",true); 
           //improves efficiency while writing data
            BufferedWriter bwr = new BufferedWriter(writer);  

 

            bwr.write("James"); 
            bwr.write("\n"); // bwr.newLine();
            bwr.write("Hobert"); 
            bwr.close(); 

 

            System.out.println("succesfully written to a file"); 
            } 
            catch (IOException ioe) { 
            ioe.printStackTrace(); 

 

            }

	}

}
