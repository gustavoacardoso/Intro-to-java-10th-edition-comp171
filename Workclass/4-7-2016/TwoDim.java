import java.util.Scanner;
public class TwoDim 
{

	public static void main(String[] args) 
	{
		int Table[] [] = new int[3][3];
		Load_Table(Table);
		for(int row=0; row<=2;++row)
		{
			for(int col=0;col<=2;++col)
			{
				System.out.print(Table[row][col]);
			}
			System.out.println();
		}
	}
	public static void Load_Table(int a[][])
	{
		Scanner in = new Scanner(System.in);
		for(int row=0;row<=2;++row)
		{
			for(int col=0;col<=2;++col)
			{
				System.out.print("ENTER A VALUE HERE: ");
				a[row][col]=in.nextInt();
			}
		}
	}

}
