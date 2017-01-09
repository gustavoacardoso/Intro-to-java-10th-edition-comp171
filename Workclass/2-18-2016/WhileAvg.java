import java.util.Scanner;
public class WhileAvg 
{

	public static void main(String[] args) 
	{
		int numin,count=0,sum=0;
		Scanner in = new Scanner(System.in);
		double avg;
		System.out.print("Enter value here: ");
		numin = in.nextInt();
		while(numin != -999)
		{
			sum=sum+numin;
			++count;
			System.out.print("Enter value here: ");
			numin = in.nextInt();
		}
		if(count == 0)
			System.out.print("No values entered");
		else
		{
			avg = (double)sum/count;
			System.out.print("SUM = "+sum+" COUNT = "+count+" Average = "+avg);
		}
	}

}
