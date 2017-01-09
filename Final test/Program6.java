import java.util.Scanner;
public class Program6 
{

	public static void main(String[] args) 
	{
		int[] myList = new int[10];
		int x=0;
		Scanner in = new Scanner(System.in);
				
		System.out.print("Enter 10 numbers: ");
		for(x=0;x<=9;x++)
		{
			myList[x]=in.nextInt();
		}
		System.out.println("ORIGINAL ORDER:");
		for(x=0;x<=9;++x)
		{
			System.out.println("NUMBER #"+(x+1)+" "+myList[x]);
		}
		for(x=0; x<myList.length-1; x++)
		{
			int currentMin = myList[x];
			int currentMinIndex = x;
			
			for(int y=x+1; y<myList.length; y++)
			{
				if(currentMin>myList[y])
				{
					currentMin = myList[y];
					currentMinIndex = y;
				}
			}
			if(currentMinIndex != x)
			{
				myList[currentMinIndex] = myList[x];
				myList[x] = currentMin;
			}
		}
		System.out.println("ASCENDING ORDER:");
		for(x=0;x<=9;++x)
		{
			System.out.println("NUMBER #"+(x+1)+" "+myList[x]);
		}
	}

}
/*
Enter 10 numbers: 1 4 5 2 3 6 9 8 7 10
ORIGINAL ORDER:
NUMBER #1 1
NUMBER #2 4
NUMBER #3 5
NUMBER #4 2
NUMBER #5 3
NUMBER #6 6
NUMBER #7 9
NUMBER #8 8
NUMBER #9 7
NUMBER #10 10
ASCENDING ORDER:
NUMBER #1 1
NUMBER #2 2
NUMBER #3 3
NUMBER #4 4
NUMBER #5 5
NUMBER #6 6
NUMBER #7 7
NUMBER #8 8
NUMBER #9 9
NUMBER #10 10
*/