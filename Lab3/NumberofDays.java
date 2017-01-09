// Gustavo AssisCardoso
// Lab3
package Exercises;
import java.util.Scanner;
import javax.swing.JOptionPane; //JOptionPane method is to show pop up messages
public class NumberofDays
{
	public static void main(String[] args) 
	{
		Scanner input = new Scanner(System.in);

		int month;
		int year;
		String in;
		boolean leap;

		in = JOptionPane.showInputDialog("Enter the month: ");
		month = Integer.parseInt(in);

		in = JOptionPane.showInputDialog("Enter the year: ");
		year = Integer.parseInt(in);

		switch (month)
		{
		case 1: JOptionPane.showMessageDialog(null, "January of "+year+" had 31 days"); break;
		case 2: if(year % 4 == 0 && year % 100 != 0 || (year % 400 == 0))
			{
			JOptionPane.showMessageDialog(null, "February of "+year+" had 29 days"); break;
			}
			else
			{
				JOptionPane.showMessageDialog(null, "February of "+year+" had 28 days"); 
			};break;
		case 3: JOptionPane.showMessageDialog(null, "March of "+year+" had 31 days"); break;
		case 4: JOptionPane.showMessageDialog(null, "April of "+year+" had 30 days"); break;
		case 5: JOptionPane.showMessageDialog(null, "May of "+year+" had 31 days"); break;
		case 6: JOptionPane.showMessageDialog(null, "June of "+year+" had 30 days"); break;
		case 7: JOptionPane.showMessageDialog(null, "July of "+year+" had 31 days"); break;
		case 8: JOptionPane.showMessageDialog(null, "August of "+year+" had 31 days"); break;
		case 9: JOptionPane.showMessageDialog(null, "September of "+year+" had 30 days"); break;
		case 10: JOptionPane.showMessageDialog(null, "October of "+year+" had 31 days"); break;
		case 11: JOptionPane.showMessageDialog(null, "November of "+year+" had 30 days"); break;
		case 12: JOptionPane.showMessageDialog(null, "December of "+year+" had 31 days"); break;
		}
		if(year % 4 == 0 && year % 100 != 0 || (year % 400 == 0))
		{
			JOptionPane.showMessageDialog(null, year+" is a leap year");
		}
		else
		{
			JOptionPane.showMessageDialog(null, year+" is not a leap year");
		}
	}
}
