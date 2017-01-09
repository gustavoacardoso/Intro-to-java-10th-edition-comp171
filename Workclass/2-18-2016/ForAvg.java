import java.util.Scanner;
public class ForAvg 
{

	public static void main(String[] args)
	{
		Scanner in = new Scanner(System.in);
		int x, sum=0, numin;
		double avg;
		for(x=0;x<=4;x++)
		{
			System.out.print("Enter a number: ");
			numin = in.nextInt();
			sum=sum+numin;
		}
		avg=(double)sum/x;
		System.out.println("The sum is "+sum+" and the average is "+avg);		
		
	}

}
