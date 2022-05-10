package fileio;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

/*
 * *
 * Java DataOutputStream class allows an application to write primitive
 * Java data types to the output stream in a machine-independent way.
 */
public class DataOutputStreamDemmo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/* try ( DataOutputStream din =
                 new DataOutputStream(new FileOutputStream("c:/demo/file.dat")) )
             {
                 din.writeDouble(1.1);
                 din.writeInt(55);
                 din.writeBoolean(true);
                 din.writeChar('4');
             }
             catch(FileNotFoundException ex)
             {
                 System.out.println("Cannot Open the Output File");
                 return;
             }
             
             // reading the data back using DataInputStream
             try ( DataInputStream din =
                         new DataInputStream(new FileInputStream("file.dat")) )
             {
                 double a = din.readDouble();
                 int b = din.readInt();
                 boolean c = din.readBoolean();
                 char d=din.readChar();
                 System.out.println("Values: " + a + " " + b + " " + c+" " + d);
             }
             catch(FileNotFoundException e)
             {
                 System.out.println("Cannot Open the Input File");
                 return;
             }
*/
	}

}
