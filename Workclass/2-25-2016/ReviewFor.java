import java.util.Scanner;
public class ReviewFor 
{

	public static void main(String[] args) 
	{
		int numin;
		int x,y;
		int sum=0;
		double avg=0;
		int limit;
		int count=0;
		Scanner in = new Scanner(System.in);// Memorize this command
		System.out.print("HOW MANY STUDENTS IN CLASS: ");
		limit=in.nextInt();					// Memorize this command in
		
		for(x=0;x<limit;x=x+5)					// Memorize the semicolon between sentences
		{
			for(y=0;y<=4;++y)
			{
			System.out.print("Enter a value here: ");
			numin=in.nextInt();				// Memorize this command
			sum=sum+numin;
			}
		System.out.println("Subtotal = "+sum);
		}
		avg=(double)sum/x;					// Check why we should put sum as a double 
		System.out.println("Sum  = "+sum);
		System.out.println("Average = "+avg);
	}

}
