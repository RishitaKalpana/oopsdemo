package fileio;

import java.io.Serializable;

public class Employee implements Serializable {
	public String name;
    public String address;
    public transient int SSN;//willnotbe serialized ie not saved
    public int number;

 

    public void mailCheck()
    {
        System.out.println("Mailing a check to " + name
                + " " + address);
    }

	

}
