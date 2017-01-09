import java.util.Scanner;
import java.text.*;
public class SalePrice 
{

	public static void main(String[] args) 
	{
		double retailPrice;
		double salePercent;
		double salePrice;
		double savings;
		Scanner in = new Scanner(System.in);
		DecimalFormat twoD = new DecimalFormat("#.##");
		System.out.print("ENTER RETAIL PRICE HERE: ");
		retailPrice = in.nextDouble();
		System.out.print("ENTER DISCOUNT PERCENT HERE: ");
		salePercent = in.nextDouble();
		salePrice = retailPrice*(1.00 - salePercent);
		savings = retailPrice*salePercent;
		System.out.println
		("RETAIL PRICE = $"+twoD.format(retailPrice));
		System.out.println
		("DISCOUNT % = "+twoD.format(salePercent));
		System.out.println
		("SALE PRICE = "+twoD.format(salePrice));
		System.out.println
		("SAVINGS = $"+twoD.format(savings));

	}

}
/*
ENTER RETAIL PRICE HERE: 55
ENTER DISCOUNT PERCENT HERE: .5
RETAIL PRICE = $55
DISCOUNT % = 0.5
SALE PRICE = 27.5
SAVINGS = $27.5
*/