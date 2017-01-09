import java.util.Random;
import java.util.Arrays;
public class MyRandom 
{

	public static void main(String[] args) 
	{
		int mine[] = new int[50]; // create 50 spaces in the array
		GetNums(mine); // what I will put in these spaces. I'm not filling out, just addressing
		for(int x=0;x<=49;++x)
			System.out.print(" "+mine[x]); // print in each space 0-49
		System.out.println();
		System.out.println("USING JAVA SORT");
		
		Arrays.sort(mine);
		MySort(mine);
		System.out.println();
		System.out.println("SORTED LIST");
		for(int x=0;x<=49;++x)
			System.out.print(" "+mine[x]);
		
	}
	public static void GetNums(int mine[]) // I can call same mine var, bc mine variable is local
	{
		Random nums = new Random();
		for(int x=0;x<=49;++x)
		{
			mine[x] = nums.nextInt(19)+1;
		}
	}
	public static void MySort(int mine[])
	{
		int hold;
		for(int x=0;x<mine.length-1;++x) // we have to compare with length-1 bc if you compare the last # with length you'll find an error
		{
			if(mine[x]>mine[x+1]) // current is < than next value
			{
				hold=mine[x]; // mov that value to hold
				mine[x]=mine[x+1]; // take the next value x+1 move to the current value
				mine[x+1]=hold; // take the hold and move to the next value
				x=-1; // change x value to -1 and after ++x it comes to 0 
			}
		}
	}
}
