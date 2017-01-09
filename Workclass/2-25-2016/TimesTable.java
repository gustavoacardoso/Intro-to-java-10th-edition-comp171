
public class TimesTable 
{

	public static void main(String[] args) 
	{
		int x,y=0;
		for(x=2;x<=5;x++)
		{
			for(y=1;y<=12;++y)
			{
				System.out.println(x+"*"+y+"="+(x*y));
			}
			System.out.println("===============");
		}
		System.out.println("x="+x+"  y="+y);
	}
}
