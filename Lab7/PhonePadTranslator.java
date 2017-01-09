package Exercises;
import java.util.Scanner;
public class PhonePadTranslator 
{

	public static void main(String[] args) 
	{
		Scanner input = new Scanner (System.in);
		
		System.out.println("Enter a string: ");
		String str = input.nextLine();
		str = str.toUpperCase();
		
		//Explain charAt
		//var str = "HELLO WORLD";
		//var res = str.charAt(0);
		
		for (int i = 0;i< str.length();i++ )
		{
			if (Character.isLetter(str.charAt(i)))
			{
				System.out.print(getNumber(str.charAt(i)));
			}
		 else 
			 System.out.print(str.charAt(i));

		}
	}

	public static int getNumber(char upperCaseLetter)
	{
		int conversion = 0;
		switch (upperCaseLetter)
		{
		case 'A':
		case 'B':
		case 'C':
			conversion = 2;
		break;

		case 'D':
		case 'E':
		case 'F':
			conversion = 3;
		break;

		case 'G':
		case 'H':
		case 'I':
			conversion = 4;
		break;

		case 'J':
		case 'K':
		case 'L':
			conversion = 5;
		break;

		case 'M':
		case 'N':
		case 'O':
			conversion = 6;
		break;

		case 'P':
		case 'Q':
		case 'R':
		case 'S':
			conversion = 7;
		break;

		case 'T':
		case 'U':
		case 'V':
			conversion = 8;
		break;

		case 'W':
		case 'X':
		case 'Y':
		case 'Z':
			conversion = 9;
		break;
		}
		return conversion;	
	}
}