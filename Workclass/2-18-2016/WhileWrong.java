import java.util.Scanner;
public class WhileWrong 
{

	public static void main(String[] args) 
	{
		Scanner in = new Scanner(System.in);
		int sum=0,count=0,numin=0;
		double avg;
		while(numin != -999)
		{
			System.out.print("ENTER VALUE HERE: ");
			numin = in.nextInt();
			sum = sum+numin;
			++count;
		}
		avg=(double)sum/count;
		System.out.println("COUNT ="+count+" SUM = "+sum+" AVG = "+avg);
	}

}
