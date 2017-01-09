import java.util.Scanner;
import javax.swing.JOptionPane; //JOptionPane method is to show pop up messages
import java.text.*; //Import the around number method
public class CalcFutureInvest 
{
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
				
		DecimalFormat TwoDec = new DecimalFormat("#.##"); // Create two decimals format
		// Declaring variables
		double investmentAmount;
		double annualInterestRate;
		double monthlyInterestRate;
		int numberOfYears;
		String in;
		
		in = JOptionPane.showInputDialog("Enter investment amount: ");
		investmentAmount = Double.parseDouble(in);
		
		in = JOptionPane.showInputDialog("Enter annual interest rate in percentage: ");
		annualInterestRate = Double.parseDouble(in);
		
		monthlyInterestRate = annualInterestRate / 1200; // Obtain monthly interest rate
		
		in = JOptionPane.showInputDialog("Enter number of years: ");
		numberOfYears = Integer.parseInt(in);
		
		// Calculate future investment value using Implementation Math.pow method ** Math class is in the implicit java.lang package
		double futureInvestmentValue = investmentAmount * Math.pow(1 + monthlyInterestRate, numberOfYears * 12);
		
		// Display results in two decimals format
		JOptionPane.showMessageDialog(null, "Accumulated value is $"+TwoDec.format(futureInvestmentValue));

	}

}



/*
//Using system.out.print method

System.out.print("Enter investment amount: ");
double investmentAmount = input.nextDouble();

System.out.print("Enter annual interest rate in percentage: ");
double annualInterestRate = input.nextDouble();

// Obtain monthly interest rate
double monthlyInterestRate = annualInterestRate / 1200;

System.out.print("Enter number of years: ");
int numberOfYears = input.nextInt();

// Calculate future investment value
double futureInvestmentValue = investmentAmount * Math.pow(1 + monthlyInterestRate, numberOfYears * 12);

// Display results
System.out.print("Accumulated value is $"+futureInvestmentValue);

*/