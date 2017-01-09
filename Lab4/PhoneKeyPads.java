package Exercises;
import java.util.Scanner;
public class PhoneKeyPads 
{

	public static void main(String[] args) 
	{
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter a letter: ");
		String key = input.next();
				
		switch(key)
		{
		case "A" : System.out.print("The corresponding number is 2"); break;
		case "B" : System.out.print("The corresponding number is 2"); break;
		case "C" : System.out.print("The corresponding number is 2"); break;
		case "D" : System.out.print("The corresponding number is 3"); break;
		case "E" : System.out.print("The corresponding number is 3"); break;
		case "F" : System.out.print("The corresponding number is 3"); break;
		case "G" : System.out.print("The corresponding number is 4"); break;
		case "H" : System.out.print("The corresponding number is 4"); break;
		case "I" : System.out.print("The corresponding number is 4"); break;
		case "J" : System.out.print("The corresponding number is 5"); break;
		case "K" : System.out.print("The corresponding number is 5"); break;
		case "L" : System.out.print("The corresponding number is 5"); break;
		case "M" : System.out.print("The corresponding number is 6"); break;
		case "N" : System.out.print("The corresponding number is 6"); break;
		case "O" : System.out.print("The corresponding number is 6"); break;
		case "P" : System.out.print("The corresponding number is 7"); break;
		case "Q" : System.out.print("The corresponding number is 7"); break;
		case "R" : System.out.print("The corresponding number is 7"); break;
		case "S" : System.out.print("The corresponding number is 7"); break;
		case "T" : System.out.print("The corresponding number is 8"); break;
		case "U" : System.out.print("The corresponding number is 8"); break;
		case "V" : System.out.print("The corresponding number is 8"); break;
		case "W" : System.out.print("The corresponding number is 9"); break;
		case "X" : System.out.print("The corresponding number is 9"); break;
		case "Y" : System.out.print("The corresponding number is 9"); break;
		case "Z" : System.out.print("The corresponding number is 9"); break;
		
		}

	}

}
