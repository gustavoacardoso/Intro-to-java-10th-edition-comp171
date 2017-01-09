import java.util.*;

public class Program3 
{

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		String str,test1,test2,test3;
		
		System.out.print("Enter processing order: ");
		str = sc.next();
		test1 = str;
		test2 = str;
		test3 = str;
		
		char c[] = str.toCharArray();
		char t1[] = test1.toCharArray();
		char t2[] = test2.toCharArray();
		char t3[] = test3.toCharArray();
		
		//Check string length
	if(str.length() == 12)
		{
			
		//Check country code
		for(int x=0 ; x <= 1 ; x++)
		{
			t1[x] = c[x];
			if(t1[0] <= '3')
			{
				
			}
			else
			{
				System.out.println("Invalid country code");
			}
		}
			
			
		//Check letters
		for(int x=3; x<=7; ++x)
		{
			t2[x] = c[x];
			if(t2[x] < 'Z')
			{
				if(t2[x] > 'A')
				{
					
				}
				else
				{
					System.out.println("Invalid letters (Upper case only)");
				}
			}
			else
			{
				System.out.println("Invalid letters (Upper case only)");
			}
		}
		
		//Check routing code
		for(int x=9; x<=11; ++x)
		{
			t3[x] = c[x];
			
			if(t3[10] < '9')
			{
				if(t3[10] > '0')
				{
					
				}
				else
				{
					System.out.println("Invalid routing number");
				}
			}
			else
			{
				System.out.println("Invalid routing number");
			}
			
			if(x!=10)
			{
			if(t3[x] <= 'Z')
			{
				if(t3[x] >= 'A')
				{
					
				}
				else
				{
				System.out.println("Invlaid routing code");
				}
			}
			else
			{
				System.out.println("Invlaid routing code");
			}
			
			}
		}
		

	}
	else
	{
		System.out.println("Invalid order code");
	}
}
}

/*
Enter processing order: 02-JUNKS-A2W

Enter processing order: 00-SCREW-SW3
Invalid routing number
Invalid routing number
Invalid routing number
Invlaid routing code

Enter processing order: 171-COMP-111
Invalid letters (Upper case only)
Invlaid routing code
Invlaid routing code

Enter processing order: 45Y-AMAN-O0O
Invalid country code
Invalid country code
Invalid letters (Upper case only)
Invalid letters (Upper case only)
Invalid letters (Upper case only)
Invalid routing number
Invalid routing number
Invalid routing number
*/
