import java.util.Scanner;
public class SearchMe 
{
static Scanner in = new Scanner(System.in);
	public static void main(String[]args)
	{
		int[]numbers = new int[10];
		int location=0;
		Load_array(numbers);
		location=Search_Array(numbers);
		if(location==0)
		{
			System.out.println("24 NOT IN ARRAY");
		}
		else
		{
			System.out.println("24 IS IN LOCATION "+location);
		}
		for(int x=0;x<=9;++x)
			System.out.println(numbers[x]);
	}
	public static void Load_array(int num[]) // Study the definition of void
	{
		int x;
		for(x=0;x<=9;++x)
		{
			System.out.print("ENTER VALUE "+(x+1)+" HERE:");
			num[x]=in.nextInt();
		}
	}
	public static int Search_Array(int num[]) // Study the definition of int in this case
	{
		int loc=0,x;
		for(x=0;x<=9;++x)
		{
			if(num[x] == 24)
			{
				loc=(x+1);
				x=10;
			}
		}
		return(loc); // Study why return command is necessary
	}
}
