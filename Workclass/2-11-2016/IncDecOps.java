
public class IncDecOps
{

	public static void main(String[] args)
	{
		int a=11;
		int b=12;
		int c=0;
		double d;
		double rate=.0325/12;
		double prin=1000;
		double future=0;
		int years=1;
		future=prin*(Math.pow(1+rate,years*12));
		System.out.println("FUTURE ="+future);
		future=prin*(1+rate);
		System.out.println("FUTURE2 ="+future);
		
		
		
		c=a+b;
		System.out.println("c="+c+" a="+a+" b="+b);
		c=++a + ++b;
		System.out.println("c="+c+" a="+a+" b="+b);
		c=a++ + b++;
		System.out.println("c="+c+" a="+a+" b="+b);
		d=(double)a/b;
		System.out.println("d="+d+" a="+a+" b="+b);
		c=a%b;
		System.out.println("c="+c+" a="+a+" b="+b);
		//returns 2 raised to 2, i.e. 4
	     System.out.println(Math.pow(2,2));
	   
	     //returns -3 raised to 2, i.e. 9
	     System.out.println(Math.pow(-3,2));
		
		

	}

}
