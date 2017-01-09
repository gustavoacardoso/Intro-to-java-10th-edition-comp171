
public class Looping
{

	public static void main(String[] args)
	{
		double prin =24;
		double rate =.03;
		int year;
		for(year=1624;year<=2015;)
		{
			for(int x=0;x<=49;++x)
			{
				prin=prin*(1+rate);
			}
			year=year+50;
			System.out.println("I'M RIIIICH $"+prin+" "+year);
		}
		System.out.println("I'M RIIIICH $"+prin);
	}
}
