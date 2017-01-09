package Exercises;
import java.text.DecimalFormat;
import java.util.Scanner;
public class CompareLoans 
{

	public static void main(String[] args) 
	{
		Scanner input = new Scanner(System.in);
		DecimalFormat twoDF = new DecimalFormat("0.00");
		
		System.out.print("Loan Amount: ");
		double loan = input.nextDouble();
		System.out.print("Number of years: ");
		int years = input.nextInt();
		
		System.out.println("Interest Rate"+" \t "+"Monthly Payment"+"\t "+"Total Payment");
			
		for(double interestRate = 5; interestRate <= 8; interestRate+=0.125)
		{
			//calculate monthly payment
			double monthlyPayment = loan*(interestRate/1200)/(1-1/Math.pow(1+(interestRate/1200), years*12));
			System.out.println(interestRate +"%" +"\t         " + twoDF.format(monthlyPayment) + "\t\t\t " + twoDF.format(monthlyPayment*12*years)); 
		}
	}

}
