import java.util.Scanner;
public class Program1
{
	static Scanner in = new Scanner(System.in);
	public static void main(String[] args) 
	{
		int x;
		int myList[] = new int[10];
		Load_Array(myList);
		Selection(myList);
	}
	public static void Load_Array(int myList[])
	{
		int x;
		System.out.print("ENTER NUMBERS HERE: ");
		for(x=0;x<=9;++x)
		{
			myList[x]=in.nextInt();
		}
	}
	public static void Selection(int myList[])
	{
		for(int x=0;x<=9;++x)
		{
			if(myList[x]==24)
				System.out.println("Number #"+(x+1)+" is the number "+myList[x]);
				
		}
		
		for(int x=0;x<=9;++x)
		{
			if(myList[x]!=24)
				break;
				System.out.println("Number 24 is not in the array");
				
		}
		
	}
}
/*
ENTER NUMBERS HERE: 1 2 3 4 5 6 7 8 9 10
Number 24 is not in the array
*/

/*
ENTER NUMBERS HERE: 1 2 3 4 5 6 7 8 9 24
Number #10 is the number 24
*/
