import java.util.Scanner;
public class DataType 
{

	public static void main(String[] args) 
	{
		//VARIABLE DEFINITION
		int a;
		int b;
		int c;
		double d;
		Scanner in = new Scanner(System.in);
		System.out.print("ENTER FIRST VALUE HERE: ");
		a = in.nextInt();
		System.out.print("ENTER SECOND VALUE HERE: ");
		b = in.nextInt();		
		c=a+b;
		System.out.println("Add "+c);
		c=a-b;
		System.out.println("Sub "+c);
		d=(double)a/b;
		System.out.println("Div "+d);
		c=a*b;
		System.out.println("Mul "+c);
		c=a%b;
		System.out.println("Mod "+c);
		
	}

}
