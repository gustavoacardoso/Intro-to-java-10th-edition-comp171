
public class Merge
{

	public static void main(String[] args)
	{
		int first[]   = {3,6,8,9,13,16};
		int second [] = {1,4,5,10,11,14,15};
		int merged[] = new int[13];
		int x=0,y=0,z=0;
		int hold1=0,hold2=0;
		for(z=0;z<=12;++z)
		{
			if(first[x]<second[y])
			{
				merged[z]=first[x];
				++x;
				if(x==first.length)
				{
					--x;
					hold1=first[x];
					first[x]=999;
				}
			}
			else
			{
				merged[z]=second[y];
				++y;
				if(y==second.length)
				{
					--y;
					hold2=second[y];
					second[y]=999;
				}
			}
		}
		first[x]=hold1;
		second[y]=hold2;
		for(x=0;x<merged.length;++x)
		{
			System.out.print(" "+merged[x]);
		}
		System.out.println();
		System.out.println("============================");
		for(x=0;x<first.length;++x)
			System.out.print(" "+first[x]);
		System.out.println();
		for(x=0;x<second.length;++x)
			System.out.print(" "+second[x]);
		System.out.println();

	}

}
