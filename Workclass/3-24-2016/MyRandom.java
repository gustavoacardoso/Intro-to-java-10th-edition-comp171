import java.util.Random;
public class MyRandom 
{

	public static void main(String[] args) 
	{
		Random myRand = new Random();
		int freqTable[] = new int[49];
		int num;
		for(int x=0;x<=10000;++x)
		{
			num=myRand.nextInt(49);
			++freqTable[num];
		}
		for(int x=0;x<=48;++x)
		{
			System.out.println(x+" = "+freqTable[x]);
		}

	}

}
