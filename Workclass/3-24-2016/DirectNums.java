import java.util.Scanner;
public class DirectNums 
{

	public static void main(String[] args) 
	{
		Scanner in = new Scanner(System.in);
		int Grades[] = new int[10];
		int x,sum=0,hi,lo,hiLoc,loLoc;
		double avg;
		
		for(x=0;x<=9;x++)
		{
			System.out.print("ENTER GRADE HERE: ");
			Grades[x]=in.nextInt();
			sum=sum+Grades[x];
		}
		
		avg=(double)sum/x;
		System.out.println("AVERAGE="+avg);
		
		for(x=0;x<=9;++x)
		{
			System.out.println("Grade #"+(x+1)+" "+Grades[x]+" "+(Grades[x]-(int)avg));
		}
		
		hi=Grades[0];
		lo=Grades[0];
		hiLoc=0;
		loLoc=0;
		
		for(x=1;x<=9;++x)
		{
			if(Grades[x]>hi)
			{
				hi=Grades[x];
				hiLoc=x;
			}
			if(Grades[x]<lo)
			{
				lo=Grades[x];
				loLoc=x;
			}
		}
		System.out.println("Highest Grade is Grade #"+(hiLoc+1)+" " +hi);
		System.out.println("Lowest Grade is Grade #"+(loLoc+1)+" "+lo);
				
		
	}

}
