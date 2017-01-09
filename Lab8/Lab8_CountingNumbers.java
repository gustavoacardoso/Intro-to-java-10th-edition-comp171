// Lab8 - PAGE 277 #7.3
// Gustavo Assis Cardoso
package Exercises;
import java.util.Scanner;
public class Lab8_CountingNumbers 
{

	public static void main(String[] args) 
	{
		int[] myList = new int[101];
		Scanner input = new Scanner(System.in);
		int num = 0;
		
		System.out.print("Enter numbers between 1-100 (0 to end): ");
		
		do{
			num = input.nextInt();
			if (num == 0)
			{
				// don't count and ends while
			}
			else if(num > 0 && num <= 100)
			{
				myList[num]++;
			}
		}while(num != 0);
		
		for(int i=0;i<myList.length;i++)
		{
			if(myList[i] == 0)
			{
				// don't count and ends while
			}
			else
			{
				if(myList[i]>1)
					System.out.println(i + " occurs " + myList[i] + " times");
				else
					System.out.println(i + " occurs " + myList[i] + " time");
			}
		}

	}

}
