// Gustavo Assis Cardoso Lab10
package Exercises;
import java.util.Scanner;
public class Lab10 
{

	public static void main(String[] args) 
	{
		Scanner in = new Scanner(System.in);
		int[] nums = new int[10];
		System.out.print("Enter ten numbers: ");
		for(int x=0;x<nums.length;x++)
		{
			nums[x] = in.nextInt();
		}
		nums = eliminateDuplicates(nums); 
		System.out.print("The distinct numbers are: ");
		for(int z = 0;z <nums.length;z++)
		{
		System.out.print(nums[z] + " "); 
		}
	} 
	public static int[] eliminateDuplicates(int[] list) 
	{ 
		int[] result = new int[0]; 
		for (int x=0;x<list.length;x++)
		{
			boolean exist = false; 
			for (int y=x+1; y < list.length; y++) 
			if (list[x] == list[y]) 
			exist = true; 
			if(!exist)
			{
				int[] newResult = new int[result.length+1]; 
				for(int z=0;z<result.length;z++) 
				newResult[z] = result[z]; 
				newResult[result.length]=list[x]; 
				result = newResult;
			}	
		}
		return result;
	}
}
/*
Enter ten numbers: 1 2 3 2 1 6 3 4 5 2 
The distinct numbers are: 1 6 3 4 5 2 
*/