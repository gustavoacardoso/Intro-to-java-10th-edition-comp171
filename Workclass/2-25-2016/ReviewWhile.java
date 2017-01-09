package review;
import java.util.Scanner;
public class ReviewWhile
{
	public static void main(String[] args) 
	{
		int valuein;
		int sum=0;
		int count=0;
		double avg;
		Scanner in = new Scanner(System.in);
		//INITILIZE FOR LOOP
		System.out.print("ENTER VALUE HERE: ");
		valuein = in.nextInt();
		while(valuein != -999)
		{
			sum=sum+valuein;
			++count;
			System.out.print("ENTER NEXT VALUE HERE: ");
			valuein = in.nextInt();
		}
		if(count != 0)
		{
			avg=(double)sum/count;
			System.out.println
			("Number of Values Entered = "+count);
			System.out.println("Sum = "+sum);
			System.out.println("Average = "+avg);
		}
		else
			System.out.println("NO VALUES ENTERED");	

	}

}
