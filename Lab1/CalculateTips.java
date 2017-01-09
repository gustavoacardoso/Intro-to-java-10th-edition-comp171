import java.util.Scanner;

public class CalculateTips 
{
	public static void main(String[] args) 
	{
		Scanner input = new Scanner(System.in);

		System.out.print("Enter the subtotal and a gratuity rate: ");
		double subtotal = input.nextDouble();
		double gratuityrate = input.nextDouble();
		
		double gratuity = (subtotal*(gratuityrate/100));
		double total = subtotal + gratuity; 
		
		System.out.print("The gratuity is $" + gratuity + " and total is $" + total);
	}
}


//Enter the subtotal and a gratuity rate: 10 15
//The gratuity is $1.5 and total is $11.5
