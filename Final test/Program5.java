import java.util.Scanner;
public class Program5 
{
	public static void main(String[] args) 
	{
		Scanner in = new Scanner(System.in);
		System.out.print("ENTER YOUR FIRST NAME HERE: ");
		String first = in.nextLine();
		System.out.print("ENTER YOUR LAST NAME HERE: ");
		String last = in.nextLine();
		System.out.println(last+" "+first);
	}

}
/*
ENTER YOUR FIRST NAME HERE: GUSTAVO
ENTER YOUR LAST NAME HERE: CARDOSO
CARDOSO GUSTAVO
*/