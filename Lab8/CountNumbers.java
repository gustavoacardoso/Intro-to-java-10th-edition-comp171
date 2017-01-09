package Exercises;
import java.util.Scanner;
public class CountNumbers 
{
	static Scanner input = new Scanner(System.in);
	public static void main(String[] args) 
	{
		// Declare and initialize int Array
		int[] myList = inputArray(); 
		
		// Display the array
		displayArray(myList);
		
	}
	public static int[] inputArray()
	{
		// Declare an array of numbers and create it
		int[] myList = new int[100];
		
		// Create input of numbers
		System.out.print("Enter integers from 1-100 (input 0 value to end inputs): ");
		int index=0;
		for(int i = 1; i < myList.length-1; i++)
		{
			if(i > 0)
				index = input.nextInt();  
			    if (index > 0 && index < myList.length)
			    	myList[index-1]++;
			    else
			    	break;
		}
		return myList;
	}
	
	// Counting and display the array of numbers
	public static void displayArray(int[] myList)
	{
		for (int i=1; i<myList.length-1; i++)
		{
			if (myList[i] != 0)
				if (myList[i] > 1)
                    System.out.println(i + " occurs " + myList[i-1] + " times");
                else
                    System.out.println(i + " occurs " + myList[i-1] + " time"); 
		}
	}


}