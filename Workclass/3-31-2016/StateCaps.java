import java.util.Scanner;
public class StateCaps 
{
static Scanner in = new Scanner(System.in);
	public static void main(String[] args) 
	{
		String[]States = new String[]{"NJ","NY","PA","CT"};
		String[]Capitals = new String[]{"Trenton","Albany","Harrisburg","Hartford"};
		String what;
		int x;
		for(x=0;x<Capitals.length;++x)
			Capitals[x]=Capitals[x].toUpperCase();
		System.out.print("Enter State Capital Here: ");;
		what=in.next();
		what=what.toUpperCase();
		//System.out.println(what);
		for(x=0;x<Capitals.length;++x)
		{
			//System.out.println(Capitals[x]);
			if(what.equals(Capitals[x]))
			{
				System.out.print(Capitals[x]+" IS THE CAPITAL OF "+States[x]);
				x=5;
			}
		}
		if(x!=(Capitals.length+2))
			System.out.println("NO STATE FOR "+what);

	}

}
