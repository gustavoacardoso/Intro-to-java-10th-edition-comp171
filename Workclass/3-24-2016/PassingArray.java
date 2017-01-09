import java.util.Scanner;
public class PassingArray 
{
	static Scanner in = new Scanner(System.in);
	public static void main(String[] args) 
	{
		int x;
		int Grades[] = new int[10];
		double avg;
		
		//Call the method created
		Load_Array(Grades);
		System.out.println("GRADES ENTERED HERE: ");
		for(x=0;x<=9;++x)
		{
			System.out.println("GRADE #"+(x+1)+" "+Grades[x]);
		}
		
		//Call the method created
		avg=Calc_Avg(Grades);
		System.out.println("Average = "+avg);
		
		//Call the method created		
		Deviation(avg,Grades);
		
		
		//Call the method created
		Hi_Lo(Grades);
	}
	
	//create a method Load_Array
	public static void Load_Array(int Grades[])
	{
		int x;
		for(x=0;x<=9;++x)
		{
			System.out.println("ENTER GRADE HERE: ");
			Grades[x]=in.nextInt();
		}
	}
	
	//create a method Cal_Avg
	public static double Calc_Avg(int Grades[])    //double instead of void bc Calc_Avg is returning something here - if you see above, avg is returning a value 
	{
		double avg;
		int x,sum=0;
		for(x=0;x<=9;++x)
		{
			sum=sum+Grades[x];
		}
		avg=(double)sum/x;
		return(avg);
	}

	//create a method Deviation
	public static void Deviation(double avg,int Grades[])
	{
		int x;
		for(x=0;x<=9;++x)
		{
			System.out.println("Grade #"+(x+1)+" "+Grades[x]+" "+(Grades[x]-(int)avg));
		}
	}
	
	//create a method Hi_Lo
	public static void Hi_Lo(int Grades[])
	{
		int lo,hi,loLoc,hiLoc,x;
		lo=Grades[0];
		hi=Grades[0];
		loLoc=0;
		hiLoc=0;
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
		System.out.println("Grade #"+loLoc+" "+lo+" Is the Lowest");
		System.out.println("Grade #"+hiLoc+" "+hi+" Is the Highest");
	}

}
