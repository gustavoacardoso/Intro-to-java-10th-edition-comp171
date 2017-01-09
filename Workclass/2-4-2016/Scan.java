import java.util.Scanner;
public class Scan 
{
	public static void main(String[] args) 
	{
		Scanner in = new Scanner(System.in);
		String fName;
		String lName;
		int age;
		System.out.println("ENTER FIRST NAME HERE: ");
		fName = in.next(); //Check explanation on book  next returns type as a string
		System.out.println("ENTER LAST NAME HERE: ");
		lName = in.next();
		System.out.println("ENTER "+fName+"'s AGE HERE: ");
		age = in.nextInt(); //nextInt returns type as an int
		System.out.println(fName+" "+lName);
		System.out.println(lName+" "+fName);
		

	}

}
