import javax.swing.JOptionPane;
import java.util.Scanner;
import java.text.*;
public class MultiMeth 
{
	static Scanner in = new Scanner(System.in); // global variable
	public static void main(String[] args) 
	{
		String fName; // global variable
		String lName;
		fName=getFirst(); // First name will be asked first  -- if you change by getLast, last name will be asked first
		lName=getLast();  
		JOptionPane.showMessageDialog(null, "Welcome "+fName+" "+lName);
	}
	public static String getFirst()    //another method
	{
		String fName; // local variable
		System.out.println("ENTER FIRST NAME HERE: ");
		fName=in.next();
		return fName;
	}
	public static String getLast()
	{
		String lName;
		System.out.println("ENTER LAST NAME HERE: ");
		lName=in.next();
		return lName;
	}

}