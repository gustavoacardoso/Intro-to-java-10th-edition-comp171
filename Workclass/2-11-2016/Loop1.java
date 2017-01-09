import java.util.Scanner;
public class Loop1 
{

	public static void main(String[] args)
	{
		double prin=1000;
		double rate=.0325;
		int years=1;
		int x;
		for(x=0;x<(years*12);++x)
		{
			prin=prin*(1+(rate/12));			
		}
		System.out.println(prin);
		
	}

}
