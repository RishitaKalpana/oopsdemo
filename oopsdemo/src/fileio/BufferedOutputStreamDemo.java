package fileio;
//no output
import java.io.BufferedOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;

//Efficiency while reading and writing
public class BufferedOutputStreamDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {

			 

            BufferedOutputStream stream = new BufferedOutputStream(



               new FileOutputStream("textfile.txt"));



               stream.write("Hello, World!".getBytes());
               stream.write(System.lineSeparator().getBytes());
               stream.write("I am writting into a file using BufferedOutputStream".getBytes());
               stream.write(System.lineSeparator().getBytes());
               stream.close();



           } catch (IOException ex) {



               ex.printStackTrace();



           }  

	}

}
