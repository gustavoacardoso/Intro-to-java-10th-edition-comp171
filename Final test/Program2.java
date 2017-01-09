import java.util.Scanner;
public class Program2
{
	static Scanner in = new Scanner(System.in);
	public static void main(String[] args) 
	{
		int x;
		double myList[] = new double[10];
		Load_Array(myList);
		Hi_Lo(myList);
	}
	public static void Load_Array(double myList[])
	{
		int x;
		for(x=0;x<=9;++x)
		{
			System.out.print("ENTER NUMBER HERE: ");
			myList[x]=in.nextDouble();
		}
	}
	public static void Hi_Lo(double myList[])
	{
		double lo,hi,loLoc,hiLoc;
		int x;
		lo=myList[0];
		hi=myList[0];
		loLoc=0;
		hiLoc=0;
		for(x=1;x<=9;++x)
		{
			if(myList[x]>hi)
			{
				hi=myList[x];
				hiLoc=x;
			}
			if(myList[x]<lo)
			{
				lo=myList[x];
				loLoc=x;
			}
			
		}
		System.out.println("Number #"+(loLoc+1)+"  "+lo+" Is the Lowest");
		System.out.println("Number #"+(hiLoc+1)+"  "+hi+" Is the Highest");
		
	}

}
/*
ENTER NUMBER HERE: 1
ENTER NUMBER HERE: 2
ENTER NUMBER HERE: 3
ENTER NUMBER HERE: 4
ENTER NUMBER HERE: 5
ENTER NUMBER HERE: 6
ENTER NUMBER HERE: 7
ENTER NUMBER HERE: 8
ENTER NUMBER HERE: 9
ENTER NUMBER HERE: 10
Number #1.0  1.0 Is the Lowest
Number #10.0  10.0 Is the Highest
*/