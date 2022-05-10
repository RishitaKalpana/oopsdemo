package fileio;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileOutputStreamDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String fname="c:/demo/data1.txt";
		try {
			FileOutputStream fos=new FileOutputStream(fname,true);
			String text="It's a Sunny day";
			byte[] myBytes=text.getBytes();
			fos.write(myBytes);
			System.out.println("Dta writen to Binary file");
			fos.close();
		} catch (FileNotFoundException e) {

			e.printStackTrace();
		} catch (IOException e) {

			e.printStackTrace();
		}

	}

}
