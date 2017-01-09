package Exercises;
import java.text.DecimalFormat;
import java.util.Scanner;
public class ComputeFutureInvest 
{

	public static void main(String[] args) 
	{
		Scanner input = new Scanner(System.in);
		DecimalFormat TwoDec = new DecimalFormat("#.##");
		
		System.out.print("The amount invested: ");
		double investmentAmount = input.nextDouble();
		System.out.print("Annual interest rate: ");
		double interestRate = input.nextInt();
		
		System.out.println("Years"+" \t "+"Future Value");		
		for(int years=1;years<=30;years++)
		{
			//Calculate future investment
			double futureInvestmentValue = investmentAmount * Math.pow(1 + (interestRate/1200), years * 12);
			System.out.println(years +"\t     "+TwoDec.format(futureInvestmentValue));
		}
	}
}
